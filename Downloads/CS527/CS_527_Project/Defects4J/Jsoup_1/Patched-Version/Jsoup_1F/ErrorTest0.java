import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements7 = document1.siblingElements();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document1.siblingNodes();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = document1.nextSibling();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document1.lastElementSibling();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("hi!");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int4 = document1.siblingIndex();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element7.nextElementSibling();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element3.nextElementSibling();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document1.siblingNodes();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.nextElementSibling();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.text("#root");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int6 = document1.siblingIndex();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element3.firstElementSibling();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.lastElementSibling();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.text("hi!");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int18 = node16.siblingIndex();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = element14.previousSibling();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("hi!");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document1.text("hi!");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element14.previousElementSibling();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document6.title("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = element7.nextSibling();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = document1.previousSibling();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.lastElementSibling();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = document1.previousSibling();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = document1.nextSibling();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.title();
        java.lang.String str6 = document1.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.nextElementSibling();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.nodes.Element element10 = element6.removeClass("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int11 = element10.siblingIndex();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = document1.previousSibling();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.lastElementSibling();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element6.previousElementSibling();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        element6.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element6.firstElementSibling();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        element7.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element7.nextElementSibling();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
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
        org.jsoup.select.Elements elements28 = document1.getElementsByClass("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements29 = document1.siblingElements();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.lang.String str7 = document1.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document1.siblingNodes();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = document9.text("#root");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element7 = document1.addClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.appendText("");
        java.lang.String str11 = element7.attr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements12 = element7.siblingElements();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = document1.previousElementSibling();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.parser.Tag tag4 = document1.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document1.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = document1.previousSibling();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.removeClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element3.lastElementSibling();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.previousElementSibling();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element38 = document9.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element6.nextElementSibling();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element5 = document1.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document1.siblingNodes();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = document1.previousSibling();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueStarting("hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.lastElementSibling();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.nodes.Element element4 = document1.val("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document6.hasClass("hi!");
        boolean boolean10 = document6.hasClass("hi!");
        org.jsoup.nodes.Element element11 = document6.head();
        boolean boolean12 = document1.equals((java.lang.Object) document6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document6.title("#document");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements3 = document1.siblingElements();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        java.lang.String str7 = document1.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.nextElementSibling();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document5.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document8.wrap("#root");
        org.jsoup.nodes.Element element12 = document8.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements13 = element12.siblingElements();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element5 = document1.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = element5.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = element5.previousSibling();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.nodeName();
        org.jsoup.nodes.Element element9 = document1.append("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.text("#root");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.outerHtml();
        org.jsoup.select.Elements elements8 = document1.getElementsByTag("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<#root>\n</#root>");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = element3.html("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int6 = element5.siblingIndex();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document1.siblingNodes();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        boolean boolean7 = element6.hasText();
        org.jsoup.select.Elements elements9 = element6.getElementsByIndexGreaterThan(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element6.nextElementSibling();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = document1.firstElementSibling();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        java.lang.String str8 = document1.toString();
        java.lang.String str9 = document1.baseUri();
        java.lang.String str10 = document1.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.wrap("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
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
        org.jsoup.nodes.Document document27 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList28 = document27.siblingNodes();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element7 = document1.addClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = document1.nextSibling();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
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
        org.jsoup.select.Elements elements28 = document1.getElementsByClass("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = document1.firstElementSibling();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = document1.removeClass("");
        org.jsoup.nodes.Element element7 = element5.toggleClass("#root");
        java.lang.String str8 = element7.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element7.firstElementSibling();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        java.lang.String str4 = document1.html();
        org.jsoup.select.Elements elements6 = document1.getElementsByTag("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.text("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = element3.previousSibling();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.text("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node3 = document1.previousSibling();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = document1.nextSibling();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.outerHtml();
        org.jsoup.select.Elements elements8 = document1.getElementsByTag("#document");
        java.lang.String str9 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.text("#root");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.removeClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element3.nextElementSibling();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements32 = document1.siblingElements();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        boolean boolean7 = element6.hasText();
        org.jsoup.nodes.Element element9 = element6.toggleClass("<#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element9.firstElementSibling();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("#document");
        org.jsoup.nodes.Attributes attributes4 = document1.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document1.text("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.outerHtml();
        java.lang.String str4 = document1.attr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document1.append("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element6.firstElementSibling();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document12.nextElementSibling();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.title();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByClass("#document");
        java.lang.String str9 = document1.title();
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexGreaterThan(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = document1.nextSibling();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document6.appendText("");
        org.jsoup.nodes.Element element9 = document1.appendChild((org.jsoup.nodes.Node) document6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document6.title("<#root>\n</#root>");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.val();
        org.jsoup.nodes.Element element4 = document1.prepend("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = element4.firstElementSibling();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("#root");
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueEnding("#document", "#document");
        org.jsoup.nodes.Element element9 = document1.val("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int10 = document1.siblingIndex();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document1.firstElementSibling();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element7.nextElementSibling();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements5 = document1.siblingElements();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        java.lang.String str6 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document1.siblingNodes();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int9 = element7.siblingIndex();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document9.title("<#root>\n</#root>");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        java.lang.String str8 = document1.baseUri();
        java.lang.String str9 = document1.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.text("#root");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element13.siblingNodes();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexLessThan((int) (short) -1);
        java.lang.String str7 = document1.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = document1.nextSibling();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.select.Elements elements10 = element6.getElementsByTag("#document");
        org.jsoup.nodes.Element element11 = element6.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = element6.nextSibling();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.outerHtml();
        org.jsoup.select.Elements elements8 = document1.getElementsByTag("#document");
        java.lang.String str9 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.wrap("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int3 = document1.siblingIndex();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.Integer int4 = document1.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.previousElementSibling();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Document document10 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document10.nextElementSibling();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        org.jsoup.nodes.Node node8 = node6.removeAttr("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = node6.previousSibling();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("#root");
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueEnding("#document", "#document");
        org.jsoup.parser.Tag tag8 = document1.tag();
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueContaining("#document", "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document1.wrap("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        org.jsoup.nodes.Element element9 = element7.parent();
        boolean boolean11 = element7.hasAttr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int12 = element7.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements13 = element7.siblingElements();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
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
        org.jsoup.nodes.Element element34 = document1.getElementById("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = document1.nextElementSibling();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.nodes.Element element10 = element6.removeClass("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements11 = element6.siblingElements();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
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
        org.jsoup.select.Elements elements21 = element3.getElementsByIndexEquals((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element3.siblingNodes();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = element3.nextSibling();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.select.Elements elements9 = document5.getElementsByIndexGreaterThan(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document5.text("#root");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        java.lang.String str6 = document1.outerHtml();
        boolean boolean7 = document1.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = document1.previousSibling();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = document1.wrap("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = document1.firstElementSibling();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.nodes.Element element4 = document1.val("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document6.hasClass("hi!");
        boolean boolean10 = document6.hasClass("hi!");
        org.jsoup.nodes.Element element11 = document6.head();
        boolean boolean12 = document1.equals((java.lang.Object) document6);
        org.jsoup.select.Elements elements13 = document1.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document1.text("#document");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element6.previousElementSibling();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Element element7 = document1.empty();
        java.lang.String str8 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.previousElementSibling();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = document1.prepend("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.text("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.getElementById("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str4 = document1.html();
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexLessThan((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.previousElementSibling();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.title();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.nodes.Element element8 = document1.prependText("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = document1.nextSibling();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document8 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.lastElementSibling();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element4 = document1.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.previousElementSibling();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        document1.title("");
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.parser.Tag tag5 = document1.tag();
        document1.setBaseUri("<#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.wrap("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
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
        org.jsoup.select.Elements elements24 = document1.getElementsByAttributeValueContaining("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;", "<#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList25 = document1.siblingNodes();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Element element7 = document1.empty();
        java.lang.String str8 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = document1.nextSibling();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        java.lang.String str10 = document1.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.firstElementSibling();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        boolean boolean4 = document1.hasClass("");
        java.lang.String str5 = document1.className();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element8 = document7.head();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = document7.previousSibling();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.nodes.Element element10 = element6.removeClass("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = element6.nextSibling();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("#document");
        org.jsoup.nodes.Attributes attributes4 = document1.attributes();
        org.jsoup.nodes.Document document5 = document1.normalise();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("<#root>\n</#root>", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document1.prependText("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element10.nextElementSibling();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.prependText("#document");
        boolean boolean9 = element7.hasClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element7.addClass("#document");
        org.jsoup.select.Elements elements12 = element7.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = element7.previousSibling();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int18 = document1.siblingIndex();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueStarting("hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.previousElementSibling();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = element3.text();
        element3.setBaseUri("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element3.previousElementSibling();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.data();
        org.jsoup.nodes.Document document10 = document1.normalise();
        document10.title("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document10.siblingNodes();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = document1.prepend("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = element8.nextSibling();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element7 = document1.addClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.appendText("");
        java.lang.String str11 = element7.attr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element7.previousElementSibling();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
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
        java.lang.String str17 = element14.absUrl("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements19 = element14.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element21 = element14.prepend("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int22 = element21.siblingIndex();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document8 = document1.normalise();
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Element element11 = document1.val("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element11.nextElementSibling();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = element3.previousSibling();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document4 = document1.normalise();
        org.jsoup.select.Elements elements5 = document4.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document4.siblingNodes();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element14.siblingNodes();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.nodeName();
        boolean boolean8 = document1.hasText();
        boolean boolean9 = document1.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("hi!");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element34 = element3.previousElementSibling();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = element3.text();
        org.jsoup.select.Elements elements6 = element3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements8 = element3.getElementsByIndexEquals(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element3.lastElementSibling();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document1.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str10 = document1.val();
        org.jsoup.select.Elements elements13 = document1.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = document1.previousSibling();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.val();
        org.jsoup.nodes.Element element4 = document1.prepend("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.previousElementSibling();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
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
        org.jsoup.select.Elements elements26 = element25.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node27 = element25.previousSibling();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
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
        org.jsoup.select.Elements elements19 = document1.getElementsByIndexLessThan(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = document1.text("<#root>\n</#root>");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.removeClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int15 = element14.elementSiblingIndex();
        org.jsoup.nodes.Element element16 = element14.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements17 = element14.siblingElements();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
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
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element22 = document20.appendText("");
        java.lang.String str23 = document20.title();
        org.jsoup.nodes.Node node25 = document20.removeAttr("hi!");
        java.lang.Integer int26 = document20.elementSiblingIndex();
        org.jsoup.nodes.Element element27 = document1.prependChild((org.jsoup.nodes.Node) document20);
        java.util.Set<java.lang.String> strSet28 = document1.classNames();
        org.jsoup.nodes.Element element30 = document1.removeClass("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node31 = element30.nextSibling();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        boolean boolean4 = document1.hasClass("");
        java.lang.String str5 = document1.className();
        org.jsoup.select.Elements elements6 = document1.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = document1.nextSibling();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        java.lang.Integer int8 = document1.elementSiblingIndex();
        org.jsoup.select.Elements elements9 = document1.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.text("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("#document");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document7.text("");
        org.jsoup.nodes.Node node11 = element9.removeAttr("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag14 = document13.tag();
        org.jsoup.nodes.Document document15 = document13.normalise();
        org.jsoup.nodes.Element element17 = document15.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element19 = element17.prependText("#document");
        boolean boolean21 = element19.hasClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element23 = element19.addClass("#document");
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("");
        java.lang.String str26 = document25.baseUri();
        java.lang.String str27 = document25.outerHtml();
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("");
        java.lang.String str30 = document29.baseUri();
        org.jsoup.nodes.Element element31 = document25.appendChild((org.jsoup.nodes.Node) document29);
        org.jsoup.nodes.Document document33 = new org.jsoup.nodes.Document("");
        java.lang.String str34 = document33.baseUri();
        org.jsoup.select.Elements elements36 = document33.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element38 = document33.val("");
        org.jsoup.nodes.Node node40 = document33.removeAttr("#root");
        boolean boolean41 = document25.equals((java.lang.Object) node40);
        java.lang.String str42 = document25.data();
        org.jsoup.nodes.Document document44 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element46 = document44.appendText("");
        java.lang.String str47 = document44.title();
        org.jsoup.nodes.Node node49 = document44.removeAttr("hi!");
        java.lang.Integer int50 = document44.elementSiblingIndex();
        org.jsoup.nodes.Element element51 = document25.prependChild((org.jsoup.nodes.Node) document44);
        java.util.Set<java.lang.String> strSet52 = document25.classNames();
        org.jsoup.nodes.Element element53 = element19.classNames(strSet52);
        org.jsoup.nodes.Element element54 = element9.classNames(strSet52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList55 = element54.siblingNodes();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = document1.previousSibling();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.select.Elements elements7 = document1.getAllElements();
        java.lang.String str8 = document1.tagName();
        org.jsoup.nodes.Element element10 = document1.toggleClass("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element10.firstElementSibling();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node3 = document1.nextSibling();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList20 = document1.siblingNodes();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.select.Elements elements5 = document1.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document1.lastElementSibling();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexEquals((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.lastElementSibling();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
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
        org.jsoup.select.Elements elements28 = document21.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = document21.text("#root");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
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
        java.lang.String str31 = document1.toString();
        org.jsoup.select.Elements elements33 = document1.getElementsByIndexGreaterThan((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node34 = document1.nextSibling();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.toggleClass("<#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements4 = element3.siblingElements();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.wrap("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Element element9 = document1.toggleClass("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = document1.previousSibling();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.outerHtml();
        java.lang.String str4 = document1.attr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document1.append("hi!");
        java.lang.String str7 = document1.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.wrap("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements18 = document1.siblingElements();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        java.lang.Integer int8 = document1.elementSiblingIndex();
        org.jsoup.select.Elements elements9 = document1.getAllElements();
        org.jsoup.nodes.Element element11 = document1.html("hi!hi!");
        org.jsoup.nodes.Element element13 = element11.addClass("\n <hi!>\n </hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = element11.nextSibling();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document1.text("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.val();
        org.jsoup.nodes.Element element4 = document1.prepend("hi!");
        boolean boolean5 = element4.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element4.nextElementSibling();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = document1.nextSibling();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
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
        java.lang.String str17 = element14.absUrl("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements19 = element14.getElementsByIndexLessThan((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList20 = element14.siblingNodes();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements29 = element28.siblingElements();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        boolean boolean4 = document1.hasClass("");
        java.lang.String str5 = document1.className();
        java.lang.String str6 = document1.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = document1.nextSibling();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element4 = document1.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document1.wrap("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.val();
        org.jsoup.nodes.Element element3 = document1.body();
        org.jsoup.nodes.Element element5 = document1.val("#document hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document1.previousElementSibling();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.outerHtml();
        boolean boolean8 = document1.hasClass("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.text("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.select.Elements elements9 = document7.getElementsByClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document7.firstElementSibling();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.select.Elements elements5 = document1.getAllElements();
        java.lang.String str6 = document1.id();
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexLessThan(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.wrap("\n <hi!>\n </hi!>");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueEnding("#document", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.nextElementSibling();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        java.lang.String str9 = element6.text();
        java.lang.String str10 = element6.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element6.previousElementSibling();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = document1.id();
        org.jsoup.nodes.Element element10 = document1.removeClass("<#root>\n</#root>");
        org.jsoup.nodes.Element element12 = document1.getElementById("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document1.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("#document hi!");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        element13.remove();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element13.wrap("\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.select.Elements elements10 = element6.getElementsByTag("#document");
        java.lang.Integer int11 = element6.elementSiblingIndex();
        org.jsoup.nodes.Element element12 = element6.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element12.lastElementSibling();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.appendElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element3.previousElementSibling();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements15 = document1.siblingElements();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str2 = document1.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        java.lang.String str5 = document1.text();
        java.lang.String str6 = document1.html();
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.removeClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int15 = element14.elementSiblingIndex();
        org.jsoup.nodes.Element element16 = element14.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element14.firstElementSibling();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.removeClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int15 = element14.elementSiblingIndex();
        org.jsoup.nodes.Element element18 = element14.attr("<html>\n <head>\n </head>\n <body>\n </body>\n</html>", "#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = element14.nextSibling();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean8 = document1.hasClass("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = element3.text();
        java.lang.String str5 = element3.data();
        org.jsoup.nodes.Element element6 = element3.parent();
        org.jsoup.nodes.Element element9 = element3.attr("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = element3.previousSibling();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.select.Elements elements5 = document1.getAllElements();
        java.lang.String str6 = document1.id();
        org.jsoup.nodes.Element element8 = document1.removeClass("hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node59 = element43.previousSibling();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document4 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.nextElementSibling();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str2 = document1.id();
        org.jsoup.nodes.Element element4 = document1.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document1.prependText("#document hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.lastElementSibling();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueContaining("<#root>\n</#root>", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element11 = document1.body();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.lastElementSibling();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements7 = document1.getElementsByIndexEquals(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.previousElementSibling();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document1.previousElementSibling();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("#root");
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueEnding("#document", "#document");
        org.jsoup.nodes.Element element9 = document1.val("hi!");
        org.jsoup.nodes.Element element11 = document1.prepend("#document");
        org.jsoup.nodes.Element element13 = document1.append("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements14 = element13.siblingElements();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.nodes.Element element4 = document1.val("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet5 = document1.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
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
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element22 = document20.appendText("");
        java.lang.String str23 = document20.title();
        org.jsoup.nodes.Node node25 = document20.removeAttr("hi!");
        java.lang.Integer int26 = document20.elementSiblingIndex();
        org.jsoup.nodes.Element element27 = document1.prependChild((org.jsoup.nodes.Node) document20);
        java.util.Set<java.lang.String> strSet28 = document1.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements29 = document1.siblingElements();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.nodes.Element element10 = element6.removeClass("#root");
        java.util.Set<java.lang.String> strSet11 = element6.classNames();
        java.lang.String str12 = element6.id();
        org.jsoup.select.Elements elements13 = element6.children();
        org.jsoup.select.Elements elements15 = element6.getElementsByIndexEquals((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = element6.previousSibling();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("#root");
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueEnding("#document", "#document");
        org.jsoup.nodes.Element element9 = document1.val("hi!");
        org.jsoup.nodes.Element element11 = document1.prepend("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("hi!");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element33 = document1.lastElementSibling();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.prependText("#document");
        boolean boolean9 = element7.hasClass("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element7.siblingNodes();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        document1.setBaseUri("");
        java.lang.String str9 = document1.val();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document1.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements11 = document1.siblingElements();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element7.previousElementSibling();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document8.wrap("#root");
        org.jsoup.nodes.Element element12 = document8.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements13 = document8.siblingElements();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        java.lang.String str10 = element6.absUrl("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element12 = element6.appendText("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element6.firstElementSibling();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.prependText("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexLessThan(1);
        org.jsoup.nodes.Element element11 = element7.val("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements12 = element11.siblingElements();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Element element11 = document1.val("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.lang.String str12 = element11.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = element11.nextSibling();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexLessThan((int) (short) -1);
        java.lang.String str7 = document1.className();
        org.jsoup.nodes.Element element9 = document1.prependText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element9.previousElementSibling();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.html();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Node node8 = document1.removeAttr("hi! #root hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.firstElementSibling();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.select.Elements elements10 = element6.getElementsByTag("#document");
        org.jsoup.nodes.Element element11 = element6.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element11.siblingNodes();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.title();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValue("<#root>\n</#root>", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = document1.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements15 = document1.getElementsByAttributeValue("#root", "<#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("hi!");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        java.lang.String str4 = document1.html();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("hi!");
        java.lang.String str7 = document1.outerHtml();
        org.jsoup.nodes.Element element9 = document1.prepend("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = element9.previousSibling();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int20 = element16.siblingIndex();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueEnding("#document", "hi!");
        org.jsoup.nodes.Element element11 = document1.parent();
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexLessThan((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document1.lastElementSibling();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = document1.id();
        org.jsoup.nodes.Element element10 = document1.removeClass("<#root>\n</#root>");
        org.jsoup.nodes.Element element12 = document1.getElementById("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.outerHtml();
        org.jsoup.select.Elements elements8 = document1.getElementsByTag("#document");
        java.lang.String str9 = document1.title();
        java.lang.String str10 = document1.val();
        org.jsoup.nodes.Element element12 = document1.removeClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element12.lastElementSibling();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str7 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = document1.nextSibling();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element27.lastElementSibling();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element47 = element46.lastElementSibling();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.title();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByClass("#document");
        java.lang.String str9 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = document1.nextSibling();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
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
        java.lang.String str19 = document9.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = document9.text("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element7 = document1.addClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.appendText("");
        java.lang.String str11 = element7.attr("");
        org.jsoup.nodes.Element element13 = element7.append("");
        org.jsoup.nodes.Attributes attributes14 = element7.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element7.wrap("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.outerHtml();
        java.util.Set<java.lang.String> strSet3 = document1.classNames();
        org.jsoup.nodes.Element element5 = document1.appendText("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document1.previousElementSibling();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = element3.nextSibling();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.lang.String str7 = document1.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.previousElementSibling();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str7 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = document1.text("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = element4.nextSibling();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = document1.nextSibling();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.outerHtml();
        java.lang.String str4 = document1.attr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document1.appendText("");
        org.jsoup.nodes.Node node8 = element6.removeAttr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = element6.nextSibling();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
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
        java.lang.String str31 = document1.toString();
        org.jsoup.select.Elements elements34 = document1.getElementsByAttributeValueStarting("#document", "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = document1.nextElementSibling();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
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
        org.jsoup.nodes.Element element19 = document1.head();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = document1.previousSibling();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.title();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValue("<#root>\n</#root>", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.previousElementSibling();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = document1.id();
        org.jsoup.nodes.Element element10 = document1.removeClass("<#root>\n</#root>");
        java.lang.Integer int11 = document1.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document1.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.title();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByClass("#document");
        java.lang.String str9 = document1.title();
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexGreaterThan(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.previousElementSibling();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
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
        java.lang.String str17 = element14.absUrl("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str18 = element14.val();
        org.jsoup.select.Elements elements21 = element14.getElementsByAttributeValueEnding("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element14.lastElementSibling();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document7.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document7.lastElementSibling();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = document1.id();
        org.jsoup.nodes.Element element10 = document1.removeClass("<#root>\n</#root>");
        java.lang.String str12 = element10.absUrl("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element10.previousElementSibling();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = document20.text("<#root>\n</#root>");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("hi!hi!");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueContaining("hi!", "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element11 = document1.appendElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document1.text("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.title();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByClass("#document");
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Document document10 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements11 = document1.siblingElements();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements9 = document1.siblingElements();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        boolean boolean4 = document1.hasClass("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("#root");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
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
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element22 = document20.appendText("");
        java.lang.String str23 = document20.title();
        org.jsoup.nodes.Node node25 = document20.removeAttr("hi!");
        java.lang.Integer int26 = document20.elementSiblingIndex();
        org.jsoup.nodes.Element element27 = document1.prependChild((org.jsoup.nodes.Node) document20);
        java.util.Set<java.lang.String> strSet28 = document1.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = document1.text("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node26 = element25.previousSibling();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element2 = document1.body();
        org.jsoup.nodes.Element element4 = document1.appendElement("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.lastElementSibling();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("#root");
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueEnding("#document", "#document");
        org.jsoup.nodes.Element element9 = document1.val("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.previousElementSibling();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document1.text("\n <hi!>\n </hi!>");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        boolean boolean7 = element6.hasText();
        org.jsoup.select.Elements elements9 = element6.getElementsByIndexGreaterThan(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = element6.previousSibling();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.title();
        java.lang.String str6 = document1.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements7 = document1.siblingElements();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.select.Elements elements11 = document8.getElementsByAttributeValueNot("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>", "<html>\n<head>\n <title></title>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int12 = document8.siblingIndex();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
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
        org.jsoup.nodes.Element element19 = element14.appendText("hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements20 = element14.siblingElements();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        document1.title("#root");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = document1.parent();
        org.jsoup.nodes.Element element10 = document1.append("hi!hi!");
        org.jsoup.nodes.Element element12 = document1.removeClass("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document1.lastElementSibling();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
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
        org.jsoup.select.Elements elements17 = element14.select("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements18 = element14.siblingElements();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.prependText("#document");
        boolean boolean9 = element7.hasClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int10 = element7.siblingIndex();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("#document");
        org.jsoup.nodes.Attributes attributes4 = document1.attributes();
        org.jsoup.nodes.Document document5 = document1.normalise();
        org.jsoup.nodes.Element element7 = document5.prependElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element9 = document5.addClass("hi!");
        org.jsoup.nodes.Element element11 = document5.toggleClass("hi! #root hi!");
        org.jsoup.nodes.Element element13 = element11.removeClass("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements14 = element11.siblingElements();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        java.lang.String str6 = document1.outerHtml();
        boolean boolean7 = document1.hasText();
        org.jsoup.select.Elements elements9 = document1.getElementsByClass("#document");
        org.jsoup.nodes.Element element11 = document1.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexLessThan((int) '4');
        org.jsoup.nodes.Attributes attributes14 = document1.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = document1.previousSibling();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        element7.setBaseUri("hi!");
        java.lang.String str10 = element7.id();
        org.jsoup.nodes.Element element12 = element7.prependText("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int14 = element12.siblingIndex();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        element7.setBaseUri("hi!");
        java.lang.String str10 = element7.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element7.lastElementSibling();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueStarting("\n <hi!>\n </hi!>", "\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.nextElementSibling();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.parser.Tag tag4 = document1.tag();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Document document8 = document7.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements9 = document8.siblingElements();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.previousElementSibling();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.String str7 = document1.nodeName();
        boolean boolean9 = document1.hasAttr("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.appendText("");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        java.lang.String str16 = document15.baseUri();
        java.lang.String str17 = document15.outerHtml();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        java.lang.String str20 = document19.baseUri();
        org.jsoup.nodes.Element element21 = document15.appendChild((org.jsoup.nodes.Node) document19);
        boolean boolean22 = element13.equals((java.lang.Object) document19);
        org.jsoup.nodes.Element element24 = element13.removeClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element25 = document1.prependChild((org.jsoup.nodes.Node) element24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int26 = document1.siblingIndex();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = document1.previousSibling();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document6.appendText("");
        org.jsoup.nodes.Element element9 = document1.appendChild((org.jsoup.nodes.Node) document6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document6.text("<hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n</hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str7 = document1.attr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = document1.previousSibling();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        document1.setBaseUri("");
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueNot("#root", "<#root>\n</#root>");
        java.lang.String str12 = document1.text();
        org.jsoup.nodes.Element element14 = document1.prependText("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element14.wrap("\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document8.wrap("#root");
        org.jsoup.nodes.Element element12 = document8.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document8.firstElementSibling();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document1.siblingNodes();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.select.Elements elements10 = element6.getElementsByTag("#document");
        java.lang.Integer int11 = element6.elementSiblingIndex();
        org.jsoup.nodes.Element element12 = element6.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int13 = element6.siblingIndex();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        java.lang.String str9 = element6.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element6.siblingNodes();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.select("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document1.siblingNodes();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int4 = element3.siblingIndex();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = document1.removeClass("");
        org.jsoup.nodes.Element element7 = element5.toggleClass("#root");
        org.jsoup.select.Elements elements9 = element5.getElementsByTag("#root");
        java.lang.String str10 = element5.baseUri();
        java.lang.String str11 = element5.baseUri();
        org.jsoup.nodes.Element element13 = element5.prepend("<#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element5.nextElementSibling();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.title();
        java.lang.String str8 = document1.nodeName();
        java.lang.String str9 = document1.outerHtml();
        org.jsoup.nodes.Element element11 = document1.createElement("<#document hi!>\n</#document hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements12 = element11.siblingElements();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        org.jsoup.parser.Tag tag4 = element3.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = element3.previousElementSibling();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str2 = document1.id();
        org.jsoup.nodes.Element element4 = document1.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document1.prependText("#document hi!");
        org.jsoup.nodes.Element element8 = document1.appendElement("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document1.appendText("hi!\n<html>\n<head>\n <title>#root</title>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int11 = element10.siblingIndex();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Element element7 = document1.empty();
        boolean boolean8 = document1.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.nextElementSibling();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.lastElementSibling();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.title();
        java.lang.String str8 = document1.nodeName();
        org.jsoup.select.Elements elements9 = document1.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = document1.previousSibling();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n</hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements32 = element3.siblingElements();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element9 = element7.appendText("hi!");
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexGreaterThan(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int12 = element7.siblingIndex();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        boolean boolean4 = document1.hasAttr("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("hi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.nodes.Element element10 = element6.removeClass("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = element6.nextSibling();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
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
        org.jsoup.nodes.Element element36 = document1.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int37 = document1.siblingIndex();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
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
        org.jsoup.select.Elements elements16 = element14.getElementsByIndexGreaterThan(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element14.siblingNodes();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Element element7 = document1.empty();
        org.jsoup.nodes.Element element9 = element7.appendText("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsByIndexGreaterThan(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element9.nextElementSibling();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.prependText("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int8 = element5.siblingIndex();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        element7.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element7.previousElementSibling();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
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
        boolean boolean29 = element28.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int30 = element28.siblingIndex();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        document1.title("#root");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = document1.parent();
        org.jsoup.nodes.Element element10 = document1.append("hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.wrap("<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
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
        org.jsoup.nodes.Element element34 = document1.getElementById("#document");
        boolean boolean35 = document1.hasText();
        org.jsoup.nodes.Element element37 = document1.addClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element38 = element37.previousElementSibling();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.createElement("hi! #root hi!");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValue("#document hi!", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        java.lang.String str10 = document1.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.nextElementSibling();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.val();
        org.jsoup.nodes.Element element4 = document1.prepend("hi!");
        element4.setBaseUri("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element8 = element4.appendElement("\n <hi!>\n </hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element4.lastElementSibling();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
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
        org.jsoup.nodes.Element element31 = document8.body();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element33 = document8.text("hi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        boolean boolean4 = document1.hasClass("");
        java.lang.Integer int5 = document1.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements6 = document1.siblingElements();
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = element18.previousSibling();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
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
        org.jsoup.nodes.Attributes attributes16 = document1.attributes();
        org.jsoup.nodes.Element element18 = document1.toggleClass("<#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = element18.previousSibling();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.body();
        org.jsoup.select.Elements elements5 = document1.getElementsByAttributeValueStarting("#root", "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        java.lang.Integer int6 = document1.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.wrap("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
    }
}


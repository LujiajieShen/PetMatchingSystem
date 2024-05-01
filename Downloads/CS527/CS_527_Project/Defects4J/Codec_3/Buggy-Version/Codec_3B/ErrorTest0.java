import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("", "hi!");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("", "hi!", false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("", "H");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!");
        java.lang.String str7 = doubleMetaphone0.encode("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("", "H", false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("", "hi!");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("", "hi!", true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("H");
        java.lang.String str6 = doubleMetaphone0.encode("");
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("", "hi!", true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        doubleMetaphone0.setMaxCodeLen(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("", "H", false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("", "H");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!");
        java.lang.String str7 = doubleMetaphone0.encode("");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("", "H", false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("H");
        java.lang.String str6 = doubleMetaphone0.encode("");
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("", "", true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = doubleMetaphone0.isDoubleMetaphoneEqual("", "hi!");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        int int6 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("", "H");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("H");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("H");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("", "hi!");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", true);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.getMaxCodeLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("", "", false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str14 = doubleMetaphone0.encode("hi!");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        java.lang.String str18 = doubleMetaphone0.encode("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) '#');
        int int21 = doubleMetaphone0.getMaxCodeLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean25 = doubleMetaphone0.isDoubleMetaphoneEqual("", "", true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str14 = doubleMetaphone0.encode("hi!");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        java.lang.String str18 = doubleMetaphone0.encode("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("", "H", false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("H");
        doubleMetaphone0.setMaxCodeLen(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("", "hi!", true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("", "", true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!");
        java.lang.String str7 = doubleMetaphone0.encode("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("", "H");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H", true);
        int int15 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("", "hi!");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("H");
        doubleMetaphone0.setMaxCodeLen(32);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("", "");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str7 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str12 = doubleMetaphone0.encode("hi!");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("", "");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("H");
        int int3 = doubleMetaphone0.getMaxCodeLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("", "hi!", false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((int) '4');
        doubleMetaphone0.setMaxCodeLen(0);
        int int7 = doubleMetaphone0.getMaxCodeLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("", "H");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("", "hi!", false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        java.lang.String str12 = doubleMetaphone0.encode("");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("", "hi!", false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!");
        doubleMetaphone0.setMaxCodeLen(4);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone12 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str14 = doubleMetaphone12.doubleMetaphone("H");
        boolean boolean17 = doubleMetaphone12.isDoubleMetaphoneEqual("H", "hi!");
        int int18 = doubleMetaphone12.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone12.new DoubleMetaphoneResult((int) (short) 1);
        doubleMetaphone12.setMaxCodeLen((int) 'a');
        java.lang.String str24 = doubleMetaphone12.encode("");
        int int25 = doubleMetaphone12.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult27 = doubleMetaphone12.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str29 = doubleMetaphone12.encode("hi!");
        java.lang.Object obj30 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean34 = doubleMetaphone0.isDoubleMetaphoneEqual("", "hi!", false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!");
        java.lang.String str11 = doubleMetaphone0.encode("H");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("", "hi!", false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("H");
        java.lang.String str6 = doubleMetaphone0.encode("");
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("", "H", false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("", "H", true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(0);
        doubleMetaphone0.setMaxCodeLen(32);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("H", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("", "");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("H");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("H", false);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("", "H", false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((int) '4');
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("", "hi!", false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H", true);
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone19 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str21 = doubleMetaphone19.doubleMetaphone("hi!");
        int int22 = doubleMetaphone19.getMaxCodeLen();
        boolean boolean26 = doubleMetaphone19.isDoubleMetaphoneEqual("H", "H", false);
        java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) "H");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean31 = doubleMetaphone0.isDoubleMetaphoneEqual("", "", true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H", true);
        java.lang.String str7 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("", false);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("", "hi!");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!");
        doubleMetaphone0.setMaxCodeLen(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("", "H", true);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!");
        doubleMetaphone0.setMaxCodeLen(35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("", "H", true);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("H");
        int int3 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!");
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("", "", false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H", true);
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H");
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("hi!", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("", "");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str7 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("", false);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!", false);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("", true);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("", "hi!#", false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("", "", true);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("H", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("", "hi!#", true);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("", "");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        java.lang.String str12 = doubleMetaphone0.encode("");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("", "hi!#", true);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("H");
        int int3 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str5 = doubleMetaphone0.encode("H");
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("H", false);
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("", "", false);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("", "hi!#");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H", true);
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H");
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("hi!", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("", "H");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("H");
        int int3 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str5 = doubleMetaphone0.encode("H");
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!#", "", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("", "hi!#", false);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("", "hi!");
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str7 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str12 = doubleMetaphone0.encode("hi!");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("hi!");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone15 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str17 = doubleMetaphone15.doubleMetaphone("hi!");
        java.lang.String str19 = doubleMetaphone15.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone15.new DoubleMetaphoneResult((int) (byte) -1);
        doubleMetaphoneResult21.append(' ');
        doubleMetaphoneResult21.append('4', '4');
        doubleMetaphoneResult21.append('#', ' ');
        java.lang.String str30 = doubleMetaphoneResult21.getAlternate();
        java.lang.Object obj31 = doubleMetaphone0.encode((java.lang.Object) str30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean34 = doubleMetaphone0.isDoubleMetaphoneEqual(" ", "hi!");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        java.lang.String str10 = doubleMetaphone0.encode("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual(" ", "hi!#");
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(0);
        int int7 = doubleMetaphone0.getMaxCodeLen();
        int int8 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("", "H", false);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H", true);
        java.lang.String str16 = doubleMetaphone0.encode("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual(" ", "hi!");
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!");
        java.lang.String str7 = doubleMetaphone0.encode("");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str11 = doubleMetaphone0.encode("H");
        int int12 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("hi!", true);
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H", true);
        java.lang.String str21 = doubleMetaphone0.encode("H");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("", "");
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual(" ", "H", false);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("hi!", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("", "hi!hi!");
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("H");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual(" ", "hi!#");
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("", "4", true);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("H");
        int int3 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str5 = doubleMetaphone0.encode("H");
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        java.lang.String str11 = doubleMetaphone0.encode("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("", "H", false);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H", true);
        int int15 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult23 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("", "H");
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual(" ", "hi!hi!");
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("hi!");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("", "HH", true);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("", "4# H", true);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H");
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual(" ", "HH", true);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H", true);
        java.lang.String str7 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("", "#");
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("H");
        java.lang.String str6 = doubleMetaphone0.encode("");
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("hi!hi!", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual(" ", "HH");
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str14 = doubleMetaphone0.encode("hi!");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        java.lang.String str18 = doubleMetaphone0.encode("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) '#');
        int int21 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str24 = doubleMetaphone0.doubleMetaphone("hi!", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean28 = doubleMetaphone0.isDoubleMetaphoneEqual(" ", "H", false);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H", true);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual(" ", "H4#", false);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) '#');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("H", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        java.lang.String str15 = doubleMetaphone0.encode("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("", "4# H");
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H", true);
        int int15 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H", false);
        int int20 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!");
        int int24 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult26 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        java.lang.String str29 = doubleMetaphone0.doubleMetaphone("", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean33 = doubleMetaphone0.isDoubleMetaphoneEqual("", "#", true);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        java.lang.String str12 = doubleMetaphone0.encode("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult(97);
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("4", "h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("", "H#a", false);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual(" ", "hi!# ", true);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", true);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("H", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H", true);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("4", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual(" ", "h", false);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H", true);
        java.lang.String str7 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("", true);
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.setMaxCodeLen(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual(" ", "# ", true);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("", "4# H");
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("H");
        java.lang.String str6 = doubleMetaphone0.encode("");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("", "4# H");
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("hi!", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("", "H#");
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("H");
        int int3 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("HH", true);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual(" ", "hi!#", false);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!");
        java.lang.String str11 = doubleMetaphone0.encode("H");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("H", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("", " ");
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H", true);
        int int15 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("", "a", false);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test82");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((int) '4');
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("", "HH");
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test83");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("H");
        doubleMetaphone0.setMaxCodeLen(32);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("", "HH");
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test84");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("", true);
        java.lang.String str17 = doubleMetaphone0.encode("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("", "H#");
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test85");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("", "HHH ");
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test86");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("", "Hah", true);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test87");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) '#');
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("hi!");
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!", true);
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("#", "HH", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean25 = doubleMetaphone0.isDoubleMetaphoneEqual("", "4# H");
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test88");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!");
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("A");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("", "H#a", false);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test89");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        int int3 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        doubleMetaphone0.setMaxCodeLen((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("", "");
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test90");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.setMaxCodeLen((int) '4');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        java.lang.String str17 = doubleMetaphone0.encode("H");
        doubleMetaphone0.setMaxCodeLen(1);
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult24 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean27 = doubleMetaphone0.isDoubleMetaphoneEqual("", "H");
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test91");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("H");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("", "Hah");
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test92");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("", true);
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "A");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("", "HHH ", true);
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test93");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str14 = doubleMetaphone0.encode("hi!");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        java.lang.String str18 = doubleMetaphone0.encode("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) '#');
        int int21 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean25 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "", false);
        int int26 = doubleMetaphone0.getMaxCodeLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean29 = doubleMetaphone0.isDoubleMetaphoneEqual("", "H4#");
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test94");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("H");
        doubleMetaphone0.setMaxCodeLen(32);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        java.lang.String str10 = doubleMetaphone0.encode("H4#");
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("4", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("", "", true);
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test95");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H", true);
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H");
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("hi!", true);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("4", true);
        int int26 = doubleMetaphone0.getMaxCodeLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean30 = doubleMetaphone0.isDoubleMetaphoneEqual("", "a#hi!HH", false);
    }

    @Test
    public void test96() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test96");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("H");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("4# H", true);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("hi!#4ahi!", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("", "HHa", true);
    }

    @Test
    public void test97() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test97");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str14 = doubleMetaphone0.encode("hi!");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        java.lang.String str18 = doubleMetaphone0.encode("");
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("hi!#hi!", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean29 = doubleMetaphone0.isDoubleMetaphoneEqual("", " ");
    }
}


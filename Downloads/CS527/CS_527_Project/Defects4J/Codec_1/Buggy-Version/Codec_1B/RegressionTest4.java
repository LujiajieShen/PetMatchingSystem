import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone6 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean9 = caverphone6.isCaverphoneEqual("hi!", "");
        java.lang.String str11 = caverphone6.encode("hi!");
        java.lang.String str13 = caverphone6.caverphone("1111111111");
        java.lang.String str15 = caverphone6.encode("1111111111");
        java.lang.Object obj16 = caverphone0.encode((java.lang.Object) "1111111111");
        boolean boolean19 = caverphone0.isCaverphoneEqual("1111111111", "hi!");
        java.lang.String str21 = caverphone0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone22 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean25 = caverphone22.isCaverphoneEqual("hi!", "");
        java.lang.String str27 = caverphone22.caverphone("");
        boolean boolean30 = caverphone22.isCaverphoneEqual("AA11111111", "");
        java.lang.String str32 = caverphone22.caverphone("AA11111111");
        java.lang.String str34 = caverphone22.caverphone("AA11111111");
        java.lang.String str36 = caverphone22.caverphone("hi!");
        java.lang.String str38 = caverphone22.caverphone("1111111111");
        java.lang.String str40 = caverphone22.caverphone("AA11111111");
        java.lang.String str42 = caverphone22.caverphone("");
        boolean boolean45 = caverphone22.isCaverphoneEqual("1111111111", "hi!");
        java.lang.Class<?> wildcardClass46 = caverphone22.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = caverphone0.encode((java.lang.Object) wildcardClass46);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "1111111111" + "'", obj16, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1111111111" + "'", str27, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "AA11111111" + "'", str32, "AA11111111");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AA11111111" + "'", str34, "AA11111111");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "AA11111111" + "'", str36, "AA11111111");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1111111111" + "'", str38, "1111111111");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "AA11111111" + "'", str40, "AA11111111");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1111111111" + "'", str42, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.String str15 = caverphone0.caverphone("hi!");
        java.lang.String str17 = caverphone0.encode("AA11111111");
        java.lang.String str19 = caverphone0.encode("");
        boolean boolean22 = caverphone0.isCaverphoneEqual("hi!", "");
        org.apache.commons.codec.language.Caverphone caverphone23 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean26 = caverphone23.isCaverphoneEqual("hi!", "");
        java.lang.String str28 = caverphone23.caverphone("AA11111111");
        boolean boolean31 = caverphone23.isCaverphoneEqual("", "");
        java.lang.String str33 = caverphone23.caverphone("AA11111111");
        java.lang.Object obj34 = caverphone0.encode((java.lang.Object) str33);
        java.lang.String str36 = caverphone0.caverphone("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone37 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean40 = caverphone37.isCaverphoneEqual("hi!", "");
        java.lang.String str42 = caverphone37.caverphone("");
        boolean boolean45 = caverphone37.isCaverphoneEqual("AA11111111", "");
        java.lang.String str47 = caverphone37.encode("1111111111");
        boolean boolean50 = caverphone37.isCaverphoneEqual("1111111111", "");
        java.lang.String str52 = caverphone37.caverphone("");
        java.lang.Object obj53 = caverphone0.encode((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1111111111" + "'", str19, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AA11111111" + "'", str28, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AA11111111" + "'", str33, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "AA11111111" + "'", obj34, "AA11111111");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1111111111" + "'", str36, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1111111111" + "'", str42, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1111111111" + "'", str47, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1111111111" + "'", str52, "1111111111");
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + "1111111111" + "'", obj53, "1111111111");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        org.apache.commons.codec.language.Caverphone caverphone7 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean10 = caverphone7.isCaverphoneEqual("hi!", "");
        java.lang.String str12 = caverphone7.encode("hi!");
        java.lang.String str14 = caverphone7.caverphone("1111111111");
        java.lang.Object obj15 = caverphone0.encode((java.lang.Object) str14);
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("hi!", "");
        boolean boolean22 = caverphone16.isCaverphoneEqual("", "hi!");
        java.lang.String str24 = caverphone16.caverphone("");
        boolean boolean27 = caverphone16.isCaverphoneEqual("", "1111111111");
        java.lang.Object obj29 = caverphone16.encode((java.lang.Object) "");
        java.lang.Object obj30 = caverphone0.encode(obj29);
        java.lang.String str32 = caverphone0.encode("1111111111");
        java.lang.String str34 = caverphone0.encode("hi!");
        boolean boolean37 = caverphone0.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.String str39 = caverphone0.encode("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "1111111111" + "'", obj15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1111111111" + "'", str24, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "1111111111" + "'", obj29, "1111111111");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "1111111111" + "'", obj30, "1111111111");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1111111111" + "'", str32, "1111111111");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AA11111111" + "'", str34, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "AA11111111" + "'", str39, "AA11111111");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.encode("hi!");
        java.lang.String str7 = caverphone0.caverphone("hi!");
        java.lang.String str9 = caverphone0.caverphone("hi!");
        java.lang.String str11 = caverphone0.caverphone("1111111111");
        java.lang.String str13 = caverphone0.encode("");
        boolean boolean16 = caverphone0.isCaverphoneEqual("", "AA11111111");
        java.lang.String str18 = caverphone0.encode("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("1111111111", "AA11111111");
        java.lang.String str15 = caverphone0.encode("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("hi!", "");
        java.lang.String str21 = caverphone16.caverphone("AA11111111");
        boolean boolean24 = caverphone16.isCaverphoneEqual("", "");
        org.apache.commons.codec.language.Caverphone caverphone25 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean28 = caverphone25.isCaverphoneEqual("hi!", "");
        java.lang.String str30 = caverphone25.encode("hi!");
        java.lang.String str32 = caverphone25.caverphone("1111111111");
        java.lang.String str34 = caverphone25.encode("1111111111");
        java.lang.Object obj35 = caverphone16.encode((java.lang.Object) "1111111111");
        org.apache.commons.codec.language.Caverphone caverphone36 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean39 = caverphone36.isCaverphoneEqual("hi!", "");
        java.lang.String str41 = caverphone36.caverphone("");
        boolean boolean44 = caverphone36.isCaverphoneEqual("AA11111111", "");
        java.lang.String str46 = caverphone36.encode("1111111111");
        java.lang.Object obj47 = caverphone16.encode((java.lang.Object) str46);
        java.lang.Object obj48 = caverphone0.encode(obj47);
        java.lang.String str50 = caverphone0.caverphone("");
        java.lang.String str52 = caverphone0.caverphone("");
        java.lang.String str54 = caverphone0.encode("");
        java.lang.String str56 = caverphone0.caverphone("AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AA11111111" + "'", str21, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "AA11111111" + "'", str30, "AA11111111");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1111111111" + "'", str32, "1111111111");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1111111111" + "'", str34, "1111111111");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "1111111111" + "'", obj35, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1111111111" + "'", str41, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1111111111" + "'", str46, "1111111111");
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + "1111111111" + "'", obj47, "1111111111");
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + "1111111111" + "'", obj48, "1111111111");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1111111111" + "'", str50, "1111111111");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1111111111" + "'", str52, "1111111111");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1111111111" + "'", str54, "1111111111");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "AA11111111" + "'", str56, "AA11111111");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "");
        org.apache.commons.codec.language.Caverphone caverphone14 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean17 = caverphone14.isCaverphoneEqual("1111111111", "");
        java.lang.Object obj18 = caverphone0.encode((java.lang.Object) "");
        java.lang.String str20 = caverphone0.caverphone("1111111111");
        boolean boolean23 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str25 = caverphone0.encode("1111111111");
        java.lang.String str27 = caverphone0.encode("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone28 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean31 = caverphone28.isCaverphoneEqual("hi!", "");
        java.lang.String str33 = caverphone28.caverphone("");
        boolean boolean36 = caverphone28.isCaverphoneEqual("AA11111111", "");
        java.lang.String str38 = caverphone28.caverphone("AA11111111");
        java.lang.String str40 = caverphone28.caverphone("AA11111111");
        java.lang.String str42 = caverphone28.caverphone("AA11111111");
        java.lang.String str44 = caverphone28.caverphone("");
        java.lang.Object obj45 = caverphone0.encode((java.lang.Object) "");
        boolean boolean48 = caverphone0.isCaverphoneEqual("hi!", "AA11111111");
        java.lang.String str50 = caverphone0.encode("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "1111111111" + "'", obj18, "1111111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1111111111" + "'", str20, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1111111111" + "'", str25, "1111111111");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "AA11111111" + "'", str27, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1111111111" + "'", str33, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "AA11111111" + "'", str38, "AA11111111");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "AA11111111" + "'", str40, "AA11111111");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "AA11111111" + "'", str42, "AA11111111");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1111111111" + "'", str44, "1111111111");
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + "1111111111" + "'", obj45, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1111111111" + "'", str50, "1111111111");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        java.lang.String str10 = caverphone0.encode("");
        java.lang.String str12 = caverphone0.caverphone("1111111111");
        boolean boolean15 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str17 = caverphone0.caverphone("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone18 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean21 = caverphone18.isCaverphoneEqual("hi!", "");
        boolean boolean24 = caverphone18.isCaverphoneEqual("", "hi!");
        java.lang.String str26 = caverphone18.caverphone("");
        boolean boolean29 = caverphone18.isCaverphoneEqual("1111111111", "AA11111111");
        java.lang.String str31 = caverphone18.encode("hi!");
        boolean boolean34 = caverphone18.isCaverphoneEqual("", "1111111111");
        java.lang.Object obj35 = caverphone0.encode((java.lang.Object) "1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111" + "'", str12, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1111111111" + "'", str26, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AA11111111" + "'", str31, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "1111111111" + "'", obj35, "1111111111");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str8 = caverphone0.caverphone("AA11111111");
        java.lang.String str10 = caverphone0.encode("1111111111");
        java.lang.String str12 = caverphone0.caverphone("hi!");
        org.apache.commons.codec.language.Caverphone caverphone13 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean16 = caverphone13.isCaverphoneEqual("hi!", "");
        boolean boolean19 = caverphone13.isCaverphoneEqual("", "hi!");
        java.lang.String str21 = caverphone13.caverphone("");
        boolean boolean24 = caverphone13.isCaverphoneEqual("", "1111111111");
        boolean boolean27 = caverphone13.isCaverphoneEqual("", "");
        java.lang.String str29 = caverphone13.caverphone("hi!");
        java.lang.String str31 = caverphone13.caverphone("");
        java.lang.String str33 = caverphone13.caverphone("hi!");
        boolean boolean36 = caverphone13.isCaverphoneEqual("", "AA11111111");
        boolean boolean39 = caverphone13.isCaverphoneEqual("AA11111111", "1111111111");
        java.lang.Object obj40 = caverphone0.encode((java.lang.Object) "1111111111");
        boolean boolean43 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str45 = caverphone0.caverphone("hi!");
        boolean boolean48 = caverphone0.isCaverphoneEqual("hi!", "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AA11111111" + "'", str29, "AA11111111");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1111111111" + "'", str31, "1111111111");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AA11111111" + "'", str33, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "1111111111" + "'", obj40, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "AA11111111" + "'", str45, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str13 = caverphone0.encode("hi!");
        java.lang.String str15 = caverphone0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("1111111111", "");
        boolean boolean22 = caverphone16.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str24 = caverphone16.encode("AA11111111");
        java.lang.Object obj25 = caverphone0.encode((java.lang.Object) "AA11111111");
        java.lang.String str27 = caverphone0.encode("");
        boolean boolean30 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str32 = caverphone0.caverphone("hi!");
        java.lang.String str34 = caverphone0.caverphone("AA11111111");
        java.lang.Class<?> wildcardClass35 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AA11111111" + "'", str24, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "AA11111111" + "'", obj25, "AA11111111");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1111111111" + "'", str27, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "AA11111111" + "'", str32, "AA11111111");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AA11111111" + "'", str34, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        boolean boolean9 = caverphone0.isCaverphoneEqual("AA11111111", "1111111111");
        java.lang.String str11 = caverphone0.caverphone("");
        java.lang.String str13 = caverphone0.encode("hi!");
        java.lang.String str15 = caverphone0.encode("hi!");
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = caverphone0.encode(obj16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone6 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean9 = caverphone6.isCaverphoneEqual("hi!", "");
        java.lang.String str11 = caverphone6.encode("hi!");
        java.lang.String str13 = caverphone6.caverphone("1111111111");
        java.lang.String str15 = caverphone6.encode("1111111111");
        java.lang.Object obj16 = caverphone0.encode((java.lang.Object) "1111111111");
        org.apache.commons.codec.language.Caverphone caverphone17 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean20 = caverphone17.isCaverphoneEqual("hi!", "");
        java.lang.String str22 = caverphone17.caverphone("");
        boolean boolean25 = caverphone17.isCaverphoneEqual("AA11111111", "");
        java.lang.String str27 = caverphone17.caverphone("AA11111111");
        java.lang.String str29 = caverphone17.caverphone("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone30 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean33 = caverphone30.isCaverphoneEqual("hi!", "");
        boolean boolean36 = caverphone30.isCaverphoneEqual("", "hi!");
        java.lang.String str38 = caverphone30.caverphone("");
        boolean boolean41 = caverphone30.isCaverphoneEqual("", "1111111111");
        boolean boolean44 = caverphone30.isCaverphoneEqual("", "");
        java.lang.String str46 = caverphone30.caverphone("hi!");
        java.lang.String str48 = caverphone30.caverphone("");
        java.lang.String str50 = caverphone30.caverphone("hi!");
        java.lang.Object obj51 = caverphone17.encode((java.lang.Object) str50);
        java.lang.String str53 = caverphone17.encode("AA11111111");
        boolean boolean56 = caverphone17.isCaverphoneEqual("hi!", "hi!");
        java.lang.Object obj57 = caverphone0.encode((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "1111111111" + "'", obj16, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1111111111" + "'", str22, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "AA11111111" + "'", str27, "AA11111111");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AA11111111" + "'", str29, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1111111111" + "'", str38, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "AA11111111" + "'", str46, "AA11111111");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1111111111" + "'", str48, "1111111111");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "AA11111111" + "'", str50, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + "AA11111111" + "'", obj51, "AA11111111");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "AA11111111" + "'", str53, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + "AA11111111" + "'", obj57, "AA11111111");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "");
        java.lang.String str5 = caverphone0.caverphone("1111111111");
        java.lang.String str7 = caverphone0.encode("");
        java.lang.String str9 = caverphone0.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone10 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean13 = caverphone10.isCaverphoneEqual("hi!", "");
        java.lang.String str15 = caverphone10.caverphone("");
        boolean boolean18 = caverphone10.isCaverphoneEqual("AA11111111", "");
        java.lang.String str20 = caverphone10.encode("1111111111");
        boolean boolean23 = caverphone10.isCaverphoneEqual("1111111111", "AA11111111");
        java.lang.String str25 = caverphone10.encode("AA11111111");
        java.lang.Object obj26 = caverphone0.encode((java.lang.Object) str25);
        org.apache.commons.codec.language.Caverphone caverphone27 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean30 = caverphone27.isCaverphoneEqual("hi!", "");
        boolean boolean33 = caverphone27.isCaverphoneEqual("", "hi!");
        java.lang.String str35 = caverphone27.caverphone("");
        boolean boolean38 = caverphone27.isCaverphoneEqual("", "1111111111");
        boolean boolean41 = caverphone27.isCaverphoneEqual("", "");
        boolean boolean44 = caverphone27.isCaverphoneEqual("", "");
        java.lang.String str46 = caverphone27.caverphone("");
        boolean boolean49 = caverphone27.isCaverphoneEqual("AA11111111", "");
        java.lang.String str51 = caverphone27.caverphone("AA11111111");
        java.lang.Object obj52 = caverphone0.encode((java.lang.Object) str51);
        java.lang.String str54 = caverphone0.encode("hi!");
        java.lang.Class<?> wildcardClass55 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111" + "'", str7, "1111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1111111111" + "'", str20, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "AA11111111" + "'", str25, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "AA11111111" + "'", obj26, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1111111111" + "'", str35, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1111111111" + "'", str46, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "AA11111111" + "'", str51, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + "AA11111111" + "'", obj52, "AA11111111");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "AA11111111" + "'", str54, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        boolean boolean14 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str16 = caverphone0.caverphone("hi!");
        java.lang.String str18 = caverphone0.caverphone("");
        java.lang.String str20 = caverphone0.caverphone("hi!");
        boolean boolean23 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean26 = caverphone0.isCaverphoneEqual("AA11111111", "1111111111");
        boolean boolean29 = caverphone0.isCaverphoneEqual("1111111111", "1111111111");
        java.lang.String str31 = caverphone0.encode("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AA11111111" + "'", str31, "AA11111111");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("1111111111", "AA11111111");
        java.lang.String str15 = caverphone0.encode("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("hi!", "");
        java.lang.String str21 = caverphone16.caverphone("AA11111111");
        boolean boolean24 = caverphone16.isCaverphoneEqual("", "");
        org.apache.commons.codec.language.Caverphone caverphone25 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean28 = caverphone25.isCaverphoneEqual("hi!", "");
        java.lang.String str30 = caverphone25.encode("hi!");
        java.lang.String str32 = caverphone25.caverphone("1111111111");
        java.lang.String str34 = caverphone25.encode("1111111111");
        java.lang.Object obj35 = caverphone16.encode((java.lang.Object) "1111111111");
        org.apache.commons.codec.language.Caverphone caverphone36 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean39 = caverphone36.isCaverphoneEqual("hi!", "");
        java.lang.String str41 = caverphone36.caverphone("");
        boolean boolean44 = caverphone36.isCaverphoneEqual("AA11111111", "");
        java.lang.String str46 = caverphone36.encode("1111111111");
        java.lang.Object obj47 = caverphone16.encode((java.lang.Object) str46);
        java.lang.Object obj48 = caverphone0.encode(obj47);
        java.lang.String str50 = caverphone0.caverphone("1111111111");
        java.lang.String str52 = caverphone0.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone53 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean56 = caverphone53.isCaverphoneEqual("hi!", "");
        boolean boolean59 = caverphone53.isCaverphoneEqual("", "hi!");
        java.lang.String str61 = caverphone53.caverphone("");
        boolean boolean64 = caverphone53.isCaverphoneEqual("", "1111111111");
        boolean boolean67 = caverphone53.isCaverphoneEqual("", "");
        boolean boolean70 = caverphone53.isCaverphoneEqual("", "");
        java.lang.String str72 = caverphone53.caverphone("hi!");
        org.apache.commons.codec.language.Caverphone caverphone73 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean76 = caverphone73.isCaverphoneEqual("1111111111", "");
        boolean boolean79 = caverphone73.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str81 = caverphone73.encode("");
        boolean boolean84 = caverphone73.isCaverphoneEqual("1111111111", "");
        java.lang.String str86 = caverphone73.caverphone("1111111111");
        java.lang.Object obj87 = caverphone53.encode((java.lang.Object) "1111111111");
        java.lang.Object obj88 = caverphone0.encode(obj87);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AA11111111" + "'", str21, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "AA11111111" + "'", str30, "AA11111111");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1111111111" + "'", str32, "1111111111");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1111111111" + "'", str34, "1111111111");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "1111111111" + "'", obj35, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1111111111" + "'", str41, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1111111111" + "'", str46, "1111111111");
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + "1111111111" + "'", obj47, "1111111111");
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + "1111111111" + "'", obj48, "1111111111");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1111111111" + "'", str50, "1111111111");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "AA11111111" + "'", str52, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "1111111111" + "'", str61, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "AA11111111" + "'", str72, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "1111111111" + "'", str81, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "1111111111" + "'", str86, "1111111111");
        org.junit.Assert.assertEquals("'" + obj87 + "' != '" + "1111111111" + "'", obj87, "1111111111");
        org.junit.Assert.assertEquals("'" + obj88 + "' != '" + "1111111111" + "'", obj88, "1111111111");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str15 = caverphone0.caverphone("AA11111111");
        boolean boolean18 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str20 = caverphone0.caverphone("AA11111111");
        java.lang.String str22 = caverphone0.caverphone("1111111111");
        java.lang.String str24 = caverphone0.caverphone("hi!");
        java.lang.String str26 = caverphone0.encode("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone27 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean30 = caverphone27.isCaverphoneEqual("hi!", "");
        java.lang.String str32 = caverphone27.caverphone("");
        boolean boolean35 = caverphone27.isCaverphoneEqual("AA11111111", "");
        java.lang.String str37 = caverphone27.encode("1111111111");
        boolean boolean40 = caverphone27.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.String str42 = caverphone27.caverphone("hi!");
        java.lang.String str44 = caverphone27.encode("1111111111");
        boolean boolean47 = caverphone27.isCaverphoneEqual("", "hi!");
        boolean boolean50 = caverphone27.isCaverphoneEqual("AA11111111", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = caverphone0.encode((java.lang.Object) caverphone27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1111111111" + "'", str22, "1111111111");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AA11111111" + "'", str24, "AA11111111");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "AA11111111" + "'", str26, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1111111111" + "'", str32, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1111111111" + "'", str37, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "AA11111111" + "'", str42, "AA11111111");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1111111111" + "'", str44, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone6 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean9 = caverphone6.isCaverphoneEqual("hi!", "");
        java.lang.String str11 = caverphone6.encode("hi!");
        java.lang.String str13 = caverphone6.caverphone("hi!");
        java.lang.String str15 = caverphone6.caverphone("hi!");
        java.lang.Object obj16 = caverphone0.encode((java.lang.Object) str15);
        java.lang.String str18 = caverphone0.caverphone("");
        boolean boolean21 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str23 = caverphone0.encode("1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "AA11111111" + "'", obj16, "AA11111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1111111111" + "'", str23, "1111111111");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str8 = caverphone0.encode("AA11111111");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("1111111111");
        java.lang.String str14 = caverphone0.encode("hi!");
        java.lang.Class<?> wildcardClass15 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111" + "'", str12, "1111111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.encode("hi!");
        java.lang.String str7 = caverphone0.caverphone("1111111111");
        java.lang.String str9 = caverphone0.encode("AA11111111");
        java.lang.String str11 = caverphone0.encode("hi!");
        java.lang.String str13 = caverphone0.caverphone("AA11111111");
        java.lang.Class<?> wildcardClass14 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111" + "'", str7, "1111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str13 = caverphone0.encode("hi!");
        java.lang.String str15 = caverphone0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("1111111111", "");
        boolean boolean22 = caverphone16.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str24 = caverphone16.encode("AA11111111");
        java.lang.Object obj25 = caverphone0.encode((java.lang.Object) "AA11111111");
        java.lang.String str27 = caverphone0.encode("");
        boolean boolean30 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str32 = caverphone0.encode("hi!");
        java.lang.String str34 = caverphone0.caverphone("hi!");
        java.lang.String str36 = caverphone0.caverphone("");
        boolean boolean39 = caverphone0.isCaverphoneEqual("AA11111111", "1111111111");
        boolean boolean42 = caverphone0.isCaverphoneEqual("1111111111", "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AA11111111" + "'", str24, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "AA11111111" + "'", obj25, "AA11111111");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1111111111" + "'", str27, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "AA11111111" + "'", str32, "AA11111111");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AA11111111" + "'", str34, "AA11111111");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1111111111" + "'", str36, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone13 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean16 = caverphone13.isCaverphoneEqual("hi!", "");
        boolean boolean19 = caverphone13.isCaverphoneEqual("", "hi!");
        java.lang.String str21 = caverphone13.caverphone("");
        boolean boolean24 = caverphone13.isCaverphoneEqual("", "1111111111");
        boolean boolean27 = caverphone13.isCaverphoneEqual("", "");
        java.lang.String str29 = caverphone13.caverphone("hi!");
        java.lang.String str31 = caverphone13.caverphone("");
        java.lang.String str33 = caverphone13.caverphone("hi!");
        java.lang.Object obj34 = caverphone0.encode((java.lang.Object) str33);
        java.lang.String str36 = caverphone0.encode("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AA11111111" + "'", str29, "AA11111111");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1111111111" + "'", str31, "1111111111");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AA11111111" + "'", str33, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "AA11111111" + "'", obj34, "AA11111111");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1111111111" + "'", str36, "1111111111");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "");
        org.apache.commons.codec.language.Caverphone caverphone9 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean12 = caverphone9.isCaverphoneEqual("hi!", "");
        java.lang.String str14 = caverphone9.encode("hi!");
        java.lang.String str16 = caverphone9.caverphone("1111111111");
        java.lang.String str18 = caverphone9.encode("1111111111");
        java.lang.Object obj19 = caverphone0.encode((java.lang.Object) "1111111111");
        java.lang.String str21 = caverphone0.caverphone("1111111111");
        java.lang.String str23 = caverphone0.encode("AA11111111");
        boolean boolean26 = caverphone0.isCaverphoneEqual("", "hi!");
        org.apache.commons.codec.language.Caverphone caverphone27 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean30 = caverphone27.isCaverphoneEqual("hi!", "");
        java.lang.String str32 = caverphone27.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone33 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean36 = caverphone33.isCaverphoneEqual("hi!", "");
        java.lang.String str38 = caverphone33.caverphone("");
        boolean boolean41 = caverphone33.isCaverphoneEqual("AA11111111", "");
        java.lang.String str43 = caverphone33.caverphone("AA11111111");
        java.lang.String str45 = caverphone33.caverphone("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone46 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean49 = caverphone46.isCaverphoneEqual("hi!", "");
        boolean boolean52 = caverphone46.isCaverphoneEqual("", "hi!");
        java.lang.String str54 = caverphone46.caverphone("");
        boolean boolean57 = caverphone46.isCaverphoneEqual("", "1111111111");
        boolean boolean60 = caverphone46.isCaverphoneEqual("", "");
        java.lang.String str62 = caverphone46.caverphone("hi!");
        java.lang.String str64 = caverphone46.caverphone("");
        java.lang.String str66 = caverphone46.caverphone("hi!");
        java.lang.Object obj67 = caverphone33.encode((java.lang.Object) str66);
        java.lang.String str69 = caverphone33.encode("AA11111111");
        java.lang.Object obj70 = caverphone27.encode((java.lang.Object) "AA11111111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj71 = caverphone0.encode((java.lang.Object) caverphone27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "1111111111" + "'", obj19, "1111111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AA11111111" + "'", str23, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "AA11111111" + "'", str32, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1111111111" + "'", str38, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "AA11111111" + "'", str43, "AA11111111");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "AA11111111" + "'", str45, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1111111111" + "'", str54, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "AA11111111" + "'", str62, "AA11111111");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "1111111111" + "'", str64, "1111111111");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "AA11111111" + "'", str66, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + "AA11111111" + "'", obj67, "AA11111111");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "AA11111111" + "'", str69, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + "AA11111111" + "'", obj70, "AA11111111");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.String str15 = caverphone0.caverphone("hi!");
        java.lang.String str17 = caverphone0.encode("1111111111");
        boolean boolean20 = caverphone0.isCaverphoneEqual("", "AA11111111");
        boolean boolean23 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str25 = caverphone0.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone26 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean29 = caverphone26.isCaverphoneEqual("hi!", "");
        java.lang.String str31 = caverphone26.encode("hi!");
        java.lang.String str33 = caverphone26.caverphone("AA11111111");
        java.lang.String str35 = caverphone26.caverphone("1111111111");
        java.lang.String str37 = caverphone26.encode("");
        java.lang.String str39 = caverphone26.encode("1111111111");
        java.lang.String str41 = caverphone26.encode("AA11111111");
        java.lang.Object obj42 = caverphone0.encode((java.lang.Object) str41);
        boolean boolean45 = caverphone0.isCaverphoneEqual("", "hi!");
        org.apache.commons.codec.language.Caverphone caverphone46 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean49 = caverphone46.isCaverphoneEqual("hi!", "");
        java.lang.String str51 = caverphone46.caverphone("AA11111111");
        java.lang.String str53 = caverphone46.encode("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone54 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean57 = caverphone54.isCaverphoneEqual("hi!", "");
        boolean boolean60 = caverphone54.isCaverphoneEqual("", "hi!");
        java.lang.String str62 = caverphone54.caverphone("");
        boolean boolean65 = caverphone54.isCaverphoneEqual("", "1111111111");
        java.lang.String str67 = caverphone54.encode("hi!");
        java.lang.String str69 = caverphone54.encode("");
        org.apache.commons.codec.language.Caverphone caverphone70 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean73 = caverphone70.isCaverphoneEqual("1111111111", "");
        boolean boolean76 = caverphone70.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str78 = caverphone70.encode("AA11111111");
        java.lang.Object obj79 = caverphone54.encode((java.lang.Object) "AA11111111");
        java.lang.String str81 = caverphone54.encode("");
        boolean boolean84 = caverphone54.isCaverphoneEqual("hi!", "");
        java.lang.String str86 = caverphone54.encode("hi!");
        java.lang.Object obj87 = caverphone46.encode((java.lang.Object) "hi!");
        java.lang.Object obj88 = caverphone0.encode((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1111111111" + "'", str25, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AA11111111" + "'", str31, "AA11111111");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AA11111111" + "'", str33, "AA11111111");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1111111111" + "'", str35, "1111111111");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1111111111" + "'", str37, "1111111111");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1111111111" + "'", str39, "1111111111");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "AA11111111" + "'", str41, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "AA11111111" + "'", obj42, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "AA11111111" + "'", str51, "AA11111111");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "AA11111111" + "'", str53, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "1111111111" + "'", str62, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "AA11111111" + "'", str67, "AA11111111");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "1111111111" + "'", str69, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "AA11111111" + "'", str78, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + "AA11111111" + "'", obj79, "AA11111111");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "1111111111" + "'", str81, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "AA11111111" + "'", str86, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj87 + "' != '" + "AA11111111" + "'", obj87, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj88 + "' != '" + "AA11111111" + "'", obj88, "AA11111111");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        boolean boolean14 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str16 = caverphone0.caverphone("hi!");
        java.lang.String str18 = caverphone0.caverphone("");
        java.lang.String str20 = caverphone0.caverphone("hi!");
        java.lang.String str22 = caverphone0.encode("");
        boolean boolean25 = caverphone0.isCaverphoneEqual("AA11111111", "hi!");
        boolean boolean28 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str30 = caverphone0.encode("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone31 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean34 = caverphone31.isCaverphoneEqual("hi!", "");
        java.lang.String str36 = caverphone31.caverphone("");
        boolean boolean39 = caverphone31.isCaverphoneEqual("AA11111111", "");
        java.lang.String str41 = caverphone31.caverphone("AA11111111");
        java.lang.String str43 = caverphone31.caverphone("AA11111111");
        java.lang.String str45 = caverphone31.caverphone("hi!");
        java.lang.String str47 = caverphone31.encode("1111111111");
        boolean boolean50 = caverphone31.isCaverphoneEqual("1111111111", "hi!");
        java.lang.String str52 = caverphone31.encode("AA11111111");
        boolean boolean55 = caverphone31.isCaverphoneEqual("", "");
        org.apache.commons.codec.language.Caverphone caverphone56 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean59 = caverphone56.isCaverphoneEqual("hi!", "");
        boolean boolean62 = caverphone56.isCaverphoneEqual("", "hi!");
        java.lang.String str64 = caverphone56.caverphone("");
        boolean boolean67 = caverphone56.isCaverphoneEqual("", "1111111111");
        java.lang.String str69 = caverphone56.encode("hi!");
        java.lang.String str71 = caverphone56.encode("");
        org.apache.commons.codec.language.Caverphone caverphone72 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean75 = caverphone72.isCaverphoneEqual("hi!", "");
        java.lang.String str77 = caverphone72.caverphone("");
        boolean boolean80 = caverphone72.isCaverphoneEqual("AA11111111", "");
        java.lang.Object obj81 = caverphone56.encode((java.lang.Object) "AA11111111");
        boolean boolean84 = caverphone56.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str86 = caverphone56.caverphone("hi!");
        boolean boolean89 = caverphone56.isCaverphoneEqual("hi!", "");
        java.lang.String str91 = caverphone56.caverphone("");
        java.lang.String str93 = caverphone56.encode("hi!");
        java.lang.Object obj94 = caverphone31.encode((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj95 = caverphone0.encode((java.lang.Object) caverphone31);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1111111111" + "'", str22, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1111111111" + "'", str30, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1111111111" + "'", str36, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "AA11111111" + "'", str41, "AA11111111");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "AA11111111" + "'", str43, "AA11111111");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "AA11111111" + "'", str45, "AA11111111");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1111111111" + "'", str47, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "AA11111111" + "'", str52, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "1111111111" + "'", str64, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "AA11111111" + "'", str69, "AA11111111");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "1111111111" + "'", str71, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "1111111111" + "'", str77, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + obj81 + "' != '" + "AA11111111" + "'", obj81, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "AA11111111" + "'", str86, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "1111111111" + "'", str91, "1111111111");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "AA11111111" + "'", str93, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj94 + "' != '" + "AA11111111" + "'", obj94, "AA11111111");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("hi!");
        org.apache.commons.codec.language.Caverphone caverphone13 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean16 = caverphone13.isCaverphoneEqual("hi!", "");
        java.lang.String str18 = caverphone13.caverphone("");
        boolean boolean21 = caverphone13.isCaverphoneEqual("AA11111111", "");
        java.lang.String str23 = caverphone13.caverphone("AA11111111");
        java.lang.String str25 = caverphone13.caverphone("AA11111111");
        java.lang.Object obj26 = caverphone0.encode((java.lang.Object) "AA11111111");
        java.lang.String str28 = caverphone0.caverphone("");
        java.lang.Class<?> wildcardClass29 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AA11111111" + "'", str23, "AA11111111");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "AA11111111" + "'", str25, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "AA11111111" + "'", obj26, "AA11111111");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1111111111" + "'", str28, "1111111111");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("1111111111", "AA11111111");
        java.lang.String str15 = caverphone0.encode("AA11111111");
        boolean boolean18 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str20 = caverphone0.caverphone("AA11111111");
        java.lang.String str22 = caverphone0.encode("");
        java.lang.String str24 = caverphone0.caverphone("1111111111");
        boolean boolean27 = caverphone0.isCaverphoneEqual("1111111111", "hi!");
        java.lang.String str29 = caverphone0.encode("AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1111111111" + "'", str22, "1111111111");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1111111111" + "'", str24, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AA11111111" + "'", str29, "AA11111111");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.encode("hi!");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("1111111111");
        java.lang.String str11 = caverphone0.encode("");
        java.lang.String str13 = caverphone0.encode("1111111111");
        java.lang.String str15 = caverphone0.encode("hi!");
        java.lang.String str17 = caverphone0.caverphone("1111111111");
        boolean boolean20 = caverphone0.isCaverphoneEqual("1111111111", "hi!");
        java.lang.String str22 = caverphone0.caverphone("1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1111111111" + "'", str22, "1111111111");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone13 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean16 = caverphone13.isCaverphoneEqual("hi!", "");
        boolean boolean19 = caverphone13.isCaverphoneEqual("", "hi!");
        java.lang.String str21 = caverphone13.caverphone("");
        boolean boolean24 = caverphone13.isCaverphoneEqual("", "1111111111");
        boolean boolean27 = caverphone13.isCaverphoneEqual("", "");
        java.lang.String str29 = caverphone13.caverphone("hi!");
        java.lang.String str31 = caverphone13.caverphone("");
        java.lang.String str33 = caverphone13.caverphone("hi!");
        java.lang.Object obj34 = caverphone0.encode((java.lang.Object) str33);
        boolean boolean37 = caverphone0.isCaverphoneEqual("1111111111", "1111111111");
        boolean boolean40 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AA11111111" + "'", str29, "AA11111111");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1111111111" + "'", str31, "1111111111");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AA11111111" + "'", str33, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "AA11111111" + "'", obj34, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str15 = caverphone0.caverphone("AA11111111");
        boolean boolean18 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str20 = caverphone0.caverphone("AA11111111");
        java.lang.String str22 = caverphone0.caverphone("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone23 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean26 = caverphone23.isCaverphoneEqual("1111111111", "");
        boolean boolean29 = caverphone23.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str31 = caverphone23.encode("AA11111111");
        java.lang.String str33 = caverphone23.encode("");
        boolean boolean36 = caverphone23.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str38 = caverphone23.caverphone("hi!");
        java.lang.Object obj39 = caverphone0.encode((java.lang.Object) "hi!");
        java.lang.String str41 = caverphone0.encode("AA11111111");
        boolean boolean44 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str46 = caverphone0.caverphone("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1111111111" + "'", str22, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AA11111111" + "'", str31, "AA11111111");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1111111111" + "'", str33, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "AA11111111" + "'", str38, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "AA11111111" + "'", obj39, "AA11111111");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "AA11111111" + "'", str41, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1111111111" + "'", str46, "1111111111");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.caverphone("1111111111");
        java.lang.String str4 = caverphone0.caverphone("1111111111");
        java.lang.String str6 = caverphone0.encode("hi!");
        java.lang.String str8 = caverphone0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111" + "'", str4, "1111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AA11111111" + "'", str6, "AA11111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str8 = caverphone0.encode("");
        java.lang.String str10 = caverphone0.caverphone("");
        java.lang.String str12 = caverphone0.encode("hi!");
        java.lang.String str14 = caverphone0.encode("hi!");
        java.lang.String str16 = caverphone0.encode("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        boolean boolean10 = caverphone0.isCaverphoneEqual("1111111111", "hi!");
        java.lang.String str12 = caverphone0.encode("hi!");
        java.lang.String str14 = caverphone0.encode("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.String str15 = caverphone0.caverphone("hi!");
        java.lang.String str17 = caverphone0.encode("1111111111");
        boolean boolean20 = caverphone0.isCaverphoneEqual("", "hi!");
        boolean boolean23 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str25 = caverphone0.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone26 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean29 = caverphone26.isCaverphoneEqual("1111111111", "");
        boolean boolean32 = caverphone26.isCaverphoneEqual("hi!", "hi!");
        boolean boolean35 = caverphone26.isCaverphoneEqual("AA11111111", "1111111111");
        java.lang.String str37 = caverphone26.caverphone("");
        java.lang.String str39 = caverphone26.caverphone("hi!");
        java.lang.String str41 = caverphone26.caverphone("hi!");
        java.lang.Object obj42 = caverphone0.encode((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "AA11111111" + "'", str25, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1111111111" + "'", str37, "1111111111");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "AA11111111" + "'", str39, "AA11111111");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "AA11111111" + "'", str41, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "AA11111111" + "'", obj42, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone6 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str8 = caverphone6.caverphone("1111111111");
        java.lang.String str10 = caverphone6.caverphone("1111111111");
        java.lang.String str12 = caverphone6.caverphone("AA11111111");
        java.lang.Object obj13 = caverphone0.encode((java.lang.Object) str12);
        boolean boolean16 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone17 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean20 = caverphone17.isCaverphoneEqual("hi!", "");
        java.lang.String str22 = caverphone17.caverphone("AA11111111");
        boolean boolean25 = caverphone17.isCaverphoneEqual("", "");
        org.apache.commons.codec.language.Caverphone caverphone26 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean29 = caverphone26.isCaverphoneEqual("hi!", "");
        java.lang.String str31 = caverphone26.encode("hi!");
        java.lang.String str33 = caverphone26.caverphone("1111111111");
        java.lang.String str35 = caverphone26.encode("1111111111");
        java.lang.Object obj36 = caverphone17.encode((java.lang.Object) "1111111111");
        java.lang.String str38 = caverphone17.caverphone("1111111111");
        boolean boolean41 = caverphone17.isCaverphoneEqual("", "");
        java.lang.String str43 = caverphone17.caverphone("AA11111111");
        java.lang.Object obj44 = caverphone0.encode((java.lang.Object) str43);
        boolean boolean47 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "AA11111111" + "'", obj13, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AA11111111" + "'", str22, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AA11111111" + "'", str31, "AA11111111");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1111111111" + "'", str33, "1111111111");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1111111111" + "'", str35, "1111111111");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "1111111111" + "'", obj36, "1111111111");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1111111111" + "'", str38, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "AA11111111" + "'", str43, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + "AA11111111" + "'", obj44, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.caverphone("1111111111");
        java.lang.String str4 = caverphone0.caverphone("1111111111");
        boolean boolean7 = caverphone0.isCaverphoneEqual("", "AA11111111");
        java.lang.String str9 = caverphone0.encode("hi!");
        java.lang.String str11 = caverphone0.encode("");
        java.lang.String str13 = caverphone0.encode("1111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111" + "'", str4, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str13 = caverphone0.encode("hi!");
        java.lang.String str15 = caverphone0.encode("");
        boolean boolean18 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str20 = caverphone0.encode("1111111111");
        java.lang.String str22 = caverphone0.caverphone("AA11111111");
        java.lang.Class<?> wildcardClass23 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1111111111" + "'", str20, "1111111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AA11111111" + "'", str22, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str8 = caverphone0.encode("");
        java.lang.String str10 = caverphone0.encode("hi!");
        java.lang.Class<?> wildcardClass11 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "");
        org.apache.commons.codec.language.Caverphone caverphone9 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean12 = caverphone9.isCaverphoneEqual("hi!", "");
        java.lang.String str14 = caverphone9.encode("hi!");
        java.lang.String str16 = caverphone9.caverphone("1111111111");
        java.lang.String str18 = caverphone9.encode("1111111111");
        java.lang.Object obj19 = caverphone0.encode((java.lang.Object) "1111111111");
        java.lang.String str21 = caverphone0.caverphone("1111111111");
        java.lang.String str23 = caverphone0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone24 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean27 = caverphone24.isCaverphoneEqual("hi!", "");
        java.lang.String str29 = caverphone24.encode("hi!");
        java.lang.String str31 = caverphone24.caverphone("1111111111");
        java.lang.String str33 = caverphone24.encode("1111111111");
        java.lang.Object obj34 = caverphone0.encode((java.lang.Object) "1111111111");
        java.lang.String str36 = caverphone0.caverphone("");
        boolean boolean39 = caverphone0.isCaverphoneEqual("", "AA11111111");
        java.lang.String str41 = caverphone0.encode("1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "1111111111" + "'", obj19, "1111111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1111111111" + "'", str23, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AA11111111" + "'", str29, "AA11111111");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1111111111" + "'", str31, "1111111111");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1111111111" + "'", str33, "1111111111");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "1111111111" + "'", obj34, "1111111111");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1111111111" + "'", str36, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1111111111" + "'", str41, "1111111111");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.String str15 = caverphone0.caverphone("hi!");
        java.lang.String str17 = caverphone0.encode("1111111111");
        boolean boolean20 = caverphone0.isCaverphoneEqual("", "AA11111111");
        boolean boolean23 = caverphone0.isCaverphoneEqual("AA11111111", "");
        org.apache.commons.codec.language.Caverphone caverphone24 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean27 = caverphone24.isCaverphoneEqual("hi!", "");
        java.lang.String str29 = caverphone24.caverphone("");
        boolean boolean32 = caverphone24.isCaverphoneEqual("AA11111111", "");
        java.lang.String str34 = caverphone24.encode("1111111111");
        boolean boolean37 = caverphone24.isCaverphoneEqual("AA11111111", "");
        java.lang.String str39 = caverphone24.caverphone("AA11111111");
        java.lang.Object obj40 = caverphone0.encode((java.lang.Object) str39);
        java.lang.String str42 = caverphone0.caverphone("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone43 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean46 = caverphone43.isCaverphoneEqual("hi!", "");
        java.lang.String str48 = caverphone43.caverphone("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = caverphone0.encode((java.lang.Object) caverphone43);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1111111111" + "'", str29, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1111111111" + "'", str34, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "AA11111111" + "'", str39, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "AA11111111" + "'", obj40, "AA11111111");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "AA11111111" + "'", str42, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1111111111" + "'", str48, "1111111111");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        boolean boolean9 = caverphone0.isCaverphoneEqual("AA11111111", "1111111111");
        java.lang.String str11 = caverphone0.caverphone("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone12 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean15 = caverphone12.isCaverphoneEqual("hi!", "");
        java.lang.String str17 = caverphone12.caverphone("");
        boolean boolean20 = caverphone12.isCaverphoneEqual("AA11111111", "");
        java.lang.String str22 = caverphone12.caverphone("AA11111111");
        java.lang.String str24 = caverphone12.caverphone("hi!");
        java.lang.String str26 = caverphone12.encode("AA11111111");
        java.lang.String str28 = caverphone12.caverphone("AA11111111");
        java.lang.String str30 = caverphone12.caverphone("1111111111");
        java.lang.String str32 = caverphone12.encode("AA11111111");
        java.lang.Object obj33 = caverphone0.encode((java.lang.Object) "AA11111111");
        java.lang.String str35 = caverphone0.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone36 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean39 = caverphone36.isCaverphoneEqual("1111111111", "");
        boolean boolean42 = caverphone36.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str44 = caverphone36.encode("");
        java.lang.String str46 = caverphone36.encode("hi!");
        boolean boolean49 = caverphone36.isCaverphoneEqual("1111111111", "1111111111");
        boolean boolean52 = caverphone36.isCaverphoneEqual("AA11111111", "1111111111");
        java.lang.Class<?> wildcardClass53 = caverphone36.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj54 = caverphone0.encode((java.lang.Object) wildcardClass53);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AA11111111" + "'", str22, "AA11111111");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AA11111111" + "'", str24, "AA11111111");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "AA11111111" + "'", str26, "AA11111111");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AA11111111" + "'", str28, "AA11111111");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1111111111" + "'", str30, "1111111111");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "AA11111111" + "'", str32, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "AA11111111" + "'", obj33, "AA11111111");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1111111111" + "'", str35, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1111111111" + "'", str44, "1111111111");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "AA11111111" + "'", str46, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("AA11111111");
        java.lang.String str14 = caverphone0.caverphone("hi!");
        java.lang.String str16 = caverphone0.encode("1111111111");
        java.lang.String str18 = caverphone0.caverphone("hi!");
        java.lang.String str20 = caverphone0.caverphone("hi!");
        java.lang.String str22 = caverphone0.encode("hi!");
        java.lang.Class<?> wildcardClass23 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AA11111111" + "'", str22, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("AA11111111");
        java.lang.String str14 = caverphone0.caverphone("hi!");
        java.lang.String str16 = caverphone0.encode("1111111111");
        java.lang.String str18 = caverphone0.caverphone("AA11111111");
        java.lang.String str20 = caverphone0.encode("AA11111111");
        java.lang.String str22 = caverphone0.caverphone("");
        boolean boolean25 = caverphone0.isCaverphoneEqual("", "hi!");
        boolean boolean28 = caverphone0.isCaverphoneEqual("", "1111111111");
        org.apache.commons.codec.language.Caverphone caverphone29 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean32 = caverphone29.isCaverphoneEqual("1111111111", "");
        boolean boolean35 = caverphone29.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str37 = caverphone29.caverphone("AA11111111");
        java.lang.String str39 = caverphone29.encode("1111111111");
        java.lang.String str41 = caverphone29.encode("1111111111");
        java.lang.String str43 = caverphone29.encode("");
        boolean boolean46 = caverphone29.isCaverphoneEqual("", "hi!");
        java.lang.Object obj47 = caverphone0.encode((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1111111111" + "'", str22, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "AA11111111" + "'", str37, "AA11111111");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1111111111" + "'", str39, "1111111111");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1111111111" + "'", str41, "1111111111");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1111111111" + "'", str43, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + "1111111111" + "'", obj47, "1111111111");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "");
        org.apache.commons.codec.language.Caverphone caverphone9 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean12 = caverphone9.isCaverphoneEqual("hi!", "");
        java.lang.String str14 = caverphone9.encode("hi!");
        java.lang.String str16 = caverphone9.caverphone("1111111111");
        java.lang.String str18 = caverphone9.encode("1111111111");
        java.lang.Object obj19 = caverphone0.encode((java.lang.Object) "1111111111");
        java.lang.String str21 = caverphone0.caverphone("1111111111");
        java.lang.String str23 = caverphone0.encode("");
        java.lang.String str25 = caverphone0.caverphone("1111111111");
        java.lang.String str27 = caverphone0.caverphone("AA11111111");
        java.lang.String str29 = caverphone0.caverphone("AA11111111");
        java.lang.String str31 = caverphone0.caverphone("AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "1111111111" + "'", obj19, "1111111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1111111111" + "'", str23, "1111111111");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1111111111" + "'", str25, "1111111111");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "AA11111111" + "'", str27, "AA11111111");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AA11111111" + "'", str29, "AA11111111");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AA11111111" + "'", str31, "AA11111111");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.String str15 = caverphone0.caverphone("hi!");
        java.lang.String str17 = caverphone0.encode("1111111111");
        boolean boolean20 = caverphone0.isCaverphoneEqual("", "AA11111111");
        boolean boolean23 = caverphone0.isCaverphoneEqual("hi!", "AA11111111");
        boolean boolean26 = caverphone0.isCaverphoneEqual("1111111111", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str8 = caverphone0.encode("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str13 = caverphone0.encode("");
        java.lang.String str15 = caverphone0.encode("");
        java.lang.String str17 = caverphone0.caverphone("hi!");
        boolean boolean20 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str22 = caverphone0.caverphone("hi!");
        java.lang.String str24 = caverphone0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone25 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean28 = caverphone25.isCaverphoneEqual("hi!", "");
        java.lang.String str30 = caverphone25.caverphone("AA11111111");
        boolean boolean33 = caverphone25.isCaverphoneEqual("", "");
        org.apache.commons.codec.language.Caverphone caverphone34 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean37 = caverphone34.isCaverphoneEqual("hi!", "");
        java.lang.String str39 = caverphone34.encode("hi!");
        java.lang.String str41 = caverphone34.caverphone("1111111111");
        java.lang.String str43 = caverphone34.encode("1111111111");
        java.lang.Object obj44 = caverphone25.encode((java.lang.Object) "1111111111");
        java.lang.String str46 = caverphone25.caverphone("1111111111");
        boolean boolean49 = caverphone25.isCaverphoneEqual("hi!", "AA11111111");
        java.lang.String str51 = caverphone25.caverphone("1111111111");
        boolean boolean54 = caverphone25.isCaverphoneEqual("hi!", "1111111111");
        java.lang.Object obj55 = caverphone0.encode((java.lang.Object) "1111111111");
        boolean boolean58 = caverphone0.isCaverphoneEqual("hi!", "1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AA11111111" + "'", str22, "AA11111111");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1111111111" + "'", str24, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "AA11111111" + "'", str30, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "AA11111111" + "'", str39, "AA11111111");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1111111111" + "'", str41, "1111111111");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1111111111" + "'", str43, "1111111111");
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + "1111111111" + "'", obj44, "1111111111");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1111111111" + "'", str46, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1111111111" + "'", str51, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + "1111111111" + "'", obj55, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str13 = caverphone0.encode("hi!");
        java.lang.String str15 = caverphone0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("hi!", "");
        java.lang.String str21 = caverphone16.caverphone("");
        boolean boolean24 = caverphone16.isCaverphoneEqual("AA11111111", "");
        java.lang.Object obj25 = caverphone0.encode((java.lang.Object) "AA11111111");
        boolean boolean28 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str30 = caverphone0.encode("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "AA11111111" + "'", obj25, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "AA11111111" + "'", str30, "AA11111111");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        boolean boolean9 = caverphone0.isCaverphoneEqual("AA11111111", "1111111111");
        java.lang.String str11 = caverphone0.caverphone("");
        java.lang.String str13 = caverphone0.caverphone("hi!");
        java.lang.String str15 = caverphone0.caverphone("hi!");
        java.lang.String str17 = caverphone0.caverphone("");
        java.lang.String str19 = caverphone0.encode("1111111111");
        java.lang.String str21 = caverphone0.caverphone("");
        boolean boolean24 = caverphone0.isCaverphoneEqual("1111111111", "");
        java.lang.String str26 = caverphone0.caverphone("AA11111111");
        boolean boolean29 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        boolean boolean32 = caverphone0.isCaverphoneEqual("AA11111111", "1111111111");
        org.apache.commons.codec.language.Caverphone caverphone33 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean36 = caverphone33.isCaverphoneEqual("hi!", "");
        java.lang.String str38 = caverphone33.caverphone("");
        boolean boolean41 = caverphone33.isCaverphoneEqual("AA11111111", "");
        java.lang.String str43 = caverphone33.encode("1111111111");
        boolean boolean46 = caverphone33.isCaverphoneEqual("AA11111111", "");
        org.apache.commons.codec.language.Caverphone caverphone47 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean50 = caverphone47.isCaverphoneEqual("1111111111", "");
        java.lang.Object obj51 = caverphone33.encode((java.lang.Object) "");
        java.lang.String str53 = caverphone33.caverphone("1111111111");
        boolean boolean56 = caverphone33.isCaverphoneEqual("AA11111111", "AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone57 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean60 = caverphone57.isCaverphoneEqual("hi!", "");
        java.lang.String str62 = caverphone57.caverphone("AA11111111");
        boolean boolean65 = caverphone57.isCaverphoneEqual("", "hi!");
        boolean boolean68 = caverphone57.isCaverphoneEqual("1111111111", "");
        java.lang.String str70 = caverphone57.encode("");
        java.lang.Object obj71 = caverphone33.encode((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj72 = caverphone0.encode((java.lang.Object) caverphone33);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1111111111" + "'", str19, "1111111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "AA11111111" + "'", str26, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1111111111" + "'", str38, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1111111111" + "'", str43, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + "1111111111" + "'", obj51, "1111111111");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1111111111" + "'", str53, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "AA11111111" + "'", str62, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "1111111111" + "'", str70, "1111111111");
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + "1111111111" + "'", obj71, "1111111111");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str13 = caverphone0.encode("hi!");
        java.lang.String str15 = caverphone0.caverphone("AA11111111");
        boolean boolean18 = caverphone0.isCaverphoneEqual("", "1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "");
        org.apache.commons.codec.language.Caverphone caverphone9 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean12 = caverphone9.isCaverphoneEqual("hi!", "");
        java.lang.String str14 = caverphone9.encode("hi!");
        java.lang.String str16 = caverphone9.caverphone("1111111111");
        java.lang.String str18 = caverphone9.encode("1111111111");
        java.lang.Object obj19 = caverphone0.encode((java.lang.Object) "1111111111");
        java.lang.String str21 = caverphone0.caverphone("1111111111");
        boolean boolean24 = caverphone0.isCaverphoneEqual("hi!", "AA11111111");
        java.lang.String str26 = caverphone0.caverphone("1111111111");
        boolean boolean29 = caverphone0.isCaverphoneEqual("hi!", "1111111111");
        java.lang.String str31 = caverphone0.caverphone("hi!");
        java.lang.String str33 = caverphone0.caverphone("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "1111111111" + "'", obj19, "1111111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1111111111" + "'", str26, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AA11111111" + "'", str31, "AA11111111");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1111111111" + "'", str33, "1111111111");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone6 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean9 = caverphone6.isCaverphoneEqual("hi!", "");
        java.lang.String str11 = caverphone6.encode("hi!");
        java.lang.String str13 = caverphone6.caverphone("hi!");
        java.lang.String str15 = caverphone6.caverphone("hi!");
        java.lang.Object obj16 = caverphone0.encode((java.lang.Object) str15);
        java.lang.String str18 = caverphone0.caverphone("");
        java.lang.String str20 = caverphone0.caverphone("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "AA11111111" + "'", obj16, "AA11111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("hi!");
        java.lang.String str12 = caverphone0.caverphone("");
        java.lang.String str14 = caverphone0.caverphone("1111111111");
        java.lang.String str16 = caverphone0.encode("");
        boolean boolean19 = caverphone0.isCaverphoneEqual("AA11111111", "1111111111");
        java.lang.String str21 = caverphone0.caverphone("");
        boolean boolean24 = caverphone0.isCaverphoneEqual("1111111111", "1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111" + "'", str12, "1111111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        java.lang.Object obj12 = caverphone0.encode((java.lang.Object) "");
        org.apache.commons.codec.language.Caverphone caverphone13 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean16 = caverphone13.isCaverphoneEqual("hi!", "");
        java.lang.String str18 = caverphone13.caverphone("AA11111111");
        java.lang.String str20 = caverphone13.caverphone("hi!");
        java.lang.Object obj21 = caverphone0.encode((java.lang.Object) str20);
        java.lang.String str23 = caverphone0.caverphone("hi!");
        java.lang.String str25 = caverphone0.encode("1111111111");
        java.lang.Class<?> wildcardClass26 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "1111111111" + "'", obj12, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "AA11111111" + "'", obj21, "AA11111111");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AA11111111" + "'", str23, "AA11111111");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1111111111" + "'", str25, "1111111111");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.encode("hi!");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("hi!");
        java.lang.String str11 = caverphone0.caverphone("hi!");
        boolean boolean14 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean17 = caverphone0.isCaverphoneEqual("", "1111111111");
        boolean boolean20 = caverphone0.isCaverphoneEqual("AA11111111", "");
        boolean boolean23 = caverphone0.isCaverphoneEqual("1111111111", "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("AA11111111");
        java.lang.String str14 = caverphone0.caverphone("hi!");
        java.lang.String str16 = caverphone0.encode("1111111111");
        java.lang.String str18 = caverphone0.caverphone("AA11111111");
        java.lang.String str20 = caverphone0.encode("AA11111111");
        java.lang.String str22 = caverphone0.caverphone("");
        boolean boolean25 = caverphone0.isCaverphoneEqual("", "hi!");
        boolean boolean28 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str30 = caverphone0.encode("");
        java.lang.String str32 = caverphone0.caverphone("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1111111111" + "'", str22, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1111111111" + "'", str30, "1111111111");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1111111111" + "'", str32, "1111111111");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "");
        org.apache.commons.codec.language.Caverphone caverphone9 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean12 = caverphone9.isCaverphoneEqual("hi!", "");
        java.lang.String str14 = caverphone9.encode("hi!");
        java.lang.String str16 = caverphone9.caverphone("1111111111");
        java.lang.String str18 = caverphone9.encode("1111111111");
        java.lang.Object obj19 = caverphone0.encode((java.lang.Object) "1111111111");
        org.apache.commons.codec.language.Caverphone caverphone20 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean23 = caverphone20.isCaverphoneEqual("hi!", "");
        java.lang.String str25 = caverphone20.caverphone("");
        boolean boolean28 = caverphone20.isCaverphoneEqual("AA11111111", "");
        java.lang.String str30 = caverphone20.caverphone("AA11111111");
        java.lang.String str32 = caverphone20.caverphone("AA11111111");
        java.lang.String str34 = caverphone20.caverphone("hi!");
        java.lang.String str36 = caverphone20.encode("1111111111");
        boolean boolean39 = caverphone20.isCaverphoneEqual("1111111111", "hi!");
        java.lang.String str41 = caverphone20.encode("AA11111111");
        boolean boolean44 = caverphone20.isCaverphoneEqual("", "");
        org.apache.commons.codec.language.Caverphone caverphone45 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean48 = caverphone45.isCaverphoneEqual("hi!", "");
        boolean boolean51 = caverphone45.isCaverphoneEqual("", "hi!");
        java.lang.String str53 = caverphone45.caverphone("");
        boolean boolean56 = caverphone45.isCaverphoneEqual("", "1111111111");
        java.lang.String str58 = caverphone45.encode("hi!");
        java.lang.String str60 = caverphone45.encode("");
        org.apache.commons.codec.language.Caverphone caverphone61 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean64 = caverphone61.isCaverphoneEqual("hi!", "");
        java.lang.String str66 = caverphone61.caverphone("");
        boolean boolean69 = caverphone61.isCaverphoneEqual("AA11111111", "");
        java.lang.Object obj70 = caverphone45.encode((java.lang.Object) "AA11111111");
        boolean boolean73 = caverphone45.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str75 = caverphone45.caverphone("hi!");
        boolean boolean78 = caverphone45.isCaverphoneEqual("hi!", "");
        java.lang.String str80 = caverphone45.caverphone("");
        java.lang.String str82 = caverphone45.encode("hi!");
        java.lang.Object obj83 = caverphone20.encode((java.lang.Object) "hi!");
        java.lang.Object obj84 = caverphone0.encode((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "1111111111" + "'", obj19, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1111111111" + "'", str25, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "AA11111111" + "'", str30, "AA11111111");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "AA11111111" + "'", str32, "AA11111111");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AA11111111" + "'", str34, "AA11111111");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1111111111" + "'", str36, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "AA11111111" + "'", str41, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1111111111" + "'", str53, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "AA11111111" + "'", str58, "AA11111111");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "1111111111" + "'", str60, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "1111111111" + "'", str66, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + "AA11111111" + "'", obj70, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "AA11111111" + "'", str75, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "1111111111" + "'", str80, "1111111111");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "AA11111111" + "'", str82, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + "AA11111111" + "'", obj83, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + "AA11111111" + "'", obj84, "AA11111111");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str13 = caverphone0.encode("hi!");
        java.lang.String str15 = caverphone0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("hi!", "");
        java.lang.String str21 = caverphone16.caverphone("");
        boolean boolean24 = caverphone16.isCaverphoneEqual("AA11111111", "");
        java.lang.Object obj25 = caverphone0.encode((java.lang.Object) "AA11111111");
        boolean boolean28 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str30 = caverphone0.encode("1111111111");
        boolean boolean33 = caverphone0.isCaverphoneEqual("", "AA11111111");
        boolean boolean36 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str38 = caverphone0.caverphone("");
        boolean boolean41 = caverphone0.isCaverphoneEqual("", "1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "AA11111111" + "'", obj25, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1111111111" + "'", str30, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1111111111" + "'", str38, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone6 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean9 = caverphone6.isCaverphoneEqual("hi!", "");
        java.lang.String str11 = caverphone6.encode("hi!");
        java.lang.String str13 = caverphone6.caverphone("hi!");
        java.lang.String str15 = caverphone6.caverphone("hi!");
        java.lang.Object obj16 = caverphone0.encode((java.lang.Object) str15);
        java.lang.String str18 = caverphone0.encode("");
        boolean boolean21 = caverphone0.isCaverphoneEqual("AA11111111", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "AA11111111" + "'", obj16, "AA11111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("AA11111111");
        java.lang.String str14 = caverphone0.caverphone("AA11111111");
        boolean boolean17 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str19 = caverphone0.encode("AA11111111");
        java.lang.Class<?> wildcardClass20 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.encode("hi!");
        java.lang.String str7 = caverphone0.caverphone("hi!");
        java.lang.String str9 = caverphone0.encode("1111111111");
        java.lang.String str11 = caverphone0.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone12 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean15 = caverphone12.isCaverphoneEqual("hi!", "");
        java.lang.String str17 = caverphone12.caverphone("AA11111111");
        boolean boolean20 = caverphone12.isCaverphoneEqual("", "");
        org.apache.commons.codec.language.Caverphone caverphone21 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean24 = caverphone21.isCaverphoneEqual("hi!", "");
        java.lang.String str26 = caverphone21.encode("hi!");
        java.lang.String str28 = caverphone21.caverphone("1111111111");
        java.lang.String str30 = caverphone21.encode("1111111111");
        java.lang.Object obj31 = caverphone12.encode((java.lang.Object) "1111111111");
        org.apache.commons.codec.language.Caverphone caverphone32 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean35 = caverphone32.isCaverphoneEqual("hi!", "");
        java.lang.String str37 = caverphone32.caverphone("");
        boolean boolean40 = caverphone32.isCaverphoneEqual("AA11111111", "");
        java.lang.String str42 = caverphone32.encode("1111111111");
        java.lang.Object obj43 = caverphone12.encode((java.lang.Object) str42);
        boolean boolean46 = caverphone12.isCaverphoneEqual("", "1111111111");
        java.lang.String str48 = caverphone12.encode("AA11111111");
        java.lang.Object obj49 = caverphone0.encode((java.lang.Object) str48);
        java.lang.String str51 = caverphone0.caverphone("");
        boolean boolean54 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.Class<?> wildcardClass55 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "AA11111111" + "'", str26, "AA11111111");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1111111111" + "'", str28, "1111111111");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1111111111" + "'", str30, "1111111111");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "1111111111" + "'", obj31, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1111111111" + "'", str37, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1111111111" + "'", str42, "1111111111");
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + "1111111111" + "'", obj43, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "AA11111111" + "'", str48, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "AA11111111" + "'", obj49, "AA11111111");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1111111111" + "'", str51, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.String str15 = caverphone0.caverphone("hi!");
        java.lang.String str17 = caverphone0.encode("1111111111");
        boolean boolean20 = caverphone0.isCaverphoneEqual("", "AA11111111");
        java.lang.String str22 = caverphone0.caverphone("hi!");
        org.apache.commons.codec.language.Caverphone caverphone23 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean26 = caverphone23.isCaverphoneEqual("hi!", "");
        java.lang.String str28 = caverphone23.encode("hi!");
        java.lang.String str30 = caverphone23.caverphone("AA11111111");
        java.lang.String str32 = caverphone23.caverphone("1111111111");
        java.lang.String str34 = caverphone23.encode("");
        boolean boolean37 = caverphone23.isCaverphoneEqual("1111111111", "");
        boolean boolean40 = caverphone23.isCaverphoneEqual("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = caverphone0.encode((java.lang.Object) caverphone23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AA11111111" + "'", str22, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AA11111111" + "'", str28, "AA11111111");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "AA11111111" + "'", str30, "AA11111111");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1111111111" + "'", str32, "1111111111");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1111111111" + "'", str34, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean16 = caverphone0.isCaverphoneEqual("AA11111111", "");
        org.apache.commons.codec.language.Caverphone caverphone17 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean20 = caverphone17.isCaverphoneEqual("hi!", "");
        java.lang.String str22 = caverphone17.caverphone("AA11111111");
        java.lang.String str24 = caverphone17.caverphone("");
        java.lang.Object obj25 = caverphone0.encode((java.lang.Object) "");
        java.lang.String str27 = caverphone0.encode("1111111111");
        java.lang.String str29 = caverphone0.caverphone("");
        boolean boolean32 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str34 = caverphone0.caverphone("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AA11111111" + "'", str22, "AA11111111");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1111111111" + "'", str24, "1111111111");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "1111111111" + "'", obj25, "1111111111");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1111111111" + "'", str27, "1111111111");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1111111111" + "'", str29, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AA11111111" + "'", str34, "AA11111111");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("1111111111", "AA11111111");
        java.lang.Object obj15 = caverphone0.encode((java.lang.Object) "AA11111111");
        boolean boolean18 = caverphone0.isCaverphoneEqual("1111111111", "1111111111");
        org.apache.commons.codec.language.Caverphone caverphone19 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean22 = caverphone19.isCaverphoneEqual("1111111111", "");
        boolean boolean25 = caverphone19.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str27 = caverphone19.encode("");
        boolean boolean30 = caverphone19.isCaverphoneEqual("", "1111111111");
        java.lang.String str32 = caverphone19.encode("");
        java.lang.Object obj33 = caverphone0.encode((java.lang.Object) str32);
        java.lang.String str35 = caverphone0.encode("1111111111");
        java.lang.String str37 = caverphone0.caverphone("1111111111");
        java.lang.String str39 = caverphone0.caverphone("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "AA11111111" + "'", obj15, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1111111111" + "'", str27, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1111111111" + "'", str32, "1111111111");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "1111111111" + "'", obj33, "1111111111");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1111111111" + "'", str35, "1111111111");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1111111111" + "'", str37, "1111111111");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1111111111" + "'", str39, "1111111111");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone6 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean9 = caverphone6.isCaverphoneEqual("hi!", "");
        java.lang.String str11 = caverphone6.encode("hi!");
        java.lang.String str13 = caverphone6.caverphone("1111111111");
        java.lang.String str15 = caverphone6.encode("1111111111");
        java.lang.Object obj16 = caverphone0.encode((java.lang.Object) "1111111111");
        boolean boolean19 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str21 = caverphone0.caverphone("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone22 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean25 = caverphone22.isCaverphoneEqual("hi!", "");
        java.lang.String str27 = caverphone22.encode("hi!");
        java.lang.String str29 = caverphone22.caverphone("hi!");
        java.lang.String str31 = caverphone22.caverphone("hi!");
        java.lang.String str33 = caverphone22.caverphone("hi!");
        java.lang.String str35 = caverphone22.caverphone("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = caverphone0.encode((java.lang.Object) caverphone22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "1111111111" + "'", obj16, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AA11111111" + "'", str21, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "AA11111111" + "'", str27, "AA11111111");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AA11111111" + "'", str29, "AA11111111");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AA11111111" + "'", str31, "AA11111111");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AA11111111" + "'", str33, "AA11111111");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "AA11111111" + "'", str35, "AA11111111");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("hi!");
        java.lang.String str14 = caverphone0.encode("AA11111111");
        java.lang.String str16 = caverphone0.caverphone("AA11111111");
        java.lang.String str18 = caverphone0.caverphone("");
        java.lang.String str20 = caverphone0.caverphone("hi!");
        boolean boolean23 = caverphone0.isCaverphoneEqual("1111111111", "AA11111111");
        boolean boolean26 = caverphone0.isCaverphoneEqual("", "1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("1111111111", "AA11111111");
        java.lang.String str15 = caverphone0.encode("AA11111111");
        boolean boolean18 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean21 = caverphone0.isCaverphoneEqual("", "hi!");
        org.apache.commons.codec.language.Caverphone caverphone22 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean25 = caverphone22.isCaverphoneEqual("hi!", "");
        boolean boolean28 = caverphone22.isCaverphoneEqual("", "hi!");
        java.lang.String str30 = caverphone22.caverphone("");
        boolean boolean33 = caverphone22.isCaverphoneEqual("", "1111111111");
        java.lang.String str35 = caverphone22.encode("hi!");
        java.lang.String str37 = caverphone22.encode("");
        org.apache.commons.codec.language.Caverphone caverphone38 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean41 = caverphone38.isCaverphoneEqual("1111111111", "");
        boolean boolean44 = caverphone38.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str46 = caverphone38.encode("AA11111111");
        java.lang.Object obj47 = caverphone22.encode((java.lang.Object) "AA11111111");
        java.lang.String str49 = caverphone22.encode("");
        boolean boolean52 = caverphone22.isCaverphoneEqual("hi!", "");
        java.lang.Object obj53 = caverphone0.encode((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1111111111" + "'", str30, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "AA11111111" + "'", str35, "AA11111111");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1111111111" + "'", str37, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "AA11111111" + "'", str46, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + "AA11111111" + "'", obj47, "AA11111111");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1111111111" + "'", str49, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + "AA11111111" + "'", obj53, "AA11111111");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("1111111111", "AA11111111");
        java.lang.Object obj15 = caverphone0.encode((java.lang.Object) "AA11111111");
        boolean boolean18 = caverphone0.isCaverphoneEqual("1111111111", "1111111111");
        org.apache.commons.codec.language.Caverphone caverphone19 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean22 = caverphone19.isCaverphoneEqual("1111111111", "");
        boolean boolean25 = caverphone19.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str27 = caverphone19.encode("");
        boolean boolean30 = caverphone19.isCaverphoneEqual("", "1111111111");
        java.lang.String str32 = caverphone19.encode("");
        java.lang.Object obj33 = caverphone0.encode((java.lang.Object) str32);
        java.lang.Class<?> wildcardClass34 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "AA11111111" + "'", obj15, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1111111111" + "'", str27, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1111111111" + "'", str32, "1111111111");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "1111111111" + "'", obj33, "1111111111");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("1111111111", "AA11111111");
        java.lang.Object obj15 = caverphone0.encode((java.lang.Object) "AA11111111");
        boolean boolean18 = caverphone0.isCaverphoneEqual("", "hi!");
        boolean boolean21 = caverphone0.isCaverphoneEqual("", "AA11111111");
        java.lang.String str23 = caverphone0.encode("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "AA11111111" + "'", obj15, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AA11111111" + "'", str23, "AA11111111");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "");
        org.apache.commons.codec.language.Caverphone caverphone14 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean17 = caverphone14.isCaverphoneEqual("1111111111", "");
        java.lang.Object obj18 = caverphone0.encode((java.lang.Object) "");
        java.lang.String str20 = caverphone0.caverphone("hi!");
        java.lang.String str22 = caverphone0.caverphone("1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "1111111111" + "'", obj18, "1111111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1111111111" + "'", str22, "1111111111");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        java.lang.String str7 = caverphone0.caverphone("hi!");
        java.lang.String str9 = caverphone0.encode("");
        java.lang.String str11 = caverphone0.encode("AA11111111");
        boolean boolean14 = caverphone0.isCaverphoneEqual("", "1111111111");
        boolean boolean17 = caverphone0.isCaverphoneEqual("AA11111111", "");
        boolean boolean20 = caverphone0.isCaverphoneEqual("AA11111111", "1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str8 = caverphone0.encode("");
        java.lang.String str10 = caverphone0.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone11 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean14 = caverphone11.isCaverphoneEqual("hi!", "");
        java.lang.String str16 = caverphone11.caverphone("AA11111111");
        java.lang.String str18 = caverphone11.caverphone("");
        java.lang.String str20 = caverphone11.encode("hi!");
        java.lang.Object obj21 = caverphone0.encode((java.lang.Object) str20);
        boolean boolean24 = caverphone0.isCaverphoneEqual("1111111111", "");
        java.lang.String str26 = caverphone0.encode("hi!");
        boolean boolean29 = caverphone0.isCaverphoneEqual("", "");
        org.apache.commons.codec.language.Caverphone caverphone30 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean33 = caverphone30.isCaverphoneEqual("hi!", "");
        boolean boolean36 = caverphone30.isCaverphoneEqual("", "hi!");
        java.lang.String str38 = caverphone30.caverphone("");
        boolean boolean41 = caverphone30.isCaverphoneEqual("", "1111111111");
        boolean boolean44 = caverphone30.isCaverphoneEqual("", "");
        java.lang.String str46 = caverphone30.caverphone("hi!");
        java.lang.String str48 = caverphone30.caverphone("");
        java.lang.String str50 = caverphone30.caverphone("hi!");
        java.lang.String str52 = caverphone30.encode("");
        java.lang.String str54 = caverphone30.caverphone("AA11111111");
        boolean boolean57 = caverphone30.isCaverphoneEqual("", "hi!");
        java.lang.String str59 = caverphone30.caverphone("AA11111111");
        java.lang.Object obj60 = caverphone0.encode((java.lang.Object) str59);
        java.lang.String str62 = caverphone0.encode("1111111111");
        java.lang.String str64 = caverphone0.caverphone("1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "AA11111111" + "'", obj21, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "AA11111111" + "'", str26, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1111111111" + "'", str38, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "AA11111111" + "'", str46, "AA11111111");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1111111111" + "'", str48, "1111111111");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "AA11111111" + "'", str50, "AA11111111");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1111111111" + "'", str52, "1111111111");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "AA11111111" + "'", str54, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "AA11111111" + "'", str59, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + "AA11111111" + "'", obj60, "AA11111111");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "1111111111" + "'", str62, "1111111111");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "1111111111" + "'", str64, "1111111111");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("AA11111111");
        java.lang.String str14 = caverphone0.caverphone("AA11111111");
        boolean boolean17 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str19 = caverphone0.encode("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone20 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean23 = caverphone20.isCaverphoneEqual("hi!", "");
        java.lang.String str25 = caverphone20.caverphone("");
        boolean boolean28 = caverphone20.isCaverphoneEqual("AA11111111", "");
        java.lang.String str30 = caverphone20.caverphone("AA11111111");
        boolean boolean33 = caverphone20.isCaverphoneEqual("", "");
        java.lang.String str35 = caverphone20.encode("1111111111");
        java.lang.String str37 = caverphone20.caverphone("");
        java.lang.String str39 = caverphone20.caverphone("hi!");
        boolean boolean42 = caverphone20.isCaverphoneEqual("", "AA11111111");
        boolean boolean45 = caverphone20.isCaverphoneEqual("", "hi!");
        java.lang.String str47 = caverphone20.encode("AA11111111");
        boolean boolean50 = caverphone20.isCaverphoneEqual("hi!", "AA11111111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = caverphone0.encode((java.lang.Object) caverphone20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1111111111" + "'", str25, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "AA11111111" + "'", str30, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1111111111" + "'", str35, "1111111111");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1111111111" + "'", str37, "1111111111");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "AA11111111" + "'", str39, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "AA11111111" + "'", str47, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("hi!");
        java.lang.String str14 = caverphone0.caverphone("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone15 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean18 = caverphone15.isCaverphoneEqual("hi!", "");
        java.lang.String str20 = caverphone15.encode("hi!");
        java.lang.String str22 = caverphone15.caverphone("");
        java.lang.Object obj23 = caverphone0.encode((java.lang.Object) "");
        java.lang.String str25 = caverphone0.encode("AA11111111");
        java.lang.String str27 = caverphone0.caverphone("1111111111");
        java.lang.String str29 = caverphone0.encode("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1111111111" + "'", str22, "1111111111");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "1111111111" + "'", obj23, "1111111111");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "AA11111111" + "'", str25, "AA11111111");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1111111111" + "'", str27, "1111111111");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AA11111111" + "'", str29, "AA11111111");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("hi!");
        java.lang.String str12 = caverphone0.caverphone("");
        java.lang.String str14 = caverphone0.caverphone("1111111111");
        java.lang.String str16 = caverphone0.encode("");
        java.lang.String str18 = caverphone0.encode("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111" + "'", str12, "1111111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str13 = caverphone0.encode("hi!");
        java.lang.String str15 = caverphone0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("hi!", "");
        java.lang.String str21 = caverphone16.caverphone("");
        boolean boolean24 = caverphone16.isCaverphoneEqual("AA11111111", "");
        java.lang.Object obj25 = caverphone0.encode((java.lang.Object) "AA11111111");
        boolean boolean28 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str30 = caverphone0.caverphone("hi!");
        boolean boolean33 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str35 = caverphone0.caverphone("");
        java.lang.String str37 = caverphone0.caverphone("");
        java.lang.String str39 = caverphone0.encode("AA11111111");
        java.lang.String str41 = caverphone0.encode("AA11111111");
        java.lang.Class<?> wildcardClass42 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "AA11111111" + "'", obj25, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "AA11111111" + "'", str30, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1111111111" + "'", str35, "1111111111");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1111111111" + "'", str37, "1111111111");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "AA11111111" + "'", str39, "AA11111111");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "AA11111111" + "'", str41, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str8 = caverphone0.caverphone("AA11111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str13 = caverphone0.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone14 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean17 = caverphone14.isCaverphoneEqual("hi!", "");
        java.lang.String str19 = caverphone14.caverphone("AA11111111");
        java.lang.String str21 = caverphone14.encode("");
        boolean boolean24 = caverphone14.isCaverphoneEqual("hi!", "");
        org.apache.commons.codec.language.Caverphone caverphone25 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean28 = caverphone25.isCaverphoneEqual("hi!", "");
        java.lang.String str30 = caverphone25.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone31 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str33 = caverphone31.caverphone("1111111111");
        java.lang.String str35 = caverphone31.caverphone("1111111111");
        java.lang.String str37 = caverphone31.caverphone("AA11111111");
        java.lang.Object obj38 = caverphone25.encode((java.lang.Object) str37);
        java.lang.String str40 = caverphone25.caverphone("");
        java.lang.Object obj41 = caverphone14.encode((java.lang.Object) str40);
        java.lang.Object obj42 = caverphone0.encode((java.lang.Object) str40);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "AA11111111" + "'", str30, "AA11111111");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1111111111" + "'", str33, "1111111111");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1111111111" + "'", str35, "1111111111");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "AA11111111" + "'", str37, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "AA11111111" + "'", obj38, "AA11111111");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1111111111" + "'", str40, "1111111111");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "1111111111" + "'", obj41, "1111111111");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "1111111111" + "'", obj42, "1111111111");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        boolean boolean16 = caverphone0.isCaverphoneEqual("1111111111", "");
        java.lang.String str18 = caverphone0.caverphone("");
        java.lang.String str20 = caverphone0.encode("hi!");
        java.lang.String str22 = caverphone0.caverphone("AA11111111");
        boolean boolean25 = caverphone0.isCaverphoneEqual("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AA11111111" + "'", str22, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        boolean boolean14 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean17 = caverphone0.isCaverphoneEqual("hi!", "1111111111");
        java.lang.String str19 = caverphone0.encode("AA11111111");
        boolean boolean22 = caverphone0.isCaverphoneEqual("AA11111111", "");
        boolean boolean25 = caverphone0.isCaverphoneEqual("AA11111111", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        boolean boolean9 = caverphone0.isCaverphoneEqual("AA11111111", "1111111111");
        java.lang.String str11 = caverphone0.caverphone("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone12 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean15 = caverphone12.isCaverphoneEqual("hi!", "");
        java.lang.String str17 = caverphone12.caverphone("");
        boolean boolean20 = caverphone12.isCaverphoneEqual("AA11111111", "");
        java.lang.String str22 = caverphone12.caverphone("AA11111111");
        java.lang.String str24 = caverphone12.caverphone("hi!");
        java.lang.String str26 = caverphone12.encode("AA11111111");
        java.lang.String str28 = caverphone12.caverphone("AA11111111");
        java.lang.String str30 = caverphone12.caverphone("1111111111");
        java.lang.String str32 = caverphone12.encode("AA11111111");
        java.lang.Object obj33 = caverphone0.encode((java.lang.Object) "AA11111111");
        boolean boolean36 = caverphone0.isCaverphoneEqual("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AA11111111" + "'", str22, "AA11111111");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AA11111111" + "'", str24, "AA11111111");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "AA11111111" + "'", str26, "AA11111111");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AA11111111" + "'", str28, "AA11111111");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1111111111" + "'", str30, "1111111111");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "AA11111111" + "'", str32, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "AA11111111" + "'", obj33, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("1111111111", "AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone14 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean17 = caverphone14.isCaverphoneEqual("hi!", "");
        java.lang.String str19 = caverphone14.caverphone("");
        boolean boolean22 = caverphone14.isCaverphoneEqual("AA11111111", "");
        java.lang.String str24 = caverphone14.caverphone("AA11111111");
        java.lang.String str26 = caverphone14.caverphone("AA11111111");
        java.lang.String str28 = caverphone14.caverphone("hi!");
        java.lang.String str30 = caverphone14.caverphone("1111111111");
        java.lang.Object obj31 = caverphone0.encode((java.lang.Object) str30);
        boolean boolean34 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str36 = caverphone0.encode("AA11111111");
        java.lang.String str38 = caverphone0.encode("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone39 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean42 = caverphone39.isCaverphoneEqual("hi!", "");
        java.lang.String str44 = caverphone39.caverphone("");
        boolean boolean47 = caverphone39.isCaverphoneEqual("AA11111111", "");
        java.lang.String str49 = caverphone39.caverphone("AA11111111");
        java.lang.String str51 = caverphone39.caverphone("hi!");
        java.lang.String str53 = caverphone39.caverphone("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone54 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean57 = caverphone54.isCaverphoneEqual("hi!", "");
        java.lang.String str59 = caverphone54.encode("hi!");
        java.lang.String str61 = caverphone54.caverphone("");
        java.lang.Object obj62 = caverphone39.encode((java.lang.Object) "");
        java.lang.String str64 = caverphone39.caverphone("hi!");
        boolean boolean67 = caverphone39.isCaverphoneEqual("AA11111111", "1111111111");
        java.lang.String str69 = caverphone39.caverphone("1111111111");
        java.lang.Object obj70 = caverphone0.encode((java.lang.Object) "1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1111111111" + "'", str19, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AA11111111" + "'", str24, "AA11111111");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "AA11111111" + "'", str26, "AA11111111");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AA11111111" + "'", str28, "AA11111111");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1111111111" + "'", str30, "1111111111");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "1111111111" + "'", obj31, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "AA11111111" + "'", str36, "AA11111111");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1111111111" + "'", str38, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1111111111" + "'", str44, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "AA11111111" + "'", str49, "AA11111111");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "AA11111111" + "'", str51, "AA11111111");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1111111111" + "'", str53, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "AA11111111" + "'", str59, "AA11111111");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "1111111111" + "'", str61, "1111111111");
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + "1111111111" + "'", obj62, "1111111111");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "AA11111111" + "'", str64, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "1111111111" + "'", str69, "1111111111");
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + "1111111111" + "'", obj70, "1111111111");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str8 = caverphone0.caverphone("AA11111111");
        java.lang.String str10 = caverphone0.caverphone("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone11 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean14 = caverphone11.isCaverphoneEqual("hi!", "");
        java.lang.String str16 = caverphone11.caverphone("");
        boolean boolean19 = caverphone11.isCaverphoneEqual("AA11111111", "");
        java.lang.String str21 = caverphone11.encode("1111111111");
        boolean boolean24 = caverphone11.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.String str26 = caverphone11.caverphone("hi!");
        java.lang.String str28 = caverphone11.encode("1111111111");
        boolean boolean31 = caverphone11.isCaverphoneEqual("", "AA11111111");
        boolean boolean34 = caverphone11.isCaverphoneEqual("AA11111111", "");
        java.lang.Object obj35 = caverphone0.encode((java.lang.Object) "");
        boolean boolean38 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str40 = caverphone0.caverphone("AA11111111");
        java.lang.String str42 = caverphone0.caverphone("1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "AA11111111" + "'", str26, "AA11111111");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1111111111" + "'", str28, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "1111111111" + "'", obj35, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "AA11111111" + "'", str40, "AA11111111");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1111111111" + "'", str42, "1111111111");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        org.apache.commons.codec.language.Caverphone caverphone7 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean10 = caverphone7.isCaverphoneEqual("hi!", "");
        java.lang.String str12 = caverphone7.encode("hi!");
        java.lang.String str14 = caverphone7.caverphone("1111111111");
        java.lang.Object obj15 = caverphone0.encode((java.lang.Object) str14);
        java.lang.String str17 = caverphone0.caverphone("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone18 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean21 = caverphone18.isCaverphoneEqual("hi!", "");
        java.lang.String str23 = caverphone18.caverphone("");
        boolean boolean26 = caverphone18.isCaverphoneEqual("AA11111111", "");
        java.lang.String str28 = caverphone18.caverphone("");
        java.lang.Class<?> wildcardClass29 = caverphone18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = caverphone0.encode((java.lang.Object) wildcardClass29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "1111111111" + "'", obj15, "1111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1111111111" + "'", str23, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1111111111" + "'", str28, "1111111111");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        org.apache.commons.codec.language.Caverphone caverphone7 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean10 = caverphone7.isCaverphoneEqual("hi!", "");
        java.lang.String str12 = caverphone7.encode("hi!");
        java.lang.String str14 = caverphone7.caverphone("1111111111");
        java.lang.Object obj15 = caverphone0.encode((java.lang.Object) str14);
        boolean boolean18 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        org.apache.commons.codec.language.Caverphone caverphone19 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean22 = caverphone19.isCaverphoneEqual("hi!", "");
        java.lang.String str24 = caverphone19.caverphone("");
        boolean boolean27 = caverphone19.isCaverphoneEqual("AA11111111", "");
        java.lang.String str29 = caverphone19.encode("1111111111");
        boolean boolean32 = caverphone19.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.String str34 = caverphone19.caverphone("hi!");
        java.lang.String str36 = caverphone19.encode("1111111111");
        boolean boolean39 = caverphone19.isCaverphoneEqual("", "AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone40 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean43 = caverphone40.isCaverphoneEqual("1111111111", "");
        java.lang.String str45 = caverphone40.caverphone("1111111111");
        java.lang.String str47 = caverphone40.encode("");
        boolean boolean50 = caverphone40.isCaverphoneEqual("1111111111", "hi!");
        java.lang.String str52 = caverphone40.caverphone("1111111111");
        java.lang.Object obj53 = caverphone19.encode((java.lang.Object) str52);
        java.lang.String str55 = caverphone19.encode("AA11111111");
        boolean boolean58 = caverphone19.isCaverphoneEqual("1111111111", "hi!");
        boolean boolean61 = caverphone19.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.Object obj62 = caverphone0.encode((java.lang.Object) "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "1111111111" + "'", obj15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1111111111" + "'", str24, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1111111111" + "'", str29, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AA11111111" + "'", str34, "AA11111111");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1111111111" + "'", str36, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1111111111" + "'", str45, "1111111111");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1111111111" + "'", str47, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1111111111" + "'", str52, "1111111111");
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + "1111111111" + "'", obj53, "1111111111");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "AA11111111" + "'", str55, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + "AA11111111" + "'", obj62, "AA11111111");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        java.lang.String str7 = caverphone0.caverphone("");
        java.lang.String str9 = caverphone0.encode("hi!");
        java.lang.String str11 = caverphone0.encode("");
        boolean boolean14 = caverphone0.isCaverphoneEqual("", "hi!");
        org.apache.commons.codec.language.Caverphone caverphone15 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean18 = caverphone15.isCaverphoneEqual("hi!", "");
        java.lang.String str20 = caverphone15.caverphone("");
        boolean boolean23 = caverphone15.isCaverphoneEqual("AA11111111", "");
        java.lang.String str25 = caverphone15.caverphone("AA11111111");
        java.lang.String str27 = caverphone15.caverphone("hi!");
        java.lang.String str29 = caverphone15.caverphone("hi!");
        java.lang.String str31 = caverphone15.encode("1111111111");
        boolean boolean34 = caverphone15.isCaverphoneEqual("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = caverphone0.encode((java.lang.Object) boolean34);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111" + "'", str7, "1111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1111111111" + "'", str20, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "AA11111111" + "'", str25, "AA11111111");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "AA11111111" + "'", str27, "AA11111111");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AA11111111" + "'", str29, "AA11111111");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1111111111" + "'", str31, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str13 = caverphone0.encode("hi!");
        java.lang.String str15 = caverphone0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("hi!", "");
        java.lang.String str21 = caverphone16.caverphone("");
        boolean boolean24 = caverphone16.isCaverphoneEqual("AA11111111", "");
        java.lang.Object obj25 = caverphone0.encode((java.lang.Object) "AA11111111");
        boolean boolean28 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        boolean boolean31 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str33 = caverphone0.caverphone("1111111111");
        boolean boolean36 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean39 = caverphone0.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.String str41 = caverphone0.caverphone("AA11111111");
        boolean boolean44 = caverphone0.isCaverphoneEqual("hi!", "");
        org.apache.commons.codec.language.Caverphone caverphone45 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean48 = caverphone45.isCaverphoneEqual("hi!", "");
        boolean boolean51 = caverphone45.isCaverphoneEqual("", "hi!");
        java.lang.String str53 = caverphone45.caverphone("");
        boolean boolean56 = caverphone45.isCaverphoneEqual("1111111111", "AA11111111");
        java.lang.String str58 = caverphone45.encode("hi!");
        boolean boolean61 = caverphone45.isCaverphoneEqual("", "1111111111");
        java.lang.String str63 = caverphone45.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone64 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean67 = caverphone64.isCaverphoneEqual("hi!", "");
        java.lang.String str69 = caverphone64.caverphone("AA11111111");
        java.lang.String str71 = caverphone64.caverphone("hi!");
        org.apache.commons.codec.language.Caverphone caverphone72 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean75 = caverphone72.isCaverphoneEqual("hi!", "");
        java.lang.String str77 = caverphone72.caverphone("");
        boolean boolean80 = caverphone72.isCaverphoneEqual("AA11111111", "");
        java.lang.String str82 = caverphone72.caverphone("AA11111111");
        boolean boolean85 = caverphone72.isCaverphoneEqual("", "1111111111");
        java.lang.Object obj86 = caverphone64.encode((java.lang.Object) "");
        java.lang.String str88 = caverphone64.caverphone("");
        java.lang.String str90 = caverphone64.caverphone("AA11111111");
        java.lang.Object obj91 = caverphone45.encode((java.lang.Object) "AA11111111");
        java.lang.String str93 = caverphone45.caverphone("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj94 = caverphone0.encode((java.lang.Object) caverphone45);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "AA11111111" + "'", obj25, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1111111111" + "'", str33, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "AA11111111" + "'", str41, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1111111111" + "'", str53, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "AA11111111" + "'", str58, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "AA11111111" + "'", str63, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "AA11111111" + "'", str69, "AA11111111");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "AA11111111" + "'", str71, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "1111111111" + "'", str77, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "AA11111111" + "'", str82, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertEquals("'" + obj86 + "' != '" + "1111111111" + "'", obj86, "1111111111");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "1111111111" + "'", str88, "1111111111");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "AA11111111" + "'", str90, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj91 + "' != '" + "AA11111111" + "'", obj91, "AA11111111");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "1111111111" + "'", str93, "1111111111");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        boolean boolean16 = caverphone0.isCaverphoneEqual("1111111111", "");
        org.apache.commons.codec.language.Caverphone caverphone17 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean20 = caverphone17.isCaverphoneEqual("hi!", "");
        boolean boolean23 = caverphone17.isCaverphoneEqual("", "hi!");
        java.lang.String str25 = caverphone17.encode("hi!");
        java.lang.String str27 = caverphone17.caverphone("1111111111");
        java.lang.Object obj28 = caverphone0.encode((java.lang.Object) "1111111111");
        boolean boolean31 = caverphone0.isCaverphoneEqual("AA11111111", "1111111111");
        boolean boolean34 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str36 = caverphone0.caverphone("1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "AA11111111" + "'", str25, "AA11111111");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1111111111" + "'", str27, "1111111111");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "1111111111" + "'", obj28, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1111111111" + "'", str36, "1111111111");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        boolean boolean9 = caverphone0.isCaverphoneEqual("hi!", "1111111111");
        boolean boolean12 = caverphone0.isCaverphoneEqual("", "AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone13 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean16 = caverphone13.isCaverphoneEqual("hi!", "");
        java.lang.String str18 = caverphone13.caverphone("");
        boolean boolean21 = caverphone13.isCaverphoneEqual("AA11111111", "");
        java.lang.String str23 = caverphone13.encode("1111111111");
        boolean boolean26 = caverphone13.isCaverphoneEqual("1111111111", "");
        java.lang.Object obj27 = caverphone0.encode((java.lang.Object) "");
        org.apache.commons.codec.language.Caverphone caverphone28 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean31 = caverphone28.isCaverphoneEqual("1111111111", "");
        boolean boolean34 = caverphone28.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str36 = caverphone28.encode("");
        boolean boolean39 = caverphone28.isCaverphoneEqual("1111111111", "hi!");
        java.lang.Object obj40 = caverphone0.encode((java.lang.Object) "1111111111");
        boolean boolean43 = caverphone0.isCaverphoneEqual("", "hi!");
        boolean boolean46 = caverphone0.isCaverphoneEqual("1111111111", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1111111111" + "'", str23, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "1111111111" + "'", obj27, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1111111111" + "'", str36, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "1111111111" + "'", obj40, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("1111111111", "AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone14 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean17 = caverphone14.isCaverphoneEqual("hi!", "");
        java.lang.String str19 = caverphone14.caverphone("");
        boolean boolean22 = caverphone14.isCaverphoneEqual("AA11111111", "");
        java.lang.String str24 = caverphone14.caverphone("AA11111111");
        java.lang.String str26 = caverphone14.caverphone("AA11111111");
        java.lang.String str28 = caverphone14.caverphone("hi!");
        java.lang.String str30 = caverphone14.caverphone("1111111111");
        java.lang.Object obj31 = caverphone0.encode((java.lang.Object) str30);
        org.apache.commons.codec.language.Caverphone caverphone32 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean35 = caverphone32.isCaverphoneEqual("hi!", "");
        java.lang.String str37 = caverphone32.caverphone("");
        boolean boolean40 = caverphone32.isCaverphoneEqual("AA11111111", "");
        java.lang.String str42 = caverphone32.caverphone("AA11111111");
        java.lang.String str44 = caverphone32.caverphone("AA11111111");
        java.lang.String str46 = caverphone32.caverphone("hi!");
        java.lang.String str48 = caverphone32.caverphone("1111111111");
        java.lang.String str50 = caverphone32.encode("1111111111");
        java.lang.Object obj51 = caverphone0.encode((java.lang.Object) "1111111111");
        java.lang.String str53 = caverphone0.caverphone("");
        boolean boolean56 = caverphone0.isCaverphoneEqual("", "hi!");
        org.apache.commons.codec.language.Caverphone caverphone57 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean60 = caverphone57.isCaverphoneEqual("hi!", "");
        java.lang.String str62 = caverphone57.caverphone("");
        boolean boolean65 = caverphone57.isCaverphoneEqual("AA11111111", "");
        java.lang.String str67 = caverphone57.caverphone("hi!");
        java.lang.String str69 = caverphone57.caverphone("");
        java.lang.String str71 = caverphone57.caverphone("1111111111");
        java.lang.Object obj72 = caverphone0.encode((java.lang.Object) "1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1111111111" + "'", str19, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AA11111111" + "'", str24, "AA11111111");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "AA11111111" + "'", str26, "AA11111111");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AA11111111" + "'", str28, "AA11111111");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1111111111" + "'", str30, "1111111111");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "1111111111" + "'", obj31, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1111111111" + "'", str37, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "AA11111111" + "'", str42, "AA11111111");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "AA11111111" + "'", str44, "AA11111111");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "AA11111111" + "'", str46, "AA11111111");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1111111111" + "'", str48, "1111111111");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1111111111" + "'", str50, "1111111111");
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + "1111111111" + "'", obj51, "1111111111");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1111111111" + "'", str53, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "1111111111" + "'", str62, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "AA11111111" + "'", str67, "AA11111111");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "1111111111" + "'", str69, "1111111111");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "1111111111" + "'", str71, "1111111111");
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + "1111111111" + "'", obj72, "1111111111");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "");
        org.apache.commons.codec.language.Caverphone caverphone9 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean12 = caverphone9.isCaverphoneEqual("hi!", "");
        java.lang.String str14 = caverphone9.encode("hi!");
        java.lang.String str16 = caverphone9.caverphone("1111111111");
        java.lang.String str18 = caverphone9.encode("1111111111");
        java.lang.Object obj19 = caverphone0.encode((java.lang.Object) "1111111111");
        java.lang.String str21 = caverphone0.caverphone("1111111111");
        java.lang.String str23 = caverphone0.encode("");
        java.lang.String str25 = caverphone0.encode("hi!");
        boolean boolean28 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str30 = caverphone0.caverphone("");
        java.lang.String str32 = caverphone0.encode("1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "1111111111" + "'", obj19, "1111111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1111111111" + "'", str23, "1111111111");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "AA11111111" + "'", str25, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1111111111" + "'", str30, "1111111111");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1111111111" + "'", str32, "1111111111");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str15 = caverphone0.caverphone("AA11111111");
        boolean boolean18 = caverphone0.isCaverphoneEqual("1111111111", "AA11111111");
        boolean boolean21 = caverphone0.isCaverphoneEqual("1111111111", "");
        java.lang.String str23 = caverphone0.encode("hi!");
        java.lang.String str25 = caverphone0.caverphone("hi!");
        org.apache.commons.codec.language.Caverphone caverphone26 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean29 = caverphone26.isCaverphoneEqual("hi!", "");
        java.lang.String str31 = caverphone26.caverphone("AA11111111");
        boolean boolean34 = caverphone26.isCaverphoneEqual("", "");
        org.apache.commons.codec.language.Caverphone caverphone35 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean38 = caverphone35.isCaverphoneEqual("hi!", "");
        java.lang.String str40 = caverphone35.encode("hi!");
        java.lang.String str42 = caverphone35.caverphone("1111111111");
        java.lang.String str44 = caverphone35.encode("1111111111");
        java.lang.Object obj45 = caverphone26.encode((java.lang.Object) "1111111111");
        java.lang.Object obj46 = caverphone0.encode((java.lang.Object) "1111111111");
        java.lang.String str48 = caverphone0.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone49 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean52 = caverphone49.isCaverphoneEqual("hi!", "");
        java.lang.String str54 = caverphone49.caverphone("AA11111111");
        java.lang.String str56 = caverphone49.encode("");
        java.lang.String str58 = caverphone49.encode("");
        java.lang.String str60 = caverphone49.encode("");
        java.lang.String str62 = caverphone49.encode("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj63 = caverphone0.encode((java.lang.Object) caverphone49);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AA11111111" + "'", str23, "AA11111111");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "AA11111111" + "'", str25, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AA11111111" + "'", str31, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "AA11111111" + "'", str40, "AA11111111");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1111111111" + "'", str42, "1111111111");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1111111111" + "'", str44, "1111111111");
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + "1111111111" + "'", obj45, "1111111111");
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + "1111111111" + "'", obj46, "1111111111");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1111111111" + "'", str48, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "AA11111111" + "'", str54, "AA11111111");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1111111111" + "'", str56, "1111111111");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "1111111111" + "'", str58, "1111111111");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "1111111111" + "'", str60, "1111111111");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "AA11111111" + "'", str62, "AA11111111");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "");
        org.apache.commons.codec.language.Caverphone caverphone14 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean17 = caverphone14.isCaverphoneEqual("1111111111", "");
        java.lang.Object obj18 = caverphone0.encode((java.lang.Object) "");
        boolean boolean21 = caverphone0.isCaverphoneEqual("hi!", "AA11111111");
        java.lang.Class<?> wildcardClass22 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "1111111111" + "'", obj18, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        java.lang.String str7 = caverphone0.encode("");
        java.lang.String str9 = caverphone0.caverphone("1111111111");
        java.lang.String str11 = caverphone0.caverphone("");
        java.lang.String str13 = caverphone0.encode("");
        java.lang.String str15 = caverphone0.caverphone("hi!");
        boolean boolean18 = caverphone0.isCaverphoneEqual("", "hi!");
        org.apache.commons.codec.language.Caverphone caverphone19 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean22 = caverphone19.isCaverphoneEqual("hi!", "");
        boolean boolean25 = caverphone19.isCaverphoneEqual("", "hi!");
        java.lang.String str27 = caverphone19.caverphone("");
        boolean boolean30 = caverphone19.isCaverphoneEqual("", "1111111111");
        java.lang.String str32 = caverphone19.encode("hi!");
        java.lang.String str34 = caverphone19.encode("");
        org.apache.commons.codec.language.Caverphone caverphone35 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean38 = caverphone35.isCaverphoneEqual("hi!", "");
        java.lang.String str40 = caverphone35.caverphone("");
        boolean boolean43 = caverphone35.isCaverphoneEqual("AA11111111", "");
        java.lang.Object obj44 = caverphone19.encode((java.lang.Object) "AA11111111");
        boolean boolean47 = caverphone19.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str49 = caverphone19.caverphone("hi!");
        boolean boolean52 = caverphone19.isCaverphoneEqual("hi!", "");
        boolean boolean55 = caverphone19.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.Object obj56 = caverphone0.encode((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111" + "'", str7, "1111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1111111111" + "'", str27, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "AA11111111" + "'", str32, "AA11111111");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1111111111" + "'", str34, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1111111111" + "'", str40, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + "AA11111111" + "'", obj44, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "AA11111111" + "'", str49, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + "AA11111111" + "'", obj56, "AA11111111");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        boolean boolean9 = caverphone0.isCaverphoneEqual("AA11111111", "1111111111");
        java.lang.String str11 = caverphone0.caverphone("");
        java.lang.String str13 = caverphone0.encode("hi!");
        java.lang.String str15 = caverphone0.encode("AA11111111");
        java.lang.String str17 = caverphone0.encode("1111111111");
        java.lang.String str19 = caverphone0.caverphone("AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("AA11111111");
        java.lang.String str14 = caverphone0.caverphone("hi!");
        java.lang.String str16 = caverphone0.caverphone("1111111111");
        java.lang.String str18 = caverphone0.caverphone("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone19 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean22 = caverphone19.isCaverphoneEqual("hi!", "");
        java.lang.String str24 = caverphone19.caverphone("");
        boolean boolean27 = caverphone19.isCaverphoneEqual("AA11111111", "");
        java.lang.String str29 = caverphone19.caverphone("AA11111111");
        java.lang.String str31 = caverphone19.caverphone("AA11111111");
        java.lang.String str33 = caverphone19.caverphone("hi!");
        java.lang.Object obj34 = caverphone0.encode((java.lang.Object) "hi!");
        java.lang.String str36 = caverphone0.encode("AA11111111");
        java.lang.String str38 = caverphone0.encode("AA11111111");
        java.lang.String str40 = caverphone0.caverphone("hi!");
        java.lang.String str42 = caverphone0.encode("");
        java.lang.String str44 = caverphone0.encode("AA11111111");
        java.lang.String str46 = caverphone0.encode("AA11111111");
        boolean boolean49 = caverphone0.isCaverphoneEqual("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1111111111" + "'", str24, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AA11111111" + "'", str29, "AA11111111");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AA11111111" + "'", str31, "AA11111111");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AA11111111" + "'", str33, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "AA11111111" + "'", obj34, "AA11111111");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "AA11111111" + "'", str36, "AA11111111");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "AA11111111" + "'", str38, "AA11111111");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "AA11111111" + "'", str40, "AA11111111");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1111111111" + "'", str42, "1111111111");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "AA11111111" + "'", str44, "AA11111111");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "AA11111111" + "'", str46, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str13 = caverphone0.encode("hi!");
        java.lang.String str15 = caverphone0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("hi!", "");
        java.lang.String str21 = caverphone16.caverphone("");
        boolean boolean24 = caverphone16.isCaverphoneEqual("AA11111111", "");
        java.lang.Object obj25 = caverphone0.encode((java.lang.Object) "AA11111111");
        boolean boolean28 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str30 = caverphone0.caverphone("hi!");
        boolean boolean33 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str35 = caverphone0.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone36 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str38 = caverphone36.caverphone("1111111111");
        java.lang.String str40 = caverphone36.caverphone("1111111111");
        java.lang.Object obj41 = caverphone0.encode((java.lang.Object) str40);
        java.lang.String str43 = caverphone0.encode("1111111111");
        java.lang.String str45 = caverphone0.encode("1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "AA11111111" + "'", obj25, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "AA11111111" + "'", str30, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1111111111" + "'", str35, "1111111111");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1111111111" + "'", str38, "1111111111");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1111111111" + "'", str40, "1111111111");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "1111111111" + "'", obj41, "1111111111");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1111111111" + "'", str43, "1111111111");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1111111111" + "'", str45, "1111111111");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str13 = caverphone0.encode("hi!");
        java.lang.String str15 = caverphone0.encode("");
        boolean boolean18 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        boolean boolean21 = caverphone0.isCaverphoneEqual("1111111111", "hi!");
        boolean boolean24 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean27 = caverphone0.isCaverphoneEqual("1111111111", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        java.lang.String str7 = caverphone0.encode("");
        java.lang.String str9 = caverphone0.caverphone("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone10 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean13 = caverphone10.isCaverphoneEqual("1111111111", "");
        boolean boolean16 = caverphone10.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str18 = caverphone10.encode("AA11111111");
        java.lang.String str20 = caverphone10.caverphone("AA11111111");
        java.lang.Object obj21 = caverphone0.encode((java.lang.Object) "AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone22 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean25 = caverphone22.isCaverphoneEqual("1111111111", "");
        boolean boolean28 = caverphone22.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str30 = caverphone22.caverphone("AA11111111");
        java.lang.String str32 = caverphone22.encode("1111111111");
        java.lang.String str34 = caverphone22.caverphone("hi!");
        org.apache.commons.codec.language.Caverphone caverphone35 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean38 = caverphone35.isCaverphoneEqual("hi!", "");
        boolean boolean41 = caverphone35.isCaverphoneEqual("", "hi!");
        java.lang.String str43 = caverphone35.caverphone("");
        boolean boolean46 = caverphone35.isCaverphoneEqual("", "1111111111");
        boolean boolean49 = caverphone35.isCaverphoneEqual("", "");
        java.lang.String str51 = caverphone35.caverphone("hi!");
        java.lang.String str53 = caverphone35.caverphone("");
        java.lang.String str55 = caverphone35.caverphone("hi!");
        boolean boolean58 = caverphone35.isCaverphoneEqual("", "AA11111111");
        boolean boolean61 = caverphone35.isCaverphoneEqual("AA11111111", "1111111111");
        java.lang.Object obj62 = caverphone22.encode((java.lang.Object) "1111111111");
        java.lang.Class<?> wildcardClass63 = caverphone22.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj64 = caverphone0.encode((java.lang.Object) caverphone22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111" + "'", str7, "1111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "AA11111111" + "'", obj21, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "AA11111111" + "'", str30, "AA11111111");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1111111111" + "'", str32, "1111111111");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AA11111111" + "'", str34, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1111111111" + "'", str43, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "AA11111111" + "'", str51, "AA11111111");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1111111111" + "'", str53, "1111111111");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "AA11111111" + "'", str55, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + "1111111111" + "'", obj62, "1111111111");
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.String str15 = caverphone0.caverphone("hi!");
        java.lang.String str17 = caverphone0.encode("1111111111");
        boolean boolean20 = caverphone0.isCaverphoneEqual("", "AA11111111");
        boolean boolean23 = caverphone0.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.String str25 = caverphone0.caverphone("");
        boolean boolean28 = caverphone0.isCaverphoneEqual("", "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1111111111" + "'", str25, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("1111111111", "AA11111111");
        java.lang.Object obj15 = caverphone0.encode((java.lang.Object) "AA11111111");
        boolean boolean18 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str20 = caverphone0.encode("1111111111");
        java.lang.String str22 = caverphone0.caverphone("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone23 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean26 = caverphone23.isCaverphoneEqual("hi!", "");
        java.lang.String str28 = caverphone23.caverphone("");
        boolean boolean31 = caverphone23.isCaverphoneEqual("AA11111111", "");
        java.lang.String str33 = caverphone23.encode("1111111111");
        boolean boolean36 = caverphone23.isCaverphoneEqual("AA11111111", "");
        org.apache.commons.codec.language.Caverphone caverphone37 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean40 = caverphone37.isCaverphoneEqual("1111111111", "");
        java.lang.Object obj41 = caverphone23.encode((java.lang.Object) "");
        java.lang.String str43 = caverphone23.caverphone("hi!");
        java.lang.Object obj44 = caverphone0.encode((java.lang.Object) str43);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "AA11111111" + "'", obj15, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1111111111" + "'", str20, "1111111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1111111111" + "'", str22, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1111111111" + "'", str28, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1111111111" + "'", str33, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "1111111111" + "'", obj41, "1111111111");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "AA11111111" + "'", str43, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + "AA11111111" + "'", obj44, "AA11111111");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.encode("hi!");
        java.lang.String str7 = caverphone0.caverphone("hi!");
        java.lang.String str9 = caverphone0.caverphone("hi!");
        java.lang.String str11 = caverphone0.caverphone("1111111111");
        java.lang.String str13 = caverphone0.encode("");
        java.lang.String str15 = caverphone0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("hi!", "");
        java.lang.String str21 = caverphone16.caverphone("");
        boolean boolean24 = caverphone16.isCaverphoneEqual("AA11111111", "");
        java.lang.String str26 = caverphone16.caverphone("AA11111111");
        java.lang.String str28 = caverphone16.caverphone("AA11111111");
        java.lang.String str30 = caverphone16.caverphone("hi!");
        java.lang.String str32 = caverphone16.caverphone("1111111111");
        java.lang.Object obj33 = caverphone0.encode((java.lang.Object) "1111111111");
        boolean boolean36 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str38 = caverphone0.caverphone("1111111111");
        boolean boolean41 = caverphone0.isCaverphoneEqual("", "1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "AA11111111" + "'", str26, "AA11111111");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AA11111111" + "'", str28, "AA11111111");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "AA11111111" + "'", str30, "AA11111111");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1111111111" + "'", str32, "1111111111");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "1111111111" + "'", obj33, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1111111111" + "'", str38, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.String str15 = caverphone0.caverphone("hi!");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("hi!", "");
        java.lang.String str21 = caverphone16.caverphone("");
        boolean boolean24 = caverphone16.isCaverphoneEqual("AA11111111", "");
        java.lang.String str26 = caverphone16.caverphone("AA11111111");
        java.lang.String str28 = caverphone16.caverphone("AA11111111");
        java.lang.String str30 = caverphone16.caverphone("hi!");
        java.lang.String str32 = caverphone16.caverphone("1111111111");
        java.lang.String str34 = caverphone16.encode("1111111111");
        java.lang.Object obj35 = caverphone0.encode((java.lang.Object) str34);
        boolean boolean38 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str40 = caverphone0.encode("hi!");
        java.lang.String str42 = caverphone0.encode("1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "AA11111111" + "'", str26, "AA11111111");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AA11111111" + "'", str28, "AA11111111");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "AA11111111" + "'", str30, "AA11111111");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1111111111" + "'", str32, "1111111111");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1111111111" + "'", str34, "1111111111");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "1111111111" + "'", obj35, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "AA11111111" + "'", str40, "AA11111111");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1111111111" + "'", str42, "1111111111");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean16 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str18 = caverphone0.caverphone("");
        java.lang.String str20 = caverphone0.encode("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone21 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean24 = caverphone21.isCaverphoneEqual("hi!", "");
        java.lang.String str26 = caverphone21.caverphone("");
        boolean boolean29 = caverphone21.isCaverphoneEqual("AA11111111", "");
        java.lang.String str31 = caverphone21.caverphone("AA11111111");
        java.lang.String str33 = caverphone21.caverphone("hi!");
        java.lang.String str35 = caverphone21.caverphone("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone36 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean39 = caverphone36.isCaverphoneEqual("hi!", "");
        java.lang.String str41 = caverphone36.caverphone("");
        boolean boolean44 = caverphone36.isCaverphoneEqual("AA11111111", "");
        java.lang.String str46 = caverphone36.caverphone("AA11111111");
        java.lang.String str48 = caverphone36.caverphone("AA11111111");
        java.lang.String str50 = caverphone36.caverphone("hi!");
        java.lang.String str52 = caverphone36.caverphone("hi!");
        java.lang.String str54 = caverphone36.encode("");
        java.lang.String str56 = caverphone36.caverphone("");
        java.lang.Object obj57 = caverphone21.encode((java.lang.Object) str56);
        java.lang.Object obj58 = caverphone0.encode(obj57);
        java.lang.Class<?> wildcardClass59 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1111111111" + "'", str20, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1111111111" + "'", str26, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AA11111111" + "'", str31, "AA11111111");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AA11111111" + "'", str33, "AA11111111");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1111111111" + "'", str35, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1111111111" + "'", str41, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "AA11111111" + "'", str46, "AA11111111");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "AA11111111" + "'", str48, "AA11111111");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "AA11111111" + "'", str50, "AA11111111");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "AA11111111" + "'", str52, "AA11111111");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1111111111" + "'", str54, "1111111111");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1111111111" + "'", str56, "1111111111");
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + "1111111111" + "'", obj57, "1111111111");
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + "1111111111" + "'", obj58, "1111111111");
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str8 = caverphone0.encode("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str13 = caverphone0.encode("");
        java.lang.String str15 = caverphone0.encode("");
        java.lang.String str17 = caverphone0.encode("1111111111");
        boolean boolean20 = caverphone0.isCaverphoneEqual("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        boolean boolean14 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean17 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str19 = caverphone0.caverphone("");
        java.lang.String str21 = caverphone0.caverphone("");
        boolean boolean24 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str26 = caverphone0.caverphone("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1111111111" + "'", str19, "1111111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "AA11111111" + "'", str26, "AA11111111");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        java.lang.String str7 = caverphone0.encode("");
        java.lang.String str9 = caverphone0.encode("");
        boolean boolean12 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str14 = caverphone0.caverphone("AA11111111");
        java.lang.String str16 = caverphone0.caverphone("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111" + "'", str7, "1111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str15 = caverphone0.caverphone("AA11111111");
        boolean boolean18 = caverphone0.isCaverphoneEqual("hi!", "AA11111111");
        java.lang.String str20 = caverphone0.caverphone("");
        boolean boolean23 = caverphone0.isCaverphoneEqual("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1111111111" + "'", str20, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "1111111111");
        java.lang.String str15 = caverphone0.encode("hi!");
        java.lang.String str17 = caverphone0.caverphone("hi!");
        boolean boolean20 = caverphone0.isCaverphoneEqual("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str13 = caverphone0.encode("hi!");
        java.lang.String str15 = caverphone0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("hi!", "");
        java.lang.String str21 = caverphone16.caverphone("");
        boolean boolean24 = caverphone16.isCaverphoneEqual("AA11111111", "");
        java.lang.Object obj25 = caverphone0.encode((java.lang.Object) "AA11111111");
        boolean boolean28 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str30 = caverphone0.encode("1111111111");
        boolean boolean33 = caverphone0.isCaverphoneEqual("", "AA11111111");
        java.lang.String str35 = caverphone0.encode("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone36 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean39 = caverphone36.isCaverphoneEqual("hi!", "");
        java.lang.String str41 = caverphone36.caverphone("");
        boolean boolean44 = caverphone36.isCaverphoneEqual("AA11111111", "");
        java.lang.String str46 = caverphone36.caverphone("AA11111111");
        java.lang.String str48 = caverphone36.caverphone("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone49 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean52 = caverphone49.isCaverphoneEqual("hi!", "");
        boolean boolean55 = caverphone49.isCaverphoneEqual("", "hi!");
        java.lang.String str57 = caverphone49.caverphone("");
        boolean boolean60 = caverphone49.isCaverphoneEqual("", "1111111111");
        boolean boolean63 = caverphone49.isCaverphoneEqual("", "");
        java.lang.String str65 = caverphone49.caverphone("hi!");
        java.lang.String str67 = caverphone49.caverphone("");
        java.lang.String str69 = caverphone49.caverphone("hi!");
        java.lang.Object obj70 = caverphone36.encode((java.lang.Object) str69);
        java.lang.String str72 = caverphone36.encode("AA11111111");
        boolean boolean75 = caverphone36.isCaverphoneEqual("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj76 = caverphone0.encode((java.lang.Object) caverphone36);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "AA11111111" + "'", obj25, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1111111111" + "'", str30, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1111111111" + "'", str35, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1111111111" + "'", str41, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "AA11111111" + "'", str46, "AA11111111");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "AA11111111" + "'", str48, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "1111111111" + "'", str57, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "AA11111111" + "'", str65, "AA11111111");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "1111111111" + "'", str67, "1111111111");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "AA11111111" + "'", str69, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + "AA11111111" + "'", obj70, "AA11111111");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "AA11111111" + "'", str72, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str8 = caverphone0.encode("AA11111111");
        java.lang.String str10 = caverphone0.encode("");
        java.lang.String str12 = caverphone0.caverphone("");
        java.lang.String str14 = caverphone0.caverphone("hi!");
        java.lang.String str16 = caverphone0.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone17 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean20 = caverphone17.isCaverphoneEqual("hi!", "");
        boolean boolean23 = caverphone17.isCaverphoneEqual("", "hi!");
        java.lang.String str25 = caverphone17.caverphone("");
        boolean boolean28 = caverphone17.isCaverphoneEqual("", "1111111111");
        java.lang.String str30 = caverphone17.encode("hi!");
        java.lang.String str32 = caverphone17.encode("");
        org.apache.commons.codec.language.Caverphone caverphone33 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean36 = caverphone33.isCaverphoneEqual("hi!", "");
        java.lang.String str38 = caverphone33.caverphone("");
        boolean boolean41 = caverphone33.isCaverphoneEqual("AA11111111", "");
        java.lang.Object obj42 = caverphone17.encode((java.lang.Object) "AA11111111");
        boolean boolean45 = caverphone17.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str47 = caverphone17.caverphone("hi!");
        java.lang.String str49 = caverphone17.caverphone("");
        java.lang.String str51 = caverphone17.encode("");
        java.lang.String str53 = caverphone17.caverphone("hi!");
        java.lang.Object obj54 = caverphone0.encode((java.lang.Object) str53);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111" + "'", str12, "1111111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1111111111" + "'", str25, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "AA11111111" + "'", str30, "AA11111111");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1111111111" + "'", str32, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1111111111" + "'", str38, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "AA11111111" + "'", obj42, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "AA11111111" + "'", str47, "AA11111111");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1111111111" + "'", str49, "1111111111");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1111111111" + "'", str51, "1111111111");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "AA11111111" + "'", str53, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + "AA11111111" + "'", obj54, "AA11111111");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.caverphone("1111111111");
        boolean boolean5 = caverphone0.isCaverphoneEqual("1111111111", "hi!");
        org.apache.commons.codec.language.Caverphone caverphone6 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean9 = caverphone6.isCaverphoneEqual("hi!", "");
        boolean boolean12 = caverphone6.isCaverphoneEqual("", "hi!");
        java.lang.String str14 = caverphone6.caverphone("");
        boolean boolean17 = caverphone6.isCaverphoneEqual("", "1111111111");
        java.lang.String str19 = caverphone6.encode("hi!");
        java.lang.String str21 = caverphone6.encode("");
        org.apache.commons.codec.language.Caverphone caverphone22 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean25 = caverphone22.isCaverphoneEqual("hi!", "");
        java.lang.String str27 = caverphone22.caverphone("");
        boolean boolean30 = caverphone22.isCaverphoneEqual("AA11111111", "");
        java.lang.Object obj31 = caverphone6.encode((java.lang.Object) "AA11111111");
        boolean boolean34 = caverphone6.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str36 = caverphone6.encode("1111111111");
        java.lang.String str38 = caverphone6.caverphone("AA11111111");
        java.lang.String str40 = caverphone6.caverphone("AA11111111");
        java.lang.String str42 = caverphone6.encode("1111111111");
        java.lang.Object obj43 = caverphone0.encode((java.lang.Object) "1111111111");
        java.lang.String str45 = caverphone0.encode("AA11111111");
        java.lang.String str47 = caverphone0.caverphone("hi!");
        java.lang.String str49 = caverphone0.caverphone("hi!");
        org.apache.commons.codec.language.Caverphone caverphone50 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean53 = caverphone50.isCaverphoneEqual("1111111111", "");
        boolean boolean56 = caverphone50.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str58 = caverphone50.encode("");
        java.lang.String str60 = caverphone50.encode("hi!");
        boolean boolean63 = caverphone50.isCaverphoneEqual("", "1111111111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj64 = caverphone0.encode((java.lang.Object) caverphone50);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1111111111" + "'", str27, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "AA11111111" + "'", obj31, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1111111111" + "'", str36, "1111111111");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "AA11111111" + "'", str38, "AA11111111");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "AA11111111" + "'", str40, "AA11111111");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1111111111" + "'", str42, "1111111111");
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + "1111111111" + "'", obj43, "1111111111");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "AA11111111" + "'", str45, "AA11111111");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "AA11111111" + "'", str47, "AA11111111");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "AA11111111" + "'", str49, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "1111111111" + "'", str58, "1111111111");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "AA11111111" + "'", str60, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        java.lang.Object obj12 = caverphone0.encode((java.lang.Object) "");
        org.apache.commons.codec.language.Caverphone caverphone13 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean16 = caverphone13.isCaverphoneEqual("hi!", "");
        java.lang.String str18 = caverphone13.caverphone("AA11111111");
        java.lang.String str20 = caverphone13.caverphone("hi!");
        java.lang.Object obj21 = caverphone0.encode((java.lang.Object) str20);
        java.lang.String str23 = caverphone0.encode("1111111111");
        java.lang.Class<?> wildcardClass24 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "1111111111" + "'", obj12, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "AA11111111" + "'", obj21, "AA11111111");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1111111111" + "'", str23, "1111111111");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("AA11111111");
        java.lang.String str14 = caverphone0.caverphone("hi!");
        boolean boolean17 = caverphone0.isCaverphoneEqual("hi!", "AA11111111");
        java.lang.String str19 = caverphone0.caverphone("");
        java.lang.String str21 = caverphone0.encode("AA11111111");
        boolean boolean24 = caverphone0.isCaverphoneEqual("", "hi!");
        boolean boolean27 = caverphone0.isCaverphoneEqual("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1111111111" + "'", str19, "1111111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AA11111111" + "'", str21, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.encode("hi!");
        java.lang.String str7 = caverphone0.caverphone("hi!");
        java.lang.String str9 = caverphone0.encode("1111111111");
        java.lang.String str11 = caverphone0.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone12 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean15 = caverphone12.isCaverphoneEqual("hi!", "");
        java.lang.String str17 = caverphone12.caverphone("AA11111111");
        boolean boolean20 = caverphone12.isCaverphoneEqual("", "");
        org.apache.commons.codec.language.Caverphone caverphone21 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean24 = caverphone21.isCaverphoneEqual("hi!", "");
        java.lang.String str26 = caverphone21.encode("hi!");
        java.lang.String str28 = caverphone21.caverphone("1111111111");
        java.lang.String str30 = caverphone21.encode("1111111111");
        java.lang.Object obj31 = caverphone12.encode((java.lang.Object) "1111111111");
        org.apache.commons.codec.language.Caverphone caverphone32 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean35 = caverphone32.isCaverphoneEqual("hi!", "");
        java.lang.String str37 = caverphone32.caverphone("");
        boolean boolean40 = caverphone32.isCaverphoneEqual("AA11111111", "");
        java.lang.String str42 = caverphone32.encode("1111111111");
        java.lang.Object obj43 = caverphone12.encode((java.lang.Object) str42);
        boolean boolean46 = caverphone12.isCaverphoneEqual("", "1111111111");
        java.lang.String str48 = caverphone12.encode("AA11111111");
        java.lang.Object obj49 = caverphone0.encode((java.lang.Object) str48);
        java.lang.String str51 = caverphone0.caverphone("hi!");
        java.lang.Class<?> wildcardClass52 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "AA11111111" + "'", str26, "AA11111111");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1111111111" + "'", str28, "1111111111");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1111111111" + "'", str30, "1111111111");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "1111111111" + "'", obj31, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1111111111" + "'", str37, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1111111111" + "'", str42, "1111111111");
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + "1111111111" + "'", obj43, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "AA11111111" + "'", str48, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "AA11111111" + "'", obj49, "AA11111111");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "AA11111111" + "'", str51, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        boolean boolean9 = caverphone0.isCaverphoneEqual("hi!", "1111111111");
        boolean boolean12 = caverphone0.isCaverphoneEqual("", "AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone13 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean16 = caverphone13.isCaverphoneEqual("hi!", "");
        java.lang.String str18 = caverphone13.caverphone("");
        boolean boolean21 = caverphone13.isCaverphoneEqual("AA11111111", "");
        java.lang.String str23 = caverphone13.encode("1111111111");
        boolean boolean26 = caverphone13.isCaverphoneEqual("1111111111", "");
        java.lang.Object obj27 = caverphone0.encode((java.lang.Object) "");
        java.lang.String str29 = caverphone0.encode("hi!");
        java.lang.String str31 = caverphone0.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone32 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean35 = caverphone32.isCaverphoneEqual("hi!", "");
        java.lang.String str37 = caverphone32.caverphone("AA11111111");
        java.lang.String str39 = caverphone32.caverphone("hi!");
        org.apache.commons.codec.language.Caverphone caverphone40 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean43 = caverphone40.isCaverphoneEqual("hi!", "");
        java.lang.String str45 = caverphone40.caverphone("AA11111111");
        boolean boolean48 = caverphone40.isCaverphoneEqual("", "");
        org.apache.commons.codec.language.Caverphone caverphone49 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean52 = caverphone49.isCaverphoneEqual("hi!", "");
        java.lang.String str54 = caverphone49.encode("hi!");
        java.lang.String str56 = caverphone49.caverphone("1111111111");
        java.lang.String str58 = caverphone49.encode("1111111111");
        java.lang.Object obj59 = caverphone40.encode((java.lang.Object) "1111111111");
        java.lang.String str61 = caverphone40.caverphone("1111111111");
        boolean boolean64 = caverphone40.isCaverphoneEqual("", "hi!");
        java.lang.Object obj65 = caverphone32.encode((java.lang.Object) "hi!");
        java.lang.Object obj66 = caverphone0.encode((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1111111111" + "'", str23, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "1111111111" + "'", obj27, "1111111111");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AA11111111" + "'", str29, "AA11111111");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AA11111111" + "'", str31, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "AA11111111" + "'", str37, "AA11111111");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "AA11111111" + "'", str39, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "AA11111111" + "'", str45, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "AA11111111" + "'", str54, "AA11111111");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1111111111" + "'", str56, "1111111111");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "1111111111" + "'", str58, "1111111111");
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + "1111111111" + "'", obj59, "1111111111");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "1111111111" + "'", str61, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + "AA11111111" + "'", obj65, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + "AA11111111" + "'", obj66, "AA11111111");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone14 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean17 = caverphone14.isCaverphoneEqual("1111111111", "");
        boolean boolean20 = caverphone14.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str22 = caverphone14.encode("");
        java.lang.String str24 = caverphone14.caverphone("");
        java.lang.Object obj25 = caverphone0.encode((java.lang.Object) str24);
        org.apache.commons.codec.language.Caverphone caverphone26 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean29 = caverphone26.isCaverphoneEqual("hi!", "");
        boolean boolean32 = caverphone26.isCaverphoneEqual("", "hi!");
        java.lang.String str34 = caverphone26.caverphone("hi!");
        java.lang.Object obj35 = caverphone0.encode((java.lang.Object) str34);
        java.lang.String str37 = caverphone0.encode("");
        java.lang.String str39 = caverphone0.encode("");
        java.lang.String str41 = caverphone0.encode("");
        java.lang.Class<?> wildcardClass42 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1111111111" + "'", str22, "1111111111");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1111111111" + "'", str24, "1111111111");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "1111111111" + "'", obj25, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AA11111111" + "'", str34, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "AA11111111" + "'", obj35, "AA11111111");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1111111111" + "'", str37, "1111111111");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1111111111" + "'", str39, "1111111111");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1111111111" + "'", str41, "1111111111");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str13 = caverphone0.encode("hi!");
        java.lang.String str15 = caverphone0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("hi!", "");
        java.lang.String str21 = caverphone16.caverphone("");
        boolean boolean24 = caverphone16.isCaverphoneEqual("AA11111111", "");
        java.lang.Object obj25 = caverphone0.encode((java.lang.Object) "AA11111111");
        boolean boolean28 = caverphone0.isCaverphoneEqual("hi!", "1111111111");
        java.lang.String str30 = caverphone0.encode("AA11111111");
        boolean boolean33 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str35 = caverphone0.encode("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "AA11111111" + "'", obj25, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "AA11111111" + "'", str30, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "AA11111111" + "'", str35, "AA11111111");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("AA11111111");
        java.lang.String str14 = caverphone0.caverphone("hi!");
        java.lang.String str16 = caverphone0.encode("1111111111");
        java.lang.String str18 = caverphone0.caverphone("hi!");
        java.lang.Object obj19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = caverphone0.encode(obj19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "1111111111");
        java.lang.String str15 = caverphone0.encode("hi!");
        java.lang.String str17 = caverphone0.caverphone("hi!");
        java.lang.String str19 = caverphone0.caverphone("");
        java.lang.String str21 = caverphone0.encode("hi!");
        java.lang.String str23 = caverphone0.encode("");
        java.lang.String str25 = caverphone0.encode("");
        java.lang.String str27 = caverphone0.caverphone("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1111111111" + "'", str19, "1111111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AA11111111" + "'", str21, "AA11111111");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1111111111" + "'", str23, "1111111111");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1111111111" + "'", str25, "1111111111");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1111111111" + "'", str27, "1111111111");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.encode("hi!");
        java.lang.String str7 = caverphone0.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone8 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean11 = caverphone8.isCaverphoneEqual("hi!", "");
        java.lang.String str13 = caverphone8.encode("hi!");
        java.lang.String str15 = caverphone8.caverphone("AA11111111");
        java.lang.String str17 = caverphone8.caverphone("hi!");
        java.lang.String str19 = caverphone8.caverphone("hi!");
        java.lang.Object obj20 = caverphone0.encode((java.lang.Object) "hi!");
        java.lang.String str22 = caverphone0.caverphone("1111111111");
        java.lang.String str24 = caverphone0.caverphone("AA11111111");
        java.lang.String str26 = caverphone0.encode("hi!");
        java.lang.String str28 = caverphone0.encode("");
        boolean boolean31 = caverphone0.isCaverphoneEqual("hi!", "");
        org.apache.commons.codec.language.Caverphone caverphone32 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean35 = caverphone32.isCaverphoneEqual("hi!", "");
        boolean boolean38 = caverphone32.isCaverphoneEqual("", "hi!");
        java.lang.String str40 = caverphone32.caverphone("");
        boolean boolean43 = caverphone32.isCaverphoneEqual("", "1111111111");
        java.lang.String str45 = caverphone32.encode("hi!");
        java.lang.String str47 = caverphone32.encode("");
        org.apache.commons.codec.language.Caverphone caverphone48 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean51 = caverphone48.isCaverphoneEqual("hi!", "");
        java.lang.String str53 = caverphone48.caverphone("");
        boolean boolean56 = caverphone48.isCaverphoneEqual("AA11111111", "");
        java.lang.Object obj57 = caverphone32.encode((java.lang.Object) "AA11111111");
        boolean boolean60 = caverphone32.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str62 = caverphone32.caverphone("hi!");
        boolean boolean65 = caverphone32.isCaverphoneEqual("hi!", "");
        java.lang.String str67 = caverphone32.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone68 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str70 = caverphone68.caverphone("1111111111");
        java.lang.String str72 = caverphone68.caverphone("1111111111");
        java.lang.Object obj73 = caverphone32.encode((java.lang.Object) str72);
        boolean boolean76 = caverphone32.isCaverphoneEqual("", "hi!");
        java.lang.String str78 = caverphone32.encode("");
        java.lang.String str80 = caverphone32.caverphone("AA11111111");
        java.lang.Object obj81 = caverphone0.encode((java.lang.Object) "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111" + "'", str7, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "AA11111111" + "'", obj20, "AA11111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1111111111" + "'", str22, "1111111111");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AA11111111" + "'", str24, "AA11111111");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "AA11111111" + "'", str26, "AA11111111");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1111111111" + "'", str28, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1111111111" + "'", str40, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "AA11111111" + "'", str45, "AA11111111");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1111111111" + "'", str47, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1111111111" + "'", str53, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + "AA11111111" + "'", obj57, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "AA11111111" + "'", str62, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "1111111111" + "'", str67, "1111111111");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "1111111111" + "'", str70, "1111111111");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "1111111111" + "'", str72, "1111111111");
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + "1111111111" + "'", obj73, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "1111111111" + "'", str78, "1111111111");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "AA11111111" + "'", str80, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj81 + "' != '" + "AA11111111" + "'", obj81, "AA11111111");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str8 = caverphone0.caverphone("AA11111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        boolean boolean14 = caverphone0.isCaverphoneEqual("1111111111", "AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone15 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean18 = caverphone15.isCaverphoneEqual("1111111111", "");
        boolean boolean21 = caverphone15.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str23 = caverphone15.encode("");
        java.lang.String str25 = caverphone15.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone26 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean29 = caverphone26.isCaverphoneEqual("hi!", "");
        java.lang.String str31 = caverphone26.caverphone("AA11111111");
        java.lang.String str33 = caverphone26.caverphone("");
        java.lang.String str35 = caverphone26.encode("hi!");
        java.lang.Object obj36 = caverphone15.encode((java.lang.Object) str35);
        java.lang.Object obj37 = caverphone0.encode(obj36);
        java.lang.String str39 = caverphone0.caverphone("AA11111111");
        java.lang.String str41 = caverphone0.caverphone("AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1111111111" + "'", str23, "1111111111");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "AA11111111" + "'", str25, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AA11111111" + "'", str31, "AA11111111");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1111111111" + "'", str33, "1111111111");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "AA11111111" + "'", str35, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "AA11111111" + "'", obj36, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "AA11111111" + "'", obj37, "AA11111111");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "AA11111111" + "'", str39, "AA11111111");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "AA11111111" + "'", str41, "AA11111111");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.String str15 = caverphone0.caverphone("hi!");
        java.lang.String str17 = caverphone0.encode("1111111111");
        boolean boolean20 = caverphone0.isCaverphoneEqual("", "AA11111111");
        boolean boolean23 = caverphone0.isCaverphoneEqual("AA11111111", "");
        boolean boolean26 = caverphone0.isCaverphoneEqual("1111111111", "");
        java.lang.Class<?> wildcardClass27 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str13 = caverphone0.encode("hi!");
        java.lang.String str15 = caverphone0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("hi!", "");
        java.lang.String str21 = caverphone16.caverphone("");
        boolean boolean24 = caverphone16.isCaverphoneEqual("AA11111111", "");
        java.lang.Object obj25 = caverphone0.encode((java.lang.Object) "AA11111111");
        boolean boolean28 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str30 = caverphone0.caverphone("hi!");
        java.lang.String str32 = caverphone0.caverphone("");
        boolean boolean35 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone36 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean39 = caverphone36.isCaverphoneEqual("1111111111", "");
        boolean boolean42 = caverphone36.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str44 = caverphone36.caverphone("AA11111111");
        java.lang.Object obj45 = caverphone0.encode((java.lang.Object) "AA11111111");
        java.lang.String str47 = caverphone0.encode("hi!");
        boolean boolean50 = caverphone0.isCaverphoneEqual("1111111111", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "AA11111111" + "'", obj25, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "AA11111111" + "'", str30, "AA11111111");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1111111111" + "'", str32, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "AA11111111" + "'", str44, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + "AA11111111" + "'", obj45, "AA11111111");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "AA11111111" + "'", str47, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        java.lang.String str12 = caverphone0.caverphone("AA11111111");
        java.lang.String str14 = caverphone0.encode("");
        boolean boolean17 = caverphone0.isCaverphoneEqual("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "");
        org.apache.commons.codec.language.Caverphone caverphone9 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean12 = caverphone9.isCaverphoneEqual("hi!", "");
        java.lang.String str14 = caverphone9.encode("hi!");
        java.lang.String str16 = caverphone9.caverphone("1111111111");
        java.lang.String str18 = caverphone9.encode("1111111111");
        java.lang.Object obj19 = caverphone0.encode((java.lang.Object) "1111111111");
        java.lang.String str21 = caverphone0.caverphone("1111111111");
        java.lang.String str23 = caverphone0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone24 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean27 = caverphone24.isCaverphoneEqual("hi!", "");
        java.lang.String str29 = caverphone24.encode("hi!");
        java.lang.String str31 = caverphone24.caverphone("1111111111");
        java.lang.String str33 = caverphone24.encode("1111111111");
        java.lang.Object obj34 = caverphone0.encode((java.lang.Object) "1111111111");
        java.lang.String str36 = caverphone0.encode("1111111111");
        java.lang.String str38 = caverphone0.encode("1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "1111111111" + "'", obj19, "1111111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1111111111" + "'", str23, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AA11111111" + "'", str29, "AA11111111");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1111111111" + "'", str31, "1111111111");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1111111111" + "'", str33, "1111111111");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "1111111111" + "'", obj34, "1111111111");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1111111111" + "'", str36, "1111111111");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1111111111" + "'", str38, "1111111111");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.encode("hi!");
        java.lang.String str7 = caverphone0.caverphone("hi!");
        java.lang.String str9 = caverphone0.caverphone("hi!");
        java.lang.String str11 = caverphone0.caverphone("1111111111");
        java.lang.String str13 = caverphone0.encode("");
        java.lang.String str15 = caverphone0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("hi!", "");
        java.lang.String str21 = caverphone16.caverphone("");
        boolean boolean24 = caverphone16.isCaverphoneEqual("AA11111111", "");
        java.lang.String str26 = caverphone16.caverphone("AA11111111");
        java.lang.String str28 = caverphone16.caverphone("AA11111111");
        java.lang.String str30 = caverphone16.caverphone("hi!");
        java.lang.String str32 = caverphone16.caverphone("1111111111");
        java.lang.Object obj33 = caverphone0.encode((java.lang.Object) "1111111111");
        boolean boolean36 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str38 = caverphone0.caverphone("1111111111");
        java.lang.String str40 = caverphone0.caverphone("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "AA11111111" + "'", str26, "AA11111111");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AA11111111" + "'", str28, "AA11111111");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "AA11111111" + "'", str30, "AA11111111");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1111111111" + "'", str32, "1111111111");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "1111111111" + "'", obj33, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1111111111" + "'", str38, "1111111111");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "AA11111111" + "'", str40, "AA11111111");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str15 = caverphone0.encode("AA11111111");
        java.lang.String str17 = caverphone0.encode("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        boolean boolean11 = caverphone0.isCaverphoneEqual("hi!", "AA11111111");
        boolean boolean14 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str16 = caverphone0.caverphone("AA11111111");
        boolean boolean19 = caverphone0.isCaverphoneEqual("hi!", "1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str13 = caverphone0.encode("hi!");
        java.lang.String str15 = caverphone0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("hi!", "");
        java.lang.String str21 = caverphone16.caverphone("");
        boolean boolean24 = caverphone16.isCaverphoneEqual("AA11111111", "");
        java.lang.Object obj25 = caverphone0.encode((java.lang.Object) "AA11111111");
        boolean boolean28 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str30 = caverphone0.caverphone("hi!");
        java.lang.String str32 = caverphone0.caverphone("hi!");
        java.lang.String str34 = caverphone0.encode("");
        java.lang.Class<?> wildcardClass35 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "AA11111111" + "'", obj25, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "AA11111111" + "'", str30, "AA11111111");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "AA11111111" + "'", str32, "AA11111111");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1111111111" + "'", str34, "1111111111");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str13 = caverphone0.encode("hi!");
        java.lang.String str15 = caverphone0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("1111111111", "");
        boolean boolean22 = caverphone16.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str24 = caverphone16.encode("AA11111111");
        java.lang.Object obj25 = caverphone0.encode((java.lang.Object) "AA11111111");
        java.lang.String str27 = caverphone0.encode("");
        java.lang.String str29 = caverphone0.encode("");
        boolean boolean32 = caverphone0.isCaverphoneEqual("1111111111", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AA11111111" + "'", str24, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "AA11111111" + "'", obj25, "AA11111111");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1111111111" + "'", str27, "1111111111");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1111111111" + "'", str29, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.encode("hi!");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone9 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean12 = caverphone9.isCaverphoneEqual("hi!", "");
        java.lang.String str14 = caverphone9.caverphone("");
        boolean boolean17 = caverphone9.isCaverphoneEqual("AA11111111", "");
        java.lang.String str19 = caverphone9.caverphone("AA11111111");
        boolean boolean22 = caverphone9.isCaverphoneEqual("", "");
        java.lang.String str24 = caverphone9.encode("1111111111");
        java.lang.String str26 = caverphone9.caverphone("");
        java.lang.String str28 = caverphone9.encode("");
        java.lang.Object obj29 = caverphone0.encode((java.lang.Object) "");
        java.lang.String str31 = caverphone0.caverphone("AA11111111");
        boolean boolean34 = caverphone0.isCaverphoneEqual("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1111111111" + "'", str24, "1111111111");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1111111111" + "'", str26, "1111111111");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1111111111" + "'", str28, "1111111111");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "1111111111" + "'", obj29, "1111111111");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AA11111111" + "'", str31, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str13 = caverphone0.encode("hi!");
        java.lang.String str15 = caverphone0.encode("");
        java.lang.String str17 = caverphone0.caverphone("hi!");
        java.lang.String str19 = caverphone0.encode("");
        boolean boolean22 = caverphone0.isCaverphoneEqual("", "hi!");
        boolean boolean25 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str27 = caverphone0.caverphone("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1111111111" + "'", str19, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "AA11111111" + "'", str27, "AA11111111");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("1111111111", "AA11111111");
        boolean boolean14 = caverphone0.isCaverphoneEqual("1111111111", "1111111111");
        java.lang.String str16 = caverphone0.caverphone("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str15 = caverphone0.caverphone("AA11111111");
        boolean boolean18 = caverphone0.isCaverphoneEqual("", "1111111111");
        boolean boolean21 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.Class<?> wildcardClass22 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str8 = caverphone0.encode("AA11111111");
        java.lang.String str10 = caverphone0.encode("");
        java.lang.String str12 = caverphone0.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone13 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean16 = caverphone13.isCaverphoneEqual("hi!", "");
        java.lang.String str18 = caverphone13.caverphone("");
        boolean boolean21 = caverphone13.isCaverphoneEqual("AA11111111", "");
        java.lang.String str23 = caverphone13.caverphone("AA11111111");
        boolean boolean26 = caverphone13.isCaverphoneEqual("", "1111111111");
        java.lang.String str28 = caverphone13.caverphone("AA11111111");
        boolean boolean31 = caverphone13.isCaverphoneEqual("", "1111111111");
        boolean boolean34 = caverphone13.isCaverphoneEqual("", "1111111111");
        java.lang.Object obj35 = caverphone0.encode((java.lang.Object) "1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111" + "'", str12, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AA11111111" + "'", str23, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AA11111111" + "'", str28, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "1111111111" + "'", obj35, "1111111111");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.encode("hi!");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str10 = caverphone0.caverphone("hi!");
        java.lang.String str12 = caverphone0.encode("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone13 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str15 = caverphone13.caverphone("1111111111");
        java.lang.String str17 = caverphone13.caverphone("1111111111");
        boolean boolean20 = caverphone13.isCaverphoneEqual("", "AA11111111");
        java.lang.String str22 = caverphone13.encode("hi!");
        java.lang.String str24 = caverphone13.encode("");
        java.lang.Object obj25 = caverphone0.encode((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AA11111111" + "'", str22, "AA11111111");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1111111111" + "'", str24, "1111111111");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "1111111111" + "'", obj25, "1111111111");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("AA11111111");
        java.lang.String str14 = caverphone0.caverphone("AA11111111");
        boolean boolean17 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str19 = caverphone0.encode("AA11111111");
        boolean boolean22 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str24 = caverphone0.caverphone("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone25 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean28 = caverphone25.isCaverphoneEqual("hi!", "");
        boolean boolean31 = caverphone25.isCaverphoneEqual("", "hi!");
        java.lang.String str33 = caverphone25.caverphone("");
        boolean boolean36 = caverphone25.isCaverphoneEqual("", "1111111111");
        boolean boolean39 = caverphone25.isCaverphoneEqual("", "");
        boolean boolean42 = caverphone25.isCaverphoneEqual("", "");
        java.lang.String str44 = caverphone25.caverphone("");
        boolean boolean47 = caverphone25.isCaverphoneEqual("AA11111111", "");
        java.lang.String str49 = caverphone25.caverphone("AA11111111");
        java.lang.String str51 = caverphone25.caverphone("");
        java.lang.Object obj52 = caverphone0.encode((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1111111111" + "'", str24, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1111111111" + "'", str33, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1111111111" + "'", str44, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "AA11111111" + "'", str49, "AA11111111");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1111111111" + "'", str51, "1111111111");
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + "1111111111" + "'", obj52, "1111111111");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "");
        org.apache.commons.codec.language.Caverphone caverphone14 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean17 = caverphone14.isCaverphoneEqual("1111111111", "");
        java.lang.Object obj18 = caverphone0.encode((java.lang.Object) "");
        java.lang.String str20 = caverphone0.caverphone("1111111111");
        boolean boolean23 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str25 = caverphone0.caverphone("hi!");
        java.lang.String str27 = caverphone0.caverphone("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone28 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean31 = caverphone28.isCaverphoneEqual("1111111111", "");
        java.lang.String str33 = caverphone28.caverphone("1111111111");
        java.lang.String str35 = caverphone28.caverphone("hi!");
        boolean boolean38 = caverphone28.isCaverphoneEqual("", "hi!");
        java.lang.String str40 = caverphone28.caverphone("AA11111111");
        java.lang.Object obj41 = caverphone0.encode((java.lang.Object) str40);
        java.lang.String str43 = caverphone0.encode("AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "1111111111" + "'", obj18, "1111111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1111111111" + "'", str20, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "AA11111111" + "'", str25, "AA11111111");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1111111111" + "'", str27, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1111111111" + "'", str33, "1111111111");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "AA11111111" + "'", str35, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "AA11111111" + "'", str40, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "AA11111111" + "'", obj41, "AA11111111");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "AA11111111" + "'", str43, "AA11111111");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.String str15 = caverphone0.caverphone("hi!");
        java.lang.String str17 = caverphone0.encode("AA11111111");
        boolean boolean20 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean23 = caverphone0.isCaverphoneEqual("", "AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone24 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean27 = caverphone24.isCaverphoneEqual("hi!", "");
        java.lang.String str29 = caverphone24.caverphone("");
        boolean boolean32 = caverphone24.isCaverphoneEqual("AA11111111", "");
        java.lang.String str34 = caverphone24.caverphone("AA11111111");
        java.lang.Object obj35 = caverphone0.encode((java.lang.Object) str34);
        java.lang.String str37 = caverphone0.caverphone("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1111111111" + "'", str29, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AA11111111" + "'", str34, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "AA11111111" + "'", obj35, "AA11111111");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "AA11111111" + "'", str37, "AA11111111");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("AA11111111");
        java.lang.String str14 = caverphone0.caverphone("AA11111111");
        boolean boolean17 = caverphone0.isCaverphoneEqual("", "1111111111");
        boolean boolean20 = caverphone0.isCaverphoneEqual("1111111111", "AA11111111");
        java.lang.String str22 = caverphone0.encode("AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AA11111111" + "'", str22, "AA11111111");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        org.apache.commons.codec.language.Caverphone caverphone7 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean10 = caverphone7.isCaverphoneEqual("hi!", "");
        java.lang.String str12 = caverphone7.encode("hi!");
        java.lang.String str14 = caverphone7.caverphone("1111111111");
        java.lang.Object obj15 = caverphone0.encode((java.lang.Object) str14);
        java.lang.String str17 = caverphone0.caverphone("1111111111");
        boolean boolean20 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str22 = caverphone0.caverphone("hi!");
        boolean boolean25 = caverphone0.isCaverphoneEqual("", "hi!");
        boolean boolean28 = caverphone0.isCaverphoneEqual("", "1111111111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = caverphone0.encode((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "1111111111" + "'", obj15, "1111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AA11111111" + "'", str22, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        boolean boolean14 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str16 = caverphone0.caverphone("hi!");
        java.lang.String str18 = caverphone0.caverphone("");
        java.lang.String str20 = caverphone0.caverphone("hi!");
        java.lang.String str22 = caverphone0.encode("");
        boolean boolean25 = caverphone0.isCaverphoneEqual("", "");
        org.apache.commons.codec.language.Caverphone caverphone26 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean29 = caverphone26.isCaverphoneEqual("hi!", "");
        java.lang.String str31 = caverphone26.caverphone("");
        boolean boolean34 = caverphone26.isCaverphoneEqual("AA11111111", "");
        java.lang.String str36 = caverphone26.encode("1111111111");
        boolean boolean39 = caverphone26.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.String str41 = caverphone26.caverphone("hi!");
        java.lang.String str43 = caverphone26.encode("1111111111");
        boolean boolean46 = caverphone26.isCaverphoneEqual("", "hi!");
        boolean boolean49 = caverphone26.isCaverphoneEqual("AA11111111", "");
        java.lang.String str51 = caverphone26.encode("hi!");
        java.lang.String str53 = caverphone26.encode("");
        java.lang.Object obj54 = caverphone0.encode((java.lang.Object) str53);
        java.lang.String str56 = caverphone0.encode("AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1111111111" + "'", str22, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1111111111" + "'", str31, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1111111111" + "'", str36, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "AA11111111" + "'", str41, "AA11111111");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1111111111" + "'", str43, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "AA11111111" + "'", str51, "AA11111111");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1111111111" + "'", str53, "1111111111");
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + "1111111111" + "'", obj54, "1111111111");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "AA11111111" + "'", str56, "AA11111111");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("AA11111111");
        java.lang.String str14 = caverphone0.caverphone("hi!");
        boolean boolean17 = caverphone0.isCaverphoneEqual("hi!", "AA11111111");
        boolean boolean20 = caverphone0.isCaverphoneEqual("AA11111111", "1111111111");
        java.lang.String str22 = caverphone0.encode("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone23 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean26 = caverphone23.isCaverphoneEqual("hi!", "");
        boolean boolean29 = caverphone23.isCaverphoneEqual("", "hi!");
        java.lang.String str31 = caverphone23.caverphone("");
        boolean boolean34 = caverphone23.isCaverphoneEqual("", "1111111111");
        java.lang.String str36 = caverphone23.encode("hi!");
        java.lang.String str38 = caverphone23.encode("");
        org.apache.commons.codec.language.Caverphone caverphone39 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean42 = caverphone39.isCaverphoneEqual("hi!", "");
        java.lang.String str44 = caverphone39.caverphone("");
        boolean boolean47 = caverphone39.isCaverphoneEqual("AA11111111", "");
        java.lang.Object obj48 = caverphone23.encode((java.lang.Object) "AA11111111");
        boolean boolean51 = caverphone23.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str53 = caverphone23.caverphone("hi!");
        boolean boolean56 = caverphone23.isCaverphoneEqual("hi!", "");
        java.lang.String str58 = caverphone23.caverphone("");
        java.lang.String str60 = caverphone23.caverphone("");
        java.lang.String str62 = caverphone23.encode("AA11111111");
        java.lang.String str64 = caverphone23.caverphone("hi!");
        boolean boolean67 = caverphone23.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.Object obj68 = caverphone0.encode((java.lang.Object) "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AA11111111" + "'", str22, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1111111111" + "'", str31, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "AA11111111" + "'", str36, "AA11111111");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1111111111" + "'", str38, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1111111111" + "'", str44, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + "AA11111111" + "'", obj48, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "AA11111111" + "'", str53, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "1111111111" + "'", str58, "1111111111");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "1111111111" + "'", str60, "1111111111");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "AA11111111" + "'", str62, "AA11111111");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "AA11111111" + "'", str64, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + "AA11111111" + "'", obj68, "AA11111111");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        java.lang.String str7 = caverphone0.caverphone("hi!");
        org.apache.commons.codec.language.Caverphone caverphone8 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean11 = caverphone8.isCaverphoneEqual("hi!", "");
        boolean boolean14 = caverphone8.isCaverphoneEqual("", "hi!");
        java.lang.String str16 = caverphone8.caverphone("");
        boolean boolean19 = caverphone8.isCaverphoneEqual("", "1111111111");
        boolean boolean22 = caverphone8.isCaverphoneEqual("", "");
        boolean boolean25 = caverphone8.isCaverphoneEqual("", "");
        java.lang.String str27 = caverphone8.caverphone("");
        boolean boolean30 = caverphone8.isCaverphoneEqual("AA11111111", "");
        java.lang.Object obj31 = caverphone0.encode((java.lang.Object) "AA11111111");
        boolean boolean34 = caverphone0.isCaverphoneEqual("hi!", "1111111111");
        boolean boolean37 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1111111111" + "'", str27, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "AA11111111" + "'", obj31, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        java.lang.String str7 = caverphone0.caverphone("hi!");
        org.apache.commons.codec.language.Caverphone caverphone8 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean11 = caverphone8.isCaverphoneEqual("hi!", "");
        java.lang.String str13 = caverphone8.caverphone("AA11111111");
        boolean boolean16 = caverphone8.isCaverphoneEqual("", "");
        org.apache.commons.codec.language.Caverphone caverphone17 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean20 = caverphone17.isCaverphoneEqual("hi!", "");
        java.lang.String str22 = caverphone17.encode("hi!");
        java.lang.String str24 = caverphone17.caverphone("1111111111");
        java.lang.String str26 = caverphone17.encode("1111111111");
        java.lang.Object obj27 = caverphone8.encode((java.lang.Object) "1111111111");
        java.lang.String str29 = caverphone8.caverphone("1111111111");
        boolean boolean32 = caverphone8.isCaverphoneEqual("", "hi!");
        java.lang.Object obj33 = caverphone0.encode((java.lang.Object) "hi!");
        java.lang.String str35 = caverphone0.caverphone("hi!");
        boolean boolean38 = caverphone0.isCaverphoneEqual("1111111111", "1111111111");
        org.apache.commons.codec.language.Caverphone caverphone39 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean42 = caverphone39.isCaverphoneEqual("hi!", "");
        java.lang.String str44 = caverphone39.caverphone("");
        boolean boolean47 = caverphone39.isCaverphoneEqual("AA11111111", "");
        java.lang.String str49 = caverphone39.encode("1111111111");
        boolean boolean52 = caverphone39.isCaverphoneEqual("AA11111111", "");
        org.apache.commons.codec.language.Caverphone caverphone53 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean56 = caverphone53.isCaverphoneEqual("1111111111", "");
        java.lang.Object obj57 = caverphone39.encode((java.lang.Object) "");
        java.lang.String str59 = caverphone39.caverphone("1111111111");
        boolean boolean62 = caverphone39.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str64 = caverphone39.caverphone("1111111111");
        java.lang.String str66 = caverphone39.encode("");
        java.lang.Object obj67 = caverphone0.encode((java.lang.Object) str66);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AA11111111" + "'", str22, "AA11111111");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1111111111" + "'", str24, "1111111111");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1111111111" + "'", str26, "1111111111");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "1111111111" + "'", obj27, "1111111111");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1111111111" + "'", str29, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "AA11111111" + "'", obj33, "AA11111111");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "AA11111111" + "'", str35, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1111111111" + "'", str44, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1111111111" + "'", str49, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + "1111111111" + "'", obj57, "1111111111");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1111111111" + "'", str59, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "1111111111" + "'", str64, "1111111111");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "1111111111" + "'", str66, "1111111111");
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + "1111111111" + "'", obj67, "1111111111");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone8 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean11 = caverphone8.isCaverphoneEqual("hi!", "");
        boolean boolean14 = caverphone8.isCaverphoneEqual("", "hi!");
        java.lang.String str16 = caverphone8.caverphone("");
        boolean boolean19 = caverphone8.isCaverphoneEqual("", "1111111111");
        java.lang.String str21 = caverphone8.encode("hi!");
        java.lang.String str23 = caverphone8.encode("");
        org.apache.commons.codec.language.Caverphone caverphone24 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean27 = caverphone24.isCaverphoneEqual("1111111111", "");
        boolean boolean30 = caverphone24.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str32 = caverphone24.encode("AA11111111");
        java.lang.Object obj33 = caverphone8.encode((java.lang.Object) "AA11111111");
        java.lang.String str35 = caverphone8.encode("");
        boolean boolean38 = caverphone8.isCaverphoneEqual("hi!", "");
        java.lang.String str40 = caverphone8.encode("hi!");
        java.lang.Object obj41 = caverphone0.encode((java.lang.Object) "hi!");
        boolean boolean44 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str46 = caverphone0.caverphone("hi!");
        boolean boolean49 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str51 = caverphone0.encode("1111111111");
        java.lang.String str53 = caverphone0.caverphone("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AA11111111" + "'", str21, "AA11111111");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1111111111" + "'", str23, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "AA11111111" + "'", str32, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "AA11111111" + "'", obj33, "AA11111111");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1111111111" + "'", str35, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "AA11111111" + "'", str40, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "AA11111111" + "'", obj41, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "AA11111111" + "'", str46, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1111111111" + "'", str51, "1111111111");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "AA11111111" + "'", str53, "AA11111111");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean11 = caverphone0.isCaverphoneEqual("1111111111", "");
        java.lang.String str13 = caverphone0.encode("");
        boolean boolean16 = caverphone0.isCaverphoneEqual("1111111111", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str15 = caverphone0.encode("1111111111");
        java.lang.String str17 = caverphone0.caverphone("");
        java.lang.String str19 = caverphone0.encode("AA11111111");
        boolean boolean22 = caverphone0.isCaverphoneEqual("", "1111111111");
        boolean boolean25 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean28 = caverphone0.isCaverphoneEqual("1111111111", "AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone29 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean32 = caverphone29.isCaverphoneEqual("hi!", "");
        java.lang.String str34 = caverphone29.caverphone("");
        boolean boolean37 = caverphone29.isCaverphoneEqual("AA11111111", "");
        java.lang.String str39 = caverphone29.caverphone("AA11111111");
        boolean boolean42 = caverphone29.isCaverphoneEqual("", "");
        java.lang.String str44 = caverphone29.encode("1111111111");
        java.lang.String str46 = caverphone29.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone47 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean50 = caverphone47.isCaverphoneEqual("hi!", "");
        java.lang.String str52 = caverphone47.caverphone("");
        boolean boolean55 = caverphone47.isCaverphoneEqual("AA11111111", "");
        java.lang.String str57 = caverphone47.encode("1111111111");
        boolean boolean60 = caverphone47.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.String str62 = caverphone47.caverphone("hi!");
        java.lang.String str64 = caverphone47.encode("1111111111");
        boolean boolean67 = caverphone47.isCaverphoneEqual("", "AA11111111");
        java.lang.String str69 = caverphone47.caverphone("");
        java.lang.String str71 = caverphone47.encode("AA11111111");
        java.lang.String str73 = caverphone47.encode("hi!");
        java.lang.Object obj74 = caverphone29.encode((java.lang.Object) str73);
        boolean boolean77 = caverphone29.isCaverphoneEqual("1111111111", "");
        java.lang.String str79 = caverphone29.caverphone("");
        java.lang.Object obj80 = caverphone0.encode((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1111111111" + "'", str34, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "AA11111111" + "'", str39, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1111111111" + "'", str44, "1111111111");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1111111111" + "'", str46, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1111111111" + "'", str52, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "1111111111" + "'", str57, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "AA11111111" + "'", str62, "AA11111111");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "1111111111" + "'", str64, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "1111111111" + "'", str69, "1111111111");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "AA11111111" + "'", str71, "AA11111111");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "AA11111111" + "'", str73, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + "AA11111111" + "'", obj74, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "1111111111" + "'", str79, "1111111111");
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + "1111111111" + "'", obj80, "1111111111");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str8 = caverphone0.encode("AA11111111");
        java.lang.String str10 = caverphone0.encode("");
        java.lang.String str12 = caverphone0.caverphone("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone13 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean16 = caverphone13.isCaverphoneEqual("hi!", "");
        java.lang.String str18 = caverphone13.caverphone("");
        boolean boolean21 = caverphone13.isCaverphoneEqual("AA11111111", "");
        java.lang.String str23 = caverphone13.encode("1111111111");
        boolean boolean26 = caverphone13.isCaverphoneEqual("1111111111", "AA11111111");
        java.lang.String str28 = caverphone13.encode("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone29 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean32 = caverphone29.isCaverphoneEqual("hi!", "");
        java.lang.String str34 = caverphone29.caverphone("AA11111111");
        boolean boolean37 = caverphone29.isCaverphoneEqual("", "");
        org.apache.commons.codec.language.Caverphone caverphone38 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean41 = caverphone38.isCaverphoneEqual("hi!", "");
        java.lang.String str43 = caverphone38.encode("hi!");
        java.lang.String str45 = caverphone38.caverphone("1111111111");
        java.lang.String str47 = caverphone38.encode("1111111111");
        java.lang.Object obj48 = caverphone29.encode((java.lang.Object) "1111111111");
        org.apache.commons.codec.language.Caverphone caverphone49 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean52 = caverphone49.isCaverphoneEqual("hi!", "");
        java.lang.String str54 = caverphone49.caverphone("");
        boolean boolean57 = caverphone49.isCaverphoneEqual("AA11111111", "");
        java.lang.String str59 = caverphone49.encode("1111111111");
        java.lang.Object obj60 = caverphone29.encode((java.lang.Object) str59);
        java.lang.Object obj61 = caverphone13.encode(obj60);
        java.lang.String str63 = caverphone13.caverphone("1111111111");
        boolean boolean66 = caverphone13.isCaverphoneEqual("hi!", "AA11111111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj67 = caverphone0.encode((java.lang.Object) boolean66);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111" + "'", str12, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1111111111" + "'", str23, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AA11111111" + "'", str28, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AA11111111" + "'", str34, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "AA11111111" + "'", str43, "AA11111111");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1111111111" + "'", str45, "1111111111");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1111111111" + "'", str47, "1111111111");
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + "1111111111" + "'", obj48, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1111111111" + "'", str54, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1111111111" + "'", str59, "1111111111");
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + "1111111111" + "'", obj60, "1111111111");
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + "1111111111" + "'", obj61, "1111111111");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "1111111111" + "'", str63, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str8 = caverphone0.caverphone("AA11111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        boolean boolean14 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.Class<?> wildcardClass15 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.encode("hi!");
        java.lang.String str7 = caverphone0.caverphone("hi!");
        java.lang.String str9 = caverphone0.caverphone("hi!");
        boolean boolean12 = caverphone0.isCaverphoneEqual("1111111111", "hi!");
        java.lang.String str14 = caverphone0.caverphone("1111111111");
        java.lang.String str16 = caverphone0.encode("hi!");
        java.lang.String str18 = caverphone0.encode("1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.encode("hi!");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("1111111111");
        java.lang.String str11 = caverphone0.encode("");
        java.lang.String str13 = caverphone0.encode("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone14 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean17 = caverphone14.isCaverphoneEqual("hi!", "");
        java.lang.String str19 = caverphone14.encode("hi!");
        java.lang.String str21 = caverphone14.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone22 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean25 = caverphone22.isCaverphoneEqual("hi!", "");
        java.lang.String str27 = caverphone22.encode("hi!");
        java.lang.String str29 = caverphone22.caverphone("AA11111111");
        java.lang.String str31 = caverphone22.caverphone("hi!");
        java.lang.String str33 = caverphone22.caverphone("hi!");
        java.lang.Object obj34 = caverphone14.encode((java.lang.Object) "hi!");
        java.lang.String str36 = caverphone14.caverphone("1111111111");
        java.lang.String str38 = caverphone14.encode("AA11111111");
        boolean boolean41 = caverphone14.isCaverphoneEqual("", "AA11111111");
        java.lang.Object obj42 = caverphone0.encode((java.lang.Object) "");
        boolean boolean45 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str47 = caverphone0.encode("1111111111");
        java.lang.Class<?> wildcardClass48 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "AA11111111" + "'", str27, "AA11111111");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AA11111111" + "'", str29, "AA11111111");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AA11111111" + "'", str31, "AA11111111");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AA11111111" + "'", str33, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "AA11111111" + "'", obj34, "AA11111111");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1111111111" + "'", str36, "1111111111");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "AA11111111" + "'", str38, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "1111111111" + "'", obj42, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1111111111" + "'", str47, "1111111111");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }
}


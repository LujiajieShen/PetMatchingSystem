package org.apache.commons.codec.language;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: ");
        boolean boolean7 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "HI");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("");
        java.lang.Class<?> wildcardClass11 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ORKP" + "'", str4, "ORKP");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength((int) '#');
        soundex1.setMaxLength(0);
        java.lang.String str12 = soundex1.encode("O0931");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O000" + "'", str12, "O000");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        java.lang.String str6 = soundex0.encode("O094010303080830603083060905301608");
        int int9 = soundex0.difference("HI", "O094010303080830603083060905301608");
        java.lang.String str11 = soundex0.soundex("O000");
        java.lang.String str13 = soundex0.soundex("org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O000" + "'", str6, "O000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O000" + "'", str11, "O000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O621" + "'", str13, "O621");
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "org.apache.commons.codec.EncoderException: 01230120022455012623010202", "");
        java.lang.String str19 = doubleMetaphone0.encode("A");
        org.apache.commons.codec.language.Metaphone metaphone20 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str22 = metaphone20.metaphone("H0");
        java.lang.String str24 = metaphone20.metaphone("");
        java.lang.String str26 = metaphone20.encode("H000");
        int int27 = metaphone20.getMaxCodeLen();
        boolean boolean30 = metaphone20.isMetaphoneEqual("O094010303080830603083060905301608", "H0");
        java.lang.String str32 = metaphone20.metaphone("O941");
        java.lang.String str34 = metaphone20.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.Object obj35 = doubleMetaphone0.encode((java.lang.Object) "ARKPXKMNSKTSNKTRKSPXN");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "O" + "'", str32, "O");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ARKP" + "'", str34, "ARKP");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "ARKPKSKMNSKTSNKTRKSPKSN" + "'", obj35, "ARKPKSKMNSKTSNKTRKSPKSN");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("org.apache.commons.codec.EncoderException: 01230120022455012623010202");
        boolean boolean10 = caverphone0.isCaverphoneEqual("#HIK", "A310");
        java.lang.String str12 = caverphone0.encode("AKPKMNSKTS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AKPKKMNSKT" + "'", str7, "AKPKKMNSKT");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AKPKMNSKTS" + "'", str12, "AKPKMNSKTS");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        java.lang.String str4 = refinedSoundex0.encode("AKPKKMNSKT");
        java.lang.String str6 = refinedSoundex0.soundex("");
        java.lang.String str8 = refinedSoundex0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A0313836" + "'", str4, "A0313836");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("AKPKKMNSKT", "org.apache.commons.codec.EncoderException: ", false);
        int int12 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str5 = refinedSoundex0.encode("hi!");
        char char7 = refinedSoundex0.getMappingCode('K');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H0" + "'", str5, "H0");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '3' + "'", char7 == '3');
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("AKP");
        java.lang.String str11 = caverphone0.caverphone("AKPK111111");
        boolean boolean14 = caverphone0.isCaverphoneEqual("AKPKMNSKTK", "ORKP");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AKP1111111" + "'", str9, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AKPK111111" + "'", str11, "AKPK111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        java.lang.String str7 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj8 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = caverphone0.caverphone("ORKP");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "AKPK");
        java.lang.String str15 = caverphone0.encode("A111111111");
        java.lang.String str17 = caverphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        java.lang.String str19 = caverphone0.encode("A031");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKPKMNSKTK" + "'", str17, "AKPKMNSKTK");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A111111111" + "'", str19, "A111111111");
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone6, "hi!", "");
        doubleMetaphone6.maxCodeLen = '4';
        java.lang.String str13 = doubleMetaphone6.doubleMetaphone("");
        int int14 = doubleMetaphone6.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone6.doubleMetaphone("hi!");
        java.lang.Object obj17 = soundex1.encode((java.lang.Object) "hi!");
        java.lang.String str19 = soundex1.encode("");
        java.lang.String str21 = soundex1.encode("");
        java.lang.String str23 = soundex1.encode("O");
        int int24 = soundex1.getMaxLength();
        java.lang.String str26 = soundex1.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int29 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "a1", "O");
        java.lang.String str31 = soundex1.encode("A0931538363836931583138363");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H000" + "'", obj17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "O000" + "'", str23, "O000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "A931" + "'", str26, "A931");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "A000" + "'", str31, "A000");
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = soundex1.difference("A", "HIA212");
        soundex1.setMaxLength((int) '3');
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.maxCodeLen = 10;
        int int13 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPKSKMNSKTSNKTRKSPKSN", "A931");
        int int17 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        java.lang.String str7 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj8 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = caverphone0.caverphone("ORKP");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "AKPK");
        java.lang.String str15 = caverphone0.encode("A111111111");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str19 = doubleMetaphone16.doubleMetaphone("", false);
        int int20 = doubleMetaphone16.maxCodeLen;
        doubleMetaphone16.setMaxCodeLen(0);
        java.lang.String str25 = doubleMetaphone16.doubleMetaphone("", true);
        doubleMetaphone16.maxCodeLen = '\000';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult29 = doubleMetaphone16.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult29.append('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = caverphone0.encode((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.String str15 = metaphone0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int16 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "O" + "'", str15, "O");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        metaphone0.setMaxCodeLen(2);
        java.lang.String str6 = metaphone0.metaphone("ARKPKSKMNSKTSNKTRKSPKSN");
        java.lang.String str8 = metaphone0.metaphone("04");
        int int9 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AR" + "'", str6, "AR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        int int4 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (byte) 1;
        doubleMetaphone0.maxCodeLen = 'K';
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("A310", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        java.lang.String str8 = soundex1.soundex("A000");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A000" + "'", str8, "A000");
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        java.lang.String str7 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj8 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = caverphone0.caverphone("ORKP");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "AKPK");
        java.lang.String str15 = caverphone0.encode("A111111111");
        java.lang.String str17 = caverphone0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str19 = caverphone0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str21 = caverphone0.encode(" ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKPKKMNSKT" + "'", str17, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AKPKKMNSKT" + "'", str19, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        int int6 = metaphone0.getMaxCodeLen();
        java.lang.String str8 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: A0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORKP" + "'", str8, "ORKP");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        char char5 = refinedSoundex3.getMappingCode('1');
        java.lang.String str7 = refinedSoundex3.encode("");
        java.lang.String str9 = refinedSoundex3.encode("");
        java.lang.Class<?> wildcardClass10 = refinedSoundex3.getClass();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        metaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.String str11 = metaphone0.encode("0");
        java.lang.String str13 = metaphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        char char4 = refinedSoundex0.getMappingCode('4');
        java.lang.String str6 = refinedSoundex0.soundex("ARKP");
        java.lang.String str8 = refinedSoundex0.soundex("A09313836383693138");
        java.lang.Object obj10 = refinedSoundex0.encode((java.lang.Object) "ARKPXKMNSKTSNKTRKSPXN");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A0931" + "'", str6, "A0931");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A0" + "'", str8, "A0");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "A093153836383693158" + "'", obj10, "A093153836383693158");
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        char[] charArray9 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray9);
        java.lang.String str12 = soundex10.encode("HI");
        java.lang.String str14 = soundex10.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone15 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone15, "hi!", "");
        doubleMetaphone15.maxCodeLen = '4';
        java.lang.String str22 = doubleMetaphone15.doubleMetaphone("");
        int int23 = doubleMetaphone15.getMaxCodeLen();
        java.lang.String str25 = doubleMetaphone15.doubleMetaphone("hi!");
        java.lang.Object obj26 = soundex10.encode((java.lang.Object) "hi!");
        java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        java.lang.String str29 = doubleMetaphone0.encode("ORKP");
        int int30 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "H000" + "'", obj26, "H000");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "H" + "'", obj27, "H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ARKP" + "'", str29, "ARKP");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(0);
        int int7 = doubleMetaphone0.maxCodeLen;
        int int8 = doubleMetaphone0.maxCodeLen;
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("O000");
        int int11 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = (byte) 100;
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "org.apache.commons.codec.EncoderException: AKPKMNSKTS", false);
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("O0");
        int int24 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "O094010303080830603083060905301608", "ARKPXKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength(10);
        int int11 = soundex1.difference("ARKP", "01230120022455012623010202");
        java.lang.String str13 = soundex1.soundex("AA11111111");
        java.lang.String str15 = soundex1.encode("HI");
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = soundex1.encode(obj16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A000" + "'", str13, "A000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        doubleMetaphone0.setMaxCodeLen(0);
        char char19 = doubleMetaphone0.charAt("O", (int) (byte) -1);
        int int20 = doubleMetaphone0.maxCodeLen;
        char char23 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: ", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        soundex1.setMaxLength((int) (byte) 10);
        soundex1.setMaxLength(0);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.soundex("01230120022455012623010202");
        int int10 = refinedSoundex0.difference("H", "H0");
        int int13 = refinedSoundex0.difference("", "01230120022455012623010202");
        java.lang.String str15 = refinedSoundex0.encode("O094010303080830603083060905301608094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "O0" + "'", str15, "O0");
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("A", true);
        doubleMetaphone0.maxCodeLen = 10;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "HI3", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone6, "hi!", "");
        doubleMetaphone6.maxCodeLen = '4';
        java.lang.String str13 = doubleMetaphone6.doubleMetaphone("");
        int int14 = doubleMetaphone6.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone6.doubleMetaphone("hi!");
        java.lang.Object obj17 = soundex1.encode((java.lang.Object) "hi!");
        java.lang.String str19 = soundex1.encode("");
        int int22 = soundex1.difference("O0", "");
        int int23 = soundex1.getMaxLength();
        int int24 = soundex1.getMaxLength();
        int int27 = soundex1.difference("H", "hi!");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H000" + "'", obj17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(0);
        int int7 = doubleMetaphone0.maxCodeLen;
        int int8 = doubleMetaphone0.maxCodeLen;
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("O000");
        int int11 = doubleMetaphone0.maxCodeLen;
        int int12 = doubleMetaphone0.maxCodeLen;
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("A0", "ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex16 = new org.apache.commons.codec.language.RefinedSoundex();
        char char18 = refinedSoundex16.getMappingCode('a');
        int int21 = refinedSoundex16.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str23 = refinedSoundex16.encode("");
        int int26 = refinedSoundex16.difference("H0", "O000");
        java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) "O000");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '0' + "'", char18 == '0');
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "" + "'", obj27, "");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        int int7 = soundex1.getMaxLength();
        int int10 = soundex1.difference("ARKP", "1111111111");
        int int13 = soundex1.difference("a1", "ARKPKSKMNSKTSNKTRKSPKSN");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength(10);
        int int11 = soundex1.difference("AKPKMNSKTS", "O094010303080830603083060905301608");
        int int12 = soundex1.getMaxLength();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        int int4 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (byte) 1;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("A0", "01230120022455012623010202", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        java.lang.String str12 = refinedSoundex10.encode("AA11111111");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A4" + "'", str12, "A4");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O09401030308083060308306090530160803138363" + "'", str2, "O09401030308083060308306090530160803138363");
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("H000", "H0");
        java.lang.String str5 = refinedSoundex0.encode("A4");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A0" + "'", str5, "A0");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str4 = soundex2.encode("A0931");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str7 = refinedSoundex5.encode("01230120022455012623010202");
        java.lang.String str9 = refinedSoundex5.soundex("A");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str14 = doubleMetaphone11.doubleMetaphone("", false);
        int int15 = doubleMetaphone11.maxCodeLen;
        int int16 = doubleMetaphone11.maxCodeLen;
        boolean boolean19 = doubleMetaphone11.isDoubleMetaphoneEqual("H", "HI");
        java.lang.Object obj20 = doubleMetaphone10.encode((java.lang.Object) "HI");
        java.lang.String str22 = doubleMetaphone10.encode("hi!");
        java.lang.Object obj23 = refinedSoundex5.encode((java.lang.Object) str22);
        java.lang.Object obj24 = soundex2.encode(obj23);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A000" + "'", str4, "A000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A0" + "'", str9, "A0");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "H" + "'", obj20, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "H0" + "'", obj23, "H0");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "H000" + "'", obj24, "H000");
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        metaphone0.setMaxCodeLen(8);
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "AKPK", "A");
        boolean boolean17 = metaphone0.isMetaphoneEqual("", "a");
        java.lang.String str19 = metaphone0.encode("O0940103030808306030830609053016080");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "O" + "'", str19, "O");
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        java.lang.String str7 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj8 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = caverphone0.caverphone("ORKP");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "AKPK");
        java.lang.String str15 = caverphone0.encode("A111111111");
        java.lang.String str17 = caverphone0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        boolean boolean20 = caverphone0.isCaverphoneEqual("O", "org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        java.lang.String str22 = caverphone0.caverphone("A0931538363836931583138363");
        java.lang.String str24 = caverphone0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKPKKMNSKT" + "'", str17, "AKPKKMNSKT");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "A111111111" + "'", str22, "A111111111");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1111111111" + "'", str24, "1111111111");
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        soundex2.setMaxLength((int) '1');
        char[] charArray5 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str8 = soundex6.encode("HI");
        java.lang.String str10 = soundex6.encode("H");
        soundex6.setMaxLength((int) (byte) 10);
        int int13 = soundex6.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = soundex2.encode((java.lang.Object) soundex6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }
}


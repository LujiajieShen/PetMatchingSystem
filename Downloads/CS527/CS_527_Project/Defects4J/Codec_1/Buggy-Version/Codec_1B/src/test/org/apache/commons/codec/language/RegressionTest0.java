package org.apache.commons.codec.language;

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
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI" + "'", str1, "HI");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HI", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("H000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        org.apache.commons.codec.EncoderException encoderException5 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException7 = new org.apache.commons.codec.EncoderException("");
        encoderException5.addSuppressed((java.lang.Throwable) encoderException7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = refinedSoundex0.encode((java.lang.Object) encoderException5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = doubleMetaphone0.encode((java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = doubleMetaphone0.encode(obj8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = doubleMetaphone0.encode((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("", "H000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = metaphone0.encode((java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        char[] charArray4 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = soundex1.encode((java.lang.Object) charArray4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = doubleMetaphone0.encode((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = soundex1.encode((java.lang.Object) (-1.0d));
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
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = metaphone0.encode((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = soundex1.encode((java.lang.Object) ' ');
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
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("org.apache.commons.codec.EncoderException: ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ORGAPACHECOMMONSCODECENCODEREXCEPTION" + "'", str1, "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("H0", "org.apache.commons.codec.EncoderException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        metaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone10, "hi!", "");
        doubleMetaphone10.maxCodeLen = '4';
        java.lang.String str17 = doubleMetaphone10.doubleMetaphone("");
        java.lang.String str20 = doubleMetaphone10.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean24 = doubleMetaphone10.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        doubleMetaphone10.setMaxCodeLen(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = metaphone0.encode((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        char[] charArray8 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray8);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = metaphone0.encode((java.lang.Object) soundex10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.encode("");
        java.lang.String str9 = refinedSoundex0.soundex("");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        soundex1.setMaxLength(10);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex();
        char char8 = refinedSoundex6.getMappingCode('a');
        char char10 = refinedSoundex6.getMappingCode('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = soundex1.encode((java.lang.Object) refinedSoundex6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '0' + "'", char8 == '0');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("1111111111", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str5 = refinedSoundex0.encode("hi!");
        char[] charArray6 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray6);
        java.lang.String str9 = soundex7.encode("HI");
        java.lang.Object obj10 = refinedSoundex0.encode((java.lang.Object) str9);
        java.lang.String str12 = refinedSoundex0.encode("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H0" + "'", str5, "H0");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "H0" + "'", obj10, "H0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("O094010303080830603083060905301608", "ARKPXKMNSKTSNKTRKSPXN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str11 = doubleMetaphone0.encode("O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.soundex("HI");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
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
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex20 = new org.apache.commons.codec.language.RefinedSoundex();
        char char22 = refinedSoundex20.getMappingCode('a');
        java.lang.String str24 = refinedSoundex20.soundex("org.apache.commons.codec.EncoderException: ");
        char char26 = refinedSoundex20.getMappingCode('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = soundex1.encode((java.lang.Object) char26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '0' + "'", char22 == '0');
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "O094010303080830603083060905301608" + "'", str24, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("ARKP", "AA11111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.codec.language.SoundexUtils soundexUtils0 = new org.apache.commons.codec.language.SoundexUtils();
        java.lang.Class<?> wildcardClass1 = soundexUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = refinedSoundex0.encode((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("A", "H0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("", "HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("ARKPXKMNSKTSNKTRKSPXN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ARKPXKMNSKTSNKTRKSPXN" + "'", str1, "ARKPXKMNSKTSNKTRKSPXN");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) "HI");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("HI", "H0");
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = doubleMetaphone0.encode(obj16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "H" + "'", obj12, "H");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone5 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone5.setMaxCodeLen((int) (byte) -1);
        doubleMetaphone5.maxCodeLen = 100;
        doubleMetaphone5.setMaxCodeLen((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = metaphone0.encode((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone5 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str8 = doubleMetaphone5.doubleMetaphone("", false);
        int int9 = doubleMetaphone5.maxCodeLen;
        doubleMetaphone5.setMaxCodeLen(0);
        int int12 = doubleMetaphone5.maxCodeLen;
        int int13 = doubleMetaphone5.maxCodeLen;
        java.lang.String str15 = doubleMetaphone5.doubleMetaphone("O000");
        int int16 = doubleMetaphone5.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = refinedSoundex0.encode((java.lang.Object) int16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone7 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str10 = doubleMetaphone7.doubleMetaphone("", false);
        boolean boolean13 = doubleMetaphone7.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = soundex6.encode((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        org.apache.commons.codec.EncoderException encoderException7 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException9 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException11 = new org.apache.commons.codec.EncoderException("");
        encoderException9.addSuppressed((java.lang.Throwable) encoderException11);
        java.lang.Throwable[] throwableArray13 = encoderException9.getSuppressed();
        encoderException7.addSuppressed((java.lang.Throwable) encoderException9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = metaphone0.encode((java.lang.Object) encoderException9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        int int7 = doubleMetaphone0.maxCodeLen;
        char char10 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: ", (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'o' + "'", char10 == 'o');
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.encode("H");
        boolean boolean7 = caverphone0.isCaverphoneEqual("", "HI");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        java.lang.String str7 = soundex1.encode("");
        int int10 = soundex1.difference("", "");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("H000");
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "ORKP", "H");
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = refinedSoundex0.encode(obj8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H0" + "'", str4, "H0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.encode("H");
        org.apache.commons.codec.EncoderException encoderException6 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException8 = new org.apache.commons.codec.EncoderException("");
        encoderException6.addSuppressed((java.lang.Throwable) encoderException8);
        java.lang.Throwable[] throwableArray10 = encoderException6.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = caverphone0.encode((java.lang.Object) throwableArray10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex14 = new org.apache.commons.codec.language.RefinedSoundex();
        char char16 = refinedSoundex14.getMappingCode('a');
        java.lang.String str18 = refinedSoundex14.soundex("H000");
        int int21 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex14, "ORKP", "H");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = metaphone0.encode((java.lang.Object) int21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '0' + "'", char16 == '0');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H0" + "'", str18, "H0");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("H000", "H0");
        org.apache.commons.codec.EncoderException encoderException5 = new org.apache.commons.codec.EncoderException("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = refinedSoundex0.encode((java.lang.Object) encoderException5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
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
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone18 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int21 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone18, "hi!", "");
        doubleMetaphone18.maxCodeLen = '4';
        java.lang.String str25 = doubleMetaphone18.doubleMetaphone("");
        int int26 = doubleMetaphone18.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = soundex1.encode((java.lang.Object) int26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        org.apache.commons.codec.EncoderException encoderException9 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException11 = new org.apache.commons.codec.EncoderException("");
        encoderException9.addSuppressed((java.lang.Throwable) encoderException11);
        java.lang.Throwable[] throwableArray13 = encoderException9.getSuppressed();
        java.lang.Class<?> wildcardClass14 = throwableArray13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = metaphone0.encode((java.lang.Object) throwableArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("A", true);
        char char16 = doubleMetaphone0.charAt("H0", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        int int7 = soundex1.getMaxLength();
        int int8 = soundex1.getMaxLength();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: ");
        boolean boolean7 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "HI");
        int int8 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str13 = doubleMetaphone10.doubleMetaphone("", false);
        int int14 = doubleMetaphone10.maxCodeLen;
        int int15 = doubleMetaphone10.maxCodeLen;
        boolean boolean18 = doubleMetaphone10.isDoubleMetaphoneEqual("H", "HI");
        java.lang.Object obj19 = doubleMetaphone9.encode((java.lang.Object) "HI");
        java.lang.String str21 = doubleMetaphone9.encode("H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = metaphone0.encode((java.lang.Object) doubleMetaphone9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ORKP" + "'", str4, "ORKP");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "H" + "'", obj19, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        org.apache.commons.codec.language.Metaphone metaphone4 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str6 = metaphone4.metaphone("H0");
        boolean boolean9 = metaphone4.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str11 = metaphone4.encode("hi!");
        boolean boolean14 = metaphone4.isMetaphoneEqual("H0", "HI");
        int int15 = metaphone4.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = soundex1.encode((java.lang.Object) int15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("O");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "O" + "'", str1, "O");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        char char4 = refinedSoundex0.getMappingCode('\000');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        java.lang.String str8 = soundex1.soundex("");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str5 = refinedSoundex0.soundex("AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A03138363" + "'", str5, "A03138363");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str14 = doubleMetaphone11.doubleMetaphone("", false);
        int int15 = doubleMetaphone11.maxCodeLen;
        doubleMetaphone11.setMaxCodeLen(0);
        java.lang.String str20 = doubleMetaphone11.doubleMetaphone("", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone21 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone21.setMaxCodeLen((int) (byte) -1);
        doubleMetaphone21.maxCodeLen = 100;
        java.lang.String str27 = doubleMetaphone21.encode("HI");
        java.lang.String str29 = doubleMetaphone21.encode("O094010303080830603083060905301608");
        java.lang.Object obj30 = doubleMetaphone11.encode((java.lang.Object) "O094010303080830603083060905301608");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "A" + "'", str29, "A");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "" + "'", obj30, "");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength(10);
        int int11 = soundex1.difference("ARKP", "01230120022455012623010202");
        java.lang.String str13 = soundex1.soundex("AA11111111");
        java.lang.Class<?> wildcardClass14 = soundex1.getClass();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A000" + "'", str13, "A000");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        char char7 = refinedSoundex5.getMappingCode('\000');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = refinedSoundex5.encode("HI");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        int int14 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex15 = new org.apache.commons.codec.language.RefinedSoundex();
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex15, "", "hi!");
        java.lang.Object obj20 = refinedSoundex15.encode((java.lang.Object) "hi!");
        int int23 = refinedSoundex15.difference("org.apache.commons.codec.EncoderException: ", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = metaphone0.encode((java.lang.Object) int23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "H0" + "'", obj20, "H0");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
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
        int int22 = soundex1.getMaxLength();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength((int) '#');
        java.lang.String str10 = soundex1.soundex("O0");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "O000" + "'", str10, "O000");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("A111111111", "H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int4 = soundex1.difference("", "H000");
        int int7 = soundex1.difference("1111111111", "ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str9 = soundex1.encode("O941");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O000" + "'", str9, "O000");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int4 = soundex1.getMaxLength();
        int int7 = soundex1.difference("ARKPXKMNSKTSNKTRKSPXN", "ORKP");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone3 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str6 = doubleMetaphone3.doubleMetaphone("", false);
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone3, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str11 = doubleMetaphone3.encode("hi!");
        java.lang.String str13 = doubleMetaphone3.doubleMetaphone("H000");
        doubleMetaphone3.maxCodeLen = 10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = soundex0.encode((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone3 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone3, "hi!", "");
        char char9 = doubleMetaphone3.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str12 = doubleMetaphone3.doubleMetaphone("1111111111", true);
        java.lang.Object obj13 = caverphone0.encode((java.lang.Object) "1111111111");
        java.lang.String str15 = caverphone0.caverphone("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '0' + "'", char9 == '0');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "1111111111" + "'", obj13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
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
        java.lang.String str26 = soundex1.encode("A0");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "A000" + "'", str26, "A000");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("");
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = caverphone0.encode(obj5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111" + "'", str4, "1111111111");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str12 = doubleMetaphone0.encode("O094010303080830603083060905301608");
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = doubleMetaphone0.encode(obj13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("1111111111", "H000");
        char char15 = doubleMetaphone0.charAt("H0", 2);
        char char18 = doubleMetaphone0.charAt("hi!", (int) (short) 10);
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("AKPKKMNSKT", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AKPK" + "'", str21, "AKPK");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
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
        soundex1.setMaxLength((int) '4');
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
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("H0", true);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("AKP1111111", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AKP" + "'", str16, "AKP");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        boolean boolean13 = metaphone0.isMetaphoneEqual("hi!", "A111111111");
        metaphone0.setMaxCodeLen((int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("");
        int int10 = refinedSoundex0.difference("H0", "O000");
        int int13 = refinedSoundex0.difference("hi!", "AKP1111111");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        java.lang.String str12 = metaphone0.metaphone("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.encode("A");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = (byte) -1;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(4);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("ARKP", "AKP");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.Caverphone caverphone6 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj8 = caverphone6.encode((java.lang.Object) "HI");
        java.lang.String str10 = caverphone6.caverphone("org.apache.commons.codec.EncoderException: ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) caverphone6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AA11111111" + "'", obj8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKPKKMNSKT" + "'", str10, "AKPKKMNSKT");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        boolean boolean5 = caverphone0.isCaverphoneEqual("H000", "hi!");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength(0);
        int int5 = soundex0.difference("O", "ARKPXKMNSKTSNKTRKSPXN");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        int int7 = soundex1.getMaxLength();
        int int10 = soundex1.difference("ARKP", "1111111111");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        int int6 = metaphone0.getMaxCodeLen();
        char[] charArray7 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = metaphone0.encode((java.lang.Object) soundex8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength(0);
        java.lang.String str4 = soundex0.encode("A000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A000" + "'", str4, "A000");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        org.apache.commons.codec.EncoderException encoderException8 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException10 = new org.apache.commons.codec.EncoderException("");
        encoderException8.addSuppressed((java.lang.Throwable) encoderException10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) encoderException10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        boolean boolean13 = metaphone0.isMetaphoneEqual("hi!", "A111111111");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone14, "hi!", "");
        doubleMetaphone14.maxCodeLen = '4';
        java.lang.String str21 = doubleMetaphone14.doubleMetaphone("");
        int int22 = doubleMetaphone14.getMaxCodeLen();
        java.lang.String str24 = doubleMetaphone14.doubleMetaphone("hi!");
        java.lang.Object obj26 = doubleMetaphone14.encode((java.lang.Object) "HI");
        boolean boolean29 = doubleMetaphone14.isDoubleMetaphoneEqual("HI", "H0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = metaphone0.encode((java.lang.Object) boolean29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "H" + "'", obj26, "H");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        java.lang.String str6 = soundex0.encode("O094010303080830603083060905301608");
        int int9 = soundex0.difference("HI", "O094010303080830603083060905301608");
        java.lang.String str11 = soundex0.soundex("O000");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O000" + "'", str6, "O000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O000" + "'", str11, "O000");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = doubleMetaphone0.encode(obj7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.caverphone("org.apache.commons.codec.EncoderException: ");
        java.lang.String str6 = caverphone0.caverphone("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AKPKKMNSKT" + "'", str4, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AKPKKMNSKT" + "'", str6, "AKPKKMNSKT");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str9 = metaphone0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        org.apache.commons.codec.language.Caverphone caverphone18 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str20 = caverphone18.encode("01230120022455012623010202");
        boolean boolean23 = caverphone18.isCaverphoneEqual("ARKP", "H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = doubleMetaphone0.encode((java.lang.Object) boolean23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1111111111" + "'", str20, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        java.lang.String str7 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj8 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = caverphone0.caverphone("ORKP");
        java.lang.String str12 = caverphone0.encode("O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A111111111" + "'", str12, "A111111111");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.soundex("01230120022455012623010202");
        int int10 = refinedSoundex0.difference("H0", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("1111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        int int9 = refinedSoundex0.difference("H000", "");
        char char11 = refinedSoundex0.getMappingCode('\000');
        java.lang.Class<?> wildcardClass12 = refinedSoundex0.getClass();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int8 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("ARKP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ARKP" + "'", str1, "ARKP");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("hi!");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str10 = refinedSoundex8.encode("01230120022455012623010202");
        java.lang.Object obj11 = refinedSoundex0.encode((java.lang.Object) str10);
        int int14 = refinedSoundex0.difference("", "1111111111");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H0" + "'", str7, "H0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        int int5 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Caverphone caverphone6 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str8 = caverphone6.encode("01230120022455012623010202");
        boolean boolean11 = caverphone6.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str13 = caverphone6.encode("AA11111111");
        java.lang.String str15 = caverphone6.caverphone("A931");
        java.lang.String str17 = caverphone6.encode("HI");
        java.lang.Object obj18 = soundex0.encode((java.lang.Object) str17);
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "A000" + "'", obj18, "A000");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('K');
        doubleMetaphoneResult8.appendAlternate("ORKP");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
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
        java.lang.String str23 = soundex1.encode("01230120022455012623010202");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone24 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int27 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone24, "hi!", "");
        char char30 = doubleMetaphone24.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str33 = doubleMetaphone24.doubleMetaphone("1111111111", true);
        boolean boolean36 = doubleMetaphone24.isDoubleMetaphoneEqual("1111111111", "H000");
        int int37 = doubleMetaphone24.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = soundex1.encode((java.lang.Object) doubleMetaphone24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '0' + "'", char30 == '0');
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength((int) '#');
        int int11 = soundex1.difference("O0", "O0");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        char[] charArray1 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex2 = new org.apache.commons.codec.language.RefinedSoundex(charArray1);
        java.lang.String str4 = refinedSoundex2.soundex("a1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = metaphone0.encode((java.lang.Object) refinedSoundex2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A0" + "'", str4, "A0");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.maxCodeLen = 10;
        doubleMetaphone0.setMaxCodeLen(2);
        doubleMetaphone0.maxCodeLen = 4;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("");
        java.lang.String str6 = metaphone0.encode("H000");
        java.lang.String str8 = metaphone0.encode("O000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "O" + "'", str8, "O");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("H0");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex3, "", "hi!");
        java.lang.String str10 = refinedSoundex3.soundex("01230120022455012623010202");
        java.lang.Object obj11 = metaphone0.encode((java.lang.Object) str10);
        java.lang.String str13 = metaphone0.metaphone("");
        java.lang.Object obj15 = metaphone0.encode((java.lang.Object) "ORKP");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "ORKP" + "'", obj15, "ORKP");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.soundex("01230120022455012623010202");
        int int10 = refinedSoundex0.difference("H", "H0");
        int int13 = refinedSoundex0.difference("", "01230120022455012623010202");
        int int16 = refinedSoundex0.difference("A0", "A0");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("org.apache.commons.codec.EncoderException: ", "A0");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("ORKP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ORKP" + "'", str1, "ORKP");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("H0");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex3, "", "hi!");
        java.lang.String str10 = refinedSoundex3.soundex("01230120022455012623010202");
        java.lang.Object obj11 = metaphone0.encode((java.lang.Object) str10);
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = metaphone0.encode(obj12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
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
        char char30 = doubleMetaphone0.charAt("AKP1111111", 1);
        doubleMetaphone0.setMaxCodeLen((int) 'a');
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
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + 'K' + "'", char30 == 'K');
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("O941");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "O" + "'", str1, "O");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str11 = metaphone0.encode("O000");
        metaphone0.setMaxCodeLen((int) 'K');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O" + "'", str11, "O");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "A000", "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("A931");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = (byte) -1;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = doubleMetaphone0.encode((java.lang.Object) "AKPK");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str11 = metaphone0.encode("O000");
        metaphone0.setMaxCodeLen((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O" + "'", str11, "O");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        boolean boolean10 = caverphone0.isCaverphoneEqual("A03138363", "H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) 'K');
        java.lang.String str14 = metaphone0.metaphone("AKPKMNSKTS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AKPKMNSKTS" + "'", str14, "AKPKMNSKTS");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
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
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = (byte) -1;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone9.setMaxCodeLen((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
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
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        soundex1.setMaxLength((int) (byte) 10);
        int int8 = soundex1.getMaxLength();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        int int5 = soundex0.getMaxLength();
        soundex0.setMaxLength(0);
        java.lang.String str9 = soundex0.encode("A0");
        int int10 = soundex0.getMaxLength();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A000" + "'", str9, "A000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.encode("H");
        java.lang.String str6 = caverphone0.encode("ARKP");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AKP1111111" + "'", str6, "AKP1111111");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        int int6 = refinedSoundex0.difference("HI", "hi!");
        java.lang.String str8 = refinedSoundex0.encode("O000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "O0" + "'", str8, "O0");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = (byte) -1;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = doubleMetaphone0.doubleMetaphone("A0313836");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        int int7 = soundex1.getMaxLength();
        java.lang.String str9 = soundex1.encode("org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength(1);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O941" + "'", str9, "O941");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.encode("");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex();
        char char10 = refinedSoundex8.getMappingCode('a');
        java.lang.String str12 = refinedSoundex8.soundex("H000");
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex8, "ORKP", "H");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = refinedSoundex0.encode((java.lang.Object) refinedSoundex8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '0' + "'", char10 == '0');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H0" + "'", str12, "H0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        metaphone0.setMaxCodeLen((int) (byte) 0);
        boolean boolean12 = metaphone0.isMetaphoneEqual("ARKP", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        int int9 = refinedSoundex0.difference("ARKP", "H000");
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = refinedSoundex0.encode(obj10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.Object obj5 = refinedSoundex0.encode((java.lang.Object) "hi!");
        int int8 = refinedSoundex0.difference("org.apache.commons.codec.EncoderException: ", "");
        char char10 = refinedSoundex0.getMappingCode('1');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "H0" + "'", obj5, "H0");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "HI", "AA11111111");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        int int9 = refinedSoundex0.difference("ARKP", "H000");
        char char11 = refinedSoundex0.getMappingCode('#');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("AKP1111111", "AKPKKMNSKT");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = soundex8.difference("org.apache.commons.codec.EncoderException: 01230120022455012623010202", "O941");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("1111111111", "H000");
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("a1", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone8 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str11 = doubleMetaphone8.doubleMetaphone("", false);
        int int12 = doubleMetaphone8.getMaxCodeLen();
        int int13 = doubleMetaphone8.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = refinedSoundex0.encode((java.lang.Object) int13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        doubleMetaphone0.setMaxCodeLen(0);
        char char19 = doubleMetaphone0.charAt("O", (int) (byte) -1);
        doubleMetaphone0.maxCodeLen = 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = metaphone0.encode(obj14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength((int) '#');
        soundex1.setMaxLength(0);
        soundex1.setMaxLength(3);
        int int15 = soundex1.difference("O", "A931");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.soundex("01230120022455012623010202");
        int int10 = refinedSoundex0.difference("H", "H0");
        char[] charArray11 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray11);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray11);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex14 = new org.apache.commons.codec.language.RefinedSoundex(charArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = refinedSoundex0.encode((java.lang.Object) charArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("A931");
        java.lang.String str11 = caverphone0.encode("HI");
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException("AKPKKMNSKT");
        java.lang.Throwable[] throwableArray14 = encoderException13.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = caverphone0.encode((java.lang.Object) throwableArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A111111111" + "'", str9, "A111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        metaphone0.setMaxCodeLen(2);
        boolean boolean7 = metaphone0.isMetaphoneEqual("ARKPXKMNSKTSNKTRKSPXN", "AKP1111111");
        int int8 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.Metaphone metaphone8 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str10 = metaphone8.metaphone("H0");
        boolean boolean13 = metaphone8.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str15 = metaphone8.encode("hi!");
        boolean boolean18 = metaphone8.isMetaphoneEqual("H0", "HI");
        int int19 = metaphone8.getMaxCodeLen();
        boolean boolean22 = metaphone8.isMetaphoneEqual("", "HI");
        java.lang.Object obj23 = refinedSoundex0.encode((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A093153836383693158" + "'", str7, "A093153836383693158");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "" + "'", obj23, "");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HI3", "A0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: ");
        boolean boolean7 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "HI");
        java.lang.Class<?> wildcardClass8 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ORKP" + "'", str4, "ORKP");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        java.lang.String str6 = soundex0.encode("O094010303080830603083060905301608");
        int int9 = soundex0.difference("1111111111", "01230120022455012623010202");
        java.lang.Class<?> wildcardClass10 = soundex0.getClass();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O000" + "'", str6, "O000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        java.lang.Class<?> wildcardClass15 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('K');
        doubleMetaphoneResult8.append("");
        doubleMetaphoneResult8.appendPrimary('\000');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("O094010303080830603083060905301608", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("");
        java.lang.String str6 = caverphone0.caverphone("A0313836");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111" + "'", str4, "1111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        char char4 = refinedSoundex0.getMappingCode(' ');
        java.lang.String str6 = refinedSoundex0.encode("O094010303080830603083060905301608");
        java.lang.String str8 = refinedSoundex0.encode("AKP");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O0" + "'", str6, "O0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A031" + "'", str8, "A031");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        int int5 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 1);
        java.lang.String str9 = soundex0.encode("AKPK");
        char[] charArray10 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = soundex0.encode((java.lang.Object) charArray10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A212" + "'", str9, "A212");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKP", "AKP", false);
        org.apache.commons.codec.language.SoundexUtils soundexUtils8 = new org.apache.commons.codec.language.SoundexUtils();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = doubleMetaphone0.encode((java.lang.Object) soundexUtils8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("AKP");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "A000", "AKP1111111");
        java.lang.Object obj13 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = caverphone0.encode(obj13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AKP1111111" + "'", str9, "AKP1111111");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.encode("H");
        java.lang.String str6 = caverphone0.caverphone("H000");
        java.lang.String str8 = caverphone0.caverphone("A093153836383693158");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("A0313836");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A0" + "'", str2, "A0");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
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
        int int30 = soundex1.getMaxLength();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("AKPKMNSKTS");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex();
        int int11 = refinedSoundex8.difference("H000", "H0");
        java.lang.String str13 = refinedSoundex8.soundex("HI");
        java.lang.Object obj14 = refinedSoundex0.encode((java.lang.Object) str13);
        java.lang.String str16 = refinedSoundex0.encode("");
        char char18 = refinedSoundex0.getMappingCode('4');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A03138363" + "'", str7, "A03138363");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H0" + "'", str13, "H0");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "H0" + "'", obj14, "H0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        int int4 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKP", "org.apache.commons.codec.EncoderException: 01230120022455012623010202", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str9 = doubleMetaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNSKTSNKTRKSPKSN" + "'", str9, "ARKPKSKMNSKTSNKTRKSPKSN");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
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
        int int18 = soundex1.getMaxLength();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("", "AKP1111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "O094010303080830603083060905301608");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("H0");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex3, "", "hi!");
        java.lang.String str10 = refinedSoundex3.soundex("01230120022455012623010202");
        java.lang.Object obj11 = metaphone0.encode((java.lang.Object) str10);
        java.lang.String str13 = metaphone0.metaphone("");
        int int14 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone5 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone5, "hi!", "");
        char char11 = doubleMetaphone5.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str14 = doubleMetaphone5.doubleMetaphone("1111111111", true);
        boolean boolean17 = doubleMetaphone5.isDoubleMetaphoneEqual("1111111111", "H000");
        char char20 = doubleMetaphone5.charAt("H0", 2);
        int int21 = doubleMetaphone5.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = caverphone0.encode((java.lang.Object) int21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111" + "'", str4, "1111111111");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '0' + "'", char11 == '0');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("A031");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        int int14 = metaphone0.getMaxCodeLen();
        java.lang.String str16 = metaphone0.encode("hi!");
        java.lang.String str18 = metaphone0.encode("ORKP");
        boolean boolean21 = metaphone0.isMetaphoneEqual("ORKP", "ORKP");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORKP" + "'", str18, "ORKP");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) "HI");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("A0313836");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "H" + "'", obj12, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str5 = refinedSoundex0.encode("hi!");
        java.lang.String str7 = refinedSoundex0.soundex("H000");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "ARKP", "");
        char char12 = refinedSoundex0.getMappingCode('3');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H0" + "'", str5, "H0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H0" + "'", str7, "H0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength(10);
        int int11 = soundex1.difference("ARKP", "01230120022455012623010202");
        int int14 = soundex1.difference("HI", "01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        int int14 = metaphone0.getMaxCodeLen();
        java.lang.String str16 = metaphone0.encode("hi!");
        java.lang.String str18 = metaphone0.encode("ORKP");
        java.lang.String str20 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str22 = metaphone0.encode("AKPK");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORKP" + "'", str18, "ORKP");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ARKP" + "'", str20, "ARKP");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AKPK" + "'", str22, "AKPK");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
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
        java.lang.String str28 = soundex1.soundex("H0");
        java.lang.String str30 = soundex1.soundex("A03138363");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "A000" + "'", str30, "A000");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
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
        java.lang.String str29 = doubleMetaphone0.doubleMetaphone("A0");
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "A" + "'", str29, "A");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "AA11111111", "ARKP");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = caverphone0.encode((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        char char5 = refinedSoundex3.getMappingCode('1');
        java.lang.String str7 = refinedSoundex3.encode("");
        char char9 = refinedSoundex3.getMappingCode('\000');
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H000", "H");
        boolean boolean13 = metaphone0.isMetaphoneEqual("0", "A031");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        char[] charArray0 = org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.soundex("A");
        int int4 = soundex1.getMaxLength();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 2, 3, 0, 1, 2, 0, 0, 2, 2, 4, 5, 5, 0, 1, 2, 6, 2, 3, 0, 1, 0, 2, 0, 2]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A000" + "'", str3, "A000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        org.apache.commons.codec.language.Metaphone metaphone3 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str5 = metaphone3.metaphone("H0");
        boolean boolean8 = metaphone3.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = metaphone3.metaphone("");
        java.lang.String str12 = metaphone3.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = doubleMetaphone0.encode((java.lang.Object) "ARKPXKMNSKTSNKTRKSPXN");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKP" + "'", str12, "ARKP");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        metaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.String str11 = metaphone0.encode("0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("A931", "A03138363");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('1');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        boolean boolean8 = caverphone0.isCaverphoneEqual("A0", "AKPKMNSKTS");
        java.lang.String str10 = caverphone0.caverphone("A0313836");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A111111111" + "'", str10, "A111111111");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.soundex("A000");
        soundex0.setMaxLength((int) '0');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A000" + "'", str2, "A000");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int4 = soundex1.getMaxLength();
        org.apache.commons.codec.language.Metaphone metaphone5 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str7 = metaphone5.metaphone("H0");
        boolean boolean10 = metaphone5.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str12 = metaphone5.encode("hi!");
        boolean boolean15 = metaphone5.isMetaphoneEqual("H0", "HI");
        java.lang.Object obj16 = soundex1.encode((java.lang.Object) "H0");
        int int19 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "ORKP", "");
        java.lang.String str21 = soundex1.encode("A111111111");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "H000" + "'", obj16, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A000" + "'", str21, "A000");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("H000", "H0");
        java.lang.String str5 = refinedSoundex0.soundex("HI");
        java.lang.Class<?> wildcardClass6 = refinedSoundex0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H0" + "'", str5, "H0");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKPKSKMNSKTSNKTRKSPKSN");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "org.apache.commons.codec.EncoderException: 01230120022455012623010202", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        java.lang.String str6 = soundex0.soundex("AKPK");
        java.lang.String str8 = soundex0.encode("0");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A212" + "'", str6, "A212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("");
        java.lang.String str6 = caverphone0.caverphone("O000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111" + "'", str4, "1111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        java.lang.String str7 = soundex1.encode("");
        java.lang.String str9 = soundex1.soundex("hi!");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphone0.maxCodeLen = '3';
        java.lang.String str17 = doubleMetaphone0.encode("HI");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKP" + "'", str13, "ARKP");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength(10);
        int int11 = soundex1.difference("ARKP", "01230120022455012623010202");
        soundex1.setMaxLength(100);
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "O0", "HI");
        java.lang.String str18 = soundex1.soundex("A000");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A000" + "'", str18, "A000");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        char char5 = refinedSoundex3.getMappingCode('1');
        java.lang.String str7 = refinedSoundex3.encode("");
        int int10 = refinedSoundex3.difference("AKPK", "ARKPKSKMNSKTSNKTRKSPKSN");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "O" + "'", str1, "O");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.Object obj5 = refinedSoundex0.encode((java.lang.Object) "hi!");
        java.lang.String str7 = refinedSoundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "H0" + "'", obj5, "H0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) "HI");
        char char15 = doubleMetaphone0.charAt("", (int) (short) 100);
        int int16 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "H" + "'", obj12, "H");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("A931");
        java.lang.String str11 = caverphone0.caverphone("AKP");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A111111111" + "'", str9, "A111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AKP1111111" + "'", str11, "AKP1111111");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.encode("");
        java.lang.String str6 = caverphone0.encode("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111" + "'", str4, "1111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("");
        java.lang.String str6 = metaphone0.encode("H000");
        int int7 = metaphone0.getMaxCodeLen();
        boolean boolean10 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "H0");
        java.lang.String str12 = metaphone0.metaphone("O941");
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "1111111111", "H0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O" + "'", str12, "O");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        int int15 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) 'o');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str5 = refinedSoundex0.encode("hi!");
        java.lang.String str7 = refinedSoundex0.soundex("H000");
        char char9 = refinedSoundex0.getMappingCode('#');
        java.lang.String str11 = refinedSoundex0.soundex("O0");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H0" + "'", str5, "H0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H0" + "'", str7, "H0");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O0" + "'", str11, "O0");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.encode("a");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A0" + "'", str7, "A0");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("1111111111", "H000");
        char char15 = doubleMetaphone0.charAt("H0", 2);
        doubleMetaphone0.maxCodeLen = 'o';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = metaphone0.getMaxCodeLen();
        java.lang.String str12 = metaphone0.metaphone("AKPKMNSKTS");
        java.lang.String str14 = metaphone0.metaphone("A931");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AKPK" + "'", str12, "AKPK");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        int int14 = metaphone0.getMaxCodeLen();
        java.lang.String str16 = metaphone0.encode("hi!");
        boolean boolean19 = metaphone0.isMetaphoneEqual("", "ARKPKSKMNSKTSNKTRKSPKSN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.Object obj5 = refinedSoundex0.encode((java.lang.Object) "hi!");
        int int8 = refinedSoundex0.difference("org.apache.commons.codec.EncoderException: ", "");
        char char10 = refinedSoundex0.getMappingCode('O');
        java.lang.String str12 = refinedSoundex0.encode("O0");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "H0" + "'", obj5, "H0");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '0' + "'", char10 == '0');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O0" + "'", str12, "O0");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        int int7 = soundex1.getMaxLength();
        java.lang.String str9 = soundex1.encode("org.apache.commons.codec.EncoderException: ");
        java.lang.String str11 = soundex1.encode("A000");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O941" + "'", str9, "O941");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A000" + "'", str11, "A000");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        java.lang.String str6 = caverphone0.caverphone("1111111111");
        java.lang.String str8 = caverphone0.caverphone("O000");
        java.lang.Object obj10 = caverphone0.encode((java.lang.Object) "AKPKMNSKTS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111" + "'", str6, "1111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "AKPKMNSKTS" + "'", obj10, "AKPKMNSKTS");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        java.lang.String str5 = doubleMetaphone0.encode("ORKP");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("01230120022455012623010202", "");
        java.lang.Object obj10 = doubleMetaphone0.encode((java.lang.Object) "01230120022455012623010202\000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "" + "'", obj10, "");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        soundex1.setMaxLength(10);
        soundex1.setMaxLength((int) ' ');
        soundex1.setMaxLength((int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = soundex1.getClass();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        soundex1.setMaxLength(10);
        soundex1.setMaxLength((-1));
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        java.lang.String str6 = caverphone0.caverphone("1111111111");
        java.lang.String str8 = caverphone0.caverphone("O000");
        java.lang.String str10 = caverphone0.encode("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111" + "'", str6, "1111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A111111111" + "'", str10, "A111111111");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(0);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "", true);
        java.lang.String str12 = doubleMetaphone0.encode("");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone14, "hi!", "");
        char char20 = doubleMetaphone14.charAt("O094010303080830603083060905301608", (int) ' ');
        int int21 = doubleMetaphone14.maxCodeLen;
        boolean boolean25 = doubleMetaphone14.isDoubleMetaphoneEqual("H0", "1111111111", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = doubleMetaphone0.encode((java.lang.Object) boolean25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '0' + "'", char20 == '0');
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = refinedSoundex7.soundex("AKP");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        int int14 = metaphone0.getMaxCodeLen();
        java.lang.String str16 = metaphone0.encode("hi!");
        int int17 = metaphone0.getMaxCodeLen();
        boolean boolean20 = metaphone0.isMetaphoneEqual("A0", "1111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "A111111111");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex();
        char char6 = refinedSoundex4.getMappingCode('a');
        char char8 = refinedSoundex4.getMappingCode('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = caverphone0.encode((java.lang.Object) char8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        int int14 = metaphone0.getMaxCodeLen();
        java.lang.String str16 = metaphone0.encode("hi!");
        int int17 = metaphone0.getMaxCodeLen();
        boolean boolean20 = metaphone0.isMetaphoneEqual("AKPKMNSKTS", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("HI", "H0");
        doubleMetaphone0.maxCodeLen = 1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str12 = doubleMetaphone0.encode("O094010303080830603083060905301608");
        int int13 = doubleMetaphone0.maxCodeLen;
        int int14 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.Object obj5 = refinedSoundex0.encode((java.lang.Object) "hi!");
        int int8 = refinedSoundex0.difference("org.apache.commons.codec.EncoderException: ", "");
        char[] charArray9 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray9);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray9);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray9);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = refinedSoundex0.encode((java.lang.Object) refinedSoundex13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "H0" + "'", obj5, "H0");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("hi!");
        char char9 = refinedSoundex0.getMappingCode('\000');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H0" + "'", str7, "H0");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("");
        int int5 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.encode("AKPK");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AKPK111111" + "'", str9, "AKPK111111");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("");
        int int10 = refinedSoundex0.difference("H0", "O000");
        char char12 = refinedSoundex0.getMappingCode('0');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.maxCodeLen = 10;
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("", false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int5 = soundex2.difference("A", "A0313836");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        java.lang.String str7 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj8 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = caverphone0.caverphone("ORKP");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "AKPK");
        java.lang.String str15 = caverphone0.encode("A111111111");
        boolean boolean18 = caverphone0.isCaverphoneEqual("01230120022455012623010202", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str4 = soundex2.encode("A0931");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A000" + "'", str4, "A000");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("O000", "AA11111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        int int9 = refinedSoundex0.difference("H000", "");
        int int12 = refinedSoundex0.difference("AKPK", "1111111111");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphone0.maxCodeLen = '3';
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("AKPK111111", true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKP" + "'", str13, "ARKP");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AKPK" + "'", str18, "AKPK");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("1111111111", "H000");
        char char15 = doubleMetaphone0.charAt("H0", 2);
        char char18 = doubleMetaphone0.charAt("hi!", (int) (short) 10);
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("HI3", "H000", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int4 = soundex1.difference("", "H000");
        int int5 = soundex1.getMaxLength();
        int int6 = soundex1.getMaxLength();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("a1", true);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("A031");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("HI", "A931");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) 'K');
        java.lang.String str14 = metaphone0.metaphone("1111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        char char4 = refinedSoundex0.getMappingCode(' ');
        java.lang.String str6 = refinedSoundex0.encode("O094010303080830603083060905301608");
        java.lang.String str8 = refinedSoundex0.encode("O0");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O0" + "'", str6, "O0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "O0" + "'", str8, "O0");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str13 = doubleMetaphone10.doubleMetaphone("", false);
        int int14 = doubleMetaphone10.maxCodeLen;
        doubleMetaphone10.setMaxCodeLen(0);
        java.lang.String str19 = doubleMetaphone10.doubleMetaphone("", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone20 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone20.setMaxCodeLen((int) (byte) -1);
        doubleMetaphone20.maxCodeLen = 100;
        java.lang.String str26 = doubleMetaphone20.encode("HI");
        java.lang.String str28 = doubleMetaphone20.encode("O094010303080830603083060905301608");
        java.lang.Object obj29 = doubleMetaphone10.encode((java.lang.Object) "O094010303080830603083060905301608");
        char char32 = doubleMetaphone10.charAt("HI3", (int) (byte) 1);
        boolean boolean35 = doubleMetaphone10.isDoubleMetaphoneEqual("AKPKKMNSKT", "a");
        java.lang.Object obj36 = doubleMetaphone0.encode((java.lang.Object) "a");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "A" + "'", str28, "A");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "" + "'", obj29, "");
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + 'I' + "'", char32 == 'I');
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "A" + "'", obj36, "A");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION" + "'", str1, "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        metaphone0.setMaxCodeLen(100);
        int int10 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        int int9 = refinedSoundex0.difference("H000", "hi!");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "AKPKMNSKTS", "hi!");
        char[] charArray13 = org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        int int15 = soundex14.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = refinedSoundex0.encode((java.lang.Object) int15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[0, 1, 2, 3, 0, 1, 2, 0, 0, 2, 2, 4, 5, 5, 0, 1, 2, 6, 2, 3, 0, 1, 0, 2, 0, 2]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
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
        java.lang.String str19 = caverphone0.caverphone("AKP");
        boolean boolean22 = caverphone0.isCaverphoneEqual("01230120022455012623010202", "H000");
        java.lang.String str24 = caverphone0.encode("AKPKMNSKTS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKPKKMNSKT" + "'", str17, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AKP1111111" + "'", str19, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AKPKMNSKTS" + "'", str24, "AKPKMNSKTS");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int3 = soundex0.difference("AKP", "AKPK111111");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        int int5 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 1);
        java.lang.String str9 = soundex0.soundex("A03138363");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A000" + "'", str9, "A000");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        int int9 = refinedSoundex0.difference("ARKP", "H000");
        java.lang.String str11 = refinedSoundex0.soundex("A031");
        java.lang.String str13 = refinedSoundex0.soundex("AA11111111");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A0" + "'", str11, "A0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A0" + "'", str13, "A0");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.maxCodeLen = 4;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("AA11111111");
        org.apache.commons.codec.language.Metaphone metaphone8 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str10 = metaphone8.metaphone("H0");
        java.lang.String str12 = metaphone8.metaphone("");
        java.lang.String str14 = metaphone8.encode("H000");
        java.lang.Object obj15 = doubleMetaphone0.encode((java.lang.Object) str14);
        doubleMetaphone0.setMaxCodeLen(0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int4 = soundex1.difference("", "H000");
        int int5 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) '#');
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("org.apache.commons.codec.EncoderException: 01230120022455012623010202");
        boolean boolean10 = caverphone0.isCaverphoneEqual("HIA212", "A0313836");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AKPKKMNSKT" + "'", str7, "AKPKKMNSKT");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str11 = doubleMetaphone0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        char[] charArray12 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray12);
        java.lang.String str15 = soundex13.encode("HI");
        java.lang.String str17 = soundex13.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone18 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int21 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone18, "hi!", "");
        doubleMetaphone18.maxCodeLen = '4';
        java.lang.String str25 = doubleMetaphone18.doubleMetaphone("");
        int int26 = doubleMetaphone18.getMaxCodeLen();
        java.lang.String str28 = doubleMetaphone18.doubleMetaphone("hi!");
        java.lang.Object obj29 = soundex13.encode((java.lang.Object) "hi!");
        java.lang.String str31 = soundex13.encode("");
        java.lang.String str33 = soundex13.encode("");
        java.lang.String str35 = soundex13.encode("O");
        int int36 = soundex13.getMaxLength();
        java.lang.String str38 = soundex13.encode("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str40 = soundex13.soundex("H0");
        java.lang.Object obj41 = doubleMetaphone0.encode((java.lang.Object) "H0");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ARKPXKMNSKTSNKTRKSPXN" + "'", str11, "ARKPXKMNSKTSNKTRKSPXN");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "H000" + "'", obj29, "H000");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "O000" + "'", str35, "O000");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "A931" + "'", str38, "A931");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "H000" + "'", str40, "H000");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "" + "'", obj41, "");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
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
        java.lang.String str31 = soundex1.encode("A");
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
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str4 = soundex2.encode("O0");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O000" + "'", str4, "O000");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        int int7 = soundex1.getMaxLength();
        java.lang.String str9 = soundex1.soundex("1111111111");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "hi!");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        org.apache.commons.codec.EncoderException encoderException8 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException10 = new org.apache.commons.codec.EncoderException("");
        encoderException8.addSuppressed((java.lang.Throwable) encoderException10);
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException("");
        encoderException13.addSuppressed((java.lang.Throwable) encoderException15);
        encoderException8.addSuppressed((java.lang.Throwable) encoderException15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = doubleMetaphone0.encode((java.lang.Object) encoderException15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        char char4 = refinedSoundex0.getMappingCode(' ');
        java.lang.String str6 = refinedSoundex0.encode("O094010303080830603083060905301608");
        int int9 = refinedSoundex0.difference("ORKP", "A000");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O0" + "'", str6, "O0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        java.lang.String str7 = caverphone0.caverphone("A931");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        java.lang.String str6 = refinedSoundex4.encode("a");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A0" + "'", str6, "A0");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
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
        char char30 = doubleMetaphone0.charAt("AKP1111111", 1);
        java.lang.String str33 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: AKPKMNSKTS", false);
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
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + 'K' + "'", char30 == 'K');
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS" + "'", str33, "ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        boolean boolean13 = metaphone0.isMetaphoneEqual("hi!", "A111111111");
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "", "HI");
        java.lang.String str18 = metaphone0.encode("A212");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: ");
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "H", "A931");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ORKP" + "'", str4, "ORKP");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("H0");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex3, "", "hi!");
        java.lang.String str10 = refinedSoundex3.soundex("01230120022455012623010202");
        java.lang.Object obj11 = metaphone0.encode((java.lang.Object) str10);
        boolean boolean14 = metaphone0.isMetaphoneEqual("H", "HIA212");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("org.apache.commons.codec.EncoderException: AKPKMNSKTS", "A031");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) (byte) 1);
        int int14 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength(10);
        int int11 = soundex1.difference("ARKP", "01230120022455012623010202");
        java.lang.String str13 = soundex1.soundex("AA11111111");
        java.lang.String str15 = soundex1.encode("HI");
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
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        int int14 = metaphone0.getMaxCodeLen();
        java.lang.String str16 = metaphone0.metaphone("1111111111");
        boolean boolean19 = metaphone0.isMetaphoneEqual("A03138363", "ARKPKSKMNSKTSNKTRKSPKSN");
        java.lang.String str21 = metaphone0.metaphone("A093153836383693158");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.maxCodeLen = 4;
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: 01230120022455012623010202", "A212", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone10, "hi!", "");
        doubleMetaphone10.maxCodeLen = '4';
        java.lang.String str17 = doubleMetaphone10.doubleMetaphone("");
        java.lang.String str20 = doubleMetaphone10.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean24 = doubleMetaphone10.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        doubleMetaphone10.setMaxCodeLen(0);
        char char29 = doubleMetaphone10.charAt("O", (int) (byte) -1);
        java.lang.String str31 = doubleMetaphone10.encode("HI3");
        doubleMetaphone10.maxCodeLen = '4';
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        metaphone0.setMaxCodeLen(8);
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "AKPK", "A");
        boolean boolean17 = metaphone0.isMetaphoneEqual("", "a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("AKP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AKP" + "'", str1, "AKP");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        java.lang.String str4 = refinedSoundex0.soundex("A");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone5 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str9 = doubleMetaphone6.doubleMetaphone("", false);
        int int10 = doubleMetaphone6.maxCodeLen;
        int int11 = doubleMetaphone6.maxCodeLen;
        boolean boolean14 = doubleMetaphone6.isDoubleMetaphoneEqual("H", "HI");
        java.lang.Object obj15 = doubleMetaphone5.encode((java.lang.Object) "HI");
        java.lang.String str17 = doubleMetaphone5.encode("hi!");
        java.lang.Object obj18 = refinedSoundex0.encode((java.lang.Object) str17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A0" + "'", str4, "A0");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "H" + "'", obj15, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "H0" + "'", obj18, "H0");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
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
        org.apache.commons.codec.language.Caverphone caverphone18 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str20 = caverphone18.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex21 = new org.apache.commons.codec.language.RefinedSoundex();
        char char23 = refinedSoundex21.getMappingCode('a');
        java.lang.String str25 = refinedSoundex21.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj26 = caverphone18.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str28 = caverphone18.caverphone("ORKP");
        boolean boolean31 = caverphone18.isCaverphoneEqual("", "AKPK");
        java.lang.Object obj32 = caverphone0.encode((java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKPKKMNSKT" + "'", str17, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AKPKMNSKTS" + "'", str20, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '0' + "'", char23 == '0');
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "O094010303080830603083060905301608" + "'", str25, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "AKPKKMNSKT" + "'", obj26, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AKP1111111" + "'", str28, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "1111111111" + "'", obj32, "1111111111");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.soundex("01230120022455012623010202");
        java.lang.String str9 = refinedSoundex0.encode("ORKP");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O0931" + "'", str9, "O0931");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.encode("A111111111");
        java.lang.Object obj11 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str13 = caverphone0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A111111111" + "'", str9, "A111111111");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "AKPKKMNSKT" + "'", obj11, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength(10);
        int int11 = soundex1.difference("AKPKMNSKTS", "O094010303080830603083060905301608");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("hi!");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str10 = refinedSoundex8.encode("01230120022455012623010202");
        java.lang.Object obj11 = refinedSoundex0.encode((java.lang.Object) str10);
        java.lang.String str13 = refinedSoundex0.encode("");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H0" + "'", str7, "H0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        java.lang.String str4 = refinedSoundex0.soundex("A");
        char char6 = refinedSoundex0.getMappingCode('a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A0" + "'", str4, "A0");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        java.lang.String str6 = caverphone0.caverphone("1111111111");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone7 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str10 = doubleMetaphone7.doubleMetaphone("", false);
        doubleMetaphone7.maxCodeLen = 4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = caverphone0.encode((java.lang.Object) 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111" + "'", str6, "1111111111");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        char[] charArray0 = org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.soundex("A");
        java.lang.String str5 = soundex1.soundex("\000");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 2, 3, 0, 1, 2, 0, 0, 2, 2, 4, 5, 5, 0, 1, 2, 6, 2, 3, 0, 1, 0, 2, 0, 2]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A000" + "'", str3, "A000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        soundex1.setMaxLength((int) (short) 1);
        java.lang.String str5 = soundex1.encode("HI");
        int int6 = soundex1.getMaxLength();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        boolean boolean14 = metaphone0.isMetaphoneEqual("AKP", "A212");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str14 = doubleMetaphone11.doubleMetaphone("", false);
        int int15 = doubleMetaphone11.maxCodeLen;
        int int16 = doubleMetaphone11.maxCodeLen;
        boolean boolean19 = doubleMetaphone11.isDoubleMetaphoneEqual("H", "HI");
        java.lang.Object obj20 = doubleMetaphone10.encode((java.lang.Object) "HI");
        java.lang.String str22 = doubleMetaphone10.encode("hi!");
        java.lang.Object obj23 = metaphone0.encode((java.lang.Object) "hi!");
        java.lang.String str25 = metaphone0.metaphone("a1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "H" + "'", obj20, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "H" + "'", obj23, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "A" + "'", str25, "A");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int5 = soundex2.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "");
        int int8 = soundex2.difference("A0", "HI3");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int4 = soundex1.difference("", "H000");
        int int7 = soundex1.difference("1111111111", "ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str9 = soundex1.soundex("1111111111");
        int int12 = soundex1.difference("ARKPXKMNSKTSNKTRKSPXN", "01230120022455012623010202\000");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        char char4 = refinedSoundex0.getMappingCode(' ');
        java.lang.String str6 = refinedSoundex0.encode("O094010303080830603083060905301608");
        char char8 = refinedSoundex0.getMappingCode('a');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O0" + "'", str6, "O0");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '0' + "'", char8 == '0');
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        int int9 = refinedSoundex0.difference("H000", "hi!");
        java.lang.String str11 = refinedSoundex0.encode("");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.soundex("A000");
        int int3 = soundex0.getMaxLength();
        int int6 = soundex0.difference("AKPK", "org.apache.commons.codec.EncoderException: HIA212");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A000" + "'", str2, "A000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("O000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "O" + "'", str1, "O");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        char[] charArray1 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray1);
        soundex2.setMaxLength((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = metaphone0.encode((java.lang.Object) soundex2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.maxCodeLen = 10;
        doubleMetaphone0.setMaxCodeLen(2);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone10.setMaxCodeLen((int) (byte) -1);
        doubleMetaphone10.maxCodeLen = 100;
        java.lang.String str16 = doubleMetaphone10.encode("HI");
        java.lang.String str18 = doubleMetaphone10.encode("O094010303080830603083060905301608");
        int int19 = doubleMetaphone10.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = metaphone0.encode((java.lang.Object) int19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        metaphone0.setMaxCodeLen(100);
        metaphone0.setMaxCodeLen(100);
        metaphone0.setMaxCodeLen((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("1111111111", "H000");
        char char15 = doubleMetaphone0.charAt("H0", 2);
        int int16 = doubleMetaphone0.maxCodeLen;
        java.lang.Class<?> wildcardClass17 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        java.lang.String str6 = caverphone0.encode("A");
        boolean boolean9 = caverphone0.isCaverphoneEqual("AA11111111", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        java.lang.String str4 = refinedSoundex0.soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608094010303080830603083060905301608");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.maxCodeLen = 10;
        int int13 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPKSKMNSKTSNKTRKSPKSN", "A931");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("H000");
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "ORKP", "H");
        java.lang.String str9 = refinedSoundex0.encode("org.apache.commons.codec.EncoderException: ");
        java.lang.String str11 = refinedSoundex0.soundex("A000");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H0" + "'", str4, "H0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O094010303080830603083060905301608" + "'", str9, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A0" + "'", str11, "A0");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
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
        int int24 = soundex1.difference("", "O0931");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.soundex("H");
        int int10 = refinedSoundex0.difference("1111111111", "A000");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H0" + "'", str7, "H0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        metaphone0.setMaxCodeLen(2);
        java.lang.String str6 = metaphone0.metaphone("ARKPKSKMNSKTSNKTRKSPKSN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AR" + "'", str6, "AR");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.caverphone("org.apache.commons.codec.EncoderException: ");
        org.apache.commons.codec.language.Soundex soundex5 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str7 = soundex5.soundex("H");
        java.lang.String str9 = soundex5.soundex("H");
        java.lang.String str11 = soundex5.encode("O094010303080830603083060905301608");
        java.lang.Object obj12 = caverphone0.encode((java.lang.Object) "O094010303080830603083060905301608");
        java.lang.String str14 = caverphone0.caverphone("HIA212");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AKPKKMNSKT" + "'", str4, "AKPKKMNSKT");
        org.junit.Assert.assertNotNull(soundex5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O000" + "'", str11, "O000");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "A111111111" + "'", obj12, "A111111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        int int4 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (byte) 1;
        doubleMetaphone0.maxCodeLen = 'K';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        char char4 = refinedSoundex0.getMappingCode('a');
        int int7 = refinedSoundex0.difference("A093153836383693158", "ORKP");
        java.lang.Class<?> wildcardClass8 = refinedSoundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '0' + "'", char4 == '0');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("AKPK", "A093153836383693158");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.caverphone("org.apache.commons.codec.EncoderException: ");
        boolean boolean7 = caverphone0.isCaverphoneEqual("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", "ARKP");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AKPKKMNSKT" + "'", str4, "AKPKKMNSKT");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        char char5 = refinedSoundex3.getMappingCode('1');
        java.lang.String str7 = refinedSoundex3.encode("");
        java.lang.String str9 = refinedSoundex3.encode("");
        java.lang.String str11 = refinedSoundex3.encode("1111111111");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
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
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.Soundex soundex18 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str20 = soundex18.soundex("H");
        java.lang.String str22 = soundex18.soundex("H");
        int int23 = soundex18.getMaxLength();
        soundex18.setMaxLength((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = doubleMetaphone0.encode((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(soundex18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        int int6 = metaphone0.getMaxCodeLen();
        int int7 = metaphone0.getMaxCodeLen();
        int int8 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.maxCodeLen = 10;
        int int13 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("01230120022455012623010202\000", "A03138363", false);
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("HI3", "1111111111");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("");
        java.lang.String str6 = metaphone0.encode("A0313836");
        int int7 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A" + "'", str6, "A");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("ARKP", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('K');
        doubleMetaphoneResult8.append("");
        doubleMetaphoneResult8.appendAlternate('a');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.soundex("01230120022455012623010202");
        int int10 = refinedSoundex0.difference("H", "H0");
        int int13 = refinedSoundex0.difference("ORKP", "AKPKKMNSKT");
        java.lang.String str15 = refinedSoundex0.encode("O");
        int int18 = refinedSoundex0.difference("", "");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "O0" + "'", str15, "O0");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = refinedSoundex5.difference("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION", "A000");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str8 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = refinedSoundex7.encode("ARKPKSKMNSKTSNKTRKSPKSN");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = metaphone0.getMaxCodeLen();
        java.lang.String str12 = metaphone0.metaphone("AKPKMNSKTS");
        char[] charArray13 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        soundex14.setMaxLength((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = metaphone0.encode((java.lang.Object) soundex14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AKPK" + "'", str12, "AKPK");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
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
        org.apache.commons.codec.language.Metaphone metaphone24 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str26 = metaphone24.metaphone("H0");
        boolean boolean29 = metaphone24.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str31 = metaphone24.metaphone("");
        java.lang.String str33 = metaphone24.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        int int34 = metaphone24.getMaxCodeLen();
        metaphone24.setMaxCodeLen((int) 'K');
        java.lang.String str38 = metaphone24.encode("ARKPXKMNSKTSNKTRKSPXN");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = soundex1.encode((java.lang.Object) metaphone24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ARKP" + "'", str33, "ARKP");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ARKPKSKMNSKTSNKTRKSPKSN" + "'", str38, "ARKPKSKMNSKTSNKTRKSPKSN");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("AA11111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AA" + "'", str1, "AA");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.encode("O0931");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O000" + "'", str2, "O000");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int4 = soundex1.difference("", "H000");
        int int7 = soundex1.difference("1111111111", "ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str9 = soundex1.soundex("1111111111");
        java.lang.String str11 = soundex1.encode("");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int4 = soundex1.difference("", "H000");
        int int7 = soundex1.difference("1111111111", "ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str9 = soundex1.soundex("1111111111");
        soundex1.setMaxLength((int) (short) -1);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        int int15 = doubleMetaphone0.maxCodeLen;
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("A000", "A000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("hi!");
        java.lang.String str9 = refinedSoundex0.encode("");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H0" + "'", str7, "H0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.encode("H");
        java.lang.String str6 = caverphone0.caverphone("H000");
        boolean boolean9 = caverphone0.isCaverphoneEqual("O0931", "H000");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        int int9 = refinedSoundex0.difference("H000", "");
        char char11 = refinedSoundex0.getMappingCode('\000');
        java.lang.String str13 = refinedSoundex0.soundex("ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A0931538363836931583138363" + "'", str13, "A0931538363836931583138363");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength(10);
        int int11 = soundex1.difference("A0931538363836931583138363", "A0931538363836931583138363");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        int int9 = refinedSoundex0.difference("H000", "hi!");
        java.lang.String str11 = refinedSoundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O094010303080830603083060905301608" + "'", str11, "O094010303080830603083060905301608");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        metaphone0.setMaxCodeLen((int) (short) 100);
        boolean boolean18 = metaphone0.isMetaphoneEqual("\000", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("1111111111", "H000");
        char char15 = doubleMetaphone0.charAt("H0", 2);
        char char18 = doubleMetaphone0.charAt("hi!", (int) (short) 10);
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("a", true);
        doubleMetaphone0.setMaxCodeLen(4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.Class<?> wildcardClass6 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
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
        java.lang.String str23 = soundex1.encode("01230120022455012623010202");
        int int26 = soundex1.difference("AKPKKMNSKT", "O941");
        int int29 = soundex1.difference("AKPKKMNSKT", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        soundex1.setMaxLength(0);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("H000", true);
        java.lang.String str9 = doubleMetaphone0.encode("AKP");
        org.apache.commons.codec.language.Metaphone metaphone10 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str12 = metaphone10.metaphone("H0");
        boolean boolean15 = metaphone10.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str17 = metaphone10.encode("hi!");
        boolean boolean20 = metaphone10.isMetaphoneEqual("H0", "HI");
        boolean boolean23 = metaphone10.isMetaphoneEqual("hi!", "A111111111");
        boolean boolean26 = metaphone10.isMetaphoneEqual("H000", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AKP" + "'", str9, "AKP");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "ARKP" + "'", obj27, "ARKP");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        int int4 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("O0931", "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        int int8 = metaphone0.getMaxCodeLen();
        boolean boolean11 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: HIA212");
        java.lang.String str13 = metaphone0.encode("A212");
        int int14 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.commons.codec.StringEncoder stringEncoder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.codec.language.SoundexUtils.difference(stringEncoder0, "O094010303080830603083060905301608094010303080830603083060905301608", "AR");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        boolean boolean13 = metaphone0.isMetaphoneEqual("hi!", "A111111111");
        boolean boolean16 = metaphone0.isMetaphoneEqual("H000", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        boolean boolean19 = metaphone0.isMetaphoneEqual("HIA212", "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
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
        java.lang.Class<?> wildcardClass20 = caverphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKPKKMNSKT" + "'", str17, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AKPKKMNSKT" + "'", str19, "AKPKKMNSKT");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("hi!");
        java.lang.String str12 = metaphone0.encode("O941");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O" + "'", str12, "O");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength(0);
        int int5 = soundex0.difference("org.apache.commons.codec.EncoderException: hi!", "H0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("AKPKMNSKTS");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex();
        int int11 = refinedSoundex8.difference("H000", "H0");
        java.lang.String str13 = refinedSoundex8.soundex("HI");
        java.lang.Object obj14 = refinedSoundex0.encode((java.lang.Object) str13);
        java.lang.String str16 = refinedSoundex0.encode("");
        char char18 = refinedSoundex0.getMappingCode('K');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A03138363" + "'", str7, "A03138363");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H0" + "'", str13, "H0");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "H0" + "'", obj14, "H0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '3' + "'", char18 == '3');
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("org.apache.commons.codec.EncoderException: ", "A0313836");
        boolean boolean6 = caverphone0.isCaverphoneEqual("A000", "HI");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) "HI");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        int int14 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '3');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "H" + "'", obj12, "H");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        char char8 = refinedSoundex0.getMappingCode('o');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '0' + "'", char8 == '0');
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.encode("A111111111");
        java.lang.Object obj11 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str13 = caverphone0.caverphone("HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A111111111" + "'", str9, "A111111111");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "AKPKKMNSKT" + "'", obj11, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        java.lang.String str6 = caverphone0.caverphone("1111111111");
        java.lang.String str8 = caverphone0.caverphone("O000");
        java.lang.String str10 = caverphone0.encode("HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111" + "'", str6, "1111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength(0);
        org.apache.commons.codec.language.Metaphone metaphone3 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str5 = metaphone3.metaphone("H0");
        boolean boolean8 = metaphone3.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = metaphone3.metaphone("");
        java.lang.String str12 = metaphone3.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str14 = metaphone3.encode("O000");
        boolean boolean17 = metaphone3.isMetaphoneEqual("org.apache.commons.codec.EncoderException: hi!", "A931");
        java.lang.Object obj18 = soundex0.encode((java.lang.Object) "A931");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone19 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int22 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone19, "hi!", "");
        doubleMetaphone19.maxCodeLen = '4';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult26 = doubleMetaphone19.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult26.append(' ');
        doubleMetaphoneResult26.appendAlternate("O000");
        java.lang.Object obj31 = soundex0.encode((java.lang.Object) "O000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKP" + "'", str12, "ARKP");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "O" + "'", str14, "O");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "A000" + "'", obj18, "A000");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "O000" + "'", obj31, "O000");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.caverphone("org.apache.commons.codec.EncoderException: 01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AKPKKMNSKT" + "'", str4, "AKPKKMNSKT");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("hi!");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str10 = refinedSoundex8.encode("01230120022455012623010202");
        java.lang.Object obj11 = refinedSoundex0.encode((java.lang.Object) str10);
        char[] charArray12 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray12);
        java.lang.String str15 = soundex13.encode("HI");
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex13, "01230120022455012623010202", "HI");
        soundex13.setMaxLength(10);
        int int23 = soundex13.difference("ARKP", "01230120022455012623010202");
        java.lang.String str25 = soundex13.soundex("AA11111111");
        java.lang.String str27 = soundex13.soundex("ARKP");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = refinedSoundex0.encode((java.lang.Object) soundex13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H0" + "'", str7, "H0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "A000" + "'", str25, "A000");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "A931" + "'", str27, "A931");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("");
        int int10 = refinedSoundex0.difference("H0", "O000");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex();
        int int14 = refinedSoundex11.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str16 = refinedSoundex11.encode("hi!");
        char[] charArray17 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray17);
        java.lang.String str20 = soundex18.encode("HI");
        java.lang.Object obj21 = refinedSoundex11.encode((java.lang.Object) str20);
        java.lang.Object obj22 = refinedSoundex0.encode(obj21);
        int int25 = refinedSoundex0.difference("a1", "");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H0" + "'", str16, "H0");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "H0" + "'", obj21, "H0");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "H0" + "'", obj22, "H0");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        int int14 = metaphone0.getMaxCodeLen();
        java.lang.String str16 = metaphone0.encode("hi!");
        java.lang.String str18 = metaphone0.encode("ORKP");
        java.lang.String str20 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str22 = metaphone0.metaphone("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORKP" + "'", str18, "ORKP");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ARKP" + "'", str20, "ARKP");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
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
        java.lang.String str21 = caverphone0.encode("HIA212");
        boolean boolean24 = caverphone0.isCaverphoneEqual("org.apache.commons.codec.EncoderException: 01230120022455012623010202", "A093153836383693158");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKPKKMNSKT" + "'", str17, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AKPKKMNSKT" + "'", str19, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AA11111111" + "'", str21, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str9 = doubleMetaphone0.encode("AKP");
        int int10 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AKP" + "'", str9, "AKP");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = refinedSoundex0.difference("A093153836383693158", "AA11111111");
        int int13 = refinedSoundex0.difference("1111111111", "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A093153836383693158" + "'", str7, "A093153836383693158");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('K');
        doubleMetaphoneResult8.append("");
        doubleMetaphoneResult8.appendAlternate("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HI3", "O0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.encode("A111111111");
        java.lang.String str11 = caverphone0.caverphone("A212");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A111111111" + "'", str9, "A111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        int int6 = metaphone0.getMaxCodeLen();
        int int7 = metaphone0.getMaxCodeLen();
        java.lang.String str9 = metaphone0.metaphone("AR");
        int int10 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AR" + "'", str9, "AR");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        char char13 = doubleMetaphone0.charAt("A000", (int) (short) 1);
        doubleMetaphone0.setMaxCodeLen((int) '#');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '0' + "'", char13 == '0');
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int5 = soundex2.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "");
        java.lang.String str7 = soundex2.encode("org.apache.commons.codec.EncoderException: 01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O941" + "'", str7, "O941");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("a1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        char char5 = refinedSoundex3.getMappingCode('1');
        java.lang.String str7 = refinedSoundex3.encode("");
        java.lang.String str9 = refinedSoundex3.encode("");
        java.lang.String str11 = refinedSoundex3.encode("O");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O0" + "'", str11, "O0");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str13 = soundex11.soundex("a");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A000" + "'", str13, "A000");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
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
        java.lang.String str22 = caverphone0.encode("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKPKKMNSKT" + "'", str17, "AKPKKMNSKT");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1111111111" + "'", str22, "1111111111");
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        boolean boolean13 = metaphone0.isMetaphoneEqual("hi!", "A111111111");
        boolean boolean16 = metaphone0.isMetaphoneEqual("H000", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str18 = metaphone0.encode("a1");
        boolean boolean21 = metaphone0.isMetaphoneEqual("ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS", "ARKPXKMNSKTSNKTRKSPXN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("A", true);
        doubleMetaphone0.maxCodeLen = 10;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
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
        java.lang.String str26 = soundex1.soundex("O094010303080830603083060905301608");
        int int29 = soundex1.difference("AKPKMNSKTS", "org.apache.commons.codec.EncoderException: ");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "O000" + "'", str26, "O000");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str10 = soundex8.encode("A0");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A000" + "'", str10, "A000");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        char char4 = refinedSoundex0.getMappingCode('4');
        java.lang.String str6 = refinedSoundex0.soundex("ARKP");
        java.lang.String str8 = refinedSoundex0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone9 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str11 = caverphone9.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex();
        char char14 = refinedSoundex12.getMappingCode('a');
        java.lang.String str16 = refinedSoundex12.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj17 = caverphone9.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str19 = caverphone9.caverphone("ORKP");
        boolean boolean22 = caverphone9.isCaverphoneEqual("", "AKPK");
        java.lang.String str24 = caverphone9.encode("A111111111");
        boolean boolean27 = caverphone9.isCaverphoneEqual("HI3", "A0931");
        java.lang.Object obj28 = refinedSoundex0.encode((java.lang.Object) "HI3");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A0931" + "'", str6, "A0931");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AKPKMNSKTS" + "'", str11, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '0' + "'", char14 == '0');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "O094010303080830603083060905301608" + "'", str16, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "AKPKKMNSKT" + "'", obj17, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AKP1111111" + "'", str19, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "A111111111" + "'", str24, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "H0" + "'", obj28, "H0");
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        java.lang.String str6 = caverphone0.encode("A");
        java.lang.String str8 = caverphone0.caverphone("A212");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.Object obj5 = refinedSoundex0.encode((java.lang.Object) "hi!");
        char char7 = refinedSoundex0.getMappingCode('\000');
        char char9 = refinedSoundex0.getMappingCode('o');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "H0" + "'", obj5, "H0");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '0' + "'", char9 == '0');
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('K');
        doubleMetaphoneResult8.append("");
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        java.lang.String str14 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "K" + "'", str14, "K");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("AKP");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "A000", "AKP1111111");
        boolean boolean15 = caverphone0.isCaverphoneEqual("01230120022455012623010202\000", "a1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AKP1111111" + "'", str9, "AKP1111111");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        java.lang.String str6 = soundex0.encode("O094010303080830603083060905301608");
        int int9 = soundex0.difference("HI", "O094010303080830603083060905301608");
        char[] charArray10 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray10);
        java.lang.String str13 = soundex11.encode("HI");
        java.lang.String str15 = soundex11.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int19 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone16, "hi!", "");
        doubleMetaphone16.maxCodeLen = '4';
        java.lang.String str23 = doubleMetaphone16.doubleMetaphone("");
        int int24 = doubleMetaphone16.getMaxCodeLen();
        java.lang.String str26 = doubleMetaphone16.doubleMetaphone("hi!");
        java.lang.Object obj27 = soundex11.encode((java.lang.Object) "hi!");
        java.lang.String str29 = soundex11.soundex("");
        java.lang.Object obj30 = soundex0.encode((java.lang.Object) str29);
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O000" + "'", str6, "O000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "H000" + "'", obj27, "H000");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "" + "'", obj30, "");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.encode("HI");
        java.lang.String str11 = caverphone0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        doubleMetaphone0.maxCodeLen = 100;
        java.lang.String str6 = doubleMetaphone0.encode("HI");
        java.lang.String str8 = doubleMetaphone0.encode("O094010303080830603083060905301608");
        org.apache.commons.codec.language.Metaphone metaphone9 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str11 = metaphone9.metaphone("H0");
        boolean boolean14 = metaphone9.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str16 = metaphone9.encode("hi!");
        metaphone9.setMaxCodeLen(100);
        int int19 = metaphone9.getMaxCodeLen();
        boolean boolean22 = metaphone9.isMetaphoneEqual("AKP1111111", "01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = doubleMetaphone0.encode((java.lang.Object) boolean22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        char[] charArray0 = null;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = refinedSoundex1.encode("A031");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        java.lang.String str4 = refinedSoundex0.encode("AKPKKMNSKT");
        java.lang.String str6 = refinedSoundex0.soundex("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A0313836" + "'", str4, "A0313836");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('K');
        doubleMetaphoneResult8.appendPrimary("A0931538363836931583138363");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.maxCodeLen = 10;
        int int13 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("01230120022455012623010202\000", "A03138363", false);
        doubleMetaphone0.maxCodeLen = 'A';
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("A0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        char char4 = refinedSoundex0.getMappingCode('a');
        char char6 = refinedSoundex0.getMappingCode('a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '0' + "'", char4 == '0');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.soundex("O094010303080830603083060905301608094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O0" + "'", str7, "O0");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.commons.codec.StringEncoder stringEncoder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.codec.language.SoundexUtils.difference(stringEncoder0, "HI3", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        boolean boolean13 = metaphone0.isMetaphoneEqual("hi!", "A111111111");
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "", "HI");
        boolean boolean19 = metaphone0.isMetaphoneEqual("", "org.apache.commons.codec.EncoderException: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.soundex("");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("AA11111111", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str12 = soundex10.soundex("A0313836");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A000" + "'", str12, "A000");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.maxCodeLen = 10;
        int int13 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str15 = doubleMetaphone0.encode("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        metaphone0.setMaxCodeLen((int) (short) 100);
        boolean boolean18 = metaphone0.isMetaphoneEqual("AKPK111111", "ARKPXKMNSKTSNKTRKSPXN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        java.lang.String str7 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj8 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = caverphone0.caverphone("ORKP");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "AKPK");
        java.lang.String str15 = caverphone0.encode("A111111111");
        boolean boolean18 = caverphone0.isCaverphoneEqual("HI3", "A0931");
        java.lang.Class<?> wildcardClass19 = caverphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "A212");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) "HI");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("HI", "H0");
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone0.new DoubleMetaphoneResult(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "H" + "'", obj12, "H");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        int int14 = metaphone0.getMaxCodeLen();
        java.lang.String str16 = metaphone0.encode("hi!");
        java.lang.String str18 = metaphone0.metaphone("HI");
        java.lang.String str20 = metaphone0.metaphone("AA11111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A" + "'", str20, "A");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        java.lang.Class<?> wildcardClass3 = refinedSoundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
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
        java.lang.String str25 = soundex1.encode("hi!");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("", "1111111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
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
        java.lang.String str23 = soundex1.encode("01230120022455012623010202");
        int int24 = soundex1.getMaxLength();
        soundex1.setMaxLength(8);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone7 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str10 = doubleMetaphone7.doubleMetaphone("", false);
        int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone7, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone7.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult15.appendPrimary('K');
        doubleMetaphoneResult15.append("");
        java.lang.String str20 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append("A03138363");
        java.lang.Object obj23 = soundex6.encode((java.lang.Object) "A03138363");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "A000" + "'", obj23, "A000");
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: ");
        boolean boolean7 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "HI");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ORKP" + "'", str4, "ORKP");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        char char7 = refinedSoundex0.getMappingCode('K');
        int int10 = refinedSoundex0.difference("", "O941");
        int int13 = refinedSoundex0.difference("O941", "ORKP");
        java.lang.String str15 = refinedSoundex0.encode("O094010303080830603083060905301608");
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "org.apache.commons.codec.EncoderException: 01230120022455012623010202", "a1");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '3' + "'", char7 == '3');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "O0" + "'", str15, "O0");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        int int14 = metaphone0.getMaxCodeLen();
        java.lang.String str16 = metaphone0.encode("hi!");
        java.lang.String str18 = metaphone0.encode("ORKP");
        boolean boolean21 = metaphone0.isMetaphoneEqual("ARKP", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORKP" + "'", str18, "ORKP");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("AKP");
        java.lang.String str11 = caverphone0.caverphone("AKPK111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AKP1111111" + "'", str9, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AKPK111111" + "'", str11, "AKPK111111");
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
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
        java.lang.String str28 = soundex1.soundex("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "O941" + "'", str28, "O941");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str14 = doubleMetaphone11.doubleMetaphone("", false);
        int int15 = doubleMetaphone11.maxCodeLen;
        int int16 = doubleMetaphone11.maxCodeLen;
        boolean boolean19 = doubleMetaphone11.isDoubleMetaphoneEqual("H", "HI");
        java.lang.Object obj20 = doubleMetaphone10.encode((java.lang.Object) "HI");
        java.lang.String str22 = doubleMetaphone10.encode("hi!");
        java.lang.Object obj23 = metaphone0.encode((java.lang.Object) "hi!");
        int int24 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex25 = new org.apache.commons.codec.language.RefinedSoundex();
        char char27 = refinedSoundex25.getMappingCode('a');
        int int30 = refinedSoundex25.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str32 = refinedSoundex25.encode("hi!");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex33 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str35 = refinedSoundex33.encode("01230120022455012623010202");
        java.lang.Object obj36 = refinedSoundex25.encode((java.lang.Object) str35);
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        java.lang.Object obj38 = metaphone0.encode(obj36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "H" + "'", obj20, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "H" + "'", obj23, "H");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '0' + "'", char27 == '0');
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H0" + "'", str32, "H0");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "" + "'", obj36, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "" + "'", obj38, "");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str14 = doubleMetaphone11.doubleMetaphone("", false);
        int int15 = doubleMetaphone11.maxCodeLen;
        int int16 = doubleMetaphone11.maxCodeLen;
        boolean boolean19 = doubleMetaphone11.isDoubleMetaphoneEqual("H", "HI");
        java.lang.Object obj20 = doubleMetaphone10.encode((java.lang.Object) "HI");
        java.lang.String str22 = doubleMetaphone10.encode("hi!");
        java.lang.Object obj23 = metaphone0.encode((java.lang.Object) "hi!");
        int int24 = metaphone0.getMaxCodeLen();
        java.lang.String str26 = metaphone0.encode("A0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "H" + "'", obj20, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "H" + "'", obj23, "H");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "A" + "'", str26, "A");
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("AKPKMNSKTS");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex();
        int int11 = refinedSoundex8.difference("H000", "H0");
        java.lang.String str13 = refinedSoundex8.soundex("HI");
        java.lang.Object obj14 = refinedSoundex0.encode((java.lang.Object) str13);
        java.lang.String str16 = refinedSoundex0.encode("A");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A03138363" + "'", str7, "A03138363");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H0" + "'", str13, "H0");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "H0" + "'", obj14, "H0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A0" + "'", str16, "A0");
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        char[] charArray10 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray10);
        java.lang.String str13 = soundex11.encode("HI");
        soundex11.setMaxLength(10);
        soundex11.setMaxLength((int) ' ');
        soundex11.setMaxLength((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = doubleMetaphone0.encode((java.lang.Object) soundex11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        int int6 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.Caverphone caverphone7 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str9 = caverphone7.encode("01230120022455012623010202");
        java.lang.String str11 = caverphone7.caverphone("H000");
        java.lang.String str13 = caverphone7.caverphone("1111111111");
        java.lang.String str15 = caverphone7.caverphone("O000");
        java.lang.Object obj16 = metaphone0.encode((java.lang.Object) "O000");
        java.lang.String str18 = metaphone0.encode("0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "O" + "'", obj16, "O");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0" + "'", str18, "0");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = refinedSoundex0.difference("A093153836383693158", "AA11111111");
        java.lang.String str12 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: hi!");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A093153836383693158" + "'", str7, "A093153836383693158");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O0940103030808306030830609053016080" + "'", str12, "O0940103030808306030830609053016080");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int4 = soundex1.difference("", "H000");
        int int7 = soundex1.difference("1111111111", "ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str9 = soundex1.soundex("A000");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A000" + "'", str9, "A000");
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int7 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!");
        org.apache.commons.codec.language.Soundex soundex14 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str16 = soundex14.soundex("H");
        java.lang.String str18 = soundex14.soundex("H");
        int int21 = soundex14.difference("AKPKKMNSKT", "H000");
        int int22 = soundex14.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = doubleMetaphone0.encode((java.lang.Object) int22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKP" + "'", str13, "ARKP");
        org.junit.Assert.assertNotNull(soundex14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int4 = soundex1.difference("", "H000");
        int int7 = soundex1.difference("A000", "A0313836");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone8 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str11 = doubleMetaphone8.doubleMetaphone("", false);
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone8, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str16 = doubleMetaphone8.encode("hi!");
        java.lang.String str18 = doubleMetaphone8.doubleMetaphone("H000");
        int int19 = doubleMetaphone8.getMaxCodeLen();
        java.lang.String str21 = doubleMetaphone8.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.Object obj22 = soundex1.encode((java.lang.Object) "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ARKP" + "'", str21, "ARKP");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "O941" + "'", obj22, "O941");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        java.lang.String str7 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj8 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = caverphone0.caverphone("ORKP");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "AKPK");
        java.lang.String str15 = caverphone0.encode("A111111111");
        java.lang.String str17 = caverphone0.caverphone("AKP1111111");
        java.lang.String str19 = caverphone0.encode("A000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKP1111111" + "'", str17, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A111111111" + "'", str19, "A111111111");
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("O0940103030808306030830609053016080");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "O" + "'", str1, "O");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphone0.maxCodeLen = '3';
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: hi!", "A0931538363836931583138363");
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("O0", true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKP" + "'", str13, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str11 = metaphone0.encode("O000");
        boolean boolean14 = metaphone0.isMetaphoneEqual("org.apache.commons.codec.EncoderException: hi!", "A931");
        boolean boolean17 = metaphone0.isMetaphoneEqual("", "O094010303080830603083060905301608094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O" + "'", str11, "O");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        int int8 = soundex1.difference("AKPK", "a1");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }
}

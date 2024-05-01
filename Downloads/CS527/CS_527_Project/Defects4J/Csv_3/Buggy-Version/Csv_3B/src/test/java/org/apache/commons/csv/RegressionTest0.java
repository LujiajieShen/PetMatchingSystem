package org.apache.commons.csv;

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
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        org.apache.commons.csv.Token token6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Token token7 = cSVLexer5.nextToken(token6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = cSVLexer5.readEscape();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape((int) '#');
        org.apache.commons.csv.Token token10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Token token11 = cSVLexer5.nextToken(token10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean8 = cSVLexer5.ignoreEmptyLines;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = cSVLexer5.readEscape();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVLexer5.format;
        java.io.Reader reader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.apache.commons.csv.CSVRecord> cSVRecordIterable13 = cSVFormat11.parse(reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVLexer5.format;
        java.lang.StringBuilder stringBuilder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVLexer5.trimTrailingSpaces(stringBuilder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape(0);
        org.apache.commons.csv.Token token10 = new org.apache.commons.csv.Token();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Token token11 = cSVLexer5.nextToken(token10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVLexer5.format;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = cSVLexer5.readEscape();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = cSVLexer5.readEscape();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        boolean boolean12 = cSVLexer5.isQuoteChar((int) '\r');
        org.apache.commons.csv.Token token13 = new org.apache.commons.csv.Token();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Token token14 = cSVLexer5.nextToken(token13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        boolean boolean12 = cSVLexer5.isQuoteChar((int) '\r');
        boolean boolean14 = cSVLexer5.isDelimiter((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = cSVLexer5.readEscape();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVLexer5.format;
        boolean boolean12 = cSVFormat11.isQuoting();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape(0);
        boolean boolean11 = cSVLexer5.isQuoteChar(1);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVLexer5.format;
        java.io.Reader reader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.apache.commons.csv.CSVRecord> cSVRecordIterable14 = cSVFormat12.parse(reader13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = null;
        org.apache.commons.csv.CSVLexer cSVLexer3 = new org.apache.commons.csv.CSVLexer(cSVFormat0, extendedBufferedReader2);
        boolean boolean5 = cSVLexer3.isEndOfFile((int) '\n');
        boolean boolean6 = cSVLexer3.ignoreEmptyLines;
        boolean boolean8 = cSVLexer3.isQuoteChar((int) '4');
        boolean boolean9 = cSVLexer3.ignoreEmptyLines;
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape(0);
        boolean boolean11 = cSVLexer5.isQuoteChar((int) (short) 1);
        boolean boolean13 = cSVLexer5.isQuoteChar((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = cSVLexer5.readEscape();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = org.apache.commons.csv.CSVFormat.newBuilder(cSVFormat0);
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = null;
        org.apache.commons.csv.CSVLexer cSVLexer4 = new org.apache.commons.csv.CSVLexer(cSVFormat0, extendedBufferedReader3);
        boolean boolean6 = cSVLexer4.readEndOfLine((int) (byte) 100);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVLexer4.format;
        org.apache.commons.csv.Token token8 = new org.apache.commons.csv.Token();
        org.apache.commons.csv.Token.Type type9 = token8.type;
        java.lang.String str10 = token8.toString();
        boolean boolean11 = token8.isReady;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Token token12 = cSVLexer4.nextToken(token8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type9.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "INVALID []" + "'", str10, "INVALID []");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = org.apache.commons.csv.CSVFormat.newBuilder(cSVFormat0);
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = null;
        org.apache.commons.csv.CSVLexer cSVLexer4 = new org.apache.commons.csv.CSVLexer(cSVFormat0, extendedBufferedReader3);
        boolean boolean6 = cSVLexer4.readEndOfLine((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = cSVLexer4.readEscape();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = cSVLexer5.getLineNumber();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape(0);
        boolean boolean11 = cSVLexer5.isQuoteChar(1);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVLexer5.format;
        boolean boolean13 = cSVLexer5.ignoreSurroundingSpaces;
        org.apache.commons.csv.Token token14 = new org.apache.commons.csv.Token();
        org.apache.commons.csv.Token.Type type15 = token14.type;
        java.lang.String str16 = token14.toString();
        org.apache.commons.csv.Token.Type type17 = token14.type;
        java.lang.StringBuilder stringBuilder18 = token14.content;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Token token19 = cSVLexer5.nextToken(token14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type15.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "INVALID []" + "'", str16, "INVALID []");
        org.junit.Assert.assertTrue("'" + type17 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type17.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat2);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder4 = cSVFormat2.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormatBuilder4.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = null;
        org.apache.commons.csv.CSVLexer cSVLexer7 = new org.apache.commons.csv.CSVLexer(cSVFormat5, extendedBufferedReader6);
        boolean boolean9 = cSVLexer7.isEscape(0);
        boolean boolean11 = cSVLexer7.isEscape(0);
        boolean boolean13 = cSVLexer7.isQuoteChar(1);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVLexer7.format;
        boolean boolean15 = cSVFormat1.equals((java.lang.Object) cSVFormat14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser16 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormatBuilder4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        boolean boolean12 = cSVLexer5.isQuoteChar((int) '\r');
        org.apache.commons.csv.Token token13 = new org.apache.commons.csv.Token();
        org.apache.commons.csv.Token.Type type14 = token13.type;
        java.lang.String str15 = token13.toString();
        org.apache.commons.csv.Token.Type type16 = token13.type;
        java.lang.StringBuilder stringBuilder17 = token13.content;
        cSVLexer5.trimTrailingSpaces(stringBuilder17);
        org.apache.commons.csv.Token token19 = new org.apache.commons.csv.Token();
        org.apache.commons.csv.Token.Type type20 = token19.type;
        java.lang.String str21 = token19.toString();
        org.apache.commons.csv.Token.Type type22 = org.apache.commons.csv.Token.Type.EORECORD;
        token19.type = type22;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Token token24 = cSVLexer5.nextToken(token19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type14.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "INVALID []" + "'", str15, "INVALID []");
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type16.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type20.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "INVALID []" + "'", str21, "INVALID []");
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + org.apache.commons.csv.Token.Type.EORECORD + "'", type22.equals(org.apache.commons.csv.Token.Type.EORECORD));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        boolean boolean12 = cSVLexer5.isStartOfLine((int) '\r');
        org.apache.commons.csv.Token token13 = new org.apache.commons.csv.Token();
        org.apache.commons.csv.Token.Type type14 = token13.type;
        java.lang.String str15 = token13.toString();
        org.apache.commons.csv.Token.Type type16 = token13.type;
        java.lang.StringBuilder stringBuilder17 = token13.content;
        token13.isReady = true;
        token13.isReady = true;
        boolean boolean22 = token13.isReady;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Token token23 = cSVLexer5.nextToken(token13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type14.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "INVALID []" + "'", str15, "INVALID []");
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type16.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.csv.CSVFormat cSVFormat0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVLexer cSVLexer2 = new org.apache.commons.csv.CSVLexer(cSVFormat0, extendedBufferedReader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        org.apache.commons.csv.Token token11 = new org.apache.commons.csv.Token();
        token11.isReady = false;
        org.apache.commons.csv.Token.Type type14 = org.apache.commons.csv.Token.Type.INVALID;
        token11.type = type14;
        org.apache.commons.csv.Token token16 = new org.apache.commons.csv.Token();
        org.apache.commons.csv.Token.Type type17 = token16.type;
        java.lang.String str18 = token16.toString();
        org.apache.commons.csv.Token.Type type19 = org.apache.commons.csv.Token.Type.EORECORD;
        token16.type = type19;
        token11.type = type19;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Token token22 = cSVLexer5.nextToken(token11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type14.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertTrue("'" + type17 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type17.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "INVALID []" + "'", str18, "INVALID []");
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.apache.commons.csv.Token.Type.EORECORD + "'", type19.equals(org.apache.commons.csv.Token.Type.EORECORD));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape(0);
        boolean boolean11 = cSVLexer5.isQuoteChar((int) (short) 1);
        boolean boolean13 = cSVLexer5.isQuoteChar(0);
        boolean boolean14 = cSVLexer5.ignoreEmptyLines;
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = cSVFormat1.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormatBuilder3.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = null;
        org.apache.commons.csv.CSVLexer cSVLexer6 = new org.apache.commons.csv.CSVLexer(cSVFormat4, extendedBufferedReader5);
        boolean boolean8 = cSVLexer6.isEscape(0);
        boolean boolean10 = cSVLexer6.isEscape(0);
        boolean boolean12 = cSVLexer6.isQuoteChar(1);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVLexer6.format;
        boolean boolean14 = cSVFormat0.equals((java.lang.Object) cSVFormat13);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder15 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat13);
        boolean boolean16 = cSVFormat13.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormatBuilder3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape(0);
        boolean boolean11 = cSVLexer5.isQuoteChar((int) (short) 1);
        boolean boolean13 = cSVLexer5.isQuoteChar(0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = cSVLexer5.getLineNumber();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = null;
        org.apache.commons.csv.CSVLexer cSVLexer3 = new org.apache.commons.csv.CSVLexer(cSVFormat0, extendedBufferedReader2);
        java.lang.String str4 = cSVFormat0.getNullToString();
        boolean boolean5 = cSVFormat0.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        boolean boolean12 = cSVLexer5.isQuoteChar((int) '\r');
        boolean boolean14 = cSVLexer5.isEscape((int) '\f');
        boolean boolean15 = cSVLexer5.ignoreEmptyLines;
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape(0);
        boolean boolean11 = cSVLexer5.readEndOfLine((int) (short) 1);
        org.apache.commons.csv.Token token12 = new org.apache.commons.csv.Token();
        org.apache.commons.csv.Token.Type type13 = org.apache.commons.csv.Token.Type.TOKEN;
        token12.type = type13;
        java.lang.StringBuilder stringBuilder15 = token12.content;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Token token16 = cSVLexer5.nextToken(token12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.apache.commons.csv.Token.Type.TOKEN + "'", type13.equals(org.apache.commons.csv.Token.Type.TOKEN));
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = cSVFormat1.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormatBuilder3.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = null;
        org.apache.commons.csv.CSVLexer cSVLexer6 = new org.apache.commons.csv.CSVLexer(cSVFormat4, extendedBufferedReader5);
        boolean boolean8 = cSVLexer6.isEscape(0);
        boolean boolean10 = cSVLexer6.isEscape(0);
        boolean boolean12 = cSVLexer6.isQuoteChar(1);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVLexer6.format;
        boolean boolean14 = cSVFormat0.equals((java.lang.Object) cSVFormat13);
        java.lang.String str15 = cSVFormat0.getNullToString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormatBuilder3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = null;
        org.apache.commons.csv.CSVLexer cSVLexer4 = new org.apache.commons.csv.CSVLexer(cSVFormat1, extendedBufferedReader3);
        java.lang.String str5 = cSVFormat1.getNullToString();
        java.lang.String str6 = cSVFormat1.toString();
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("hi!,,hi!,,hi!,hi!", cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Delimiter=<,> QuoteChar=<\">" + "'", str6, "Delimiter=<,> QuoteChar=<\">");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = null;
        org.apache.commons.csv.CSVLexer cSVLexer3 = new org.apache.commons.csv.CSVLexer(cSVFormat0, extendedBufferedReader2);
        boolean boolean5 = cSVLexer3.isEndOfFile((int) '\n');
        boolean boolean7 = cSVLexer3.isDelimiter(0);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = org.apache.commons.csv.CSVFormat.newBuilder(cSVFormat0);
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = null;
        org.apache.commons.csv.CSVLexer cSVLexer4 = new org.apache.commons.csv.CSVLexer(cSVFormat0, extendedBufferedReader3);
        boolean boolean6 = cSVLexer4.readEndOfLine((int) (byte) 100);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVLexer4.format;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = null;
        org.apache.commons.csv.CSVLexer cSVLexer9 = new org.apache.commons.csv.CSVLexer(cSVFormat7, extendedBufferedReader8);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = null;
        org.apache.commons.csv.CSVLexer cSVLexer3 = new org.apache.commons.csv.CSVLexer(cSVFormat0, extendedBufferedReader2);
        boolean boolean5 = cSVLexer3.isWhitespace(6);
        java.lang.StringBuilder stringBuilder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVLexer3.trimTrailingSpaces(stringBuilder6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = null;
        org.apache.commons.csv.CSVLexer cSVLexer3 = new org.apache.commons.csv.CSVLexer(cSVFormat0, extendedBufferedReader2);
        java.lang.String[] strArray4 = cSVFormat0.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        boolean boolean12 = cSVLexer5.isEscape(0);
        boolean boolean14 = cSVLexer5.readEndOfLine((int) (byte) 1);
        boolean boolean15 = cSVLexer5.ignoreEmptyLines;
        boolean boolean17 = cSVLexer5.isStartOfLine(10);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = cSVFormat1.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormatBuilder3.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = null;
        org.apache.commons.csv.CSVLexer cSVLexer6 = new org.apache.commons.csv.CSVLexer(cSVFormat4, extendedBufferedReader5);
        boolean boolean8 = cSVLexer6.isEscape(0);
        boolean boolean10 = cSVLexer6.isEscape(0);
        boolean boolean12 = cSVLexer6.isQuoteChar(1);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVLexer6.format;
        boolean boolean14 = cSVFormat0.equals((java.lang.Object) cSVFormat13);
        java.lang.String str15 = cSVFormat13.toString();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder16 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat13);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder18 = cSVFormatBuilder16.withEscape((java.lang.Character) '\\');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormatBuilder3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Delimiter=<,> QuoteChar=<\">" + "'", str15, "Delimiter=<,> QuoteChar=<\">");
        org.junit.Assert.assertNotNull(cSVFormatBuilder18);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = org.apache.commons.csv.CSVFormat.newBuilder(cSVFormat0);
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = null;
        org.apache.commons.csv.CSVLexer cSVLexer4 = new org.apache.commons.csv.CSVLexer(cSVFormat0, extendedBufferedReader3);
        boolean boolean6 = cSVLexer4.readEndOfLine(0);
        boolean boolean8 = cSVLexer4.isEndOfFile((int) (byte) 1);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVLexer4.format;
        java.lang.String str10 = cSVFormat9.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\r\n" + "'", str10, "\r\n");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVLexer5.format;
        boolean boolean12 = cSVLexer5.ignoreSurroundingSpaces;
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        boolean boolean12 = cSVLexer5.isQuoteChar((int) '\r');
        boolean boolean14 = cSVLexer5.isDelimiter((int) (short) 0);
        boolean boolean15 = cSVLexer5.ignoreEmptyLines;
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        boolean boolean12 = cSVLexer5.isStartOfLine((int) '\r');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVLexer5.format;
        java.io.Reader reader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.apache.commons.csv.CSVRecord> cSVRecordIterable15 = cSVFormat13.parse(reader14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape(0);
        boolean boolean11 = cSVLexer5.isQuoteChar((int) '\n');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVLexer5.format;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = null;
        org.apache.commons.csv.CSVLexer cSVLexer14 = new org.apache.commons.csv.CSVLexer(cSVFormat12, extendedBufferedReader13);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        boolean boolean12 = cSVLexer5.isQuoteChar((int) '\r');
        boolean boolean14 = cSVLexer5.isEscape((int) '\f');
        boolean boolean16 = cSVLexer5.isCommentStart((int) (short) -1);
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder18 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat17);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder19 = cSVFormat17.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormatBuilder19.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader21 = null;
        org.apache.commons.csv.CSVLexer cSVLexer22 = new org.apache.commons.csv.CSVLexer(cSVFormat20, extendedBufferedReader21);
        boolean boolean24 = cSVLexer22.isEscape(0);
        boolean boolean26 = cSVLexer22.isEscape(0);
        boolean boolean28 = cSVLexer22.isQuoteChar(1);
        org.apache.commons.csv.Token token29 = new org.apache.commons.csv.Token();
        org.apache.commons.csv.Token.Type type30 = org.apache.commons.csv.Token.Type.TOKEN;
        token29.type = type30;
        java.lang.StringBuilder stringBuilder32 = token29.content;
        cSVLexer22.trimTrailingSpaces(stringBuilder32);
        cSVLexer5.trimTrailingSpaces(stringBuilder32);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormatBuilder19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + type30 + "' != '" + org.apache.commons.csv.Token.Type.TOKEN + "'", type30.equals(org.apache.commons.csv.Token.Type.TOKEN));
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = null;
        org.apache.commons.csv.CSVLexer cSVLexer3 = new org.apache.commons.csv.CSVLexer(cSVFormat0, extendedBufferedReader2);
        boolean boolean5 = cSVLexer3.isEndOfFile((int) '\n');
        boolean boolean6 = cSVLexer3.ignoreEmptyLines;
        org.apache.commons.csv.Token token7 = new org.apache.commons.csv.Token();
        org.apache.commons.csv.Token.Type type8 = token7.type;
        java.lang.StringBuilder stringBuilder9 = token7.content;
        cSVLexer3.trimTrailingSpaces(stringBuilder9);
        boolean boolean12 = cSVLexer3.isEndOfFile((int) (byte) 10);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type8.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = cSVFormat1.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormatBuilder3.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = null;
        org.apache.commons.csv.CSVLexer cSVLexer6 = new org.apache.commons.csv.CSVLexer(cSVFormat4, extendedBufferedReader5);
        boolean boolean8 = cSVLexer6.isEscape(0);
        boolean boolean10 = cSVLexer6.isEscape(0);
        boolean boolean12 = cSVLexer6.isQuoteChar(1);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVLexer6.format;
        boolean boolean14 = cSVFormat0.equals((java.lang.Object) cSVFormat13);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder15 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat13);
        boolean boolean16 = cSVFormat13.isCommentingEnabled();
        boolean boolean17 = cSVFormat13.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormatBuilder3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.csv.Quote quote2 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\">", "hi!", "" };
        org.apache.commons.csv.CSVFormat cSVFormat13 = new org.apache.commons.csv.CSVFormat('\\', (java.lang.Character) '4', quote2, (java.lang.Character) 'a', (java.lang.Character) '4', false, true, "", "hi!", strArray12);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = null;
        org.apache.commons.csv.CSVLexer cSVLexer15 = new org.apache.commons.csv.CSVLexer(cSVFormat13, extendedBufferedReader14);
        boolean boolean16 = cSVLexer15.ignoreSurroundingSpaces;
        boolean boolean18 = cSVLexer15.isQuoteChar((int) '4');
        boolean boolean19 = cSVLexer15.ignoreSurroundingSpaces;
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape(0);
        boolean boolean11 = cSVLexer5.isQuoteChar(1);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVLexer5.format;
        boolean boolean13 = cSVLexer5.ignoreSurroundingSpaces;
        boolean boolean15 = cSVLexer5.readEndOfLine((int) (byte) 0);
        boolean boolean17 = cSVLexer5.isEndOfFile(100);
        org.apache.commons.csv.Token token18 = new org.apache.commons.csv.Token();
        org.apache.commons.csv.Token.Type type19 = token18.type;
        java.lang.String str20 = token18.toString();
        boolean boolean21 = token18.isReady;
        java.lang.String str22 = token18.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Token token23 = cSVLexer5.nextToken(token18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type19.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "INVALID []" + "'", str20, "INVALID []");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "INVALID []" + "'", str22, "INVALID []");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.toString();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = org.apache.commons.csv.CSVFormat.newBuilder(cSVFormat0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = null;
        org.apache.commons.csv.CSVLexer cSVLexer4 = new org.apache.commons.csv.CSVLexer(cSVFormat0, extendedBufferedReader3);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Delimiter=<,> QuoteChar=<\"> EmptyLines:ignored" + "'", str1, "Delimiter=<,> QuoteChar=<\"> EmptyLines:ignored");
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        boolean boolean12 = cSVLexer5.isStartOfLine((int) '\r');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = cSVLexer5.in;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = cSVLexer5.in;
        boolean boolean16 = cSVLexer5.isEndOfFile(10);
        boolean boolean18 = cSVLexer5.isWhitespace((int) (byte) 10);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(extendedBufferedReader13);
        org.junit.Assert.assertNull(extendedBufferedReader14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = org.apache.commons.csv.CSVFormat.newBuilder(cSVFormat0);
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = null;
        org.apache.commons.csv.CSVLexer cSVLexer4 = new org.apache.commons.csv.CSVLexer(cSVFormat0, extendedBufferedReader3);
        boolean boolean6 = cSVLexer4.readEndOfLine((int) (byte) 100);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVLexer4.format;
        org.apache.commons.csv.Token token8 = new org.apache.commons.csv.Token();
        org.apache.commons.csv.Token.Type type9 = token8.type;
        token8.isReady = false;
        boolean boolean12 = token8.isReady;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Token token13 = cSVLexer4.nextToken(token8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type9.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape(0);
        boolean boolean11 = cSVLexer5.isQuoteChar((int) (short) 1);
        boolean boolean13 = cSVLexer5.isQuoteChar(0);
        java.lang.StringBuilder stringBuilder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVLexer5.trimTrailingSpaces(stringBuilder14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.csv.Quote quote2 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\">", "hi!", "" };
        org.apache.commons.csv.CSVFormat cSVFormat13 = new org.apache.commons.csv.CSVFormat('\\', (java.lang.Character) '4', quote2, (java.lang.Character) 'a', (java.lang.Character) '4', false, true, "", "hi!", strArray12);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = null;
        org.apache.commons.csv.CSVLexer cSVLexer15 = new org.apache.commons.csv.CSVLexer(cSVFormat13, extendedBufferedReader14);
        boolean boolean16 = cSVLexer15.ignoreSurroundingSpaces;
        boolean boolean18 = cSVLexer15.isCommentStart((int) ',');
        boolean boolean19 = cSVLexer15.ignoreSurroundingSpaces;
        org.apache.commons.csv.Token token20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Token token21 = cSVLexer15.nextToken(token20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape(0);
        boolean boolean11 = cSVLexer5.isQuoteChar((int) '\n');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVLexer5.format;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = cSVLexer5.readEscape();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape(0);
        boolean boolean11 = cSVLexer5.isQuoteChar(1);
        org.apache.commons.csv.Token token12 = new org.apache.commons.csv.Token();
        org.apache.commons.csv.Token.Type type13 = org.apache.commons.csv.Token.Type.TOKEN;
        token12.type = type13;
        java.lang.StringBuilder stringBuilder15 = token12.content;
        cSVLexer5.trimTrailingSpaces(stringBuilder15);
        boolean boolean18 = cSVLexer5.readEndOfLine((int) '\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.apache.commons.csv.Token.Type.TOKEN + "'", type13.equals(org.apache.commons.csv.Token.Type.TOKEN));
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape(0);
        boolean boolean11 = cSVLexer5.readEndOfLine((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = cSVLexer5.readEscape();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        boolean boolean11 = cSVLexer5.ignoreSurroundingSpaces;
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = null;
        org.apache.commons.csv.CSVLexer cSVLexer3 = new org.apache.commons.csv.CSVLexer(cSVFormat0, extendedBufferedReader2);
        boolean boolean5 = cSVLexer3.isEndOfFile((int) '\n');
        boolean boolean7 = cSVLexer3.isEscape((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = cSVLexer3.readEscape();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = cSVFormat1.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormatBuilder3.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = null;
        org.apache.commons.csv.CSVLexer cSVLexer6 = new org.apache.commons.csv.CSVLexer(cSVFormat4, extendedBufferedReader5);
        boolean boolean8 = cSVLexer6.isEscape(0);
        boolean boolean10 = cSVLexer6.isEscape(0);
        boolean boolean12 = cSVLexer6.isQuoteChar(1);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVLexer6.format;
        boolean boolean14 = cSVFormat0.equals((java.lang.Object) cSVFormat13);
        boolean boolean15 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormatBuilder3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape(0);
        boolean boolean11 = cSVLexer5.isQuoteChar(1);
        boolean boolean13 = cSVLexer5.isWhitespace(10);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape(0);
        boolean boolean11 = cSVLexer5.isQuoteChar(1);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVLexer5.format;
        org.apache.commons.csv.Quote quote15 = null;
        org.apache.commons.csv.Quote quote24 = null;
        org.apache.commons.csv.Quote quote33 = null;
        org.apache.commons.csv.Quote quote42 = null;
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat56 = new org.apache.commons.csv.CSVFormat(' ', (java.lang.Character) '#', quote42, (java.lang.Character) '\r', (java.lang.Character) '#', false, true, "hi!", "", strArray55);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder57 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder('\"', (java.lang.Character) ',', quote33, (java.lang.Character) '\r', (java.lang.Character) '\\', true, true, "", "", strArray55);
        org.apache.commons.csv.Quote quote60 = null;
        org.apache.commons.csv.Quote quote69 = null;
        java.lang.String[] strArray82 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat83 = new org.apache.commons.csv.CSVFormat(' ', (java.lang.Character) '#', quote69, (java.lang.Character) '\r', (java.lang.Character) '#', false, true, "hi!", "", strArray82);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder84 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder('\"', (java.lang.Character) ',', quote60, (java.lang.Character) '\r', (java.lang.Character) '\\', true, true, "", "", strArray82);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder85 = cSVFormatBuilder57.withHeader(strArray82);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder86 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder('#', (java.lang.Character) '\b', quote24, (java.lang.Character) ',', (java.lang.Character) 'a', true, false, "\r\n", "", strArray82);
        org.apache.commons.csv.CSVFormat cSVFormat87 = new org.apache.commons.csv.CSVFormat('\\', (java.lang.Character) '4', quote15, (java.lang.Character) '#', (java.lang.Character) 'a', false, false, "", "\r\n", strArray82);
        java.lang.String str88 = cSVFormat12.format((java.lang.Object[]) strArray82);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder89 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(cSVFormatBuilder85);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!,,hi!,,hi!,hi!" + "'", str88, "hi!,,hi!,,hi!,hi!");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        boolean boolean12 = cSVLexer5.isStartOfLine((int) '\r');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = cSVLexer5.in;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = cSVLexer5.in;
        boolean boolean16 = cSVLexer5.isEndOfFile((int) '#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(extendedBufferedReader13);
        org.junit.Assert.assertNull(extendedBufferedReader14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape(0);
        boolean boolean11 = cSVLexer5.isQuoteChar(1);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVLexer5.format;
        org.apache.commons.csv.Quote quote15 = null;
        org.apache.commons.csv.Quote quote24 = null;
        org.apache.commons.csv.Quote quote33 = null;
        org.apache.commons.csv.Quote quote42 = null;
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat56 = new org.apache.commons.csv.CSVFormat(' ', (java.lang.Character) '#', quote42, (java.lang.Character) '\r', (java.lang.Character) '#', false, true, "hi!", "", strArray55);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder57 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder('\"', (java.lang.Character) ',', quote33, (java.lang.Character) '\r', (java.lang.Character) '\\', true, true, "", "", strArray55);
        org.apache.commons.csv.Quote quote60 = null;
        org.apache.commons.csv.Quote quote69 = null;
        java.lang.String[] strArray82 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat83 = new org.apache.commons.csv.CSVFormat(' ', (java.lang.Character) '#', quote69, (java.lang.Character) '\r', (java.lang.Character) '#', false, true, "hi!", "", strArray82);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder84 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder('\"', (java.lang.Character) ',', quote60, (java.lang.Character) '\r', (java.lang.Character) '\\', true, true, "", "", strArray82);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder85 = cSVFormatBuilder57.withHeader(strArray82);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder86 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder('#', (java.lang.Character) '\b', quote24, (java.lang.Character) ',', (java.lang.Character) 'a', true, false, "\r\n", "", strArray82);
        org.apache.commons.csv.CSVFormat cSVFormat87 = new org.apache.commons.csv.CSVFormat('\\', (java.lang.Character) '4', quote15, (java.lang.Character) '#', (java.lang.Character) 'a', false, false, "", "\r\n", strArray82);
        java.lang.String str88 = cSVFormat12.format((java.lang.Object[]) strArray82);
        java.lang.String str89 = cSVFormat12.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(cSVFormatBuilder85);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!,,hi!,,hi!,hi!" + "'", str88, "hi!,,hi!,,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Delimiter=<,> QuoteChar=<\">" + "'", str89, "Delimiter=<,> QuoteChar=<\">");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape(0);
        boolean boolean11 = cSVLexer5.readEndOfLine((int) 'a');
        org.apache.commons.csv.Token token12 = new org.apache.commons.csv.Token();
        org.apache.commons.csv.Token.Type type13 = token12.type;
        token12.isReady = false;
        boolean boolean16 = token12.isReady;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Token token17 = cSVLexer5.nextToken(token12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type13.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        boolean boolean12 = cSVLexer5.isQuoteChar((int) '\r');
        boolean boolean14 = cSVLexer5.isEscape((int) '\f');
        boolean boolean16 = cSVLexer5.isCommentStart((int) (short) -1);
        boolean boolean18 = cSVLexer5.isEndOfFile((int) (short) 10);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape(0);
        boolean boolean11 = cSVLexer5.isQuoteChar(1);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = cSVLexer5.getLineNumber();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        boolean boolean12 = cSVLexer5.isCommentStart((int) (short) 10);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape(0);
        boolean boolean11 = cSVLexer5.isQuoteChar(1);
        boolean boolean13 = cSVLexer5.isQuoteChar((int) '\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isCommentStart(1);
        boolean boolean12 = cSVLexer5.isQuoteChar((int) ',');
        org.apache.commons.csv.Token token13 = new org.apache.commons.csv.Token();
        org.apache.commons.csv.Token.Type type14 = token13.type;
        java.lang.String str15 = token13.toString();
        token13.isReady = false;
        java.lang.String str18 = token13.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Token token19 = cSVLexer5.nextToken(token13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type14.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "INVALID []" + "'", str15, "INVALID []");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "INVALID []" + "'", str18, "INVALID []");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.csv.Quote quote2 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\">", "hi!", "" };
        org.apache.commons.csv.CSVFormat cSVFormat13 = new org.apache.commons.csv.CSVFormat('\\', (java.lang.Character) '4', quote2, (java.lang.Character) 'a', (java.lang.Character) '4', false, true, "", "hi!", strArray12);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = null;
        org.apache.commons.csv.CSVLexer cSVLexer15 = new org.apache.commons.csv.CSVLexer(cSVFormat13, extendedBufferedReader14);
        boolean boolean16 = cSVLexer15.ignoreSurroundingSpaces;
        org.apache.commons.csv.Token token17 = new org.apache.commons.csv.Token();
        token17.isReady = false;
        org.apache.commons.csv.Token.Type type20 = org.apache.commons.csv.Token.Type.INVALID;
        token17.type = type20;
        org.apache.commons.csv.Token token22 = new org.apache.commons.csv.Token();
        org.apache.commons.csv.Token.Type type23 = token22.type;
        java.lang.String str24 = token22.toString();
        org.apache.commons.csv.Token.Type type25 = org.apache.commons.csv.Token.Type.EORECORD;
        token22.type = type25;
        token17.type = type25;
        java.lang.StringBuilder stringBuilder28 = token17.content;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Token token29 = cSVLexer15.nextToken(token17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type20.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertTrue("'" + type23 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type23.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "INVALID []" + "'", str24, "INVALID []");
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + org.apache.commons.csv.Token.Type.EORECORD + "'", type25.equals(org.apache.commons.csv.Token.Type.EORECORD));
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        boolean boolean12 = cSVLexer5.isQuoteChar((int) '\r');
        boolean boolean14 = cSVLexer5.isEscape((int) '\f');
        boolean boolean15 = cSVLexer5.ignoreSurroundingSpaces;
        boolean boolean17 = cSVLexer5.isQuoteChar(6);
        boolean boolean18 = cSVLexer5.ignoreEmptyLines;
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.csv.Quote quote2 = null;
        org.apache.commons.csv.Quote quote11 = null;
        org.apache.commons.csv.Quote quote20 = null;
        org.apache.commons.csv.Quote quote29 = null;
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = new org.apache.commons.csv.CSVFormat(' ', (java.lang.Character) '#', quote29, (java.lang.Character) '\r', (java.lang.Character) '#', false, true, "hi!", "", strArray42);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder44 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder('\"', (java.lang.Character) ',', quote20, (java.lang.Character) '\r', (java.lang.Character) '\\', true, true, "", "", strArray42);
        org.apache.commons.csv.Quote quote47 = null;
        org.apache.commons.csv.Quote quote56 = null;
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat70 = new org.apache.commons.csv.CSVFormat(' ', (java.lang.Character) '#', quote56, (java.lang.Character) '\r', (java.lang.Character) '#', false, true, "hi!", "", strArray69);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder71 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder('\"', (java.lang.Character) ',', quote47, (java.lang.Character) '\r', (java.lang.Character) '\\', true, true, "", "", strArray69);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder72 = cSVFormatBuilder44.withHeader(strArray69);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder73 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder('#', (java.lang.Character) '\b', quote11, (java.lang.Character) ',', (java.lang.Character) 'a', true, false, "\r\n", "", strArray69);
        org.apache.commons.csv.CSVFormat cSVFormat74 = new org.apache.commons.csv.CSVFormat('\\', (java.lang.Character) '4', quote2, (java.lang.Character) '#', (java.lang.Character) 'a', false, false, "", "\r\n", strArray69);
        org.apache.commons.csv.Quote quote75 = cSVFormat74.getQuotePolicy();
        java.lang.String[] strArray76 = cSVFormat74.getHeader();
        java.lang.String[] strArray77 = cSVFormat74.getHeader();
        boolean boolean78 = cSVFormat74.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat79 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder80 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat79);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder81 = cSVFormat79.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat82 = cSVFormatBuilder81.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader83 = null;
        org.apache.commons.csv.CSVLexer cSVLexer84 = new org.apache.commons.csv.CSVLexer(cSVFormat82, extendedBufferedReader83);
        boolean boolean85 = cSVLexer84.ignoreEmptyLines;
        boolean boolean87 = cSVLexer84.isEndOfFile((int) (short) 10);
        boolean boolean89 = cSVLexer84.isEndOfFile(0);
        org.apache.commons.csv.CSVFormat cSVFormat90 = cSVLexer84.format;
        boolean boolean92 = cSVLexer84.isEscape((int) (short) 10);
        boolean boolean94 = cSVLexer84.isStartOfLine(100);
        boolean boolean95 = cSVLexer84.ignoreSurroundingSpaces;
        boolean boolean96 = cSVFormat74.equals((java.lang.Object) cSVLexer84);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(cSVFormatBuilder72);
        org.junit.Assert.assertNull(quote75);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(cSVFormat79);
        org.junit.Assert.assertNotNull(cSVFormatBuilder81);
        org.junit.Assert.assertNotNull(cSVFormat82);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(cSVFormat90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = org.apache.commons.csv.CSVFormat.newBuilder(cSVFormat0);
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = null;
        org.apache.commons.csv.CSVLexer cSVLexer4 = new org.apache.commons.csv.CSVLexer(cSVFormat0, extendedBufferedReader3);
        boolean boolean6 = cSVLexer4.readEndOfLine(0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = cSVLexer4.in;
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(extendedBufferedReader7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape(0);
        boolean boolean11 = cSVLexer5.isQuoteChar(1);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVLexer5.format;
        boolean boolean13 = cSVFormat12.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        boolean boolean12 = cSVLexer5.isQuoteChar((int) '\r');
        boolean boolean14 = cSVLexer5.isDelimiter((int) (short) 0);
        boolean boolean15 = cSVLexer5.ignoreSurroundingSpaces;
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape(0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = cSVLexer5.readEscape();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape(0);
        boolean boolean11 = cSVLexer5.isQuoteChar((int) (short) 1);
        boolean boolean13 = cSVLexer5.isQuoteChar(0);
        boolean boolean15 = cSVLexer5.isEndOfFile((int) ',');
        boolean boolean17 = cSVLexer5.isEndOfFile((int) (byte) 0);
        boolean boolean19 = cSVLexer5.isWhitespace((int) (byte) 10);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = cSVFormat1.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormatBuilder3.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = null;
        org.apache.commons.csv.CSVLexer cSVLexer6 = new org.apache.commons.csv.CSVLexer(cSVFormat4, extendedBufferedReader5);
        boolean boolean8 = cSVLexer6.isEscape(0);
        boolean boolean10 = cSVLexer6.isEscape(0);
        boolean boolean12 = cSVLexer6.isQuoteChar(1);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVLexer6.format;
        boolean boolean14 = cSVFormat0.equals((java.lang.Object) cSVFormat13);
        java.lang.String str15 = cSVFormat13.toString();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder16 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat13);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder18 = cSVFormatBuilder16.withCommentStart((java.lang.Character) '\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormatBuilder3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Delimiter=<,> QuoteChar=<\">" + "'", str15, "Delimiter=<,> QuoteChar=<\">");
        org.junit.Assert.assertNotNull(cSVFormatBuilder18);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = cSVFormat1.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormatBuilder3.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = null;
        org.apache.commons.csv.CSVLexer cSVLexer6 = new org.apache.commons.csv.CSVLexer(cSVFormat4, extendedBufferedReader5);
        boolean boolean8 = cSVLexer6.isEscape(0);
        boolean boolean10 = cSVLexer6.isEscape(0);
        boolean boolean12 = cSVLexer6.isQuoteChar(1);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVLexer6.format;
        boolean boolean14 = cSVFormat0.equals((java.lang.Object) cSVFormat13);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder15 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat13);
        boolean boolean16 = cSVFormat13.isCommentingEnabled();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = null;
        org.apache.commons.csv.CSVLexer cSVLexer18 = new org.apache.commons.csv.CSVLexer(cSVFormat13, extendedBufferedReader17);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader19 = cSVLexer18.in;
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormatBuilder3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(extendedBufferedReader19);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        boolean boolean12 = cSVLexer5.isStartOfLine((int) '\r');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVLexer5.format;
        java.lang.String str14 = cSVFormat13.getNullToString();
        java.lang.Character char15 = cSVFormat13.getEscape();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(char15);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        boolean boolean12 = cSVLexer5.isStartOfLine((int) '\r');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVLexer5.format;
        boolean boolean15 = cSVLexer5.isCommentStart((int) (short) -1);
        boolean boolean16 = cSVLexer5.ignoreEmptyLines;
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = cSVLexer5.in;
        boolean boolean8 = cSVLexer5.isEndOfFile((-1));
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(extendedBufferedReader6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape(0);
        boolean boolean11 = cSVLexer5.isQuoteChar(1);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVLexer5.format;
        org.apache.commons.csv.Quote quote15 = null;
        org.apache.commons.csv.Quote quote24 = null;
        org.apache.commons.csv.Quote quote33 = null;
        org.apache.commons.csv.Quote quote42 = null;
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat56 = new org.apache.commons.csv.CSVFormat(' ', (java.lang.Character) '#', quote42, (java.lang.Character) '\r', (java.lang.Character) '#', false, true, "hi!", "", strArray55);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder57 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder('\"', (java.lang.Character) ',', quote33, (java.lang.Character) '\r', (java.lang.Character) '\\', true, true, "", "", strArray55);
        org.apache.commons.csv.Quote quote60 = null;
        org.apache.commons.csv.Quote quote69 = null;
        java.lang.String[] strArray82 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat83 = new org.apache.commons.csv.CSVFormat(' ', (java.lang.Character) '#', quote69, (java.lang.Character) '\r', (java.lang.Character) '#', false, true, "hi!", "", strArray82);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder84 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder('\"', (java.lang.Character) ',', quote60, (java.lang.Character) '\r', (java.lang.Character) '\\', true, true, "", "", strArray82);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder85 = cSVFormatBuilder57.withHeader(strArray82);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder86 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder('#', (java.lang.Character) '\b', quote24, (java.lang.Character) ',', (java.lang.Character) 'a', true, false, "\r\n", "", strArray82);
        org.apache.commons.csv.CSVFormat cSVFormat87 = new org.apache.commons.csv.CSVFormat('\\', (java.lang.Character) '4', quote15, (java.lang.Character) '#', (java.lang.Character) 'a', false, false, "", "\r\n", strArray82);
        java.lang.String str88 = cSVFormat12.format((java.lang.Object[]) strArray82);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder89 = org.apache.commons.csv.CSVFormat.newBuilder(cSVFormat12);
        boolean boolean90 = cSVFormat12.getIgnoreSurroundingSpaces();
        java.lang.String str91 = cSVFormat12.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(cSVFormatBuilder85);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!,,hi!,,hi!,hi!" + "'", str88, "hi!,,hi!,,hi!,hi!");
        org.junit.Assert.assertNotNull(cSVFormatBuilder89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "Delimiter=<,> QuoteChar=<\">" + "'", str91, "Delimiter=<,> QuoteChar=<\">");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape(0);
        boolean boolean11 = cSVLexer5.isQuoteChar((int) '\n');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVLexer5.format;
        char char13 = cSVFormat12.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder15 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat14);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder16 = cSVFormat14.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormatBuilder16.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader18 = null;
        org.apache.commons.csv.CSVLexer cSVLexer19 = new org.apache.commons.csv.CSVLexer(cSVFormat17, extendedBufferedReader18);
        boolean boolean20 = cSVLexer19.ignoreEmptyLines;
        boolean boolean22 = cSVLexer19.isEndOfFile((int) (short) 10);
        boolean boolean24 = cSVLexer19.isEndOfFile(0);
        boolean boolean26 = cSVLexer19.isQuoteChar((int) '\r');
        boolean boolean28 = cSVLexer19.isDelimiter((int) (short) 0);
        boolean boolean30 = cSVLexer19.isCommentStart((int) (short) 10);
        boolean boolean31 = cSVFormat12.equals((java.lang.Object) cSVLexer19);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + ',' + "'", char13 == ',');
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormatBuilder16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.csv.Quote quote2 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\">", "hi!", "" };
        org.apache.commons.csv.CSVFormat cSVFormat13 = new org.apache.commons.csv.CSVFormat('\\', (java.lang.Character) '4', quote2, (java.lang.Character) 'a', (java.lang.Character) '4', false, true, "", "hi!", strArray12);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = null;
        org.apache.commons.csv.CSVLexer cSVLexer15 = new org.apache.commons.csv.CSVLexer(cSVFormat13, extendedBufferedReader14);
        boolean boolean17 = cSVLexer15.isEndOfFile(100);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader18 = cSVLexer15.in;
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(extendedBufferedReader18);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        boolean boolean12 = cSVLexer5.isEscape(0);
        boolean boolean14 = cSVLexer5.readEndOfLine((int) (byte) 1);
        boolean boolean15 = cSVLexer5.ignoreEmptyLines;
        boolean boolean17 = cSVLexer5.isDelimiter(0);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape(0);
        boolean boolean11 = cSVLexer5.isQuoteChar(1);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVLexer5.format;
        org.apache.commons.csv.Quote quote15 = null;
        org.apache.commons.csv.Quote quote24 = null;
        org.apache.commons.csv.Quote quote33 = null;
        org.apache.commons.csv.Quote quote42 = null;
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat56 = new org.apache.commons.csv.CSVFormat(' ', (java.lang.Character) '#', quote42, (java.lang.Character) '\r', (java.lang.Character) '#', false, true, "hi!", "", strArray55);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder57 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder('\"', (java.lang.Character) ',', quote33, (java.lang.Character) '\r', (java.lang.Character) '\\', true, true, "", "", strArray55);
        org.apache.commons.csv.Quote quote60 = null;
        org.apache.commons.csv.Quote quote69 = null;
        java.lang.String[] strArray82 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat83 = new org.apache.commons.csv.CSVFormat(' ', (java.lang.Character) '#', quote69, (java.lang.Character) '\r', (java.lang.Character) '#', false, true, "hi!", "", strArray82);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder84 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder('\"', (java.lang.Character) ',', quote60, (java.lang.Character) '\r', (java.lang.Character) '\\', true, true, "", "", strArray82);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder85 = cSVFormatBuilder57.withHeader(strArray82);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder86 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder('#', (java.lang.Character) '\b', quote24, (java.lang.Character) ',', (java.lang.Character) 'a', true, false, "\r\n", "", strArray82);
        org.apache.commons.csv.CSVFormat cSVFormat87 = new org.apache.commons.csv.CSVFormat('\\', (java.lang.Character) '4', quote15, (java.lang.Character) '#', (java.lang.Character) 'a', false, false, "", "\r\n", strArray82);
        java.lang.String str88 = cSVFormat12.format((java.lang.Object[]) strArray82);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder89 = org.apache.commons.csv.CSVFormat.newBuilder(cSVFormat12);
        boolean boolean90 = cSVFormat12.getIgnoreSurroundingSpaces();
        java.lang.Object[] objArray91 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str92 = cSVFormat12.format(objArray91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(cSVFormatBuilder85);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!,,hi!,,hi!,hi!" + "'", str88, "hi!,,hi!,,hi!,hi!");
        org.junit.Assert.assertNotNull(cSVFormatBuilder89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape(0);
        boolean boolean11 = cSVLexer5.isQuoteChar((int) '\n');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVLexer5.format;
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder14 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat13);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder15 = cSVFormat13.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormatBuilder15.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = null;
        org.apache.commons.csv.CSVLexer cSVLexer18 = new org.apache.commons.csv.CSVLexer(cSVFormat16, extendedBufferedReader17);
        boolean boolean20 = cSVLexer18.isEscape(0);
        boolean boolean22 = cSVLexer18.isEscape(0);
        boolean boolean24 = cSVLexer18.isQuoteChar(1);
        org.apache.commons.csv.Token token25 = new org.apache.commons.csv.Token();
        org.apache.commons.csv.Token.Type type26 = org.apache.commons.csv.Token.Type.TOKEN;
        token25.type = type26;
        java.lang.StringBuilder stringBuilder28 = token25.content;
        cSVLexer18.trimTrailingSpaces(stringBuilder28);
        cSVLexer5.trimTrailingSpaces(stringBuilder28);
        boolean boolean32 = cSVLexer5.isWhitespace((int) '\\');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormatBuilder15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + type26 + "' != '" + org.apache.commons.csv.Token.Type.TOKEN + "'", type26.equals(org.apache.commons.csv.Token.Type.TOKEN));
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = cSVFormat1.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormatBuilder3.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = null;
        org.apache.commons.csv.CSVLexer cSVLexer6 = new org.apache.commons.csv.CSVLexer(cSVFormat4, extendedBufferedReader5);
        boolean boolean8 = cSVLexer6.isEscape(0);
        boolean boolean10 = cSVLexer6.isEscape(0);
        boolean boolean12 = cSVLexer6.isQuoteChar(1);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVLexer6.format;
        boolean boolean14 = cSVFormat0.equals((java.lang.Object) cSVFormat13);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder15 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat13);
        boolean boolean16 = cSVFormat13.isCommentingEnabled();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = null;
        org.apache.commons.csv.CSVLexer cSVLexer18 = new org.apache.commons.csv.CSVLexer(cSVFormat13, extendedBufferedReader17);
        java.lang.String str19 = cSVFormat13.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormatBuilder3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Delimiter=<,> QuoteChar=<\">" + "'", str19, "Delimiter=<,> QuoteChar=<\">");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.csv.Quote quote2 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\">", "hi!", "" };
        org.apache.commons.csv.CSVFormat cSVFormat13 = new org.apache.commons.csv.CSVFormat('\\', (java.lang.Character) '4', quote2, (java.lang.Character) 'a', (java.lang.Character) '4', false, true, "", "hi!", strArray12);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = null;
        org.apache.commons.csv.CSVLexer cSVLexer15 = new org.apache.commons.csv.CSVLexer(cSVFormat13, extendedBufferedReader14);
        boolean boolean16 = cSVLexer15.ignoreSurroundingSpaces;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = cSVLexer15.readEscape();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVLexer5.format;
        boolean boolean13 = cSVLexer5.isEscape((int) (short) 10);
        boolean boolean15 = cSVLexer5.isStartOfLine(100);
        org.apache.commons.csv.Token token16 = new org.apache.commons.csv.Token();
        token16.isReady = false;
        org.apache.commons.csv.Token.Type type19 = org.apache.commons.csv.Token.Type.INVALID;
        token16.type = type19;
        org.apache.commons.csv.Token token21 = new org.apache.commons.csv.Token();
        org.apache.commons.csv.Token.Type type22 = token21.type;
        java.lang.String str23 = token21.toString();
        org.apache.commons.csv.Token.Type type24 = org.apache.commons.csv.Token.Type.EORECORD;
        token21.type = type24;
        token16.type = type24;
        boolean boolean27 = token16.isReady;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Token token28 = cSVLexer5.nextToken(token16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type19.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type22.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "INVALID []" + "'", str23, "INVALID []");
        org.junit.Assert.assertTrue("'" + type24 + "' != '" + org.apache.commons.csv.Token.Type.EORECORD + "'", type24.equals(org.apache.commons.csv.Token.Type.EORECORD));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape(0);
        boolean boolean11 = cSVLexer5.isQuoteChar((int) (short) 1);
        boolean boolean13 = cSVLexer5.isQuoteChar((int) (byte) 100);
        org.apache.commons.csv.Token token14 = new org.apache.commons.csv.Token();
        org.apache.commons.csv.Token.Type type15 = token14.type;
        java.lang.String str16 = token14.toString();
        boolean boolean17 = token14.isReady;
        java.lang.String str18 = token14.toString();
        java.lang.StringBuilder stringBuilder19 = token14.content;
        cSVLexer5.trimTrailingSpaces(stringBuilder19);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type15.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "INVALID []" + "'", str16, "INVALID []");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "INVALID []" + "'", str18, "INVALID []");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        boolean boolean12 = cSVLexer5.isStartOfLine((int) '\r');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = cSVLexer5.in;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = cSVLexer5.in;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = cSVLexer5.getLineNumber();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(extendedBufferedReader13);
        org.junit.Assert.assertNull(extendedBufferedReader14);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        boolean boolean12 = cSVLexer5.isQuoteChar((int) '\r');
        boolean boolean14 = cSVLexer5.isEscape((int) '\f');
        boolean boolean16 = cSVLexer5.isCommentStart((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = cSVLexer5.readEscape();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        boolean boolean12 = cSVLexer5.isEscape(0);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVLexer5.format;
        boolean boolean15 = cSVLexer5.isWhitespace((int) '\\');
        boolean boolean17 = cSVLexer5.isWhitespace((int) '\f');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = cSVFormat1.toBuilder();
        boolean boolean4 = cSVFormat1.isCommentingEnabled();
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("[]", cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormatBuilder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        boolean boolean12 = cSVLexer5.isQuoteChar((int) '\r');
        boolean boolean14 = cSVLexer5.isEscape((int) '\f');
        boolean boolean16 = cSVLexer5.isCommentStart(0);
        boolean boolean18 = cSVLexer5.isCommentStart((int) '\\');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEndOfFile((int) (short) 100);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        boolean boolean12 = cSVLexer5.isEscape(0);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVLexer5.format;
        boolean boolean15 = cSVLexer5.isCommentStart((int) '4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape((int) '#');
        boolean boolean11 = cSVLexer5.isWhitespace(6);
        boolean boolean13 = cSVLexer5.isEndOfFile(0);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        boolean boolean12 = cSVLexer5.isStartOfLine((int) '\r');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVLexer5.format;
        java.lang.String str14 = cSVFormat13.getNullToString();
        java.lang.String[] strArray15 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "", (long) (byte) 100);
        boolean boolean20 = cSVRecord19.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord19.spliterator();
        boolean boolean22 = cSVRecord19.isConsistent();
        boolean boolean23 = cSVRecord19.isConsistent();
        long long24 = cSVRecord19.getRecordNumber();
        long long25 = cSVRecord19.getRecordNumber();
        boolean boolean26 = cSVFormat13.equals((java.lang.Object) cSVRecord19);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean7 = cSVLexer5.isEscape(0);
        boolean boolean9 = cSVLexer5.isEscape((int) '#');
        boolean boolean10 = cSVLexer5.ignoreEmptyLines;
        java.lang.Class<?> wildcardClass11 = cSVLexer5.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = cSVFormat0.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormatBuilder2.build();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.CSVLexer cSVLexer5 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader4);
        boolean boolean6 = cSVLexer5.ignoreEmptyLines;
        boolean boolean8 = cSVLexer5.isEndOfFile((int) (short) 10);
        boolean boolean10 = cSVLexer5.isEndOfFile(0);
        boolean boolean12 = cSVLexer5.isEscape(0);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVLexer5.format;
        java.io.Reader reader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.apache.commons.csv.CSVRecord> cSVRecordIterable15 = cSVFormat13.parse(reader14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormatBuilder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder1 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = null;
        org.apache.commons.csv.CSVLexer cSVLexer3 = new org.apache.commons.csv.CSVLexer(cSVFormat0, extendedBufferedReader2);
        boolean boolean5 = cSVLexer3.isEndOfFile((int) '\n');
        boolean boolean6 = cSVLexer3.ignoreEmptyLines;
        org.apache.commons.csv.Token token7 = new org.apache.commons.csv.Token();
        org.apache.commons.csv.Token.Type type8 = token7.type;
        java.lang.StringBuilder stringBuilder9 = token7.content;
        cSVLexer3.trimTrailingSpaces(stringBuilder9);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = cSVLexer3.readEscape();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type8.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }
}


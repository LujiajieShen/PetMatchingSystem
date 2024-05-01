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
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.io.Reader reader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.apache.commons.csv.CSVRecord> cSVRecordIterable2 = cSVFormat0.parse(reader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser1 = new org.apache.commons.csv.CSVParser(reader0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        char char3 = cSVFormat1.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        boolean boolean11 = cSVFormat1.isSurroundingSpacesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat12);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor14 = cSVParser13.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVRecordItor14);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSurroundingSpacesIgnored(true);
        java.lang.String[] strArray20 = cSVFormat17.getHeader();
        boolean boolean21 = cSVFormat17.isEncapsulating();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray14, strMap18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord19.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withLineSeparator("hi!");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat12);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator14 = cSVParser13.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor15 = cSVParser13.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator14);
        org.junit.Assert.assertNotNull(cSVRecordItor15);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.lang.String str4 = cSVFormat1.getLineSeparator();
        char char5 = cSVFormat1.getEscape();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\ufffe' + "'", char5 == '\ufffe');
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentStart(' ');
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("\"\",,,hi!,hi!,", cSVFormat3);
        int int7 = cSVParser6.getLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSurroundingSpacesIgnored(true);
        boolean boolean20 = cSVFormat19.isEncapsulating();
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat19.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The encapsulator character and the delimiter cannot be the same (\"#\")");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSurroundingSpacesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withDelimiter('4');
        char char22 = cSVFormat21.getEscape();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + ' ' + "'", char22 == ' ');
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.io.Reader reader0 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "\"\"   hi! hi!", "hi!", "", "\"\"   hi! hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat13 = new org.apache.commons.csv.CSVFormat('#', '\"', '\ufffe', '4', false, true, "hi!", strArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withLineSeparator("hi!");
        char char20 = cSVFormat17.getDelimiter();
        boolean boolean21 = cSVFormat17.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '#' + "'", char20 == '#');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat0.withDelimiter('a');
        java.lang.Class<?> wildcardClass16 = cSVFormat0.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withLineSeparator("hi!");
        char char20 = cSVFormat17.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withSurroundingSpacesIgnored(true);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '#' + "'", char20 == '#');
        org.junit.Assert.assertNotNull(cSVFormat22);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        java.io.Reader reader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.apache.commons.csv.CSVRecord> cSVRecordIterable4 = cSVFormat1.parse(reader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("", cSVFormat6);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withHeader(strArray9);
        java.lang.String str11 = cSVFormat2.format(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withHeader(strArray9);
        cSVFormat12.validate();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        char char3 = cSVFormat1.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        boolean boolean11 = cSVFormat1.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        int int3 = cSVParser2.getLineNumber();
        int int4 = cSVParser2.getLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser2.getRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(cSVRecord5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEncapsulator('4');
        boolean boolean14 = cSVFormat11.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withEmptyLinesIgnored(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat12);
        int int14 = cSVParser13.getLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord15 = cSVParser13.getRecord();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord15.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(cSVRecord15);
        org.junit.Assert.assertNotNull(strItor16);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        cSVFormat11.validate();
        char char13 = cSVFormat11.getDelimiter();
        java.lang.String str14 = cSVFormat11.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + ' ' + "'", char13 == ' ');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=< > Encapsulator=<\"> EmptyLines:ignored" + "'", str14, "Delimiter=< > Encapsulator=<\"> EmptyLines:ignored");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        boolean boolean3 = cSVFormat1.isEmptyLinesIgnored();
        char char4 = cSVFormat1.getEscape();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\ufffe' + "'", char4 == '\ufffe');
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray14, strMap18);
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord19.spliterator();
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord19.iterator();
        java.lang.String str22 = cSVRecord19.toString();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[hi!]" + "'", str22, "[hi!]");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        char char10 = cSVFormat0.getDelimiter();
        char char11 = cSVFormat0.getEncapsulator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ',' + "'", char10 == ',');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat12);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList14 = cSVParser13.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVRecordList14);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', ' ', ' ', 'a', true, true, "\"\",,,hi!,hi!,", strArray14);
        char char18 = cSVFormat17.getEncapsulator();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + ' ' + "'", char18 == ' ');
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withDelimiter('4');
        char char22 = cSVFormat21.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '4' + "'", char22 == '4');
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("", cSVFormat2);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withHeader(strArray5);
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", cSVFormat6);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser7.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser7.spliterator();
        int int10 = cSVParser7.getLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVRecordList8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        char char7 = cSVFormat5.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser10 = new org.apache.commons.csv.CSVParser("", cSVFormat9);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withHeader(strArray12);
        java.lang.String str14 = cSVFormat5.format(strArray12);
        java.lang.String str15 = cSVFormat0.format(strArray12);
        java.lang.String[] strArray16 = cSVFormat0.getHeader();
        java.lang.String str17 = cSVFormat0.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\"' + "'", char7 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Delimiter=<,> Encapsulator=<\">" + "'", str17, "Delimiter=<,> Encapsulator=<\">");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat0.withDelimiter('a');
        boolean boolean16 = cSVFormat15.isEmptyLinesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser19 = new org.apache.commons.csv.CSVParser("", cSVFormat18);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withHeader(strArray21);
        java.lang.String str23 = cSVFormat14.format(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat14.withDelimiter(' ');
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "", "hi!", "hi!", "" };
        java.lang.String str33 = cSVFormat25.format(strArray32);
        java.lang.String str34 = cSVFormat13.format(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat13.withSurroundingSpacesIgnored(false);
        char char37 = cSVFormat36.getEscape();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"\"   hi! hi!" + "'", str33, "\"\"   hi! hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"\",,,hi!,hi!," + "'", str34, "\"\",,,hi!,hi!,");
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + ' ' + "'", char37 == ' ');
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.lang.String[] strArray4 = cSVFormat1.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withLineSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withDelimiter(',');
        java.io.Reader reader22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.apache.commons.csv.CSVRecord> cSVRecordIterable23 = cSVFormat17.parse(reader22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The encapsulator character and the delimiter cannot be the same (\"#\")");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withLineSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withDelimiter(',');
        java.lang.String str22 = cSVFormat21.toString();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Delimiter=<,> Escape=< > Encapsulator=<#> CommentStart=<4> SurroundingSpaces:ignored" + "'", str22, "Delimiter=<,> Escape=< > Encapsulator=<#> CommentStart=<4> SurroundingSpaces:ignored");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser19 = new org.apache.commons.csv.CSVParser("", cSVFormat18);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withHeader(strArray21);
        java.lang.String str23 = cSVFormat14.format(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray21);
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray21, strMap25);
        org.apache.commons.csv.CSVFormat cSVFormat27 = new org.apache.commons.csv.CSVFormat('a', 'a', '\ufffe', 'a', false, false, "Delimiter=<4> Encapsulator=<\">", strArray21);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("", cSVFormat12);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        java.lang.String str17 = cSVFormat8.format(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withDelimiter('\"');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader21 = null;
        org.apache.commons.csv.CSVLexer cSVLexer22 = new org.apache.commons.csv.CSVLexer(cSVFormat18, extendedBufferedReader21);
        java.lang.String[] strArray23 = cSVFormat18.getHeader();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser24 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The encapsulator character and the delimiter cannot be the same (\"#\")");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat0.withDelimiter('a');
        java.lang.String str16 = cSVFormat15.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withEncapsulator(' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\r\n" + "'", str16, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray14, strMap18);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray14, strMap20);
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord21.iterator();
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord21.iterator();
        java.lang.Class<?> wildcardClass24 = strItor23.getClass();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSurroundingSpacesIgnored(true);
        java.lang.String[] strArray20 = cSVFormat17.getHeader();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21);
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord22.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = cSVRecord22.get((int) '\ufffe');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 65534");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strItor23);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.lang.String str4 = cSVFormat1.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('4');
        cSVFormat6.validate();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withCommentStart('4');
        boolean boolean10 = cSVFormat9.isEncapsulating();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        char char7 = cSVFormat5.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser10 = new org.apache.commons.csv.CSVParser("", cSVFormat9);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withHeader(strArray12);
        java.lang.String str14 = cSVFormat5.format(strArray12);
        java.lang.String str15 = cSVFormat0.format(strArray12);
        char char16 = cSVFormat0.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\"' + "'", char7 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\ufffe' + "'", char16 == '\ufffe');
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray14, strMap18);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray14, strMap20);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray14, strMap22);
        int int24 = cSVRecord23.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = cSVRecord23.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape(' ');
        char char14 = cSVFormat13.getDelimiter();
        java.lang.String[] strArray15 = cSVFormat13.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + ',' + "'", char14 == ',');
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.lang.String str4 = cSVFormat1.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('4');
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.apache.commons.csv.CSVRecord> cSVRecordIterable8 = cSVFormat1.parse(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withDelimiter('4');
        boolean boolean14 = cSVFormat13.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape(' ');
        char char14 = cSVFormat13.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withSurroundingSpacesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withEscape(' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + ',' + "'", char14 == ',');
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("", cSVFormat6);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withHeader(strArray9);
        java.lang.String str11 = cSVFormat2.format(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withHeader(strArray9);
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray9, strMap13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = cSVRecord14.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "", "hi!", "hi!", "" };
        java.lang.String str19 = cSVFormat11.format(strArray18);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray18, strMap20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = cSVRecord21.get("[hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\"   hi! hi!" + "'", str19, "\"\"   hi! hi!");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat17.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The encapsulator character and the delimiter cannot be the same (\"#\")");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("", cSVFormat2);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withHeader(strArray5);
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", cSVFormat6);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser7.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser7.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVRecordList8);
        org.junit.Assert.assertNotNull(cSVRecordList9);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSurroundingSpacesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withEscape('\ufffe');
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentStart(' ');
        char char6 = cSVFormat5.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = null;
        org.apache.commons.csv.CSVLexer cSVLexer8 = new org.apache.commons.csv.CSVLexer(cSVFormat5, extendedBufferedReader7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\ufffe' + "'", char6 == '\ufffe');
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord3 = cSVParser2.getRecord();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser2.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser2.getRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(cSVRecord3);
        org.junit.Assert.assertNotNull(cSVRecordItor4);
        org.junit.Assert.assertNull(cSVRecord5);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat12);
        int int14 = cSVParser13.getLineNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor15 = cSVParser13.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(cSVRecordItor15);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSurroundingSpacesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser34 = new org.apache.commons.csv.CSVParser("", cSVFormat33);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat33.withHeader(strArray36);
        java.lang.String str38 = cSVFormat29.format(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray36);
        java.util.Map<java.lang.String, java.lang.Integer> strMap40 = null;
        org.apache.commons.csv.CSVRecord cSVRecord41 = new org.apache.commons.csv.CSVRecord(strArray36, strMap40);
        java.util.Map<java.lang.String, java.lang.Integer> strMap42 = null;
        org.apache.commons.csv.CSVRecord cSVRecord43 = new org.apache.commons.csv.CSVRecord(strArray36, strMap42);
        java.util.Map<java.lang.String, java.lang.Integer> strMap44 = null;
        org.apache.commons.csv.CSVRecord cSVRecord45 = new org.apache.commons.csv.CSVRecord(strArray36, strMap44);
        java.util.Map<java.lang.String, java.lang.Integer> strMap46 = null;
        org.apache.commons.csv.CSVRecord cSVRecord47 = new org.apache.commons.csv.CSVRecord(strArray36, strMap46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = cSVFormat21.format(strArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the delimiter cannot be the same (\"4\")");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withEmptyLinesIgnored(false);
        boolean boolean12 = cSVFormat11.isCommentingEnabled();
        boolean boolean13 = cSVFormat11.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.lang.String str4 = cSVFormat1.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('4');
        cSVFormat6.validate();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withCommentStart('4');
        boolean boolean10 = cSVFormat6.isEmptyLinesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("", cSVFormat6);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withHeader(strArray9);
        java.lang.String str11 = cSVFormat2.format(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withHeader(strArray9);
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray9, strMap13);
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord14.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strSpliterator15);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withDelimiter('4');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = null;
        org.apache.commons.csv.CSVLexer cSVLexer15 = new org.apache.commons.csv.CSVLexer(cSVFormat0, extendedBufferedReader14);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = cSVLexer15.in;
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(extendedBufferedReader16);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        char char10 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withDelimiter('\ufffe');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ',' + "'", char10 == ',');
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat12);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator14 = cSVParser13.spliterator();
        org.apache.commons.csv.CSVRecord cSVRecord15 = cSVParser13.getRecord();
        java.lang.String str16 = cSVRecord15.toString();
        int int17 = cSVRecord15.size();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord15.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = cSVRecord15.get("\"\"   hi! hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator14);
        org.junit.Assert.assertNotNull(cSVRecord15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, , , hi!, hi!]" + "'", str16, "[, , , hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(strItor18);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean8 = cSVFormat7.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat7);
        java.lang.String str10 = cSVFormat7.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withDelimiter('4');
        cSVFormat12.validate();
        java.lang.String str14 = cSVFormat12.toString();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser17 = new org.apache.commons.csv.CSVParser("", cSVFormat16);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withHeader(strArray19);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat12.withHeader(strArray19);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap22);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat3.withHeader(strArray19);
        boolean boolean25 = cSVFormat3.isEmptyLinesIgnored();
        char char26 = cSVFormat3.getEncapsulator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\r\n" + "'", str10, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str14, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\"' + "'", char26 == '\"');
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean8 = cSVFormat7.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat7);
        java.lang.String str10 = cSVFormat7.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withDelimiter('4');
        cSVFormat12.validate();
        java.lang.String str14 = cSVFormat12.toString();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser17 = new org.apache.commons.csv.CSVParser("", cSVFormat16);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withHeader(strArray19);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat12.withHeader(strArray19);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap22);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat3.withHeader(strArray19);
        boolean boolean25 = cSVFormat24.isEncapsulating();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\r\n" + "'", str10, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str14, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray14, strMap18);
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord19.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord19.get("\"\"   hi! hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strSpliterator20);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withEmptyLinesIgnored(false);
        boolean boolean12 = cSVFormat11.isCommentingEnabled();
        java.lang.Class<?> wildcardClass13 = cSVFormat11.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withDelimiter('4');
        boolean boolean22 = cSVFormat21.isEmptyLinesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape(' ');
        char char14 = cSVFormat13.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withSurroundingSpacesIgnored(true);
        boolean boolean17 = cSVFormat16.isEmptyLinesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + ',' + "'", char14 == ',');
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("", cSVFormat2);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withHeader(strArray5);
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", cSVFormat6);
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser7.getRecord();
        java.lang.String[] strArray9 = cSVRecord8.values();
        java.lang.String[] strArray10 = cSVRecord8.values();
        java.lang.String str12 = cSVRecord8.get("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored");
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVRecord8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = null;
        org.apache.commons.csv.CSVLexer cSVLexer21 = new org.apache.commons.csv.CSVLexer(cSVFormat17, extendedBufferedReader20);
        boolean boolean23 = cSVLexer21.isEndOfFile((int) '\"');
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        cSVFormat0.validate();
        boolean boolean11 = cSVFormat0.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat12);
        int int14 = cSVParser13.getLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord15 = cSVParser13.getRecord();
        java.lang.String[] strArray16 = cSVRecord15.values();
        java.lang.String[] strArray17 = cSVRecord15.values();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(cSVRecord15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray14, strMap18);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray14, strMap20);
        java.lang.String str22 = cSVRecord21.toString();
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord21.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[hi!]" + "'", str22, "[hi!]");
        org.junit.Assert.assertNotNull(strSpliterator23);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSurroundingSpacesIgnored(true);
        boolean boolean20 = cSVFormat19.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withLineSeparator("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withLineSeparator("");
        java.lang.String str25 = cSVFormat24.toString();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Delimiter=<#> Escape=< > Encapsulator=<#> CommentStart=<4> SurroundingSpaces:ignored" + "'", str25, "Delimiter=<#> Escape=< > Encapsulator=<#> CommentStart=<4> SurroundingSpaces:ignored");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat1.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat1.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat1.withEmptyLinesIgnored(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser19 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser3.getRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVRecordItor4);
        org.junit.Assert.assertNotNull(cSVRecord5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("", cSVFormat2);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withHeader(strArray5);
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", cSVFormat6);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser7.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser7.getRecord();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVRecordList8);
        org.junit.Assert.assertNull(cSVRecord9);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSurroundingSpacesIgnored(true);
        java.lang.String[] strArray20 = cSVFormat17.getHeader();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21);
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap23);
        java.lang.String str25 = cSVRecord24.toString();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[hi!]" + "'", str25, "[hi!]");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser19 = new org.apache.commons.csv.CSVParser("", cSVFormat18);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withHeader(strArray21);
        java.lang.String str23 = cSVFormat14.format(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat14.withDelimiter(' ');
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "", "hi!", "hi!", "" };
        java.lang.String str33 = cSVFormat25.format(strArray32);
        java.lang.String str34 = cSVFormat13.format(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat13.withSurroundingSpacesIgnored(false);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader37 = null;
        org.apache.commons.csv.CSVLexer cSVLexer38 = new org.apache.commons.csv.CSVLexer(cSVFormat36, extendedBufferedReader37);
        boolean boolean39 = cSVLexer38.surroundingSpacesIgnored;
        org.apache.commons.csv.Token token40 = new org.apache.commons.csv.Token();
        token40.isReady = false;
        boolean boolean43 = token40.isReady;
        boolean boolean44 = token40.isReady;
        org.apache.commons.csv.Token token45 = token40.reset();
        org.apache.commons.csv.Token.Type type46 = token40.type;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Token token47 = cSVLexer38.nextToken(token40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"\"   hi! hi!" + "'", str33, "\"\"   hi! hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"\",,,hi!,hi!," + "'", str34, "\"\",,,hi!,hi!,");
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(token45);
        org.junit.Assert.assertTrue("'" + type46 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type46.equals(org.apache.commons.csv.Token.Type.INVALID));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSurroundingSpacesIgnored(true);
        boolean boolean20 = cSVFormat19.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withLineSeparator("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withLineSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat19.withEncapsulator('#');
        char char27 = cSVFormat19.getEscape();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + ' ' + "'", char27 == ' ');
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSurroundingSpacesIgnored(true);
        boolean boolean20 = cSVFormat19.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withLineSeparator("\r\n");
        char char23 = cSVFormat22.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '4' + "'", char23 == '4');
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat12);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator14 = cSVParser13.spliterator();
        org.apache.commons.csv.CSVRecord cSVRecord15 = cSVParser13.getRecord();
        java.lang.String str16 = cSVRecord15.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = cSVRecord15.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator14);
        org.junit.Assert.assertNotNull(cSVRecord15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, , , hi!, hi!]" + "'", str16, "[, , , hi!, hi!]");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withDelimiter('4');
        char char22 = cSVFormat21.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '4' + "'", char22 == '4');
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSurroundingSpacesIgnored(true);
        boolean boolean20 = cSVFormat19.isEncapsulating();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withSurroundingSpacesIgnored(true);
        boolean boolean23 = cSVFormat19.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat12);
        int int14 = cSVParser13.getLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord15 = cSVParser13.getRecord();
        java.lang.String[] strArray16 = cSVRecord15.values();
        java.lang.String str17 = cSVRecord15.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(cSVRecord15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, , , hi!, hi!]" + "'", str17, "[, , , hi!, hi!]");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser19 = new org.apache.commons.csv.CSVParser("", cSVFormat18);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withHeader(strArray21);
        java.lang.String str23 = cSVFormat14.format(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat14.withDelimiter(' ');
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "", "hi!", "hi!", "" };
        java.lang.String str33 = cSVFormat25.format(strArray32);
        java.lang.String str34 = cSVFormat13.format(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat13.withSurroundingSpacesIgnored(false);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader37 = null;
        org.apache.commons.csv.CSVLexer cSVLexer38 = new org.apache.commons.csv.CSVLexer(cSVFormat36, extendedBufferedReader37);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = cSVLexer38.readEscape(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"\"   hi! hi!" + "'", str33, "\"\"   hi! hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"\",,,hi!,hi!," + "'", str34, "\"\",,,hi!,hi!,");
        org.junit.Assert.assertNotNull(cSVFormat36);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser19 = new org.apache.commons.csv.CSVParser("", cSVFormat18);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withHeader(strArray21);
        java.lang.String str23 = cSVFormat14.format(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat14.withDelimiter(' ');
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "", "hi!", "hi!", "" };
        java.lang.String str33 = cSVFormat25.format(strArray32);
        java.lang.String str34 = cSVFormat13.format(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat13.withSurroundingSpacesIgnored(false);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader37 = null;
        org.apache.commons.csv.CSVLexer cSVLexer38 = new org.apache.commons.csv.CSVLexer(cSVFormat36, extendedBufferedReader37);
        boolean boolean39 = cSVLexer38.surroundingSpacesIgnored;
        org.apache.commons.csv.Token token40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Token token41 = cSVLexer38.nextToken(token40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"\"   hi! hi!" + "'", str33, "\"\"   hi! hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"\",,,hi!,hi!," + "'", str34, "\"\",,,hi!,hi!,");
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat12);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator14 = cSVParser13.spliterator();
        org.apache.commons.csv.CSVRecord cSVRecord15 = cSVParser13.getRecord();
        int int16 = cSVParser13.getLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList17 = cSVParser13.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList18 = cSVParser13.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator14);
        org.junit.Assert.assertNotNull(cSVRecord15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(cSVRecordList17);
        org.junit.Assert.assertNotNull(cSVRecordList18);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat12);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator14 = cSVParser13.spliterator();
        org.apache.commons.csv.CSVRecord cSVRecord15 = cSVParser13.getRecord();
        int int16 = cSVParser13.getLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList17 = cSVParser13.getRecords();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor18 = cSVParser13.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator14);
        org.junit.Assert.assertNotNull(cSVRecord15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(cSVRecordList17);
        org.junit.Assert.assertNotNull(cSVRecordItor18);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser19 = new org.apache.commons.csv.CSVParser("", cSVFormat18);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withHeader(strArray21);
        java.lang.String str23 = cSVFormat14.format(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = new org.apache.commons.csv.CSVFormat('#', ' ', ' ', 'a', true, true, "\"\",,,hi!,hi!,", strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat25 = new org.apache.commons.csv.CSVFormat('\ufffe', ' ', '\"', '\ufffe', true, true, "\"\",,,hi!,hi!,", strArray21);
        java.lang.String str26 = cSVFormat25.getLineSeparator();
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\",,,hi!,hi!," + "'", str26, "\"\",,,hi!,hi!,");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.String[] strArray11 = new java.lang.String[] { "\"\"   hi! hi!", "hi!", "", "\"\"   hi! hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat12 = new org.apache.commons.csv.CSVFormat('#', '\"', '\ufffe', '4', false, true, "hi!", strArray11);
        java.lang.String[] strArray13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser20 = new org.apache.commons.csv.CSVParser("", cSVFormat19);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat19.withHeader(strArray22);
        java.lang.String str24 = cSVFormat15.format(strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat14.withHeader(strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat14.withDelimiter('4');
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        char char6 = cSVFormat5.getCommentStart();
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.apache.commons.csv.CSVRecord> cSVRecordIterable8 = cSVFormat5.parse(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\ufffe' + "'", char6 == '\ufffe');
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.lang.String str4 = cSVFormat1.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('4');
        cSVFormat6.validate();
        java.lang.String str8 = cSVFormat6.toString();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = null;
        org.apache.commons.csv.CSVLexer cSVLexer10 = new org.apache.commons.csv.CSVLexer(cSVFormat6, extendedBufferedReader9);
        boolean boolean12 = cSVLexer10.isEscape((int) ',');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str8, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        java.lang.Class<?> wildcardClass12 = cSVFormat11.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.lang.String str4 = cSVFormat1.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('4');
        cSVFormat6.validate();
        java.lang.String str8 = cSVFormat6.toString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser11 = new org.apache.commons.csv.CSVParser("", cSVFormat10);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withHeader(strArray13);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap16);
        java.lang.String[] strArray18 = cSVRecord17.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord20.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str8, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray14, strMap18);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray14, strMap20);
        java.lang.String str22 = cSVRecord21.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = cSVRecord21.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[hi!]" + "'", str22, "[hi!]");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat12);
        java.lang.String[] strArray14 = cSVFormat12.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("", cSVFormat12);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        java.lang.String str17 = cSVFormat8.format(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withSurroundingSpacesIgnored(true);
        boolean boolean21 = cSVFormat20.isEncapsulating();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withSurroundingSpacesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withEncapsulator(',');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser26 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The encapsulator character and the delimiter cannot be the same (\"#\")");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("", cSVFormat12);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        java.lang.String str17 = cSVFormat8.format(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', ' ', ' ', 'a', true, true, "\"\",,,hi!,hi!,", strArray15);
        java.lang.String str19 = cSVFormat0.format(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat0.withEmptyLinesIgnored(false);
        java.lang.String[] strArray22 = cSVFormat0.getHeader();
        boolean boolean23 = cSVFormat0.isEmptyLinesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean6 = cSVFormat5.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat5);
        java.lang.String str8 = cSVFormat5.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withDelimiter('4');
        cSVFormat10.validate();
        java.lang.String str12 = cSVFormat10.toString();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser15 = new org.apache.commons.csv.CSVParser("", cSVFormat14);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat10.withHeader(strArray17);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap20);
        java.lang.String[] strArray22 = cSVRecord21.values();
        java.lang.String str23 = cSVFormat3.format(strArray22);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\r\n" + "'", str8, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str12, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("", cSVFormat12);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        java.lang.String str17 = cSVFormat8.format(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', ' ', ' ', 'a', true, true, "\"\",,,hi!,hi!,", strArray15);
        java.lang.String str19 = cSVFormat0.format(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat0.withEmptyLinesIgnored(false);
        java.lang.String[] strArray22 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat0.withEmptyLinesIgnored(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(cSVFormat24);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("", cSVFormat2);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withHeader(strArray5);
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", cSVFormat6);
        int int8 = cSVParser7.getLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray14, strMap18);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray14, strMap20);
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord21.iterator();
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord21.iterator();
        java.lang.String str24 = cSVRecord21.toString();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[hi!]" + "'", str24, "[hi!]");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat0.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat0.withEmptyLinesIgnored(false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withCommentStart('#');
        java.lang.Class<?> wildcardClass20 = cSVFormat19.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean9 = cSVFormat8.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser10 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat8);
        java.lang.String str11 = cSVFormat8.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withDelimiter('4');
        cSVFormat13.validate();
        java.lang.String str15 = cSVFormat13.toString();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser18 = new org.apache.commons.csv.CSVParser("", cSVFormat17);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withHeader(strArray20);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat13.withHeader(strArray20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = new org.apache.commons.csv.CSVFormat(',', '#', '\ufffe', '4', true, false, "Delimiter=<4> Encapsulator=<\">", strArray20);
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser36 = new org.apache.commons.csv.CSVParser("", cSVFormat35);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat35.withHeader(strArray38);
        java.lang.String str40 = cSVFormat31.format(strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat41 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withSurroundingSpacesIgnored(true);
        java.lang.String[] strArray44 = cSVFormat41.getHeader();
        java.util.Map<java.lang.String, java.lang.Integer> strMap45 = null;
        org.apache.commons.csv.CSVRecord cSVRecord46 = new org.apache.commons.csv.CSVRecord(strArray44, strMap45);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat23.withHeader(strArray44);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\r\n" + "'", str11, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str15, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(cSVFormat47);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("", cSVFormat12);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        java.lang.String str17 = cSVFormat8.format(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withLineSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withDelimiter(',');
        char char23 = cSVFormat22.getEscape();
        org.apache.commons.csv.CSVParser cSVParser24 = new org.apache.commons.csv.CSVParser("[, , , hi!, hi!]", cSVFormat22);
        char char25 = cSVFormat22.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + ' ' + "'", char23 == ' ');
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + ',' + "'", char25 == ',');
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat1.withDelimiter('4');
        org.apache.commons.csv.CSVParser cSVParser15 = new org.apache.commons.csv.CSVParser("\"\",,,hi!,hi!,", cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray14, strMap18);
        int int20 = cSVRecord19.size();
        java.lang.String str21 = cSVRecord19.toString();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[hi!]" + "'", str21, "[hi!]");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("", cSVFormat12);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        java.lang.String str17 = cSVFormat8.format(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', ' ', ' ', 'a', true, true, "\"\",,,hi!,hi!,", strArray15);
        java.lang.String str19 = cSVFormat0.format(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat0.withEmptyLinesIgnored(false);
        boolean boolean22 = cSVFormat21.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = null;
        org.apache.commons.csv.CSVLexer cSVLexer21 = new org.apache.commons.csv.CSVLexer(cSVFormat17, extendedBufferedReader20);
        org.apache.commons.csv.Token token22 = new org.apache.commons.csv.Token();
        token22.isReady = false;
        boolean boolean25 = token22.isReady;
        token22.isReady = false;
        org.apache.commons.csv.Token.Type type28 = token22.type;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Token token29 = cSVLexer21.nextToken(token22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + type28 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type28.equals(org.apache.commons.csv.Token.Type.INVALID));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray14, strMap18);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray14, strMap20);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray14, strMap22);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray14, strMap24);
        java.lang.String[] strArray26 = cSVRecord25.values();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("", cSVFormat6);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withHeader(strArray9);
        java.lang.String str11 = cSVFormat2.format(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withHeader(strArray9);
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray9, strMap13);
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord14.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord14.get("Delimiter=<#> Escape=< > Encapsulator=<#> CommentStart=<4> SurroundingSpaces:ignored");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strItor15);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSurroundingSpacesIgnored(true);
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat17.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The encapsulator character and the delimiter cannot be the same (\"#\")");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withLineSeparator("hi!");
        java.lang.String str20 = cSVFormat19.getLineSeparator();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape(' ');
        char char14 = cSVFormat13.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser27 = new org.apache.commons.csv.CSVParser("", cSVFormat26);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat26.withHeader(strArray29);
        java.lang.String str31 = cSVFormat22.format(strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray29);
        java.lang.String str33 = cSVFormat13.format(strArray29);
        java.lang.Class<?> wildcardClass34 = cSVFormat13.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + ',' + "'", char14 == ',');
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentStart(' ');
        char char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = null;
        org.apache.commons.csv.CSVLexer cSVLexer7 = new org.apache.commons.csv.CSVLexer(cSVFormat4, extendedBufferedReader6);
        boolean boolean8 = cSVFormat4.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean13 = cSVFormat12.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser14 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat12);
        java.lang.String str15 = cSVFormat12.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withDelimiter('4');
        cSVFormat17.validate();
        java.lang.String str19 = cSVFormat17.toString();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser22 = new org.apache.commons.csv.CSVParser("", cSVFormat21);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat21.withHeader(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat17.withHeader(strArray24);
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray24, strMap27);
        java.lang.String str29 = cSVFormat10.format(strArray24);
        boolean boolean30 = cSVFormat10.isEmptyLinesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\ufffe' + "'", char5 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\r\n" + "'", str15, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str19, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray14, strMap18);
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord19.spliterator();
        int int21 = cSVRecord19.size();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape(' ');
        char char14 = cSVFormat13.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withCommentStart('4');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withCommentStart(' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + ',' + "'", char14 == ',');
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray14, strMap18);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray14, strMap20);
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord21.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = cSVRecord21.get("Delimiter=< > Encapsulator=<\"> EmptyLines:ignored");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strSpliterator22);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.lang.String str4 = cSVFormat1.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('4');
        cSVFormat6.validate();
        java.lang.String str8 = cSVFormat6.toString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser11 = new org.apache.commons.csv.CSVParser("", cSVFormat10);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withHeader(strArray13);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap16);
        java.lang.String[] strArray18 = cSVRecord17.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19);
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord20.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str8, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strSpliterator21);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        char char3 = cSVFormat1.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withCommentStart('\ufffe');
        boolean boolean6 = cSVFormat1.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSurroundingSpacesIgnored(true);
        boolean boolean20 = cSVFormat19.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withLineSeparator("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withLineSeparator("[, , , hi!, hi!]");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape(' ');
        char char14 = cSVFormat13.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withSurroundingSpacesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withLineSeparator("[, , , hi!, hi!]");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + ',' + "'", char14 == ',');
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSurroundingSpacesIgnored(true);
        boolean boolean20 = cSVFormat19.isEncapsulating();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withSurroundingSpacesIgnored(true);
        java.lang.String[] strArray23 = cSVFormat22.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray14, strMap18);
        int int20 = cSVRecord19.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord19.get("Delimiter=<4> Encapsulator=<\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord3 = cSVParser2.getRecord();
        int int4 = cSVParser2.getLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser2.getRecords();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor6 = cSVParser2.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(cSVRecord3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(cSVRecordList5);
        org.junit.Assert.assertNotNull(cSVRecordItor6);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean8 = cSVFormat7.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat7);
        java.lang.String str10 = cSVFormat7.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withDelimiter('4');
        cSVFormat12.validate();
        java.lang.String str14 = cSVFormat12.toString();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser17 = new org.apache.commons.csv.CSVParser("", cSVFormat16);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withHeader(strArray19);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat12.withHeader(strArray19);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap22);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat3.withHeader(strArray19);
        boolean boolean25 = cSVFormat24.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\r\n" + "'", str10, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str14, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSurroundingSpacesIgnored(true);
        boolean boolean20 = cSVFormat19.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withLineSeparator("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withLineSeparator("");
        char char25 = cSVFormat19.getCommentStart();
        char char26 = cSVFormat19.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat41 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser46 = new org.apache.commons.csv.CSVParser("", cSVFormat45);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat45.withHeader(strArray48);
        java.lang.String str50 = cSVFormat41.format(strArray48);
        org.apache.commons.csv.CSVFormat cSVFormat51 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray48);
        java.lang.String[] strArray52 = cSVFormat51.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat53 = new org.apache.commons.csv.CSVFormat(' ', '#', '#', 'a', false, false, "", strArray52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = cSVFormat19.format(strArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The encapsulator character and the delimiter cannot be the same (\"#\")");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '4' + "'", char25 == '4');
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '#' + "'", char26 == '#');
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(strArray52);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEncapsulator('4');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withEscape('\"');
        char char16 = cSVFormat15.getEscape();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\"' + "'", char16 == '\"');
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        boolean boolean6 = cSVFormat5.isSurroundingSpacesIgnored();
        char char7 = cSVFormat5.getDelimiter();
        java.lang.String str8 = cSVFormat5.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + ',' + "'", char7 == ',');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<,> Encapsulator=<\"> EmptyLines:ignored" + "'", str8, "Delimiter=<,> Encapsulator=<\"> EmptyLines:ignored");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord3 = cSVParser2.getRecord();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser2.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser2.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(cSVRecord3);
        org.junit.Assert.assertNotNull(cSVRecordItor4);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        int int4 = cSVParser3.getLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = null;
        org.apache.commons.csv.CSVLexer cSVLexer21 = new org.apache.commons.csv.CSVLexer(cSVFormat17, extendedBufferedReader20);
        char char22 = cSVFormat17.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '#' + "'", char22 == '#');
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.lang.String str4 = cSVFormat1.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('4');
        cSVFormat6.validate();
        java.lang.String str8 = cSVFormat6.toString();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = null;
        org.apache.commons.csv.CSVLexer cSVLexer10 = new org.apache.commons.csv.CSVLexer(cSVFormat6, extendedBufferedReader9);
        boolean boolean12 = cSVLexer10.isEscape((-2));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str8, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.lang.String str4 = cSVFormat1.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('4');
        cSVFormat6.validate();
        java.lang.String str8 = cSVFormat6.toString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser11 = new org.apache.commons.csv.CSVParser("", cSVFormat10);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withHeader(strArray13);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap16);
        java.lang.Class<?> wildcardClass18 = cSVRecord17.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str8, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat12);
        int int14 = cSVParser13.getLineNumber();
        int int15 = cSVParser13.getLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord16 = cSVParser13.getRecord();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor17 = cSVParser13.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(cSVRecord16);
        org.junit.Assert.assertNotNull(cSVRecordItor17);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser29 = new org.apache.commons.csv.CSVParser("", cSVFormat28);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat28.withHeader(strArray31);
        java.lang.String str33 = cSVFormat24.format(strArray31);
        org.apache.commons.csv.CSVFormat cSVFormat34 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray31);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withSurroundingSpacesIgnored(true);
        java.lang.String[] strArray37 = cSVFormat34.getHeader();
        java.util.Map<java.lang.String, java.lang.Integer> strMap38 = null;
        org.apache.commons.csv.CSVRecord cSVRecord39 = new org.apache.commons.csv.CSVRecord(strArray37, strMap38);
        org.apache.commons.csv.CSVFormat cSVFormat40 = new org.apache.commons.csv.CSVFormat('a', ',', ' ', '4', false, false, "[, , , hi!, hi!]", strArray37);
        java.lang.String str41 = cSVFormat9.format(strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat42 = new org.apache.commons.csv.CSVFormat('a', '4', 'a', 'a', false, false, "Delimiter=<,> Encapsulator=<\">", strArray37);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("", cSVFormat12);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        java.lang.String str17 = cSVFormat8.format(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', ' ', ' ', 'a', true, true, "\"\",,,hi!,hi!,", strArray15);
        java.lang.String str19 = cSVFormat0.format(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat0.withEmptyLinesIgnored(false);
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser34 = new org.apache.commons.csv.CSVParser("", cSVFormat33);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat33.withHeader(strArray36);
        java.lang.String str38 = cSVFormat29.format(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray36);
        java.util.Map<java.lang.String, java.lang.Integer> strMap40 = null;
        org.apache.commons.csv.CSVRecord cSVRecord41 = new org.apache.commons.csv.CSVRecord(strArray36, strMap40);
        java.util.Map<java.lang.String, java.lang.Integer> strMap42 = null;
        org.apache.commons.csv.CSVRecord cSVRecord43 = new org.apache.commons.csv.CSVRecord(strArray36, strMap42);
        java.util.Iterator<java.lang.String> strItor44 = cSVRecord43.iterator();
        java.lang.String[] strArray45 = cSVRecord43.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap46 = null;
        org.apache.commons.csv.CSVRecord cSVRecord47 = new org.apache.commons.csv.CSVRecord(strArray45, strMap46);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat21.withHeader(strArray45);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(strItor44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(cSVFormat48);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = null;
        org.apache.commons.csv.CSVLexer cSVLexer4 = new org.apache.commons.csv.CSVLexer(cSVFormat1, extendedBufferedReader3);
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = null;
        org.apache.commons.csv.CSVLexer cSVLexer21 = new org.apache.commons.csv.CSVLexer(cSVFormat17, extendedBufferedReader20);
        java.lang.String[] strArray22 = cSVFormat17.getHeader();
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray22, strMap23);
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord24.iterator();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strItor25);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("Delimiter=<4> Encapsulator=<\">", cSVFormat1);
        int int3 = cSVParser2.getLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEncapsulator('4');
        char char14 = cSVFormat11.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withLineSeparator("\"\",,,hi!,hi!,");
        java.lang.String str17 = cSVFormat16.getLineSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\"' + "'", char14 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\",,,hi!,hi!," + "'", str17, "\"\",,,hi!,hi!,");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat1.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat1.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat1.withEmptyLinesIgnored(false);
        org.apache.commons.csv.CSVParser cSVParser19 = new org.apache.commons.csv.CSVParser("", cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.lang.String str4 = cSVFormat1.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('4');
        cSVFormat6.validate();
        java.lang.String str8 = cSVFormat6.toString();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = null;
        org.apache.commons.csv.CSVLexer cSVLexer10 = new org.apache.commons.csv.CSVLexer(cSVFormat6, extendedBufferedReader9);
        boolean boolean12 = cSVLexer10.isWhitespace((int) '\ufffe');
        boolean boolean14 = cSVLexer10.isWhitespace((int) (short) -1);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str8, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withEscape('\ufffe');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat17.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withLineSeparator("\r\n");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean9 = cSVFormat8.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser10 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat8);
        java.lang.String str11 = cSVFormat8.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withDelimiter('4');
        cSVFormat13.validate();
        java.lang.String str15 = cSVFormat13.toString();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser18 = new org.apache.commons.csv.CSVParser("", cSVFormat17);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withHeader(strArray20);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat13.withHeader(strArray20);
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap23);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat4.withHeader(strArray20);
        org.apache.commons.csv.CSVParser cSVParser26 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat4);
        java.io.Reader reader27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.apache.commons.csv.CSVRecord> cSVRecordIterable28 = cSVFormat4.parse(reader27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\r\n" + "'", str11, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str15, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat25);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withEscape('\ufffe');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat17.withSurroundingSpacesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withEncapsulator(',');
        java.io.Reader reader26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.apache.commons.csv.CSVRecord> cSVRecordIterable27 = cSVFormat25.parse(reader26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withEscape('\ufffe');
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat17.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The encapsulator character and the delimiter cannot be the same (\"#\")");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord3 = cSVParser2.getRecord();
        int int4 = cSVParser2.getLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser2.getRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(cSVRecord3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(cSVRecord5);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withEmptyLinesIgnored(false);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = null;
        org.apache.commons.csv.CSVLexer cSVLexer13 = new org.apache.commons.csv.CSVLexer(cSVFormat0, extendedBufferedReader12);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat12);
        int int14 = cSVParser13.getLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord15 = cSVParser13.getRecord();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor16 = cSVParser13.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(cSVRecord15);
        org.junit.Assert.assertNotNull(cSVRecordItor16);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        char char20 = cSVFormat19.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\"' + "'", char20 == '\"');
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat12);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator14 = cSVParser13.spliterator();
        org.apache.commons.csv.CSVRecord cSVRecord15 = cSVParser13.getRecord();
        java.lang.String str16 = cSVRecord15.toString();
        java.lang.String[] strArray17 = cSVRecord15.values();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator14);
        org.junit.Assert.assertNotNull(cSVRecord15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, , , hi!, hi!]" + "'", str16, "[, , , hi!, hi!]");
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean8 = cSVFormat7.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat7);
        java.lang.String str10 = cSVFormat7.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withDelimiter('4');
        cSVFormat12.validate();
        java.lang.String str14 = cSVFormat12.toString();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser17 = new org.apache.commons.csv.CSVParser("", cSVFormat16);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withHeader(strArray19);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat12.withHeader(strArray19);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap22);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat3.withHeader(strArray19);
        boolean boolean25 = cSVFormat3.isEmptyLinesIgnored();
        boolean boolean26 = cSVFormat3.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\r\n" + "'", str10, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str14, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat12);
        int int14 = cSVParser13.getLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord15 = cSVParser13.getRecord();
        java.lang.Class<?> wildcardClass16 = cSVParser13.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(cSVRecord15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat12);
        int int14 = cSVParser13.getLineNumber();
        int int15 = cSVParser13.getLineNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor16 = cSVParser13.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor17 = cSVParser13.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(cSVRecordItor16);
        org.junit.Assert.assertNotNull(cSVRecordItor17);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray14, strMap18);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray14, strMap20);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray14, strMap22);
        int int24 = cSVRecord23.size();
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord23.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(strSpliterator25);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser19 = new org.apache.commons.csv.CSVParser("", cSVFormat18);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withHeader(strArray21);
        java.lang.String str23 = cSVFormat14.format(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withLineSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat24.withDelimiter(',');
        java.lang.String[] strArray29 = cSVFormat24.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat30 = new org.apache.commons.csv.CSVFormat(' ', '4', ',', 'a', true, true, "[hi!]", strArray29);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(strArray29);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        char char3 = cSVFormat1.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord12 = new org.apache.commons.csv.CSVRecord(strArray8, strMap11);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("", cSVFormat12);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        java.lang.String str17 = cSVFormat8.format(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withSurroundingSpacesIgnored(true);
        boolean boolean21 = cSVFormat20.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withLineSeparator("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withLineSeparator("");
        char char26 = cSVFormat20.getCommentStart();
        char char27 = cSVFormat20.getDelimiter();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser28 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=<\">", cSVFormat20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The encapsulator character and the delimiter cannot be the same (\"#\")");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '4' + "'", char26 == '4');
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '#' + "'", char27 == '#');
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = null;
        org.apache.commons.csv.CSVLexer cSVLexer21 = new org.apache.commons.csv.CSVLexer(cSVFormat17, extendedBufferedReader20);
        java.lang.String[] strArray22 = cSVFormat17.getHeader();
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray22, strMap23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = cSVRecord24.get(5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat12);
        int int14 = cSVParser13.getLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord15 = cSVParser13.getRecord();
        int int16 = cSVParser13.getLineNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor17 = cSVParser13.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(cSVRecord15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(cSVRecordItor17);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.lang.String str4 = cSVFormat1.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('4');
        cSVFormat6.validate();
        java.lang.String str8 = cSVFormat6.toString();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = null;
        org.apache.commons.csv.CSVLexer cSVLexer10 = new org.apache.commons.csv.CSVLexer(cSVFormat6, extendedBufferedReader9);
        boolean boolean12 = cSVLexer10.isEndOfLine((-1));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str8, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEncapsulator('4');
        char char14 = cSVFormat11.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withLineSeparator("\"\",,,hi!,hi!,");
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat11.withEscape(',');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\"' + "'", char14 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSurroundingSpacesIgnored(true);
        boolean boolean20 = cSVFormat19.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withCommentStart(' ');
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("", cSVFormat2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray14, strMap18);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray14, strMap20);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray14, strMap22);
        int int24 = cSVRecord23.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = cSVRecord23.get("\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        int int3 = cSVParser2.getLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator4 = cSVParser2.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator4);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat0.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat0.withDelimiter('\ufffe');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter(',');
        java.lang.String str20 = cSVFormat17.getLineSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\r\n" + "'", str20, "\r\n");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList4 = cSVParser3.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVRecordList4);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("", cSVFormat2);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withHeader(strArray5);
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", cSVFormat6);
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser7.getRecord();
        java.lang.String[] strArray9 = cSVRecord8.values();
        java.lang.String str11 = cSVRecord8.get((int) (byte) 1);
        int int12 = cSVRecord8.size();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVRecord8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored" + "'", str11, "> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withEmptyLinesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withEmptyLinesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean8 = cSVFormat7.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("", cSVFormat12);
        char char14 = cSVFormat12.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser17 = new org.apache.commons.csv.CSVParser("", cSVFormat16);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withHeader(strArray19);
        java.lang.String str21 = cSVFormat12.format(strArray19);
        java.lang.String str22 = cSVFormat7.format(strArray19);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat2.withHeader(strArray19);
        char char24 = cSVFormat23.getEncapsulator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\"' + "'", char14 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\"' + "'", char24 == '\"');
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        char char12 = cSVFormat0.getCommentStart();
        java.lang.String str13 = cSVFormat0.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\ufffe' + "'", char12 == '\ufffe');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Delimiter=<,> Encapsulator=<\"> EmptyLines:ignored" + "'", str13, "Delimiter=<,> Encapsulator=<\"> EmptyLines:ignored");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("Delimiter=<4> Encapsulator=<\">", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList3 = cSVParser2.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator4 = cSVRecordList3.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVRecordList3);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator4);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = null;
        org.apache.commons.csv.CSVLexer cSVLexer21 = new org.apache.commons.csv.CSVLexer(cSVFormat17, extendedBufferedReader20);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = cSVLexer21.getLineNumber();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        int int3 = cSVParser2.getLineNumber();
        int int4 = cSVParser2.getLineNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser2.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("", cSVFormat12);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        java.lang.String str17 = cSVFormat8.format(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withEscape('\ufffe');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat18.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat18.withEmptyLinesIgnored(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser27 = new org.apache.commons.csv.CSVParser("Delimiter=<\t> Encapsulator=<\"> EmptyLines:ignored SurroundingSpaces:ignored", cSVFormat26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The encapsulator character and the delimiter cannot be the same (\"#\")");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSurroundingSpacesIgnored(true);
        boolean boolean20 = cSVFormat19.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withLineSeparator("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withLineSeparator("");
        char char25 = cSVFormat24.getEncapsulator();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '#' + "'", char25 == '#');
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat12);
        int int14 = cSVParser13.getLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord15 = cSVParser13.getRecord();
        java.lang.String[] strArray16 = cSVRecord15.values();
        java.lang.String str18 = cSVRecord15.get(1);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(cSVRecord15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withDelimiter('4');
        java.lang.String[] strArray27 = new java.lang.String[] { "Delimiter=<4> Encapsulator=<\">", "Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", "Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", "hi!", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat21.withHeader(strArray27);
        char char29 = cSVFormat21.getEscape();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + ' ' + "'", char29 == ' ');
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat1.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser20 = new org.apache.commons.csv.CSVParser("", cSVFormat19);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat19.withHeader(strArray22);
        java.lang.String str24 = cSVFormat15.format(strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat15.withDelimiter(' ');
        java.lang.String[] strArray33 = new java.lang.String[] { "", "", "", "hi!", "hi!", "" };
        java.lang.String str34 = cSVFormat26.format(strArray33);
        java.lang.String str35 = cSVFormat14.format(strArray33);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat14.withSurroundingSpacesIgnored(false);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withSurroundingSpacesIgnored(false);
        org.apache.commons.csv.CSVParser cSVParser40 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Escape=< > Encapsulator=<#> CommentStart=<4> SurroundingSpaces:ignored", cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"\"   hi! hi!" + "'", str34, "\"\"   hi! hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"\",,,hi!,hi!," + "'", str35, "\"\",,,hi!,hi!,");
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray14, strMap18);
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord19.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord19.spliterator();
        java.lang.String str22 = cSVRecord19.toString();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[hi!]" + "'", str22, "[hi!]");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentStart(' ');
        char char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = null;
        org.apache.commons.csv.CSVLexer cSVLexer7 = new org.apache.commons.csv.CSVLexer(cSVFormat4, extendedBufferedReader6);
        boolean boolean8 = cSVFormat4.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean13 = cSVFormat12.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser14 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat12);
        java.lang.String str15 = cSVFormat12.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withDelimiter('4');
        cSVFormat17.validate();
        java.lang.String str19 = cSVFormat17.toString();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser22 = new org.apache.commons.csv.CSVParser("", cSVFormat21);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat21.withHeader(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat17.withHeader(strArray24);
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray24, strMap27);
        java.lang.String str29 = cSVFormat10.format(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat10.withLineSeparator("Delimiter=< > Encapsulator=<\"> EmptyLines:ignored");
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withSurroundingSpacesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat31.withLineSeparator("Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\ufffe' + "'", char5 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\r\n" + "'", str15, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str19, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "", "hi!", "hi!", "" };
        java.lang.String str19 = cSVFormat11.format(strArray18);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray18, strMap20);
        java.lang.String[] strArray22 = cSVRecord21.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray22, strMap23);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\"   hi! hi!" + "'", str19, "\"\"   hi! hi!");
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEncapsulator('4');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withEscape('\"');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = null;
        org.apache.commons.csv.CSVLexer cSVLexer17 = new org.apache.commons.csv.CSVLexer(cSVFormat13, extendedBufferedReader16);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat12);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator14 = cSVParser13.spliterator();
        org.apache.commons.csv.CSVRecord cSVRecord15 = cSVParser13.getRecord();
        java.lang.String str16 = cSVRecord15.toString();
        int int17 = cSVRecord15.size();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord15.iterator();
        java.lang.String[] strArray19 = cSVRecord15.values();
        java.lang.String str21 = cSVRecord15.get((int) (byte) 1);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator14);
        org.junit.Assert.assertNotNull(cSVRecord15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, , , hi!, hi!]" + "'", str16, "[, , , hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        boolean boolean4 = cSVFormat1.isEmptyLinesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        char char18 = cSVFormat17.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withEscape('4');
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '4' + "'", char18 == '4');
        org.junit.Assert.assertNotNull(cSVFormat20);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = null;
        org.apache.commons.csv.CSVLexer cSVLexer21 = new org.apache.commons.csv.CSVLexer(cSVFormat17, extendedBufferedReader20);
        boolean boolean22 = cSVFormat17.isSurroundingSpacesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.lang.String str4 = cSVFormat1.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('4');
        cSVFormat1.validate();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = null;
        org.apache.commons.csv.CSVLexer cSVLexer21 = new org.apache.commons.csv.CSVLexer(cSVFormat17, extendedBufferedReader20);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVLexer21.format;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader23 = cSVLexer21.in;
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNull(extendedBufferedReader23);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentStart(' ');
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("\"\",,,hi!,hi!,", cSVFormat3);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withSurroundingSpacesIgnored(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser19 = new org.apache.commons.csv.CSVParser("", cSVFormat18);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withHeader(strArray21);
        java.lang.String str23 = cSVFormat14.format(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat14.withDelimiter(' ');
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "", "hi!", "hi!", "" };
        java.lang.String str33 = cSVFormat25.format(strArray32);
        java.lang.String str34 = cSVFormat13.format(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat13.withSurroundingSpacesIgnored(false);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader37 = null;
        org.apache.commons.csv.CSVLexer cSVLexer38 = new org.apache.commons.csv.CSVLexer(cSVFormat36, extendedBufferedReader37);
        boolean boolean40 = cSVLexer38.isEndOfFile((int) (byte) 0);
        boolean boolean42 = cSVLexer38.isEscape((int) '\"');
        boolean boolean44 = cSVLexer38.isCommentStart((int) (short) 0);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"\"   hi! hi!" + "'", str33, "\"\"   hi! hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"\",,,hi!,hi!," + "'", str34, "\"\",,,hi!,hi!,");
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.lang.String str4 = cSVFormat1.getLineSeparator();
        java.io.Reader reader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.apache.commons.csv.CSVRecord> cSVRecordIterable6 = cSVFormat1.parse(reader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        char char12 = cSVFormat11.getDelimiter();
        char char13 = cSVFormat11.getEscape();
        java.lang.String[] strArray25 = new java.lang.String[] { "\"\"   hi! hi!", "hi!", "", "\"\"   hi! hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat26 = new org.apache.commons.csv.CSVFormat('#', '\"', '\ufffe', '4', false, true, "hi!", strArray25);
        java.lang.String[] strArray27 = null;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser34 = new org.apache.commons.csv.CSVParser("", cSVFormat33);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat33.withHeader(strArray36);
        java.lang.String str38 = cSVFormat29.format(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat28.withHeader(strArray36);
        java.lang.String str40 = cSVFormat11.format(strArray36);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + ' ' + "'", char12 == ' ');
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\ufffe' + "'", char13 == '\ufffe');
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withDelimiter('4');
        java.io.Reader reader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.apache.commons.csv.CSVRecord> cSVRecordIterable15 = cSVFormat0.parse(reader14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray14, strMap18);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray14, strMap20);
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord21.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord21.spliterator();
        java.lang.String[] strArray24 = cSVRecord21.values();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertNotNull(strSpliterator23);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentStart(' ');
        char char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = null;
        org.apache.commons.csv.CSVLexer cSVLexer7 = new org.apache.commons.csv.CSVLexer(cSVFormat4, extendedBufferedReader6);
        boolean boolean8 = cSVFormat4.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean13 = cSVFormat12.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser14 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat12);
        java.lang.String str15 = cSVFormat12.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withDelimiter('4');
        cSVFormat17.validate();
        java.lang.String str19 = cSVFormat17.toString();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser22 = new org.apache.commons.csv.CSVParser("", cSVFormat21);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat21.withHeader(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat17.withHeader(strArray24);
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray24, strMap27);
        java.lang.String str29 = cSVFormat10.format(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat10.withSurroundingSpacesIgnored(true);
        java.lang.String str32 = cSVFormat31.getLineSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\ufffe' + "'", char5 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\r\n" + "'", str15, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str19, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\r\n" + "'", str32, "\r\n");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        java.lang.String str20 = cSVFormat17.toString();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Delimiter=<#> Escape=< > Encapsulator=<#> CommentStart=<4> SurroundingSpaces:ignored" + "'", str20, "Delimiter=<#> Escape=< > Encapsulator=<#> CommentStart=<4> SurroundingSpaces:ignored");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withEmptyLinesIgnored(false);
        boolean boolean12 = cSVFormat11.isEncapsulating();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray14, strMap18);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray14, strMap20);
        java.lang.String str22 = cSVRecord21.toString();
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord21.iterator();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[hi!]" + "'", str22, "[hi!]");
        org.junit.Assert.assertNotNull(strItor23);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        char char3 = cSVFormat1.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        char char11 = cSVFormat1.getDelimiter();
        cSVFormat1.validate();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + ',' + "'", char11 == ',');
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser18 = new org.apache.commons.csv.CSVParser("", cSVFormat17);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withHeader(strArray20);
        java.lang.String str22 = cSVFormat13.format(strArray20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray20);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray20, strMap24);
        java.util.Map<java.lang.String, java.lang.Integer> strMap26 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray20, strMap26);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord29 = new org.apache.commons.csv.CSVRecord(strArray20, strMap28);
        java.lang.String str30 = cSVFormat5.format(strArray20);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean8 = cSVFormat7.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat7);
        java.lang.String str10 = cSVFormat7.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withDelimiter('4');
        cSVFormat12.validate();
        java.lang.String str14 = cSVFormat12.toString();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser17 = new org.apache.commons.csv.CSVParser("", cSVFormat16);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withHeader(strArray19);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat12.withHeader(strArray19);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap22);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat3.withHeader(strArray19);
        boolean boolean25 = cSVFormat3.isEmptyLinesIgnored();
        char char26 = cSVFormat3.getEscape();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\r\n" + "'", str10, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str14, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + 'a' + "'", char26 == 'a');
    }
}


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
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        cSVFormat4.validate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        cSVFormat4.validate();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withRecordSeparator('\f');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withDelimiter('#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        java.io.Reader reader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = cSVFormat2.parse(reader4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.lang.Class<?> wildcardClass4 = cSVParser3.getClass();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord6 = cSVParser3.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withCommentStart((java.lang.Character) '\b');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray1 = cSVFormat0.getHeader();
        java.lang.String[] strArray8 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withHeader(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape(',');
        java.io.Reader reader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = cSVFormat9.parse(reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList6 = cSVParser3.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray3 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape('\"');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray12 = cSVFormat11.getHeader();
        java.lang.String[] strArray19 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat11.withHeader(strArray19);
        java.lang.String str21 = cSVFormat10.format((java.lang.Object[]) strArray19);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat10.withSkipHeaderRecord(false);
        java.lang.String[] strArray27 = new java.lang.String[] { "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"", "\r\n", "\u2028" };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat10.withHeader(strArray27);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser29 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str21, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(cSVFormat28);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('\"');
        boolean boolean7 = cSVFormat4.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray12 = cSVFormat11.getHeader();
        java.lang.String[] strArray19 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat11.withHeader(strArray19);
        java.lang.String str21 = cSVFormat10.format((java.lang.Object[]) strArray19);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat10.withSkipHeaderRecord(false);
        java.lang.String[] strArray27 = new java.lang.String[] { "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"", "\r\n", "\u2028" };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat10.withHeader(strArray27);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser29 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str21, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(cSVFormat28);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        java.lang.Character char7 = cSVFormat2.getQuoteChar();
        boolean boolean8 = cSVFormat2.getIgnoreSurroundingSpaces();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        cSVFormat4.validate();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withDelimiter('\b');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        cSVFormat4.validate();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray13 = cSVFormat12.getHeader();
        java.lang.String[] strArray20 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat12.withHeader(strArray20);
        java.lang.String str22 = cSVFormat11.format((java.lang.Object[]) strArray20);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat11.withEscape((java.lang.Character) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser25 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str22, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat24);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        org.apache.commons.csv.CSVRecord cSVRecord4 = cSVParser3.nextRecord();
        boolean boolean5 = cSVParser3.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList6 = cSVParser3.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVRecordList6.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecord4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVRecordList6);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter('\t');
        java.lang.String[] strArray9 = cSVFormat8.getHeader();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withRecordSeparator('a');
        boolean boolean8 = cSVFormat7.getSkipHeaderRecord();
        java.io.Reader reader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = cSVFormat7.parse(reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator("\205");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote4 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("0\tDelimiter=<,> QuoteChar=<\"> CommentStart=<\f> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\tfalse", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser7.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quote4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordList8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray12 = cSVFormat11.getHeader();
        java.lang.String[] strArray19 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat11.withHeader(strArray19);
        java.lang.String str21 = cSVFormat10.format((java.lang.Object[]) strArray19);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat10.withSkipHeaderRecord(false);
        java.lang.String[] strArray27 = new java.lang.String[] { "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"", "\r\n", "\u2028" };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat10.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withEscape((java.lang.Character) 'a');
        boolean boolean31 = cSVFormat28.getSkipHeaderRecord();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser32 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str21, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        boolean boolean7 = cSVFormat6.getIgnoreEmptyLines();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        cSVFormat4.validate();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray13 = cSVFormat12.getHeader();
        java.lang.String[] strArray20 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat12.withHeader(strArray20);
        java.lang.String str22 = cSVFormat11.format((java.lang.Object[]) strArray20);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat11.withSkipHeaderRecord(false);
        java.lang.String[] strArray28 = new java.lang.String[] { "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"", "\r\n", "\u2028" };
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat11.withHeader(strArray28);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser30 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str22, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(cSVFormat29);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser3.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser3.nextRecord();
        long long6 = cSVParser3.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor4);
        org.junit.Assert.assertNotNull(cSVRecord5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser3.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser3.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        boolean boolean4 = cSVFormat2.isEscaping();
        java.lang.String str5 = cSVFormat2.getNullString();
        java.lang.String str6 = cSVFormat2.toString();
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = cSVFormat2.parse(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str6, "Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentStart((java.lang.Character) 'a');
        java.lang.String str6 = cSVFormat3.toString();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withIgnoreEmptyLines(false);
        java.io.Reader reader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = cSVFormat12.parse(reader13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false" + "'", str6, "Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser3.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        boolean boolean7 = cSVFormat2.isQuoting();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        long long6 = cSVParser3.getRecordNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser3.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        boolean boolean4 = cSVParser3.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        long long6 = cSVParser3.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        cSVParser3.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord6 = cSVParser3.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        boolean boolean5 = cSVParser3.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser3.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser3.iterator();
        long long8 = cSVParser3.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("INVALID []", cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'format' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        org.apache.commons.csv.CSVRecord cSVRecord4 = cSVParser3.nextRecord();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser3.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList6 = cSVParser3.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecord4);
        org.junit.Assert.assertNotNull(cSVRecordList5);
        org.junit.Assert.assertNotNull(cSVRecordList6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser3.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser3.iterator();
        boolean boolean8 = cSVParser3.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat('#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        java.lang.String[] strArray6 = cSVFormat5.getHeader();
        boolean boolean7 = cSVFormat5.isNullHandling();
        boolean boolean8 = cSVFormat3.equals((java.lang.Object) boolean7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('4');
        java.io.Reader reader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser3 = cSVFormat1.parse(reader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        org.apache.commons.csv.CSVRecord cSVRecord4 = cSVParser3.nextRecord();
        boolean boolean5 = cSVParser3.isClosed();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor6 = cSVParser3.iterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecord4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVRecordItor6);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"", cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'format' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        long long6 = cSVParser3.getRecordNumber();
        cSVParser3.close();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        boolean boolean7 = cSVFormat6.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuoteChar((java.lang.Character) 'a');
        cSVFormat10.validate();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat10.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat10.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray21 = cSVFormat20.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withEscape('\"');
        boolean boolean26 = cSVFormat23.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat23.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat29.withIgnoreSurroundingSpaces(true);
        java.lang.Character char34 = cSVFormat33.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray36 = cSVFormat35.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat35.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withEscape('\"');
        java.lang.String[] strArray46 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat35.withHeader(strArray46);
        java.lang.String str48 = cSVFormat33.format((java.lang.Object[]) strArray46);
        java.lang.String str49 = cSVFormat28.format((java.lang.Object[]) strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat10.withHeader(strArray46);
        java.lang.String str51 = cSVFormat6.format((java.lang.Object[]) strArray46);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser52 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNull(char34);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNull(strArray36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str48, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str49, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\205 hi! hi! a\205a,a\r\na,a\r\na,\205,\205,a\r\nanull" + "'", str51, "\205 hi! hi! a\205a,a\r\na,a\r\na,\205,\205,a\r\nanull");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        cSVParser3.close();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser3.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat('\"');
        boolean boolean4 = cSVFormat3.isCommentingEnabled();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote4 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("0\tDelimiter=<,> QuoteChar=<\"> CommentStart=<\f> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\tfalse", cSVFormat1);
        org.apache.commons.csv.Quote quote8 = cSVFormat1.getQuotePolicy();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quote4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNull(quote8);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuoteChar((java.lang.Character) '#');
        java.lang.String str7 = cSVFormat1.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withCommentStart((java.lang.Character) '\\');
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> SkipHeaderRecord:false", cSVFormat1);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withCommentStart('\"');
        java.lang.String[] strArray13 = cSVFormat12.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\r\n" + "'", str7, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVParser10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        org.apache.commons.csv.CSVRecord cSVRecord4 = cSVParser3.nextRecord();
        boolean boolean5 = cSVParser3.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList6 = cSVParser3.getRecords();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser3.iterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecord4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVRecordList6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withDelimiter(' ');
        boolean boolean9 = cSVFormat8.isCommentingEnabled();
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("\u2029", cSVFormat8);
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser10.nextRecord();
        cSVParser10.close();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser10);
        org.junit.Assert.assertNotNull(cSVRecord11);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("\u2028", cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'format' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        boolean boolean5 = cSVParser3.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList6 = cSVParser3.getRecords();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser3.iterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVRecordList6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        java.lang.Character char7 = cSVFormat6.getCommentStart();
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withIgnoreEmptyLines(false);
        cSVFormat10.validate();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        cSVParser3.close();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList6 = cSVParser3.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor4);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        boolean boolean9 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEscape((java.lang.Character) ',');
        boolean boolean14 = cSVFormat11.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser15 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVParser15);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuoteChar((java.lang.Character) '#');
        java.lang.String str7 = cSVFormat1.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withCommentStart((java.lang.Character) '\\');
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> SkipHeaderRecord:false", cSVFormat1);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withCommentStart('\"');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat1.withCommentStart((java.lang.Character) '#');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\r\n" + "'", str7, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVParser10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        java.lang.Character char7 = cSVFormat2.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withQuoteChar((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withDelimiter('a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser16 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord6 = cSVParser3.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        boolean boolean5 = cSVParser3.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList6 = cSVParser3.getRecords();
        boolean boolean7 = cSVParser3.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVRecordList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        long long6 = cSVParser3.getRecordNumber();
        long long7 = cSVParser3.getCurrentLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser3.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withDelimiter('#');
        java.lang.Character char8 = cSVFormat3.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withIgnoreEmptyLines(true);
        boolean boolean11 = cSVFormat10.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withIgnoreEmptyLines(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter('a');
        boolean boolean9 = cSVFormat6.isEscaping();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser3.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'format' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withRecordSeparator("\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        java.lang.Character char7 = cSVFormat6.getCommentStart();
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat6);
        java.lang.String str9 = cSVFormat6.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\r\n" + "'", str9, "\r\n");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        long long5 = cSVParser3.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord6 = cSVParser3.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord7 = cSVParser3.nextRecord();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord6);
        org.junit.Assert.assertNotNull(cSVRecord7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        long long5 = cSVParser3.getCurrentLineNumber();
        long long6 = cSVParser3.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse("a\fa,\205,hi!,hi!,aaa\205aa,aa\r\naa,aa\r\naa,\205,\205,aa\r\naaa", cSVFormat4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVParser5);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        boolean boolean8 = cSVParser3.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser3.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter('\b');
        boolean boolean9 = cSVFormat6.getIgnoreSurroundingSpaces();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withDelimiter(' ');
        boolean boolean9 = cSVFormat8.isCommentingEnabled();
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("\u2029", cSVFormat8);
        cSVParser10.close();
        cSVParser10.close();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        boolean boolean6 = cSVFormat1.isQuoting();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cSVParser7);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('#');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.MINIMAL;
        java.lang.String[] strArray12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = new org.apache.commons.csv.CSVFormat(',', (java.lang.Character) '\"', quote5, (java.lang.Character) 'a', (java.lang.Character) ' ', false, false, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na", "\u2029", strArray12, false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser16 = org.apache.commons.csv.CSVParser.parse("0\tDelimiter=<,> QuoteChar=<\"> CommentStart=<\f> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\tfalse", cSVFormat15);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor17 = cSVParser16.iterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.MINIMAL + "'", quote5.equals(org.apache.commons.csv.Quote.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVParser16);
        org.junit.Assert.assertNotNull(cSVRecordItor17);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        boolean boolean6 = cSVParser3.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord7 = cSVParser3.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        long long5 = cSVParser3.getCurrentLineNumber();
        boolean boolean6 = cSVParser3.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote4 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("0\tDelimiter=<,> QuoteChar=<\"> CommentStart=<\f> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\tfalse", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser7.spliterator();
        long long9 = cSVParser7.getRecordNumber();
        long long10 = cSVParser7.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quote4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat8);
        long long10 = cSVParser9.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false", cSVFormat1);
        long long8 = cSVParser7.getRecordNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser7.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser3.spliterator();
        long long7 = cSVParser3.getRecordNumber();
        boolean boolean8 = cSVParser3.isClosed();
        long long9 = cSVParser3.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor6 = cSVParser3.iterator();
        cSVParser3.close();
        long long8 = cSVParser3.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNotNull(cSVRecordItor6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray11 = cSVFormat10.getHeader();
        java.lang.String[] strArray18 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat10.withHeader(strArray18);
        java.lang.String str20 = cSVFormat9.format((java.lang.Object[]) strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat9.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat9.withRecordSeparator("");
        java.io.Reader reader25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser26 = cSVFormat9.parse(reader25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str20, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        java.lang.Character char7 = cSVFormat6.getCommentStart();
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withEscape(',');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        org.apache.commons.csv.CSVRecord cSVRecord4 = cSVParser3.nextRecord();
        boolean boolean5 = cSVParser3.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList6 = cSVParser3.getRecords();
        long long7 = cSVParser3.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser3.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser3.nextRecord();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecord4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVRecordList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertNotNull(cSVRecordList8);
        org.junit.Assert.assertNull(cSVRecord9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        java.lang.Character char7 = cSVFormat6.getCommentStart();
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat6);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser8.iterator();
        boolean boolean10 = cSVParser8.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat8);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser9.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser9.nextRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertNull(cSVRecord11);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        cSVFormat4.validate();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withRecordSeparator('\f');
        boolean boolean8 = cSVFormat7.isEscaping();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = null;
        org.apache.commons.csv.Lexer lexer10 = new org.apache.commons.csv.Lexer(cSVFormat7, extendedBufferedReader9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('4');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withEscape(',');
        java.lang.Character char5 = cSVFormat4.getCommentStart();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > SkipHeaderRecord:false", cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVParser6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote4 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("0\tDelimiter=<,> QuoteChar=<\"> CommentStart=<\f> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\tfalse", cSVFormat1);
        boolean boolean8 = cSVParser7.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quote4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuoteChar((java.lang.Character) '#');
        java.lang.String str7 = cSVFormat1.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withCommentStart((java.lang.Character) '\\');
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> SkipHeaderRecord:false", cSVFormat1);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withNullString("#\205# #\r\n# #\r\n# \205 \205 #\r\n#");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\r\n" + "'", str7, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVParser10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withDelimiter('#');
        java.lang.Character char8 = cSVFormat3.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withQuoteChar((java.lang.Character) ',');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        cSVFormat4.validate();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withRecordSeparator('\f');
        boolean boolean8 = cSVFormat7.getSkipHeaderRecord();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        org.apache.commons.csv.CSVRecord cSVRecord4 = cSVParser3.nextRecord();
        boolean boolean5 = cSVParser3.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList6 = cSVParser3.getRecords();
        long long7 = cSVParser3.getCurrentLineNumber();
        long long8 = cSVParser3.getRecordNumber();
        long long9 = cSVParser3.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecord4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVRecordList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 4L + "'", long8 == 4L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter('\t');
        boolean boolean9 = cSVFormat8.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse("\u2028", cSVFormat8);
        cSVParser12.close();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVParser12);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        cSVParser3.close();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        cSVParser3.close();
        long long6 = cSVParser3.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote4 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("0\tDelimiter=<,> QuoteChar=<\"> CommentStart=<\f> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\tfalse", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser7.spliterator();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVRecordSpliterator8, "\f");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quote4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator8);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withRecordSeparator('\f');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser3.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser3.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote4 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("0\tDelimiter=<,> QuoteChar=<\"> CommentStart=<\f> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\tfalse", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser7.spliterator();
        boolean boolean9 = cSVParser7.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser7.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quote4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVRecordList10);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        java.lang.String[] strArray9 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(strArray9);
        java.lang.Character char11 = cSVFormat10.getEscape();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withQuoteChar((java.lang.Character) ',');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }
}


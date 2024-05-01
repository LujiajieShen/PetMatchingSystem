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
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser3.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
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
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
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
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser3.nextRecord();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withRecordSeparator('\f');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter('#');
        java.lang.String str9 = cSVFormat6.getRecordSeparator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\f" + "'", str9, "\f");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote4 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray6 = cSVFormat5.getHeader();
        java.lang.String[] strArray13 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat5.withHeader(strArray13);
        java.lang.String str15 = cSVFormat1.format((java.lang.Object[]) strArray13);
        boolean boolean16 = cSVFormat1.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat1.withEscape((java.lang.Character) '\t');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser19 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quote4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"" + "'", str15, "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        boolean boolean10 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat2.withNullString("\205");
        java.io.Reader reader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = cSVFormat12.parse(reader13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('\"');
        boolean boolean7 = cSVFormat4.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        boolean boolean10 = cSVFormat4.isCommentingEnabled();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        boolean boolean4 = cSVFormat2.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentStart((java.lang.Character) 'a');
        boolean boolean11 = cSVFormat10.isEscaping();
        boolean boolean12 = cSVFormat2.equals((java.lang.Object) boolean11);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withRecordSeparator('\f');
        boolean boolean7 = cSVFormat6.isEscaping();
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
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser3.spliterator();
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
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        java.lang.String[] strArray9 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(strArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("EOF []", cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: The header contains duplicate names: [?, ??, ??, ?, ?, ??]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray1 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('\"');
        boolean boolean6 = cSVFormat3.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        boolean boolean9 = cSVFormat3.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withRecordSeparator("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        java.io.Reader reader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = cSVFormat11.parse(reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        java.lang.String str10 = cSVFormat4.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withEscape('\b');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray3 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape('\"');
        boolean boolean8 = cSVFormat5.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        boolean boolean11 = cSVFormat5.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat5.withRecordSeparator("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        java.lang.String[] strArray9 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(strArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        cSVParser7.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser7.iterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser7.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        long long6 = cSVParser3.getRecordNumber();
        boolean boolean7 = cSVParser3.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        boolean boolean8 = cSVFormat4.isNullHandling();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('\"');
        boolean boolean7 = cSVFormat4.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote15 = cSVFormat12.getQuotePolicy();
        org.apache.commons.csv.Quote quote16 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withQuotePolicy(quote16);
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray25 = cSVFormat24.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat24.withEscape('\"');
        java.lang.String[] strArray35 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat24.withHeader(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat38 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote16, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray35, false);
        java.lang.String str39 = cSVFormat9.format((java.lang.Object[]) strArray35);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser40 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat9);
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
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(quote15);
        org.junit.Assert.assertTrue("'" + quote16 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote16.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str39, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray3 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withCommentStart((java.lang.Character) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser9.nextRecord();
        long long11 = cSVParser9.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertNull(cSVRecord10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withRecordSeparator('a');
        boolean boolean8 = cSVFormat2.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat11);
        boolean boolean13 = cSVFormat2.equals((java.lang.Object) cSVFormat11);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withEscape((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVParser12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cSVParser3.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray1 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('\"');
        boolean boolean6 = cSVFormat3.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        boolean boolean9 = cSVFormat3.isCommentingEnabled();
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = cSVFormat3.parse(reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser7.iterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser7.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
        org.junit.Assert.assertNotNull(cSVRecordList9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.csv.Quote quote4 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray12 = cSVFormat11.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withEscape('\"');
        boolean boolean17 = cSVFormat14.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote25 = cSVFormat22.getQuotePolicy();
        org.apache.commons.csv.Quote quote26 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withQuotePolicy(quote26);
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray35 = cSVFormat34.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat34.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat34.withEscape('\"');
        java.lang.String[] strArray45 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat34.withHeader(strArray45);
        org.apache.commons.csv.CSVFormat cSVFormat48 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote26, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray45, false);
        java.lang.String str49 = cSVFormat19.format((java.lang.Object[]) strArray45);
        org.apache.commons.csv.CSVFormat cSVFormat51 = new org.apache.commons.csv.CSVFormat('a', (java.lang.Character) ',', quote4, (java.lang.Character) 'a', (java.lang.Character) 'a', true, true, "\u2028", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> SkipHeaderRecord:false", strArray45, true);
        org.apache.commons.csv.CSVFormat cSVFormat58 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat58.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat58.withIgnoreSurroundingSpaces(true);
        java.lang.Character char63 = cSVFormat62.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat64 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray65 = cSVFormat64.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat64.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat64.withEscape('\"');
        java.lang.String[] strArray75 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat64.withHeader(strArray75);
        java.lang.String str77 = cSVFormat62.format((java.lang.Object[]) strArray75);
        org.apache.commons.csv.CSVFormat cSVFormat79 = new org.apache.commons.csv.CSVFormat(' ', (java.lang.Character) '#', quote4, (java.lang.Character) ' ', (java.lang.Character) ',', true, false, "", "", strArray75, false);
        java.io.Reader reader80 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser81 = cSVFormat79.parse(reader80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + quote4 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote4.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNull(quote25);
        org.junit.Assert.assertTrue("'" + quote26 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote26.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str49, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNull(char63);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertNull(strArray65);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str77, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        java.io.Reader reader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = cSVFormat1.parse(reader3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote4 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray6 = cSVFormat5.getHeader();
        java.lang.String[] strArray13 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat5.withHeader(strArray13);
        java.lang.String str15 = cSVFormat1.format((java.lang.Object[]) strArray13);
        boolean boolean16 = cSVFormat1.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat1.withEscape((java.lang.Character) '\t');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser19 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quote4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"" + "'", str15, "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
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
        boolean boolean24 = cSVFormat10.isEscaping();
        org.apache.commons.csv.CSVParser cSVParser25 = org.apache.commons.csv.CSVParser.parse("", cSVFormat10);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cSVParser25);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray3 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote12 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withQuotePolicy(quote12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + quote12 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote12.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser3.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser3.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord7 = cSVParser3.nextRecord();
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
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        cSVParser7.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser7.iterator();
        long long10 = cSVParser7.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser3.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"", cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'format' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        boolean boolean5 = cSVParser3.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord6 = cSVParser3.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser7.iterator();
        boolean boolean9 = cSVParser7.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser8.getHeaderMap();
        long long10 = cSVParser8.getRecordNumber();
        boolean boolean11 = cSVParser8.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withNullString("");
        java.lang.String[] strArray13 = cSVFormat10.getHeader();
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false", cSVFormat10);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList15 = cSVParser14.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertNotNull(cSVRecordList15);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        java.lang.Character char10 = cSVFormat4.getEscape();
        boolean boolean11 = cSVFormat4.isNullHandling();
        cSVFormat4.validate();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        cSVFormat4.validate();
        boolean boolean6 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuoteChar('\t');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withRecordSeparator('a');
        boolean boolean8 = cSVFormat2.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat11);
        boolean boolean13 = cSVFormat2.equals((java.lang.Object) cSVFormat11);
        boolean boolean14 = cSVFormat11.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVParser12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray1 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('\"');
        boolean boolean6 = cSVFormat3.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray10 = cSVFormat9.getHeader();
        java.lang.String[] strArray17 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat9.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat3.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withSkipHeaderRecord(false);
        java.io.Reader reader22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser23 = cSVFormat19.parse(reader22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        java.lang.Character char3 = cSVFormat2.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuoteChar('\"');
        java.lang.String str6 = cSVFormat2.toString();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Delimiter=<\b> SkipHeaderRecord:false" + "'", str6, "Delimiter=<\b> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVParser7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
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
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        java.lang.Character char10 = cSVFormat4.getEscape();
        boolean boolean11 = cSVFormat4.isNullHandling();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = null;
        org.apache.commons.csv.Lexer lexer13 = new org.apache.commons.csv.Lexer(cSVFormat4, extendedBufferedReader12);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        java.lang.Character char10 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreSurroundingSpaces(true);
        boolean boolean15 = cSVFormat4.equals((java.lang.Object) cSVFormat14);
        java.lang.String str16 = cSVFormat14.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false" + "'", str16, "Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        cSVParser7.close();
        boolean boolean9 = cSVParser7.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser7.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        cSVFormat4.validate();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat4.withRecordSeparator("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        boolean boolean6 = cSVParser3.isClosed();
        boolean boolean7 = cSVParser3.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser3.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        long long8 = cSVParser7.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser7.getRecords();
        long long10 = cSVParser7.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser8.nextRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser8.spliterator();
        long long11 = cSVParser8.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNotNull(cSVRecord9);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        java.lang.Character char10 = cSVFormat4.getEscape();
        cSVFormat4.validate();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertNull(char10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape('\"');
        cSVFormat1.validate();
        java.lang.String[] strArray8 = cSVFormat1.getHeader();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<a> QuoteChar=<a> CommentStart=<\f> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'format' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat10);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        boolean boolean7 = cSVParser3.isClosed();
        long long8 = cSVParser3.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat10);
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuoteChar((java.lang.Character) 'a');
        cSVFormat16.validate();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withRecordSeparator('\f');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withDelimiter('#');
        java.lang.String str22 = cSVFormat19.getRecordSeparator();
        java.lang.Character char23 = cSVFormat19.getEscape();
        boolean boolean24 = cSVFormat10.equals((java.lang.Object) cSVFormat19);
        org.apache.commons.csv.Quote quote25 = cSVFormat10.getQuotePolicy();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\f" + "'", str22, "\f");
        org.junit.Assert.assertNull(char23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(quote25);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser9.nextRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator11 = cSVParser9.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertNull(cSVRecord10);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator11);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
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
        org.junit.Assert.assertNotNull(cSVRecordItor5);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        cSVParser3.close();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        long long10 = cSVParser9.getCurrentLineNumber();
        boolean boolean11 = cSVParser9.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('#');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = null;
        org.apache.commons.csv.Lexer lexer4 = new org.apache.commons.csv.Lexer(cSVFormat2, extendedBufferedReader3);
        org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:false", cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        long long10 = cSVParser9.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList11 = cSVParser9.getRecords();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cSVParser9.getHeaderMap();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cSVParser9.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        boolean boolean7 = cSVFormat2.getSkipHeaderRecord();
        boolean boolean9 = cSVFormat2.equals((java.lang.Object) 0);
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat2.withEscape((java.lang.Character) ' ');
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        boolean boolean2 = cSVFormat1.getIgnoreEmptyLines();
        java.lang.Character char3 = cSVFormat1.getCommentStart();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(char3);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor6 = cSVParser3.iterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertNotNull(cSVRecordItor6);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        long long8 = cSVParser7.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser7.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser7.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser7.nextRecord();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertNull(cSVRecord11);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withEscape((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote11 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withQuotePolicy(quote11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withSkipHeaderRecord(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser17 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + quote11 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote11.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        long long6 = cSVParser3.getRecordNumber();
        long long7 = cSVParser3.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withIgnoreEmptyLines(false);
        java.lang.String[] strArray10 = cSVFormat9.getHeader();
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat9);
        java.lang.String[] strArray12 = cSVFormat9.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuoteChar((java.lang.Character) 'a');
        cSVFormat8.validate();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withRecordSeparator('a');
        boolean boolean14 = cSVFormat8.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser18 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat17);
        boolean boolean19 = cSVFormat8.equals((java.lang.Object) cSVFormat17);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote25 = cSVFormat22.getQuotePolicy();
        org.apache.commons.csv.Quote quote26 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withQuotePolicy(quote26);
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray35 = cSVFormat34.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat34.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat34.withEscape('\"');
        java.lang.String[] strArray45 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat34.withHeader(strArray45);
        org.apache.commons.csv.CSVFormat cSVFormat48 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote26, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray45, false);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat17.withHeader(strArray45);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat2.withHeader(strArray45);
        org.apache.commons.csv.Quote quote51 = cSVFormat50.getQuotePolicy();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVParser18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNull(quote25);
        org.junit.Assert.assertTrue("'" + quote26 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote26.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNull(quote51);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        long long10 = cSVParser9.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser9.nextRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(cSVRecord11);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        long long9 = cSVParser8.getCurrentLineNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser8.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator11 = cSVParser8.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator11);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        cSVParser3.close();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'format' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote7 = cSVFormat4.getQuotePolicy();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(quote7);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray4 = cSVFormat3.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withRecordSeparator("");
        boolean boolean7 = cSVFormat6.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withEscape((java.lang.Character) 'a');
        java.lang.String str10 = cSVFormat6.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("", cSVFormat6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(cSVParser11);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        boolean boolean7 = cSVFormat2.getSkipHeaderRecord();
        boolean boolean9 = cSVFormat2.equals((java.lang.Object) 0);
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat2.withNullString("\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"");
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
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
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape('a');
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVParser9);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        java.lang.Character char3 = cSVFormat2.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuoteChar('\"');
        java.lang.Character char6 = cSVFormat5.getCommentStart();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat5);
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser7.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser8.nextRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser8.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList11 = cSVParser8.getRecords();
        long long12 = cSVParser8.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNotNull(cSVRecord9);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
        org.junit.Assert.assertNotNull(cSVRecordList11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser3.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser3.iterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat10);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withEscape('\"');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        long long9 = cSVParser8.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser8.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser8.nextRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator12 = cSVParser8.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord10);
        org.junit.Assert.assertNull(cSVRecord11);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator12);
    }
}


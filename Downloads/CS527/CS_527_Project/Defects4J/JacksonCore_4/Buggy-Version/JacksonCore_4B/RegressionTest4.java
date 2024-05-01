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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer3 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler2);
        char[] charArray4 = textBuffer3.getTextBuffer();
        int int5 = textBuffer3.size();
        int int6 = textBuffer3.getTextOffset();
        char[] charArray7 = textBuffer3.getTextBuffer();
        textBuffer3.setCurrentLength((int) '#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        char[] charArray12 = textBuffer11.getTextBuffer();
        char[] charArray13 = textBuffer11.getCurrentSegment();
        textBuffer3.append(charArray13, 100, (int) (byte) 10);
        textBuffer1.resetWithShared(charArray13, (int) (byte) 100, 100);
        textBuffer1.append(' ');
        textBuffer1.append('#');
        textBuffer1.append('4');
        int int26 = textBuffer1.size();
        int int27 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        char[] charArray30 = textBuffer29.getTextBuffer();
        int int31 = textBuffer29.size();
        int int32 = textBuffer29.size();
        java.lang.String str33 = textBuffer29.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler34 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer35 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler34);
        char[] charArray36 = textBuffer35.getCurrentSegment();
        char[] charArray37 = textBuffer35.contentsAsArray();
        char[] charArray38 = textBuffer35.contentsAsArray();
        textBuffer35.resetWithEmpty();
        char[] charArray40 = textBuffer35.getTextBuffer();
        textBuffer29.append(charArray40, (int) (byte) 10, 52);
        textBuffer1.append(charArray40, 10, 11);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(charArray7);
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 103 + "'", int26 == 103);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 103 + "'", int27 == 103);
        org.junit.Assert.assertNull(charArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[]");
        org.junit.Assert.assertNotNull(charArray40);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        char[] charArray7 = textBuffer6.getCurrentSegment();
        textBuffer1.append(charArray7, (int) (short) 1, (int) '#');
        boolean boolean11 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength(53);
        int int14 = textBuffer1.size();
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        int int3 = textBuffer1.size();
        int int4 = textBuffer1.size();
        java.lang.String str5 = textBuffer1.contentsAsString();
        java.lang.String str6 = textBuffer1.toString();
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        int int3 = textBuffer1.size();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength((int) '#');
        char[] charArray8 = textBuffer1.getCurrentSegment();
        char[] charArray9 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray11 = textBuffer1.expandCurrentSegment(100);
        char[] charArray12 = null;
        textBuffer1.resetWithShared(charArray12, (int) ' ', (int) '#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        char[] charArray18 = textBuffer17.getTextBuffer();
        textBuffer17.resetWithEmpty();
        java.lang.String str20 = textBuffer17.contentsAsString();
        char[] charArray21 = textBuffer17.getCurrentSegment();
        textBuffer1.resetWithShared(charArray21, (int) (short) 100, 0);
        char[] charArray25 = textBuffer1.getCurrentSegment();
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNull(charArray18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray25);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        int int3 = textBuffer1.size();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getTextBuffer();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        java.lang.String str8 = textBuffer1.toString();
        char[] charArray9 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithEmpty();
        int int11 = textBuffer1.getCurrentSegmentSize();
        boolean boolean12 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithString("hi!");
        textBuffer1.resetWithString("hi!");
        char[] charArray9 = textBuffer1.getCurrentSegment();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        char[] charArray5 = textBuffer1.getTextBuffer();
        char[] charArray6 = textBuffer1.contentsAsArray();
        char[] charArray7 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        textBuffer1.append('4');
        char[] charArray12 = textBuffer1.expandCurrentSegment((int) (short) 100);
        boolean boolean13 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        int int4 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        char[] charArray7 = textBuffer6.getCurrentSegment();
        textBuffer1.append(charArray7, (int) (short) 1, (int) '#');
        char[] charArray12 = textBuffer1.expandCurrentSegment(52);
        boolean boolean13 = textBuffer1.hasTextAsCharacters();
        boolean boolean14 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('#');
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        java.lang.String str5 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        char[] charArray8 = textBuffer7.getCurrentSegment();
        textBuffer1.resetWithShared(charArray8, 32, (int) ' ');
        java.lang.String str12 = textBuffer1.toString();
        char[] charArray13 = textBuffer1.contentsAsArray();
        int int14 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str12, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithEmpty();
        int int4 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("");
        char[] charArray8 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        java.lang.String str5 = textBuffer1.contentsAsString();
        textBuffer1.releaseBuffers();
        char[] charArray7 = textBuffer1.getCurrentSegment();
        char[] charArray8 = textBuffer1.getTextBuffer();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        char[] charArray11 = textBuffer1.expandCurrentSegment(52);
        textBuffer1.setCurrentLength(1);
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray11);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        char[] charArray6 = textBuffer5.getCurrentSegment();
        textBuffer1.append(charArray6, (int) (short) 0, (int) '4');
        char[] charArray10 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        char[] charArray14 = textBuffer1.expandCurrentSegment((int) (byte) 10);
        textBuffer1.setCurrentLength(0);
        java.lang.String str17 = textBuffer1.contentsAsString();
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str17, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        int int3 = textBuffer1.size();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getTextBuffer();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        int int8 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.releaseBuffers();
        int int5 = textBuffer1.getCurrentSegmentSize();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.resetWithEmpty();
        textBuffer1.releaseBuffers();
        int int9 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        char[] charArray14 = textBuffer13.getTextBuffer();
        int int15 = textBuffer13.size();
        int int16 = textBuffer13.getTextOffset();
        char[] charArray17 = textBuffer13.getTextBuffer();
        textBuffer13.setCurrentLength((int) '#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        char[] charArray22 = textBuffer21.getTextBuffer();
        char[] charArray23 = textBuffer21.getCurrentSegment();
        textBuffer13.append(charArray23, 100, (int) (byte) 10);
        textBuffer11.resetWithShared(charArray23, (int) (byte) 100, 100);
        textBuffer11.append(' ');
        textBuffer11.append('#');
        textBuffer11.append('4');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler36 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer37 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler36);
        char[] charArray38 = textBuffer37.contentsAsArray();
        int int39 = textBuffer37.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler40 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer41 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler40);
        char[] charArray42 = textBuffer41.getTextBuffer();
        char[] charArray43 = textBuffer41.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler44 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer45 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler44);
        char[] charArray46 = textBuffer45.getCurrentSegment();
        textBuffer41.append(charArray46, (int) (short) 0, (int) '4');
        textBuffer37.resetWithCopy(charArray46, (int) (byte) 10, (int) (byte) 10);
        char[] charArray53 = textBuffer37.getTextBuffer();
        textBuffer11.resetWithShared(charArray53, 103, 0);
        textBuffer1.resetWithCopy(charArray53, 87, (int) ' ');
        char[] charArray60 = textBuffer1.emptyAndGetCurrentSegment();
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNull(charArray22);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(charArray42);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertNotNull(charArray60);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.setCurrentLength((int) (byte) 10);
        textBuffer1.setCurrentLength(32);
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        int int3 = textBuffer1.size();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength((int) '#');
        textBuffer1.append('4');
        java.lang.String str10 = textBuffer1.toString();
        java.math.BigDecimal bigDecimal11 = textBuffer1.contentsAsDecimal();
        java.math.BigDecimal bigDecimal12 = textBuffer1.contentsAsDecimal();
        textBuffer1.releaseBuffers();
        char[] charArray14 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray16 = textBuffer1.expandCurrentSegment((int) '4');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        char[] charArray19 = textBuffer18.getTextBuffer();
        int int20 = textBuffer18.size();
        int int21 = textBuffer18.size();
        textBuffer18.append('4');
        textBuffer18.ensureNotShared();
        int int25 = textBuffer18.getCurrentSegmentSize();
        int int26 = textBuffer18.size();
        textBuffer18.resetWithEmpty();
        char[] charArray28 = textBuffer18.getCurrentSegment();
        textBuffer1.resetWithShared(charArray28, 10, 52);
        java.lang.String str32 = textBuffer1.toString();
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4" + "'", str10, "4");
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNull(charArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str32, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        int int3 = textBuffer1.size();
        int int4 = textBuffer1.size();
        textBuffer1.append('4');
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        char[] charArray10 = textBuffer9.getCurrentSegment();
        char[] charArray11 = textBuffer9.contentsAsArray();
        char[] charArray12 = textBuffer9.contentsAsArray();
        textBuffer9.resetWithEmpty();
        int int14 = textBuffer9.getCurrentSegmentSize();
        char[] charArray15 = textBuffer9.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray15, (-1), (int) '4');
        int int19 = textBuffer1.getTextOffset();
        java.lang.Class<?> wildcardClass20 = textBuffer1.getClass();
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        int int5 = textBuffer1.size();
        int int6 = textBuffer1.getCurrentSegmentSize();
        char[] charArray7 = textBuffer1.getCurrentSegment();
        char[] charArray8 = textBuffer1.getTextBuffer();
        char[] charArray9 = textBuffer1.emptyAndGetCurrentSegment();
        int int10 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000#", (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 62");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        int int5 = textBuffer1.size();
        int int6 = textBuffer1.getCurrentSegmentSize();
        char[] charArray7 = textBuffer1.getTextBuffer();
        int int8 = textBuffer1.size();
        int int9 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        char[] charArray13 = textBuffer12.getTextBuffer();
        char[] charArray14 = textBuffer12.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = textBuffer16.getTextBuffer();
        char[] charArray18 = textBuffer16.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        char[] charArray21 = textBuffer20.getCurrentSegment();
        textBuffer16.append(charArray21, (int) (short) 0, (int) '4');
        textBuffer12.resetWithShared(charArray21, (int) ' ', 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        char[] charArray30 = textBuffer29.getTextBuffer();
        char[] charArray31 = textBuffer29.getCurrentSegment();
        textBuffer12.append(charArray31, (int) (short) 1, 1);
        int int35 = textBuffer12.getTextOffset();
        java.lang.String str36 = textBuffer12.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler37 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer38 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler37);
        char[] charArray39 = textBuffer38.getTextBuffer();
        int int40 = textBuffer38.size();
        int int41 = textBuffer38.getTextOffset();
        char[] charArray42 = textBuffer38.getTextBuffer();
        textBuffer38.setCurrentLength((int) '#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler45 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer46 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler45);
        char[] charArray47 = textBuffer46.getTextBuffer();
        char[] charArray48 = textBuffer46.getCurrentSegment();
        textBuffer38.append(charArray48, 100, (int) (byte) 10);
        textBuffer38.setCurrentLength(0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler54 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer55 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler54);
        char[] charArray56 = textBuffer55.getTextBuffer();
        int int57 = textBuffer55.size();
        textBuffer55.resetWithEmpty();
        java.lang.String str59 = textBuffer55.contentsAsString();
        char[] charArray60 = textBuffer55.getCurrentSegment();
        textBuffer38.append(charArray60, (int) (byte) 10, (int) ' ');
        textBuffer12.resetWithCopy(charArray60, (int) 'a', (int) (short) 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler67 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer68 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler67);
        char[] charArray69 = textBuffer68.getTextBuffer();
        int int70 = textBuffer68.size();
        int int71 = textBuffer68.getTextOffset();
        char[] charArray72 = textBuffer68.getTextBuffer();
        textBuffer68.setCurrentLength((int) '#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler75 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer76 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler75);
        char[] charArray77 = textBuffer76.getTextBuffer();
        char[] charArray78 = textBuffer76.getCurrentSegment();
        textBuffer68.append(charArray78, 100, (int) (byte) 10);
        int int82 = textBuffer68.getTextOffset();
        char[] charArray83 = textBuffer68.getCurrentSegment();
        textBuffer12.resetWithShared(charArray83, (int) (byte) -1, (int) '4');
        char[] charArray87 = textBuffer12.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray87, 12, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(charArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNull(charArray30);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000" + "'", str36, "\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNull(charArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(charArray42);
        org.junit.Assert.assertNull(charArray47);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertNull(charArray56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertNull(charArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(charArray72);
        org.junit.Assert.assertNull(charArray77);
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertNotNull(charArray87);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithEmpty();
        java.lang.String str4 = textBuffer1.contentsAsString();
        java.lang.String str5 = textBuffer1.contentsAsString();
        textBuffer1.resetWithString("hi!");
        int int8 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("#");
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        int int3 = textBuffer1.size();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength((int) '#');
        java.lang.String str8 = textBuffer1.contentsAsString();
        char[] charArray9 = textBuffer1.getTextBuffer();
        java.lang.String str10 = textBuffer1.contentsAsString();
        char[] charArray11 = textBuffer1.getTextBuffer();
        int int12 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray13 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(charArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(charArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        int int3 = textBuffer1.size();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength((int) '#');
        java.lang.String str8 = textBuffer1.contentsAsString();
        char[] charArray9 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithEmpty();
        java.lang.String str11 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        char[] charArray14 = textBuffer13.getCurrentSegment();
        char[] charArray15 = textBuffer13.contentsAsArray();
        char[] charArray16 = textBuffer13.contentsAsArray();
        textBuffer13.resetWithEmpty();
        char[] charArray18 = textBuffer13.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray18, 0, 103);
        char[] charArray22 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.setCurrentLength(32);
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(charArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray22);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer3 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler2);
        char[] charArray4 = textBuffer3.getTextBuffer();
        int int5 = textBuffer3.size();
        int int6 = textBuffer3.getTextOffset();
        char[] charArray7 = textBuffer3.getTextBuffer();
        textBuffer3.setCurrentLength((int) '#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        char[] charArray12 = textBuffer11.getTextBuffer();
        char[] charArray13 = textBuffer11.getCurrentSegment();
        textBuffer3.append(charArray13, 100, (int) (byte) 10);
        textBuffer1.resetWithShared(charArray13, (int) (byte) 100, 100);
        java.lang.String str20 = textBuffer1.toString();
        textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000 ", (int) (short) 0, 35);
        java.lang.String str25 = textBuffer1.toString();
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(charArray7);
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str20, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str25, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithEmpty();
        java.lang.String str4 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        char[] charArray7 = textBuffer6.getTextBuffer();
        int int8 = textBuffer6.size();
        int int9 = textBuffer6.getTextOffset();
        char[] charArray14 = new char[] { ' ', ' ', '#', 'a' };
        textBuffer6.resetWithShared(charArray14, 0, 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        char[] charArray20 = textBuffer19.getTextBuffer();
        int int21 = textBuffer19.size();
        int int22 = textBuffer19.getTextOffset();
        char[] charArray23 = textBuffer19.getTextBuffer();
        textBuffer19.setCurrentLength((int) '#');
        char[] charArray26 = textBuffer19.getCurrentSegment();
        textBuffer6.resetWithShared(charArray26, 0, (int) (short) -1);
        textBuffer1.resetWithCopy(charArray26, (int) ' ', (int) '4');
        java.lang.String str33 = textBuffer1.contentsAsString();
        boolean boolean34 = textBuffer1.hasTextAsCharacters();
        char[] charArray35 = textBuffer1.getTextBuffer();
        int int36 = textBuffer1.getTextOffset();
        boolean boolean37 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(charArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "  #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "  #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ ,  , #, a]");
        org.junit.Assert.assertNull(charArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(charArray23);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str33, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        int int3 = textBuffer1.size();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength((int) '#');
        java.lang.String str8 = textBuffer1.contentsAsString();
        int int9 = textBuffer1.getTextOffset();
        java.lang.String str10 = textBuffer1.toString();
        char[] charArray11 = textBuffer1.getTextBuffer();
        java.lang.String str12 = textBuffer1.contentsAsString();
        java.lang.String str13 = textBuffer1.contentsAsString();
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(charArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        java.lang.String str5 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        char[] charArray8 = textBuffer7.getTextBuffer();
        int int9 = textBuffer7.size();
        textBuffer7.resetWithEmpty();
        int int11 = textBuffer7.getTextOffset();
        textBuffer7.setCurrentLength((int) (byte) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        char[] charArray16 = textBuffer15.getTextBuffer();
        char[] charArray17 = textBuffer15.getCurrentSegment();
        int int18 = textBuffer15.getCurrentSegmentSize();
        char[] charArray19 = textBuffer15.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        char[] charArray22 = textBuffer21.getTextBuffer();
        char[] charArray23 = textBuffer21.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        char[] charArray28 = textBuffer27.getTextBuffer();
        int int29 = textBuffer27.size();
        int int30 = textBuffer27.getTextOffset();
        char[] charArray31 = textBuffer27.getTextBuffer();
        textBuffer27.setCurrentLength((int) '#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler34 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer35 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler34);
        char[] charArray36 = textBuffer35.getTextBuffer();
        char[] charArray37 = textBuffer35.getCurrentSegment();
        textBuffer27.append(charArray37, 100, (int) (byte) 10);
        textBuffer25.resetWithShared(charArray37, (int) (byte) 100, 100);
        textBuffer25.append(' ');
        char[] charArray46 = textBuffer25.emptyAndGetCurrentSegment();
        textBuffer21.resetWithShared(charArray46, (int) (byte) 0, (-1));
        textBuffer15.resetWithCopy(charArray46, (int) ' ', (int) '4');
        char[] charArray54 = textBuffer15.expandCurrentSegment((int) (short) 10);
        textBuffer7.resetWithShared(charArray54, 103, (int) '#');
        textBuffer1.resetWithShared(charArray54, 32, 35);
        char[] charArray61 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("4");
        char[] charArray64 = textBuffer1.contentsAsArray();
        java.lang.String str65 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNull(charArray22);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNull(charArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(charArray31);
        org.junit.Assert.assertNull(charArray36);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[4]");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "4" + "'", str65, "4");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        int int3 = textBuffer1.size();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength((int) '#');
        textBuffer1.append('4');
        java.lang.String str10 = textBuffer1.toString();
        java.math.BigDecimal bigDecimal11 = textBuffer1.contentsAsDecimal();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        char[] charArray14 = textBuffer13.getTextBuffer();
        int int15 = textBuffer13.size();
        int int16 = textBuffer13.getTextOffset();
        char[] charArray17 = textBuffer13.getTextBuffer();
        textBuffer13.setCurrentLength((int) '#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        char[] charArray22 = textBuffer21.getTextBuffer();
        char[] charArray23 = textBuffer21.getCurrentSegment();
        textBuffer13.append(charArray23, 100, (int) (byte) 10);
        textBuffer1.append(charArray23, (int) '4', 102);
        boolean boolean30 = textBuffer1.hasTextAsCharacters();
        char[] charArray32 = textBuffer1.expandCurrentSegment((int) '#');
        textBuffer1.resetWithString("#");
        char[] charArray36 = textBuffer1.expandCurrentSegment((int) (short) 100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler37 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer38 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler37);
        char[] charArray39 = textBuffer38.getTextBuffer();
        int int40 = textBuffer38.size();
        char[] charArray41 = textBuffer38.contentsAsArray();
        textBuffer1.resetWithShared(charArray41, 1, (int) (byte) -1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler45 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer46 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler45);
        char[] charArray47 = textBuffer46.getTextBuffer();
        int int48 = textBuffer46.size();
        int int49 = textBuffer46.size();
        textBuffer46.append('4');
        textBuffer46.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler53 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer54 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler53);
        char[] charArray55 = textBuffer54.getCurrentSegment();
        char[] charArray56 = textBuffer54.contentsAsArray();
        char[] charArray57 = textBuffer54.contentsAsArray();
        textBuffer54.resetWithEmpty();
        int int59 = textBuffer54.getCurrentSegmentSize();
        char[] charArray60 = textBuffer54.emptyAndGetCurrentSegment();
        textBuffer46.resetWithShared(charArray60, (-1), (int) '4');
        textBuffer1.resetWithShared(charArray60, 97, (int) 'a');
        int int67 = textBuffer1.size();
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4" + "'", str10, "4");
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNull(charArray22);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertNull(charArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[]");
        org.junit.Assert.assertNull(charArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[]");
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 97 + "'", int67 == 97);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        int int3 = textBuffer1.size();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength((int) '#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        char[] charArray10 = textBuffer9.getTextBuffer();
        char[] charArray11 = textBuffer9.getCurrentSegment();
        textBuffer1.append(charArray11, 100, (int) (byte) 10);
        char[] charArray16 = textBuffer1.expandCurrentSegment((int) (short) 10);
        char[] charArray17 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray18 = textBuffer1.getCurrentSegment();
        int int19 = textBuffer1.getTextOffset();
        java.lang.String str20 = textBuffer1.toString();
        textBuffer1.resetWithEmpty();
        int int22 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        int int5 = textBuffer1.size();
        int int6 = textBuffer1.getCurrentSegmentSize();
        char[] charArray7 = textBuffer1.getCurrentSegment();
        char[] charArray8 = textBuffer1.getTextBuffer();
        int int9 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        char[] charArray12 = textBuffer11.getTextBuffer();
        char[] charArray13 = textBuffer11.getCurrentSegment();
        int int14 = textBuffer11.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = textBuffer16.getCurrentSegment();
        textBuffer11.append(charArray17, (int) (short) 1, (int) '#');
        java.lang.String str21 = textBuffer11.toString();
        int int22 = textBuffer11.getCurrentSegmentSize();
        char[] charArray23 = textBuffer11.emptyAndGetCurrentSegment();
        char[] charArray24 = textBuffer11.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray24, (int) (byte) -1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str21, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray24);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        int int3 = textBuffer1.size();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength((int) '#');
        textBuffer1.append('4');
        java.lang.String str10 = textBuffer1.toString();
        java.math.BigDecimal bigDecimal11 = textBuffer1.contentsAsDecimal();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        char[] charArray14 = textBuffer13.getTextBuffer();
        int int15 = textBuffer13.size();
        int int16 = textBuffer13.getTextOffset();
        char[] charArray17 = textBuffer13.getTextBuffer();
        textBuffer13.setCurrentLength((int) '#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        char[] charArray22 = textBuffer21.getTextBuffer();
        char[] charArray23 = textBuffer21.getCurrentSegment();
        textBuffer13.append(charArray23, 100, (int) (byte) 10);
        textBuffer1.append(charArray23, (int) '4', 102);
        boolean boolean30 = textBuffer1.hasTextAsCharacters();
        char[] charArray32 = textBuffer1.expandCurrentSegment((int) '#');
        textBuffer1.resetWithString("#");
        char[] charArray35 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler36 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer37 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler36);
        char[] charArray38 = textBuffer37.getTextBuffer();
        int int39 = textBuffer37.size();
        textBuffer37.resetWithEmpty();
        textBuffer37.resetWithEmpty();
        textBuffer37.resetWithEmpty();
        java.lang.String str43 = textBuffer37.toString();
        textBuffer37.ensureNotShared();
        char[] charArray45 = textBuffer37.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler46 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer47 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler46);
        char[] charArray48 = textBuffer47.getTextBuffer();
        int int49 = textBuffer47.size();
        int int50 = textBuffer47.getTextOffset();
        char[] charArray51 = textBuffer47.getTextBuffer();
        textBuffer47.setCurrentLength((int) '#');
        textBuffer47.append('4');
        java.lang.String str56 = textBuffer47.toString();
        java.math.BigDecimal bigDecimal57 = textBuffer47.contentsAsDecimal();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler58 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer59 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler58);
        char[] charArray60 = textBuffer59.getTextBuffer();
        int int61 = textBuffer59.size();
        int int62 = textBuffer59.getTextOffset();
        char[] charArray63 = textBuffer59.getTextBuffer();
        textBuffer59.setCurrentLength((int) '#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler66 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer67 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler66);
        char[] charArray68 = textBuffer67.getTextBuffer();
        char[] charArray69 = textBuffer67.getCurrentSegment();
        textBuffer59.append(charArray69, 100, (int) (byte) 10);
        textBuffer47.append(charArray69, (int) '4', 102);
        boolean boolean76 = textBuffer47.hasTextAsCharacters();
        char[] charArray78 = textBuffer47.expandCurrentSegment((int) '#');
        textBuffer47.resetWithString("#");
        char[] charArray82 = textBuffer47.expandCurrentSegment((int) (short) 100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler83 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer84 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler83);
        char[] charArray85 = textBuffer84.getTextBuffer();
        int int86 = textBuffer84.size();
        char[] charArray87 = textBuffer84.contentsAsArray();
        textBuffer47.resetWithShared(charArray87, 1, (int) (byte) -1);
        textBuffer37.resetWithShared(charArray87, 97, 32);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray87, 97, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4" + "'", str10, "4");
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNull(charArray22);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[#]");
        org.junit.Assert.assertNull(charArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertNull(charArray48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(charArray51);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "4" + "'", str56, "4");
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNull(charArray60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(charArray63);
        org.junit.Assert.assertNull(charArray68);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertNotNull(charArray82);
        org.junit.Assert.assertNull(charArray85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(charArray87);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray87), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray87), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray87), "[]");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        int int3 = textBuffer1.size();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength((int) '#');
        char[] charArray8 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        char[] charArray11 = textBuffer10.getTextBuffer();
        int int12 = textBuffer10.size();
        int int13 = textBuffer10.getTextOffset();
        char[] charArray14 = textBuffer10.getTextBuffer();
        textBuffer10.setCurrentLength((int) '#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        char[] charArray19 = textBuffer18.getTextBuffer();
        char[] charArray20 = textBuffer18.getCurrentSegment();
        textBuffer10.append(charArray20, 100, (int) (byte) 10);
        textBuffer1.resetWithShared(charArray20, 1, (int) (byte) 100);
        char[] charArray27 = textBuffer1.getTextBuffer();
        char[] charArray29 = textBuffer1.expandCurrentSegment(12);
        textBuffer1.resetWithEmpty();
        char[] charArray31 = textBuffer1.getCurrentSegment();
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNull(charArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray31);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        int int3 = textBuffer1.size();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength((int) '#');
        textBuffer1.append('4');
        java.lang.String str10 = textBuffer1.toString();
        java.math.BigDecimal bigDecimal11 = textBuffer1.contentsAsDecimal();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        char[] charArray14 = textBuffer13.getTextBuffer();
        int int15 = textBuffer13.size();
        int int16 = textBuffer13.getTextOffset();
        char[] charArray17 = textBuffer13.getTextBuffer();
        textBuffer13.setCurrentLength((int) '#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        char[] charArray22 = textBuffer21.getTextBuffer();
        char[] charArray23 = textBuffer21.getCurrentSegment();
        textBuffer13.append(charArray23, 100, (int) (byte) 10);
        textBuffer1.append(charArray23, (int) '4', 102);
        char[] charArray30 = textBuffer1.contentsAsArray();
        java.lang.String str31 = textBuffer1.contentsAsString();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4" + "'", str10, "4");
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNull(charArray22);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[4, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str31, "4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        java.lang.String str3 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        char[] charArray6 = textBuffer5.getTextBuffer();
        char[] charArray7 = textBuffer5.getCurrentSegment();
        textBuffer5.releaseBuffers();
        int int9 = textBuffer5.getCurrentSegmentSize();
        int int10 = textBuffer5.getTextOffset();
        char[] charArray11 = textBuffer5.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray11, (int) '#', (int) (short) 1);
        char[] charArray15 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.releaseBuffers();
        char[] charArray18 = textBuffer1.expandCurrentSegment((int) (short) 100);
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray18);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        int int3 = textBuffer1.size();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength((int) '#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        char[] charArray10 = textBuffer9.getTextBuffer();
        char[] charArray11 = textBuffer9.getCurrentSegment();
        textBuffer1.append(charArray11, 100, (int) (byte) 10);
        char[] charArray16 = textBuffer1.expandCurrentSegment((int) (short) 10);
        char[] charArray17 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str18 = textBuffer1.toString();
        char[] charArray19 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithEmpty();
        java.lang.String str21 = textBuffer1.contentsAsString();
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithString("4");
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        int int8 = textBuffer1.getTextOffset();
        int int9 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((int) '#');
        java.lang.String str12 = textBuffer1.contentsAsString();
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4" + "'", str12, "4");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer3 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler2);
        char[] charArray4 = textBuffer3.getTextBuffer();
        int int5 = textBuffer3.size();
        int int6 = textBuffer3.getTextOffset();
        char[] charArray7 = textBuffer3.getTextBuffer();
        textBuffer3.setCurrentLength((int) '#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        char[] charArray12 = textBuffer11.getTextBuffer();
        char[] charArray13 = textBuffer11.getCurrentSegment();
        textBuffer3.append(charArray13, 100, (int) (byte) 10);
        textBuffer1.resetWithShared(charArray13, (int) (byte) 100, 100);
        textBuffer1.append(' ');
        textBuffer1.append('#');
        textBuffer1.append('4');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        char[] charArray28 = textBuffer27.contentsAsArray();
        int int29 = textBuffer27.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        char[] charArray32 = textBuffer31.getTextBuffer();
        char[] charArray33 = textBuffer31.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler34 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer35 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler34);
        char[] charArray36 = textBuffer35.getCurrentSegment();
        textBuffer31.append(charArray36, (int) (short) 0, (int) '4');
        textBuffer27.resetWithCopy(charArray36, (int) (byte) 10, (int) (byte) 10);
        char[] charArray43 = textBuffer27.getTextBuffer();
        textBuffer1.resetWithShared(charArray43, 103, 0);
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(charArray7);
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(charArray32);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertNotNull(charArray43);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.releaseBuffers();
        int int5 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        char[] charArray8 = textBuffer7.getTextBuffer();
        int int9 = textBuffer7.size();
        textBuffer7.resetWithEmpty();
        java.lang.String str11 = textBuffer7.contentsAsString();
        char[] charArray12 = textBuffer7.getCurrentSegment();
        textBuffer1.append(charArray12, (int) (short) 100, (int) (byte) 10);
        java.lang.String str16 = textBuffer1.toString();
        char[] charArray17 = textBuffer1.getCurrentSegment();
        int int18 = textBuffer1.size();
        textBuffer1.append('4');
        textBuffer1.append('#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer24 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler23);
        char[] charArray25 = textBuffer24.getTextBuffer();
        int int26 = textBuffer24.size();
        int int27 = textBuffer24.getTextOffset();
        char[] charArray28 = textBuffer24.getTextBuffer();
        textBuffer24.setCurrentLength((int) '#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler31 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer32 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler31);
        char[] charArray33 = textBuffer32.getTextBuffer();
        int int34 = textBuffer32.size();
        textBuffer32.resetWithEmpty();
        java.lang.String str36 = textBuffer32.contentsAsString();
        char[] charArray37 = textBuffer32.getCurrentSegment();
        textBuffer24.resetWithShared(charArray37, (int) ' ', (int) '4');
        boolean boolean41 = textBuffer24.hasTextAsCharacters();
        int int42 = textBuffer24.getTextOffset();
        char[] charArray43 = textBuffer24.getCurrentSegment();
        boolean boolean44 = textBuffer24.hasTextAsCharacters();
        char[] charArray46 = textBuffer24.expandCurrentSegment(101);
        char[] charArray48 = textBuffer24.expandCurrentSegment(100);
        textBuffer1.append(charArray48, 101, 102);
        char[] charArray52 = textBuffer1.emptyAndGetCurrentSegment();
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str16, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNull(charArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(charArray28);
        org.junit.Assert.assertNull(charArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 32 + "'", int42 == 32);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertNotNull(charArray52);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithEmpty();
        java.lang.String str4 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        char[] charArray7 = textBuffer6.getTextBuffer();
        int int8 = textBuffer6.size();
        int int9 = textBuffer6.getTextOffset();
        char[] charArray14 = new char[] { ' ', ' ', '#', 'a' };
        textBuffer6.resetWithShared(charArray14, 0, 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        char[] charArray20 = textBuffer19.getTextBuffer();
        int int21 = textBuffer19.size();
        int int22 = textBuffer19.getTextOffset();
        char[] charArray23 = textBuffer19.getTextBuffer();
        textBuffer19.setCurrentLength((int) '#');
        char[] charArray26 = textBuffer19.getCurrentSegment();
        textBuffer6.resetWithShared(charArray26, 0, (int) (short) -1);
        textBuffer1.resetWithCopy(charArray26, (int) ' ', (int) '4');
        textBuffer1.setCurrentLength((int) '#');
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength(1);
        char[] charArray38 = textBuffer1.contentsAsArray();
        int int39 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        int int41 = textBuffer1.size();
        textBuffer1.append(' ');
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(charArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "  #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "  #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ ,  , #, a]");
        org.junit.Assert.assertNull(charArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(charArray23);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[\000]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        int int3 = textBuffer1.size();
        int int4 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        char[] charArray6 = textBuffer1.getTextBuffer();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        int int8 = textBuffer1.size();
        textBuffer1.append('#');
        textBuffer1.setCurrentLength((-1));
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithString("4");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        char[] charArray8 = textBuffer7.getTextBuffer();
        int int9 = textBuffer7.size();
        textBuffer7.resetWithEmpty();
        textBuffer7.resetWithString("hi!");
        char[] charArray13 = textBuffer7.getTextBuffer();
        textBuffer1.resetWithShared(charArray13, (int) 'a', (int) (byte) 1);
        textBuffer1.setCurrentLength((int) (byte) 0);
        int int19 = textBuffer1.getTextOffset();
        int int20 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        char[] charArray23 = textBuffer22.getTextBuffer();
        int int24 = textBuffer22.size();
        textBuffer22.resetWithEmpty();
        int int26 = textBuffer22.getTextOffset();
        textBuffer22.setCurrentLength((int) (byte) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler29 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer30 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler29);
        char[] charArray31 = textBuffer30.getTextBuffer();
        char[] charArray32 = textBuffer30.getCurrentSegment();
        int int33 = textBuffer30.getCurrentSegmentSize();
        char[] charArray34 = textBuffer30.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler35 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer36 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler35);
        char[] charArray37 = textBuffer36.getTextBuffer();
        char[] charArray38 = textBuffer36.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler39 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer40 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler39);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler41 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer42 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler41);
        char[] charArray43 = textBuffer42.getTextBuffer();
        int int44 = textBuffer42.size();
        int int45 = textBuffer42.getTextOffset();
        char[] charArray46 = textBuffer42.getTextBuffer();
        textBuffer42.setCurrentLength((int) '#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler49 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer50 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler49);
        char[] charArray51 = textBuffer50.getTextBuffer();
        char[] charArray52 = textBuffer50.getCurrentSegment();
        textBuffer42.append(charArray52, 100, (int) (byte) 10);
        textBuffer40.resetWithShared(charArray52, (int) (byte) 100, 100);
        textBuffer40.append(' ');
        char[] charArray61 = textBuffer40.emptyAndGetCurrentSegment();
        textBuffer36.resetWithShared(charArray61, (int) (byte) 0, (-1));
        textBuffer30.resetWithCopy(charArray61, (int) ' ', (int) '4');
        char[] charArray69 = textBuffer30.expandCurrentSegment((int) (short) 10);
        textBuffer22.resetWithShared(charArray69, 103, (int) '#');
        textBuffer1.resetWithCopy(charArray69, (int) (byte) 100, 10);
        textBuffer1.resetWithEmpty();
        int int77 = textBuffer1.size();
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNull(charArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(charArray31);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertNull(charArray37);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertNull(charArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(charArray46);
        org.junit.Assert.assertNull(charArray51);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        int int3 = textBuffer1.getTextOffset();
        int int4 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        int int8 = textBuffer1.getTextOffset();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        char[] charArray10 = textBuffer1.contentsAsArray();
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithEmpty();
        java.lang.String str4 = textBuffer1.contentsAsString();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.append('#');
        textBuffer1.setCurrentLength(35);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        char[] charArray13 = textBuffer12.getTextBuffer();
        int int14 = textBuffer12.size();
        int int15 = textBuffer12.getTextOffset();
        char[] charArray16 = textBuffer12.getTextBuffer();
        textBuffer12.setCurrentLength((int) '#');
        textBuffer12.append('4');
        java.lang.String str21 = textBuffer12.toString();
        java.math.BigDecimal bigDecimal22 = textBuffer12.contentsAsDecimal();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer24 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler23);
        char[] charArray25 = textBuffer24.getTextBuffer();
        int int26 = textBuffer24.size();
        int int27 = textBuffer24.getTextOffset();
        char[] charArray28 = textBuffer24.getTextBuffer();
        textBuffer24.setCurrentLength((int) '#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler31 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer32 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler31);
        char[] charArray33 = textBuffer32.getTextBuffer();
        char[] charArray34 = textBuffer32.getCurrentSegment();
        textBuffer24.append(charArray34, 100, (int) (byte) 10);
        textBuffer12.append(charArray34, (int) '4', 102);
        textBuffer12.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler43 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer44 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler43);
        char[] charArray45 = textBuffer44.getTextBuffer();
        int int46 = textBuffer44.size();
        textBuffer44.resetWithEmpty();
        java.lang.String str48 = textBuffer44.contentsAsString();
        textBuffer44.releaseBuffers();
        char[] charArray50 = textBuffer44.getCurrentSegment();
        textBuffer12.resetWithShared(charArray50, 0, 1);
        java.lang.String str54 = textBuffer12.contentsAsString();
        textBuffer12.setCurrentLength(100);
        char[] charArray57 = textBuffer12.getTextBuffer();
        textBuffer1.append(charArray57, 10, (int) 'a');
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(charArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(charArray16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4" + "'", str21, "4");
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNull(charArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(charArray28);
        org.junit.Assert.assertNull(charArray33);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertNull(charArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\000" + "'", str54, "\000");
        org.junit.Assert.assertNotNull(charArray57);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        int int3 = textBuffer1.size();
        int int4 = textBuffer1.getTextOffset();
        char[] charArray5 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength((int) '#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        char[] charArray10 = textBuffer9.getTextBuffer();
        int int11 = textBuffer9.size();
        textBuffer9.resetWithEmpty();
        java.lang.String str13 = textBuffer9.contentsAsString();
        char[] charArray14 = textBuffer9.getCurrentSegment();
        textBuffer1.resetWithShared(charArray14, (int) ' ', (int) '4');
        boolean boolean18 = textBuffer1.hasTextAsCharacters();
        java.lang.String str19 = textBuffer1.contentsAsString();
        char[] charArray20 = textBuffer1.getCurrentSegment();
        int int21 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        char[] charArray24 = textBuffer23.getTextBuffer();
        int int25 = textBuffer23.size();
        int int26 = textBuffer23.getTextOffset();
        char[] charArray27 = textBuffer23.getTextBuffer();
        textBuffer23.setCurrentLength((int) '#');
        int int30 = textBuffer23.size();
        int int31 = textBuffer23.getTextOffset();
        int int32 = textBuffer23.getCurrentSegmentSize();
        int int33 = textBuffer23.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler34 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer35 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler34);
        char[] charArray36 = textBuffer35.getTextBuffer();
        int int37 = textBuffer35.size();
        textBuffer35.resetWithEmpty();
        java.lang.String str39 = textBuffer35.contentsAsString();
        textBuffer35.releaseBuffers();
        char[] charArray41 = textBuffer35.getCurrentSegment();
        char[] charArray42 = textBuffer35.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler43 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer44 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler43);
        char[] charArray45 = textBuffer44.getTextBuffer();
        int int46 = textBuffer44.size();
        int int47 = textBuffer44.getTextOffset();
        char[] charArray48 = textBuffer44.getTextBuffer();
        textBuffer44.setCurrentLength((int) '#');
        char[] charArray51 = textBuffer44.getCurrentSegment();
        textBuffer35.resetWithCopy(charArray51, 103, (int) '4');
        textBuffer23.resetWithShared(charArray51, (int) (byte) 0, 53);
        textBuffer1.resetWithCopy(charArray51, 100, (int) (byte) 1);
        textBuffer1.setCurrentLength(100);
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str19, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(charArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(charArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(charArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertNull(charArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(charArray48);
        org.junit.Assert.assertNotNull(charArray51);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        int int3 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        char[] charArray6 = textBuffer5.getTextBuffer();
        char[] charArray7 = textBuffer5.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        char[] charArray10 = textBuffer9.getTextBuffer();
        char[] charArray11 = textBuffer9.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        char[] charArray14 = textBuffer13.getCurrentSegment();
        textBuffer9.append(charArray14, (int) (short) 0, (int) '4');
        textBuffer5.resetWithShared(charArray14, (int) ' ', 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        char[] charArray23 = textBuffer22.getTextBuffer();
        char[] charArray24 = textBuffer22.getCurrentSegment();
        textBuffer5.append(charArray24, (int) (short) 1, 1);
        textBuffer1.append(charArray24, 12, (int) (short) 100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler31 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer32 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler31);
        char[] charArray33 = textBuffer32.getTextBuffer();
        int int34 = textBuffer32.size();
        textBuffer32.resetWithEmpty();
        int int36 = textBuffer32.size();
        int int37 = textBuffer32.getCurrentSegmentSize();
        textBuffer32.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000 ");
        char[] charArray40 = textBuffer32.getTextBuffer();
        textBuffer1.resetWithShared(charArray40, (int) (byte) 0, 87);
        // The following exception was thrown during execution in test generation
        try {
            double double44 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNull(charArray23);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertNull(charArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,  ]");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        char[] charArray3 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength(102);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        char[] charArray8 = textBuffer7.getTextBuffer();
        textBuffer7.resetWithEmpty();
        java.lang.String str10 = textBuffer7.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        char[] charArray13 = textBuffer12.getTextBuffer();
        char[] charArray14 = textBuffer12.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = textBuffer16.getTextBuffer();
        char[] charArray18 = textBuffer16.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        char[] charArray21 = textBuffer20.getCurrentSegment();
        textBuffer16.append(charArray21, (int) (short) 0, (int) '4');
        textBuffer12.resetWithShared(charArray21, (int) ' ', 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        char[] charArray30 = textBuffer29.getTextBuffer();
        char[] charArray31 = textBuffer29.getCurrentSegment();
        textBuffer12.append(charArray31, (int) (short) 1, 1);
        textBuffer7.resetWithShared(charArray31, (int) (short) -1, (int) 'a');
        textBuffer1.resetWithShared(charArray31, (int) (short) 10, (int) (short) -1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler41 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer42 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler41);
        char[] charArray43 = textBuffer42.getTextBuffer();
        char[] charArray44 = textBuffer42.getCurrentSegment();
        int int45 = textBuffer42.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler46 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer47 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler46);
        char[] charArray48 = textBuffer47.getCurrentSegment();
        textBuffer42.append(charArray48, (int) (short) 1, (int) '#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler52 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer53 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler52);
        char[] charArray54 = textBuffer53.getTextBuffer();
        int int55 = textBuffer53.size();
        textBuffer53.resetWithEmpty();
        java.lang.String str57 = textBuffer53.contentsAsString();
        textBuffer53.releaseBuffers();
        char[] charArray59 = textBuffer53.getCurrentSegment();
        char[] charArray60 = textBuffer53.getTextBuffer();
        char[] charArray61 = textBuffer53.getCurrentSegment();
        char[] charArray63 = textBuffer53.expandCurrentSegment(52);
        char[] charArray64 = textBuffer53.emptyAndGetCurrentSegment();
        textBuffer42.resetWithCopy(charArray64, (int) (byte) 10, 0);
        textBuffer1.resetWithShared(charArray64, (int) (short) 1, (int) (byte) -1);
        char[] charArray71 = textBuffer1.getCurrentSegment();
        java.lang.Class<?> wildcardClass72 = charArray71.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNull(charArray30);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertNull(charArray43);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertNull(charArray54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }
}


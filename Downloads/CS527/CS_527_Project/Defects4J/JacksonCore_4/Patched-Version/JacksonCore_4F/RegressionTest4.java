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
        char[] charArray2 = textBuffer1.getTextBuffer();
        int int3 = textBuffer1.getTextOffset();
        int int4 = textBuffer1.size();
        int int5 = textBuffer1.getCurrentSegmentSize();
        int int6 = textBuffer1.size();
        textBuffer1.setCurrentLength(10);
        int int9 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal10 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
        int int19 = textBuffer1.getTextOffset();
        char[] charArray20 = textBuffer1.getCurrentSegment();
        boolean boolean21 = textBuffer1.hasTextAsCharacters();
        int int22 = textBuffer1.size();
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        int int18 = textBuffer1.getTextOffset();
        char[] charArray19 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString("4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000 4");
        boolean boolean24 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        char[] charArray29 = textBuffer28.getTextBuffer();
        textBuffer28.resetWithEmpty();
        java.lang.String str31 = textBuffer28.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler32 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer33 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler32);
        char[] charArray34 = textBuffer33.getTextBuffer();
        char[] charArray35 = textBuffer33.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler36 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer37 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler36);
        char[] charArray38 = textBuffer37.getTextBuffer();
        char[] charArray39 = textBuffer37.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler40 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer41 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler40);
        char[] charArray42 = textBuffer41.getCurrentSegment();
        textBuffer37.append(charArray42, (int) (short) 0, (int) '4');
        textBuffer33.resetWithShared(charArray42, (int) ' ', 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler49 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer50 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler49);
        char[] charArray51 = textBuffer50.getTextBuffer();
        char[] charArray52 = textBuffer50.getCurrentSegment();
        textBuffer33.append(charArray52, (int) (short) 1, 1);
        textBuffer28.resetWithShared(charArray52, (int) (short) -1, (int) 'a');
        textBuffer1.resetWithCopy(charArray52, 1, 1);
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(charArray29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(charArray34);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertNull(charArray38);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertNull(charArray51);
        org.junit.Assert.assertNotNull(charArray52);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        char[] charArray3 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength(102);
        textBuffer1.setCurrentLength((int) (short) 1);
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        char[] charArray3 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength(102);
        textBuffer1.releaseBuffers();
        char[] charArray7 = textBuffer1.contentsAsArray();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        int int3 = textBuffer1.size();
        int int4 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        char[] charArray6 = textBuffer1.getTextBuffer();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        int int8 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = textBuffer16.getTextBuffer();
        int int18 = textBuffer16.size();
        textBuffer16.resetWithEmpty();
        int int20 = textBuffer16.size();
        int int21 = textBuffer16.getCurrentSegmentSize();
        char[] charArray22 = textBuffer16.getTextBuffer();
        char[] charArray23 = textBuffer16.getCurrentSegment();
        textBuffer1.resetWithShared(charArray23, 10, 1);
        char[] charArray28 = textBuffer1.expandCurrentSegment(97);
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(charArray22);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray28);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        char[] charArray19 = textBuffer18.getTextBuffer();
        int int20 = textBuffer18.size();
        int int21 = textBuffer18.size();
        textBuffer18.ensureNotShared();
        char[] charArray23 = textBuffer18.getTextBuffer();
        char[] charArray24 = textBuffer18.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray24, (int) (byte) -1, (int) (short) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        char[] charArray30 = textBuffer29.getTextBuffer();
        int int31 = textBuffer29.size();
        int int32 = textBuffer29.getTextOffset();
        char[] charArray33 = textBuffer29.getTextBuffer();
        textBuffer29.ensureNotShared();
        textBuffer29.ensureNotShared();
        java.lang.String str36 = textBuffer29.toString();
        char[] charArray37 = textBuffer29.emptyAndGetCurrentSegment();
        char[] charArray38 = textBuffer29.getTextBuffer();
        textBuffer1.resetWithShared(charArray38, 32, (int) (byte) 100);
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNull(charArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertNull(charArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(charArray33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertNotNull(charArray38);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        int int3 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        char[] charArray6 = textBuffer5.getTextBuffer();
        char[] charArray7 = textBuffer5.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        char[] charArray10 = textBuffer9.getCurrentSegment();
        textBuffer5.append(charArray10, (int) (short) 0, (int) '4');
        textBuffer1.resetWithCopy(charArray10, (int) (byte) 10, (int) (byte) 10);
        boolean boolean17 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength(102);
        boolean boolean20 = textBuffer1.hasTextAsCharacters();
        java.lang.Class<?> wildcardClass21 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
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
        int int5 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        char[] charArray8 = textBuffer7.getCurrentSegment();
        char[] charArray9 = textBuffer7.contentsAsArray();
        textBuffer1.resetWithShared(charArray9, (int) (byte) 1, (-1));
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        char[] charArray6 = textBuffer5.getCurrentSegment();
        textBuffer1.append(charArray6, (int) (short) 0, (int) '4');
        int int10 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000 ");
        int int13 = textBuffer1.getCurrentSegmentSize();
        int int14 = textBuffer1.getTextOffset();
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        char[] charArray20 = textBuffer1.getTextBuffer();
        textBuffer1.append("hi!", (int) (short) 1, 0);
        textBuffer1.append(' ');
        textBuffer1.setCurrentLength(87);
        char[] charArray29 = textBuffer1.getCurrentSegment();
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(charArray7);
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray29);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithString("");
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithString("4");
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength((int) (byte) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        char[] charArray7 = textBuffer6.getCurrentSegment();
        int int8 = textBuffer6.getCurrentSegmentSize();
        textBuffer6.setCurrentLength((int) (short) 0);
        int int11 = textBuffer6.getTextOffset();
        char[] charArray12 = textBuffer6.getCurrentSegment();
        textBuffer1.resetWithShared(charArray12, (int) (short) 10, 97);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", 4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        int int3 = textBuffer1.size();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.setCurrentLength(4);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        char[] charArray19 = textBuffer18.getTextBuffer();
        int int20 = textBuffer18.size();
        int int21 = textBuffer18.getTextOffset();
        char[] charArray22 = textBuffer18.getTextBuffer();
        textBuffer18.setCurrentLength((int) '#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        char[] charArray27 = textBuffer26.getTextBuffer();
        char[] charArray28 = textBuffer26.getCurrentSegment();
        textBuffer18.append(charArray28, 100, (int) (byte) 10);
        textBuffer16.resetWithShared(charArray28, (int) (byte) 100, 100);
        textBuffer16.append(' ');
        char[] charArray37 = textBuffer16.emptyAndGetCurrentSegment();
        textBuffer1.resetWithCopy(charArray37, 102, (int) (byte) 100);
        textBuffer1.append(' ');
        char[] charArray44 = textBuffer1.expandCurrentSegment((int) '#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler45 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer46 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler45);
        char[] charArray47 = textBuffer46.getTextBuffer();
        int int48 = textBuffer46.size();
        int int49 = textBuffer46.getTextOffset();
        char[] charArray50 = textBuffer46.getTextBuffer();
        textBuffer46.setCurrentLength((int) '#');
        int int53 = textBuffer46.size();
        int int54 = textBuffer46.getTextOffset();
        int int55 = textBuffer46.getCurrentSegmentSize();
        int int56 = textBuffer46.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler57 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer58 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler57);
        char[] charArray59 = textBuffer58.getTextBuffer();
        int int60 = textBuffer58.size();
        textBuffer58.resetWithEmpty();
        java.lang.String str62 = textBuffer58.contentsAsString();
        textBuffer58.releaseBuffers();
        char[] charArray64 = textBuffer58.getCurrentSegment();
        char[] charArray65 = textBuffer58.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler66 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer67 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler66);
        char[] charArray68 = textBuffer67.getTextBuffer();
        int int69 = textBuffer67.size();
        int int70 = textBuffer67.getTextOffset();
        char[] charArray71 = textBuffer67.getTextBuffer();
        textBuffer67.setCurrentLength((int) '#');
        char[] charArray74 = textBuffer67.getCurrentSegment();
        textBuffer58.resetWithCopy(charArray74, 103, (int) '4');
        textBuffer46.resetWithShared(charArray74, (int) (byte) 0, 53);
        textBuffer1.resetWithShared(charArray74, (int) '#', 1);
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNull(charArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(charArray22);
        org.junit.Assert.assertNull(charArray27);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertNull(charArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(charArray50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 35 + "'", int55 == 35);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNull(charArray59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertNull(charArray68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNull(charArray71);
        org.junit.Assert.assertNotNull(charArray74);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        int int3 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithString("hi!");
        char[] charArray7 = textBuffer1.getTextBuffer();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000#");
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[h, i, !]");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
}


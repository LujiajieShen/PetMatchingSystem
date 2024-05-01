package org.apache.commons.compress.archivers.tar;

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
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int3 = tarArchiveOutputStream2.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy5 = null;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, 10, 33188);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream9.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int3 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        byte[] byteArray6 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("00");
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.write(byteArray6, 8, 4096);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4096' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[48, 48]");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.lang.String str3 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 10, 10240);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream7.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (int) (short) 100, 10240);
        zipArchiveOutputStream2.setMethod((int) (byte) 100);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker10 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray11 = jarMarker10.getLocalFileDataData();
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream12);
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField18 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray17);
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean29 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray26, 2, (int) '#');
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray17, byteArray26);
        cpioArchiveOutputStream13.write(byteArray26, 0, 0);
        jarMarker10.parseFromCentralDirectoryData(byteArray26, (int) ' ', 0);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(byteArray26, 33188, (int) (byte) 53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 0]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 1, 10, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (int) (short) 100, 10240);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy5 = null;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, 10, 33188);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry11 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("");
        long long12 = jarArchiveEntry11.getCrc();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream9.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.jar.JarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int3 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 12, 4);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = tarBuffer7.readRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: reading from an output buffer");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int3 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        int int5 = tarArchiveOutputStream2.getRecordSize();
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = tarArchiveOutputStream2.createArchiveEntry(file6, "070701");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField6 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray5);
        int int9 = zipArchiveInputStream1.read(byteArray5, (int) (short) 10, 4096);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, 511, (int) '#');
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        arArchiveInputStream13.close();
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream15);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream15);
        int int18 = tarArchiveOutputStream17.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer19 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream17);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer22 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream17, (int) (short) 12, 4);
        java.io.InputStream inputStream23 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream23);
        byte[] byteArray28 = new byte[] { (byte) -1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField29 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray28);
        int int32 = zipArchiveInputStream24.read(byteArray28, (int) (short) 10, 4096);
        boolean boolean33 = tarBuffer22.isEOFRecord(byteArray28);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = arArchiveInputStream13.read(byteArray28, (int) (byte) 1, 33188);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The stream is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy5 = null;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream7);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream7);
        int int10 = tarArchiveOutputStream9.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer11 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream9);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer14 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream9, (int) (short) 12, 4);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream15);
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField21 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray20);
        int int24 = zipArchiveInputStream16.read(byteArray20, (int) (short) 10, 4096);
        boolean boolean25 = tarBuffer14.isEOFRecord(byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(byteArray20, (int) (short) 3, 10240);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField6 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray5);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray14, 2, (int) '#');
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray14);
        cpioArchiveOutputStream1.write(byteArray14, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 1, 10, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, 3, (int) (short) 2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream10.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archives contains unclosed entries.");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, 3, (int) (short) 2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream10.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, 3, (int) (short) 2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = arArchiveOutputStream10.createArchiveEntry(file11, "070701");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, 3, (int) (short) 2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream11);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray16);
        int int20 = zipArchiveInputStream12.read(byteArray16, (int) (short) 10, 4096);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker22 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray23 = jarMarker22.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField24 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("`\n", byteArray23);
        int int25 = zipArchiveInputStream12.read(byteArray23);
        byte[] byteArray27 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes(0);
        boolean boolean28 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray23, byteArray27);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream10.write(byteArray23, 24576, 2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, 3, (int) (short) 2);
        byte[] byteArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(byteArray10, 16384, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int3 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 12, 4);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        byte[] byteArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarBuffer8.writeRecord(byteArray9, 100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(tarBuffer8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.lang.String str3 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 10, 10240);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry9 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("");
        byte[] byteArray10 = jarArchiveEntry9.getExtra();
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray19, 2, (int) '#');
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField23 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("ustar\000", byteArray19);
        jarArchiveEntry9.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodeCommentExtraField23);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry25 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry9);
        byte[] byteArray29 = new byte[] { (byte) -1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField30 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray29);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort31 = unicodeCommentExtraField30.getHeaderId();
        jarArchiveEntry25.removeExtraField(zipShort31);
        jarArchiveEntry25.setCrc((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream4.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
        org.junit.Assert.assertNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 1, 10, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1, 0]");
        org.junit.Assert.assertNotNull(zipShort31);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int3 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 12, 4);
        tarArchiveOutputStream2.setLongFileMode((int) (short) 10);
        int int10 = tarArchiveOutputStream2.getRecordSize();
        int int11 = tarArchiveOutputStream2.getRecordSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, 3, (int) (short) 2);
        zipArchiveOutputStream2.flush();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (int) (short) 100, 10240);
        zipArchiveOutputStream2.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, 3, (int) (short) 2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField15 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray14);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray23, 2, (int) '#');
        boolean boolean27 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray14, byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream10.write(byteArray23, 4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '100' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 0]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 1, 10, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, 40960);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        tarArchiveOutputStream8.finish();
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = tarArchiveOutputStream8.createArchiveEntry(file10, "TRAILER!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField6 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray5);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray14, 2, (int) '#');
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray14);
        cpioArchiveOutputStream1.write(byteArray14, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22, (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 1, 10, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int3 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 12, 4);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        tarArchiveOutputStream2.closeArchiveEntry();
        int int10 = tarArchiveOutputStream2.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker3 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray4 = jarMarker3.getLocalFileDataData();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField11 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray10);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray19, 2, (int) '#');
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, byteArray19);
        cpioArchiveOutputStream6.write(byteArray19, 0, 0);
        jarMarker3.parseFromCentralDirectoryData(byteArray19, (int) ' ', 0);
        byte[] byteArray30 = jarMarker3.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.write(byteArray30, 1, 8192);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '8192' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 0]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 1, 10, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField6 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray5);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray14, 2, (int) '#');
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray14);
        cpioArchiveOutputStream1.write(byteArray14, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry25 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort26 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField27 = jarArchiveEntry25.getExtraField(zipShort26);
        java.util.jar.Attributes attributes28 = jarArchiveEntry25.getManifestAttributes();
        java.nio.file.attribute.FileTime fileTime29 = jarArchiveEntry25.getLastAccessTime();
        jarArchiveEntry25.setInternalAttributes(61440);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry25);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream22.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 1, 10, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(zipExtraField27);
        org.junit.Assert.assertNull(attributes28);
        org.junit.Assert.assertNull(fileTime29);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, 3, (int) (short) 2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!");
        cpioArchiveEntry12.setNumberOfLinks((long) (short) 10);
        cpioArchiveEntry12.setSize((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream9.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream2);
        int int5 = tarArchiveOutputStream4.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream4);
        int int7 = tarArchiveOutputStream4.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream8 = archiveStreamFactory0.createArchiveOutputStream("!<arch>\n", (java.io.OutputStream) tarArchiveOutputStream4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: !<arch>? not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (int) (short) 100, 10240);
        zipArchiveOutputStream2.setMethod((int) (byte) 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.putArchiveEntry(archiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (int) (short) 100, 10240);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream8.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.lang.String str3 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 10, 10240);
        tarArchiveOutputStream7.flush();
        java.io.File file9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = tarArchiveOutputStream7.createArchiveEntry(file9, "ustar\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream9, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField6 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray5);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray14, 2, (int) '#');
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray14);
        cpioArchiveOutputStream1.write(byteArray14, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        byte[] byteArray30 = new byte[] { (byte) 52, (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) 51 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream23.write(byteArray30, 4095, 420);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '420' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 1, 10, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[52, -1, 100, 100, 100, 51]");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (int) (short) 100, 10240);
        zipArchiveOutputStream2.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int3 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        int int5 = tarBuffer4.getCurrentRecordNum();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = tarBuffer4.readRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: reading from an output buffer");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream2);
        int int5 = tarArchiveOutputStream4.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream4);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream4, (int) (short) 12, 4);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = tarArchiveOutputStream4.buffer;
        tarArchiveOutputStream4.closeArchiveEntry();
        int int12 = tarArchiveOutputStream4.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream13 = archiveStreamFactory0.createArchiveOutputStream(" \000", (java.io.OutputStream) tarArchiveOutputStream4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver:  ? not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertNotNull(tarBuffer10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.lang.String str3 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 10, 10240);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        arArchiveOutputStream8.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry11 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("");
        byte[] byteArray12 = jarArchiveEntry11.getExtra();
        jarArchiveEntry11.setCrc((long) 'a');
        jarArchiveEntry11.setCompressedSize(8589934591L);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream8.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.jar.JarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
        org.junit.Assert.assertNull(byteArray12);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.lang.String str3 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 10, 10240);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        arArchiveOutputStream8.closeArchiveEntry();
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = arArchiveOutputStream8.createArchiveEntry(file10, "never");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, 40960);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.lang.String str3 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 10, 10240);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream7.buffer;
        int int9 = tarBuffer8.getCurrentBlockNum();
        // The following exception was thrown during execution in test generation
        try {
            tarBuffer8.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        tarArchiveOutputStream8.finish();
        tarArchiveOutputStream8.setLongFileMode(256);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy5 = null;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, 10, 33188);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (short) (byte) 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 49");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream2);
        java.lang.String str5 = zipArchiveOutputStream4.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6, (int) (byte) 10, 10240);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream10 = archiveStreamFactory0.createArchiveOutputStream("org.apache.commons.compress.archivers.ArchiveException: !<arch>\n", (java.io.OutputStream) tarArchiveOutputStream9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: org.apache.commons.compress.archivers.ArchiveException: !<arch>? not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, 3, (int) (short) 2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 512, 10240);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField8 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray7);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray16, 2, (int) '#');
        boolean boolean20 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray7, byteArray16);
        cpioArchiveOutputStream3.write(byteArray16, 0, 0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream24 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream26 = archiveStreamFactory0.createArchiveOutputStream("UTF8", (java.io.OutputStream) cpioArchiveOutputStream3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: UTF8 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 1, 10, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        tarArchiveOutputStream8.finish();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = tarArchiveOutputStream8.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!");
        cpioArchiveEntry12.setRemoteDeviceMin((long) '4');
        boolean boolean15 = cpioArchiveEntry12.isBlockDevice();
        cpioArchiveEntry12.setGID((long) '4');
        boolean boolean18 = cpioArchiveEntry12.isNetwork();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream8.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertNotNull(tarBuffer10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (int) (short) 100, 10240);
        zipArchiveOutputStream2.setMethod((int) (byte) 100);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.setComment("`\n");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.lang.String str3 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 10, 10240);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream8.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archives contains unclosed entries.");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.lang.String str3 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 10, 10240);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        arArchiveOutputStream8.closeArchiveEntry();
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = arArchiveOutputStream8.createArchiveEntry(file10, "0\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField6 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray5);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray14, 2, (int) '#');
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray14);
        cpioArchiveOutputStream1.write(byteArray14, 0, 0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream22 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 1, 10, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int3 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 12, 4);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (byte) 1, (int) '#');
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray20, 2, (int) '#');
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField26 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("ustar\000", byteArray20, 0, 3);
        boolean boolean27 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("ustar ", byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            tarBuffer10.writeRecord(byteArray20, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: record has length '6' with offset '100' which is less than the record size of '35'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 1, 10, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream8.write(40960);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (int) (short) 100, 10240);
        zipArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray10 = asiExtraField9.getCentralDirectoryData();
        asiExtraField9.setMode(49152);
        byte[] byteArray13 = asiExtraField9.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(byteArray13, 0, (int) (byte) 49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[57, 104, -33, -123, 0, -128, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream8.write(128);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.lang.String str3 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 10, 10240);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream7.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream7, 28789);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream7.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
        org.junit.Assert.assertNotNull(tarBuffer8);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (int) (short) 100, 10240);
        zipArchiveOutputStream2.setMethod(4);
        zipArchiveOutputStream2.setFallbackToUTF8(true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField6 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray5);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray14, 2, (int) '#');
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray14);
        cpioArchiveOutputStream1.write(byteArray14, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!");
        cpioArchiveEntry24.setRemoteDeviceMin((long) '4');
        short short27 = cpioArchiveEntry24.getFormat();
        long long28 = cpioArchiveEntry24.getGID();
        java.lang.String str29 = cpioArchiveEntry24.getName();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 1, 10, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 1 + "'", short27 == (short) 1);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.lang.String str3 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 10, 10240);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream7.buffer;
        int int9 = tarBuffer8.getRecordSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10240 + "'", int9 == 10240);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.lang.String str3 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 10, 10240);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream7.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream7, 28789);
        tarArchiveOutputStream7.flush();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
        org.junit.Assert.assertNotNull(tarBuffer8);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int3 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 12, 4);
        int int8 = tarBuffer7.getCurrentRecordNum();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (int) (short) 100, 10240);
        zipArchiveOutputStream2.setMethod(4);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.lang.String str3 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 10, 10240);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        jarArchiveOutputStream4.setFallbackToUTF8(true);
        boolean boolean11 = jarArchiveOutputStream4.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream4.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream2);
        zipArchiveOutputStream4.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream4, (int) (short) 100, 10240);
        zipArchiveOutputStream4.setMethod(4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream12 = archiveStreamFactory0.createArchiveOutputStream("070701", (java.io.OutputStream) zipArchiveOutputStream4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: 070701 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.lang.String str3 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 10, 10240);
        tarArchiveOutputStream7.flush();
        java.io.File file9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = tarArchiveOutputStream7.createArchiveEntry(file9, "org.apache.commons.compress.archivers.ArchiveException: !<arch>\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField6 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray5);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray14, 2, (int) '#');
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray14);
        cpioArchiveOutputStream1.write(byteArray14, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        java.io.OutputStream outputStream23 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream23);
        byte[] byteArray28 = new byte[] { (byte) -1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField29 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray28);
        byte[] byteArray37 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray37, 2, (int) '#');
        boolean boolean41 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray28, byteArray37);
        cpioArchiveOutputStream24.write(byteArray37, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.write(byteArray37, 33188, 24576);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 1, 10, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, 0]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[0, 1, 10, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream8.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        tarArchiveOutputStream10.closeArchiveEntry();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertNotNull(tarBuffer9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField6 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray5);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray14, 2, (int) '#');
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray14);
        cpioArchiveOutputStream1.write(byteArray14, 0, 0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream22 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray24 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.write(byteArray24, 263, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 1, 10, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream2);
        zipArchiveOutputStream4.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream4.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream4.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream11 = archiveStreamFactory0.createArchiveOutputStream("././@LongLink", (java.io.OutputStream) zipArchiveOutputStream4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: ././@LongLink not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.lang.String str3 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 10, 10240);
        tarArchiveOutputStream7.flush();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray10 = asiExtraField9.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream7.write(byteArray10, 6, 35);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '35' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int3 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        int int5 = tarBuffer4.getCurrentRecordNum();
        int int6 = tarBuffer4.getRecordSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (int) (short) 100, 10240);
        tarArchiveOutputStream7.closeArchiveEntry();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (int) (short) 100, 10240);
        zipArchiveOutputStream2.setMethod((int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, 1);
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes(4095);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField15 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("hi!", byteArray14);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = unicodeCommentExtraField15.getHeaderId();
        byte[] byteArray17 = zipShort16.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.write(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 15]");
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[117, 99]");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.lang.String str3 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 10, 10240);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        arArchiveOutputStream8.closeArchiveEntry();
        arArchiveOutputStream8.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream8);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray13 = asiExtraField12.getCentralDirectoryData();
        asiExtraField12.setMode(49152);
        byte[] byteArray16 = asiExtraField12.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream8.write(byteArray16, 49152, 420);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[57, 104, -33, -123, 0, -128, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.lang.String str3 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 10, 10240);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, 3, (int) (short) 2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.setEncoding("-      -1 ");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: -      -1 ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream8.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream8, 40960);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertNotNull(tarBuffer9);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int3 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 12, 4);
        tarArchiveOutputStream2.setLongFileMode((int) (short) 10);
        tarArchiveOutputStream2.setLongFileMode(263);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (int) (short) 100, 10240);
        zipArchiveOutputStream2.setComment("org.apache.commons.compress.archivers.ArchiveException: ");
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField6 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray5);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray14, 2, (int) '#');
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray14);
        cpioArchiveOutputStream1.write(byteArray14, 0, 0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream22 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer24 = tarArchiveOutputStream23.buffer;
        java.io.OutputStream outputStream25 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream25);
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField31 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray30);
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean42 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray39, 2, (int) '#');
        boolean boolean43 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray30, byteArray39);
        cpioArchiveOutputStream26.write(byteArray39, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream23.write(byteArray39, (int) (byte) 0, (int) (byte) 50);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '50' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 1, 10, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tarBuffer24);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, 0]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 1, 10, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.lang.String str3 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 10, 10240);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        jarArchiveOutputStream4.setComment("`\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (int) (short) 100, 10240);
        zipArchiveOutputStream2.setMethod((int) (byte) 100);
        java.lang.String str10 = zipArchiveOutputStream2.getEncoding();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (short) 4);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int3 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry7 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField9 = jarArchiveEntry7.getExtraField(zipShort8);
        java.util.jar.Attributes attributes10 = jarArchiveEntry7.getManifestAttributes();
        java.nio.file.attribute.FileTime fileTime11 = jarArchiveEntry7.getLastAccessTime();
        java.lang.String str12 = jarArchiveEntry7.getComment();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.jar.JarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertNull(zipExtraField9);
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertNull(fileTime11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int3 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 12, 4);
        tarArchiveOutputStream2.setLongFileMode((int) (short) 10);
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray20, 2, (int) '#');
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField26 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("ustar\000", byteArray20, 0, 3);
        boolean boolean27 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("ustar ", byteArray20);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField28 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField(" \000", byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.write(byteArray20, 49152, 1000);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1000' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 1, 10, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int3 = tarArchiveOutputStream2.getRecordSize();
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int3 = tarArchiveOutputStream2.getRecordSize();
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = arArchiveOutputStream5.createArchiveEntry(file6, " \000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.lang.String str3 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 10, 10240);
        tarArchiveOutputStream7.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream7.buffer;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
        org.junit.Assert.assertNotNull(tarBuffer9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.lang.String str3 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 10, 10240);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        java.io.File file9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = arArchiveOutputStream8.createArchiveEntry(file9, "././@LongLink");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, 3, (int) (short) 2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = arArchiveOutputStream10.createArchiveEntry(file11, "`\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int3 = tarArchiveOutputStream2.getRecordSize();
        tarArchiveOutputStream2.closeArchiveEntry();
        tarArchiveOutputStream2.setLongFileMode(4096);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int3 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 12, 4);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        tarBuffer8.close();
        int int10 = tarBuffer8.getBlockSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10240 + "'", int10 == 10240);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, 3, (int) (short) 2);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField6 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray5);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray14, 2, (int) '#');
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray14);
        cpioArchiveOutputStream1.write(byteArray14, 0, 0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream22 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer24 = tarArchiveOutputStream23.buffer;
        int int25 = tarBuffer24.getBlockSize();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 1, 10, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tarBuffer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10240 + "'", int25 == 10240);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int3 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 12, 4);
        tarArchiveOutputStream2.setLongFileMode((int) (short) 10);
        int int10 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry12 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("");
        byte[] byteArray13 = jarArchiveEntry12.getExtra();
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean25 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray22, 2, (int) '#');
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField26 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("ustar\000", byteArray22);
        jarArchiveEntry12.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodeCommentExtraField26);
        byte[] byteArray28 = unicodeCommentExtraField26.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.write(byteArray28, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '10' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 1, 10, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, 57, -14, 22, 92, 117, 115, 116, 97, 114, 0]");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int3 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 12, 4);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (byte) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, (short) (byte) 53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 53");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) zipArchiveOutputStream2, (int) (byte) 49);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, 3, (int) (short) 2);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray14 = tarArchiveEntry13.getDirectoryEntries();
        boolean boolean15 = tarArchiveEntry11.equals(tarArchiveEntry13);
        boolean boolean16 = tarArchiveEntry11.isDirectory();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream9.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarArchiveEntryArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("");
        byte[] byteArray2 = jarArchiveEntry1.getExtra();
        java.nio.file.attribute.FileTime fileTime3 = jarArchiveEntry1.getCreationTime();
        jarArchiveEntry1.setUnixMode((int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = org.apache.commons.compress.archivers.zip.UnicodePathExtraField.UPATH_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = jarArchiveEntry1.getExtraField(zipShort6);
        jarArchiveEntry1.setExternalAttributes((long) 1);
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10);
        int int13 = tarArchiveOutputStream12.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer14 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream12);
        int int15 = tarBuffer14.getCurrentBlockNum();
        boolean boolean16 = jarArchiveEntry1.equals((java.lang.Object) tarBuffer14);
        long long17 = jarArchiveEntry1.getCompressedSize();
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNull(fileTime3);
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNull(zipExtraField7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int3 = tarArchiveOutputStream2.getRecordSize();
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream5.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archives contains unclosed entries.");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField6 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray5);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray14, 2, (int) '#');
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray14);
        cpioArchiveOutputStream1.write(byteArray14, 0, 0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream22 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, (int) '4', 10);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 1, 10, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy5 = null;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, 10, 33188);
        zipArchiveOutputStream2.flush();
        java.lang.String str11 = zipArchiveOutputStream2.getEncoding();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy5 = null;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, 10, 33188);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream2.closeArchiveEntry();
        zipArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer15 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) zipArchiveOutputStream2, 51);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = tarBuffer15.readRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: reading from an output buffer");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int3 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        int int5 = tarBuffer4.getCurrentBlockNum();
        int int6 = tarBuffer4.getBlockSize();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField13 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray12);
        int int16 = zipArchiveInputStream8.read(byteArray12, (int) (short) 10, 4096);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream8, 511, (int) '#');
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean31 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray28, 2, (int) '#');
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField32 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("ustar\000", byteArray28);
        int int35 = tarArchiveInputStream19.read(byteArray28, (int) (byte) 51, (-1));
        // The following exception was thrown during execution in test generation
        try {
            tarBuffer4.writeRecord(byteArray28);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: record to write has length '6' which is not the record size of '512'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10240 + "'", int6 == 10240);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 1, 10, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField6 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray5);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray14, 2, (int) '#');
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray14);
        cpioArchiveOutputStream1.write(byteArray14, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry24 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("");
        byte[] byteArray25 = jarArchiveEntry24.getExtra();
        java.nio.file.attribute.FileTime fileTime26 = jarArchiveEntry24.getCreationTime();
        jarArchiveEntry24.setUnixMode((int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort29 = org.apache.commons.compress.archivers.zip.UnicodePathExtraField.UPATH_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField30 = jarArchiveEntry24.getExtraField(zipShort29);
        jarArchiveEntry24.setExternalAttributes((long) 1);
        int int33 = jarArchiveEntry24.getUnixMode();
        jarArchiveEntry24.setCompressedSize(52L);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.jar.JarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 1, 10, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(byteArray25);
        org.junit.Assert.assertNull(fileTime26);
        org.junit.Assert.assertNotNull(zipShort29);
        org.junit.Assert.assertNull(zipExtraField30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (int) (short) 100, 10240);
        zipArchiveOutputStream2.setMethod((int) (byte) 100);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        boolean boolean14 = zipArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!");
        cpioArchiveEntry16.setRemoteDeviceMin((long) '4');
        cpioArchiveEntry16.setRemoteDeviceMin((long) 61440);
        long long21 = cpioArchiveEntry16.getChksum();
        long long22 = cpioArchiveEntry16.getUID();
        boolean boolean23 = cpioArchiveEntry16.isDirectory();
        boolean boolean24 = cpioArchiveEntry16.isDirectory();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy5 = null;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, 10, 33188);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.putArchiveEntry(archiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.lang.String str3 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 10, 10240);
        tarArchiveOutputStream7.flush();
        tarArchiveOutputStream7.setLongFileMode((int) (byte) 48);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, 3, (int) (short) 2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray13 = asiExtraField12.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("hi!", byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream10.write(byteArray13, 8192, 2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.lang.String str3 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 10, 10240);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        arArchiveOutputStream8.closeArchiveEntry();
        arArchiveOutputStream8.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream8);
        arArchiveOutputStream8.finish();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream9.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, 3, (int) (short) 2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream9, 6, 35);
        int int13 = tarBuffer12.getCurrentBlockNum();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int3 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 12, 4);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (byte) 1, (int) '#');
        int int11 = tarBuffer10.getRecordSize();
        int int12 = tarBuffer10.getRecordSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.lang.String str3 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream5);
        zipArchiveOutputStream7.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream7.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream7, 3, (int) (short) 2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        jarArchiveOutputStream4.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField8 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray7);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray16, 2, (int) '#');
        boolean boolean20 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray7, byteArray16);
        cpioArchiveOutputStream3.write(byteArray16, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream25 = archiveStreamFactory0.createArchiveOutputStream("00", (java.io.OutputStream) cpioArchiveOutputStream3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: 00 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 1, 10, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int3 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        int int5 = tarBuffer4.getCurrentBlockNum();
        int int6 = tarBuffer4.getBlockSize();
        int int7 = tarBuffer4.getRecordSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10240 + "'", int6 == 10240);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.lang.String str3 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 10, 10240);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        arArchiveOutputStream8.closeArchiveEntry();
        arArchiveOutputStream8.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream8);
        java.io.File file12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = cpioArchiveOutputStream11.createArchiveEntry(file12, "TRAILER!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, 3, (int) (short) 2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        int int11 = tarArchiveOutputStream9.getRecordSize();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (int) (short) 100, 10240);
        zipArchiveOutputStream2.setComment("org.apache.commons.compress.archivers.ArchiveException: ");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (int) ' ', 28789);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12, (short) 2);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int3 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 29127);
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = tarArchiveOutputStream2.createArchiveEntry(file6, "!<arch>\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int3 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        int int5 = tarBuffer4.getCurrentRecordNum();
        int int6 = tarBuffer4.getCurrentBlockNum();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, 3, (int) (short) 2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        zipArchiveOutputStream2.setFallbackToUTF8(false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (int) (short) 100, 10240);
        zipArchiveOutputStream2.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.setEncoding("org.apache.commons.compress.archivers.ArchiveException: ");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: org.apache.commons.compress.archivers.ArchiveException: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer11 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) jarArchiveOutputStream10);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy5 = null;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, 10, 33188);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream2.closeArchiveEntry();
        zipArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer15 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) zipArchiveOutputStream2, 51);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream16.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField6 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray5);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray14, 2, (int) '#');
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray14);
        cpioArchiveOutputStream1.write(byteArray14, 0, 0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream22 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 1, 10, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 10, 40960);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int3 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        int int5 = tarBuffer4.getCurrentBlockNum();
        // The following exception was thrown during execution in test generation
        try {
            tarBuffer4.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        asiExtraField0.setDirectory(false);
        int int3 = asiExtraField0.getGroupId();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream4);
        int int7 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer11 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream6, (int) (short) 12, 4);
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream12);
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField18 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray17);
        int int21 = zipArchiveInputStream13.read(byteArray17, (int) (short) 10, 4096);
        boolean boolean22 = tarBuffer11.isEOFRecord(byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            asiExtraField0.parseFromLocalFileData(byteArray17, (int) (short) 2, 12336);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 257, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("");
        byte[] byteArray2 = jarArchiveEntry1.getExtra();
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean14 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray11, 2, (int) '#');
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField15 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("ustar\000", byteArray11);
        jarArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodeCommentExtraField15);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry17 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField22 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray21);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort23 = unicodeCommentExtraField22.getHeaderId();
        jarArchiveEntry17.removeExtraField(zipShort23);
        byte[] byteArray28 = new byte[] { (byte) -1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField29 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray28);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort30 = unicodeCommentExtraField29.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField31 = jarArchiveEntry17.getExtraField(zipShort30);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry33 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!");
        cpioArchiveEntry33.setRemoteDeviceMin((long) '4');
        cpioArchiveEntry33.setRemoteDeviceMin((long) 61440);
        cpioArchiveEntry33.setChksum(0L);
        boolean boolean40 = jarArchiveEntry17.equals((java.lang.Object) cpioArchiveEntry33);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry41 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry17);
        java.io.OutputStream outputStream42 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream43 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream42);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream44 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream42);
        tarArchiveOutputStream44.setLongFileMode(0);
        boolean boolean47 = jarArchiveEntry41.equals((java.lang.Object) 0);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 1, 10, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 0]");
        org.junit.Assert.assertNotNull(zipShort23);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, 0]");
        org.junit.Assert.assertNotNull(zipShort30);
        org.junit.Assert.assertNull(zipExtraField31);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy5 = null;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, 10, 33188);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream2.closeArchiveEntry();
        zipArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer15 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) zipArchiveOutputStream2, 51);
        zipArchiveOutputStream2.flush();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 4, 256);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.lang.String str3 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 10, 10240);
        tarArchiveOutputStream7.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = tarArchiveOutputStream7.buffer;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
        org.junit.Assert.assertNotNull(tarBuffer10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream2.setLongFileMode(0);
        tarArchiveOutputStream2.setLongFileMode(4096);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.lang.String str3 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 10, 10240);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        arArchiveOutputStream8.closeArchiveEntry();
        arArchiveOutputStream8.finish();
        arArchiveOutputStream8.closeArchiveEntry();
        arArchiveOutputStream8.closeArchiveEntry();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.lang.String str3 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 10, 10240);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        arArchiveOutputStream8.closeArchiveEntry();
        arArchiveOutputStream8.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream8);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream11.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.lang.String str3 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 10, 10240);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream7.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream7, 28789);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer11 = tarArchiveOutputStream7.buffer;
        int int12 = tarBuffer11.getCurrentBlockNum();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = tarBuffer11.readRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: reading from an output buffer");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertNotNull(tarBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream8.buffer;
        tarArchiveOutputStream8.finish();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertNotNull(tarBuffer9);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int3 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream2.buffer;
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((-1));
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            tarBuffer5.writeRecord(byteArray7, 29127);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray8);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.lang.String str3 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 10, 10240);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream7.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream7, 28789);
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry13 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry(" \000", (long) (byte) 54);
        int int14 = arArchiveEntry13.getMode();
        java.lang.String str15 = arArchiveEntry13.getName();
        int int16 = arArchiveEntry13.getMode();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream7.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) arArchiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.ar.ArArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 33188 + "'", int14 == 33188);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " \000" + "'", str15, " \000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 33188 + "'", int16 == 33188);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy5 = null;
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, 10, 33188);
        zipArchiveOutputStream2.flush();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (short) (byte) 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 51");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream2);
        java.lang.String str5 = zipArchiveOutputStream4.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6, (int) (byte) 10, 10240);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        arArchiveOutputStream10.closeArchiveEntry();
        arArchiveOutputStream10.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream14 = archiveStreamFactory0.createArchiveOutputStream("org.apache.commons.compress.archivers.ArchiveException: UTF8", (java.io.OutputStream) arArchiveOutputStream10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: org.apache.commons.compress.archivers.ArchiveException: UTF8 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
    }
}


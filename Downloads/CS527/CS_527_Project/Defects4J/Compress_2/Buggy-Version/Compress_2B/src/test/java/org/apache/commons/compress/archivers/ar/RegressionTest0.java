package org.apache.commons.compress.archivers.ar;

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
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long11 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray10);
        boolean boolean13 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream4.write(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 167774820L + "'", long11 == 167774820L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        java.lang.String str3 = tarArchiveOutputStream2.getDefaultFileExtension();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        boolean boolean5 = jarArchiveOutputStream4.isSeekable();
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long12 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray11);
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream4.write(byteArray11, 40960, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tar" + "'", str3, "tar");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 167774820L + "'", long12 == 167774820L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        java.lang.String str3 = tarArchiveOutputStream2.getDefaultFileExtension();
        tarArchiveOutputStream2.setDebug(true);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long12 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray11);
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.write(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '5' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tar" + "'", str3, "tar");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 167774820L + "'", long12 == 167774820L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = arArchiveInputStream8.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: failed to read header");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = tarArchiveInputStream4.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: input buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        int int30 = arArchiveInputStream8.read(byteArray25);
        java.io.InputStream inputStream31 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream32 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream31);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream31, 0, 100);
        tarArchiveInputStream35.reset();
        tarArchiveInputStream35.reset();
        java.io.InputStream inputStream38 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream41 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream38, "org.apache.commons.compress.archivers.ArchiveException", true);
        java.io.InputStream inputStream42 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream43 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream42);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream46 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream42, 0, 100);
        tarArchiveInputStream46.close();
        byte[] byteArray49 = new byte[] { (byte) 10 };
        int int52 = tarArchiveInputStream46.read(byteArray49, (-1), (int) (short) 1);
        byte[] byteArray58 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long59 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray58);
        int int62 = tarArchiveInputStream46.read(byteArray58, 8192, 40960);
        boolean boolean64 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray58, (int) (byte) 10);
        int int67 = zipArchiveInputStream41.read(byteArray58, (int) (byte) 100, 49152);
        int int70 = tarArchiveInputStream35.read(byteArray58, 24576, (int) (short) 10);
        int int71 = arArchiveInputStream8.read(byteArray58);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry72 = arArchiveInputStream8.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: failed to read header");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[10]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 167774820L + "'", long59 == 167774820L);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        int int30 = arArchiveInputStream8.read(byteArray25);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry31 = arArchiveInputStream8.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: failed to read header");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream1, 0, 100);
        int int6 = tarArchiveInputStream5.getRecordSize();
        long long8 = tarArchiveInputStream5.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream10, 0, 100);
        tarArchiveInputStream14.close();
        byte[] byteArray17 = new byte[] { (byte) 10 };
        int int20 = tarArchiveInputStream14.read(byteArray17, (-1), (int) (short) 1);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long27 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray26);
        int int30 = tarArchiveInputStream14.read(byteArray26, 8192, 40960);
        int int31 = arArchiveInputStream9.read(byteArray26);
        arArchiveInputStream9.close();
        int int33 = arArchiveInputStream9.read();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream34 = archiveStreamFactory0.createArchiveInputStream((java.io.InputStream) arArchiveInputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 167774820L + "'", long27 == 167774820L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        int int30 = arArchiveInputStream8.read(byteArray25);
        arArchiveInputStream8.close();
        java.io.InputStream inputStream32 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream35 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream32, "org.apache.commons.compress.archivers.ArchiveException", true);
        java.io.InputStream inputStream36 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream37 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream36);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream36, 0, 100);
        tarArchiveInputStream40.close();
        byte[] byteArray43 = new byte[] { (byte) 10 };
        int int46 = tarArchiveInputStream40.read(byteArray43, (-1), (int) (short) 1);
        byte[] byteArray52 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long53 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray52);
        int int56 = tarArchiveInputStream40.read(byteArray52, 8192, 40960);
        boolean boolean58 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray52, (int) (byte) 10);
        int int61 = zipArchiveInputStream35.read(byteArray52, (int) (byte) 100, 49152);
        boolean boolean63 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray52, 1);
        int int64 = arArchiveInputStream8.read(byteArray52);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry65 = arArchiveInputStream8.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: failed to read header");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[10]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 167774820L + "'", long53 == 167774820L);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        int int30 = arArchiveInputStream8.read(byteArray25);
        byte[] byteArray36 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long37 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray36);
        boolean boolean39 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray36, (int) (short) 0);
        int int42 = arArchiveInputStream8.read(byteArray36, 49152, 16384);
        java.lang.Class<?> wildcardClass43 = byteArray36.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 167774820L + "'", long37 == 167774820L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        boolean boolean31 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray25, (int) (byte) 10);
        int int34 = arArchiveInputStream8.read(byteArray25, 0, 29127);
        arArchiveInputStream8.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry36 = arArchiveInputStream8.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: failed to read header");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) (short) 0);
        tarArchiveInputStream4.mark((int) '4');
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12);
        tarArchiveInputStream4.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream13);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream13);
        arArchiveOutputStream15.closeArchiveEntry();
        arArchiveOutputStream15.closeArchiveEntry();
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong23 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray22);
        boolean boolean25 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray22, 1);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream15.write(byteArray22);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        boolean boolean31 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray25, (int) (byte) 10);
        int int34 = arArchiveInputStream8.read(byteArray25, 0, 29127);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry35 = arArchiveInputStream8.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: failed to read header");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream5, 0, 100);
        int int10 = tarArchiveInputStream9.getRecordSize();
        long long12 = tarArchiveInputStream9.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream9);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream14);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream14, 0, 100);
        tarArchiveInputStream18.close();
        byte[] byteArray21 = new byte[] { (byte) 10 };
        int int24 = tarArchiveInputStream18.read(byteArray21, (-1), (int) (short) 1);
        byte[] byteArray30 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long31 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray30);
        int int34 = tarArchiveInputStream18.read(byteArray30, 8192, 40960);
        int int35 = arArchiveInputStream13.read(byteArray30);
        byte[] byteArray41 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long42 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray41);
        boolean boolean44 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray41, (int) (short) 0);
        int int47 = arArchiveInputStream13.read(byteArray41, 49152, 16384);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.write(byteArray41);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '5' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 167774820L + "'", long31 == 167774820L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 167774820L + "'", long42 == 167774820L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray4);
        boolean boolean8 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray4, (int) (byte) 100);
        long long9 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 174325761L + "'", long9 == 174325761L);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray6);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray6);
        boolean boolean10 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray6, (int) (byte) 100);
        boolean boolean12 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray6, (int) (short) 4);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream1.write(byteArray6, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        int int30 = arArchiveInputStream8.read(byteArray25);
        // The following exception was thrown during execution in test generation
        try {
            long long32 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4, 24576, 40960);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray12);
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, 1);
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray12, 1024);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream4.write(byteArray12, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        java.lang.String str3 = tarArchiveOutputStream2.getDefaultFileExtension();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        boolean boolean5 = jarArchiveOutputStream4.isSeekable();
        java.lang.String str6 = jarArchiveOutputStream4.getEncoding();
        jarArchiveOutputStream4.setFallbackToUTF8(false);
        jarArchiveOutputStream4.setMethod(0);
        jarArchiveOutputStream4.setUseLanguageEncodingFlag(true);
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream13);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream13, 0, 100);
        int int18 = tarArchiveInputStream17.getRecordSize();
        long long20 = tarArchiveInputStream17.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream21 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream17);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream22, 0, 100);
        tarArchiveInputStream26.close();
        byte[] byteArray29 = new byte[] { (byte) 10 };
        int int32 = tarArchiveInputStream26.read(byteArray29, (-1), (int) (short) 1);
        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long39 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray38);
        int int42 = tarArchiveInputStream26.read(byteArray38, 8192, 40960);
        int int43 = arArchiveInputStream21.read(byteArray38);
        byte[] byteArray49 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long50 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray49);
        boolean boolean52 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray49, (int) (short) 0);
        int int55 = arArchiveInputStream21.read(byteArray49, 49152, 16384);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream4.write(byteArray49, (int) (short) 2, (int) (short) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tar" + "'", str3, "tar");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[10]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 167774820L + "'", long39 == 167774820L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 167774820L + "'", long50 == 167774820L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        int int30 = arArchiveInputStream8.read(byteArray25);
        arArchiveInputStream8.close();
        byte[] byteArray32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int33 = arArchiveInputStream8.read(byteArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        java.lang.String str3 = tarArchiveOutputStream2.getDefaultFileExtension();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream6, 0, 100);
        int int11 = tarArchiveInputStream10.getRecordSize();
        long long13 = tarArchiveInputStream10.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream14 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream10);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream15);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream15, 0, 100);
        tarArchiveInputStream19.close();
        byte[] byteArray22 = new byte[] { (byte) 10 };
        int int25 = tarArchiveInputStream19.read(byteArray22, (-1), (int) (short) 1);
        byte[] byteArray31 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long32 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray31);
        int int35 = tarArchiveInputStream19.read(byteArray31, 8192, 40960);
        int int36 = arArchiveInputStream14.read(byteArray31);
        boolean boolean38 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray31, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.write(byteArray31, (int) (short) 12, 1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tar" + "'", str3, "tar");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 167774820L + "'", long32 == 167774820L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream2, 0, 100);
        tarArchiveInputStream6.reset();
        tarArchiveInputStream6.reset();
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9, "org.apache.commons.compress.archivers.ArchiveException", true);
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream13);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream13, 0, 100);
        tarArchiveInputStream17.close();
        byte[] byteArray20 = new byte[] { (byte) 10 };
        int int23 = tarArchiveInputStream17.read(byteArray20, (-1), (int) (short) 1);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long30 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray29);
        int int33 = tarArchiveInputStream17.read(byteArray29, 8192, 40960);
        boolean boolean35 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray29, (int) (byte) 10);
        int int38 = zipArchiveInputStream12.read(byteArray29, (int) (byte) 100, 49152);
        int int41 = tarArchiveInputStream6.read(byteArray29, 24576, (int) (short) 10);
        org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream42 = archiveStreamFactory0.createArchiveInputStream("tar", (java.io.InputStream) tarArchiveInputStream6);
        java.io.InputStream inputStream43 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream44 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream43);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream47 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream43, 0, 100);
        int int48 = tarArchiveInputStream47.getRecordSize();
        long long50 = tarArchiveInputStream47.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream51 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream47);
        java.io.InputStream inputStream52 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream53 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream52);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream56 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream52, 0, 100);
        tarArchiveInputStream56.close();
        byte[] byteArray59 = new byte[] { (byte) 10 };
        int int62 = tarArchiveInputStream56.read(byteArray59, (-1), (int) (short) 1);
        byte[] byteArray68 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long69 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray68);
        int int72 = tarArchiveInputStream56.read(byteArray68, 8192, 40960);
        int int73 = arArchiveInputStream51.read(byteArray68);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream74 = archiveStreamFactory0.createArchiveInputStream((java.io.InputStream) arArchiveInputStream51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 167774820L + "'", long30 == 167774820L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(archiveInputStream42);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[10]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 167774820L + "'", long69 == 167774820L);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream2, 0, 100);
        int int7 = tarArchiveInputStream6.getRecordSize();
        long long9 = tarArchiveInputStream6.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream6);
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream11, 0, 100);
        tarArchiveInputStream15.close();
        byte[] byteArray18 = new byte[] { (byte) 10 };
        int int21 = tarArchiveInputStream15.read(byteArray18, (-1), (int) (short) 1);
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long28 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray27);
        int int31 = tarArchiveInputStream15.read(byteArray27, 8192, 40960);
        int int32 = arArchiveInputStream10.read(byteArray27);
        boolean boolean34 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray27, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream1.write(byteArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 167774820L + "'", long28 == 167774820L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        long long5 = org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream1, (java.io.OutputStream) tarArchiveOutputStream3);
        cpioArchiveInputStream1.closeEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        long long9 = jarArchiveInputStream7.skip((long) (short) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = jarArchiveInputStream7.getNextZipEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry11 = jarArchiveInputStream7.getNextJarEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = jarArchiveInputStream7.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = jarArchiveInputStream7.getNextZipEntry();
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong19 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray18);
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray18, 1);
        int int22 = jarArchiveInputStream7.read(byteArray18);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry23 = jarArchiveInputStream7.getNextEntry();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry10);
        org.junit.Assert.assertNull(jarArchiveEntry11);
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertNull(zipArchiveEntry13);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(archiveEntry23);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        int int30 = arArchiveInputStream8.read(byteArray25);
        arArchiveInputStream8.close();
        int int32 = arArchiveInputStream8.read();
        int int33 = arArchiveInputStream8.read();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry34 = arArchiveInputStream8.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: failed to read header");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        int int30 = arArchiveInputStream8.read(byteArray25);
        arArchiveInputStream8.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = arArchiveInputStream8.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: failed to read header");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        int int30 = arArchiveInputStream8.read(byteArray25);
        arArchiveInputStream8.close();
        java.io.InputStream inputStream32 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream35 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream32, "org.apache.commons.compress.archivers.ArchiveException", true);
        java.io.InputStream inputStream36 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream37 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream36);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream36, 0, 100);
        tarArchiveInputStream40.close();
        byte[] byteArray43 = new byte[] { (byte) 10 };
        int int46 = tarArchiveInputStream40.read(byteArray43, (-1), (int) (short) 1);
        byte[] byteArray52 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long53 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray52);
        int int56 = tarArchiveInputStream40.read(byteArray52, 8192, 40960);
        boolean boolean58 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray52, (int) (byte) 10);
        int int61 = zipArchiveInputStream35.read(byteArray52, (int) (byte) 100, 49152);
        boolean boolean63 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray52, 1);
        int int64 = arArchiveInputStream8.read(byteArray52);
        // The following exception was thrown during execution in test generation
        try {
            long long66 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray52, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 55");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[10]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 167774820L + "'", long53 == 167774820L);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        java.lang.String str3 = tarArchiveOutputStream2.getDefaultFileExtension();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        boolean boolean5 = jarArchiveOutputStream4.isSeekable();
        java.lang.String str6 = jarArchiveOutputStream4.getEncoding();
        java.lang.String str7 = jarArchiveOutputStream4.getEncoding();
        jarArchiveOutputStream4.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        java.lang.String str12 = unicodeExtraFieldPolicy10.toString();
        jarArchiveOutputStream4.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        jarArchiveOutputStream4.setLevel((int) (short) 2);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream16);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream16, 0, 100);
        int int21 = tarArchiveInputStream20.getRecordSize();
        long long23 = tarArchiveInputStream20.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream24 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream20);
        java.io.InputStream inputStream25 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream25);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream25, 0, 100);
        tarArchiveInputStream29.close();
        byte[] byteArray32 = new byte[] { (byte) 10 };
        int int35 = tarArchiveInputStream29.read(byteArray32, (-1), (int) (short) 1);
        byte[] byteArray41 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long42 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray41);
        int int45 = tarArchiveInputStream29.read(byteArray41, 8192, 40960);
        int int46 = arArchiveInputStream24.read(byteArray41);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream4.write(byteArray41, 32768, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tar" + "'", str3, "tar");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "never" + "'", str11, "never");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "never" + "'", str12, "never");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[10]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 167774820L + "'", long42 == 167774820L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) (short) 0);
        tarArchiveInputStream4.mark((int) '4');
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12);
        tarArchiveInputStream4.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream13);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream13);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream16);
        java.io.OutputStream outputStream18 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream19);
        long long21 = org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream17, (java.io.OutputStream) tarArchiveOutputStream19);
        cpioArchiveInputStream17.closeEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream23 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream17);
        long long25 = jarArchiveInputStream23.skip((long) (short) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = jarArchiveInputStream23.getNextZipEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry27 = jarArchiveInputStream23.getNextJarEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry28 = jarArchiveInputStream23.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = jarArchiveInputStream23.getNextZipEntry();
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong35 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray34);
        boolean boolean37 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray34, 1);
        int int38 = jarArchiveInputStream23.read(byteArray34);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream15.write(byteArray34);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry26);
        org.junit.Assert.assertNull(jarArchiveEntry27);
        org.junit.Assert.assertNull(archiveEntry28);
        org.junit.Assert.assertNull(zipArchiveEntry29);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        arArchiveInputStream8.close();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        int int9 = arArchiveInputStream8.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry10 = arArchiveInputStream8.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: failed to read header");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        tarArchiveInputStream4.close();
        tarArchiveInputStream4.close();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        byte[] byteArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = arArchiveInputStream1.read(byteArray2, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        long long5 = org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream1, (java.io.OutputStream) tarArchiveOutputStream3);
        cpioArchiveInputStream1.closeEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream8);
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        long long13 = org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream9, (java.io.OutputStream) tarArchiveOutputStream11);
        cpioArchiveInputStream9.closeEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream9);
        long long17 = jarArchiveInputStream15.skip((long) (short) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = jarArchiveInputStream15.getNextZipEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry19 = jarArchiveInputStream15.getNextJarEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = jarArchiveInputStream15.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = jarArchiveInputStream15.getNextZipEntry();
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong27 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray26);
        boolean boolean29 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray26, 1);
        int int30 = jarArchiveInputStream15.read(byteArray26);
        int int33 = jarArchiveInputStream7.read(byteArray26, 8, 61440);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream7, (int) (byte) 10, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream7);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry18);
        org.junit.Assert.assertNull(jarArchiveEntry19);
        org.junit.Assert.assertNull(archiveEntry20);
        org.junit.Assert.assertNull(zipArchiveEntry21);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        boolean boolean31 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray25, (int) (byte) 10);
        int int34 = arArchiveInputStream8.read(byteArray25, 0, 29127);
        arArchiveInputStream8.close();
        java.io.InputStream inputStream36 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream37 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream36);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream36, 0, 100);
        tarArchiveInputStream40.close();
        byte[] byteArray43 = new byte[] { (byte) 10 };
        int int46 = tarArchiveInputStream40.read(byteArray43, (-1), (int) (short) 1);
        byte[] byteArray52 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long53 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray52);
        int int56 = tarArchiveInputStream40.read(byteArray52, 8192, 40960);
        int int57 = arArchiveInputStream8.read(byteArray52);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry58 = arArchiveInputStream8.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: failed to read header");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[10]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 167774820L + "'", long53 == 167774820L);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        int int30 = arArchiveInputStream8.read(byteArray25);
        arArchiveInputStream8.close();
        java.io.InputStream inputStream32 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream33 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream32);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream32, 0, 100);
        int int37 = tarArchiveInputStream36.getRecordSize();
        long long39 = tarArchiveInputStream36.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream40 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream36);
        java.io.InputStream inputStream41 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream42 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream41);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream45 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream41, 0, 100);
        tarArchiveInputStream45.close();
        byte[] byteArray48 = new byte[] { (byte) 10 };
        int int51 = tarArchiveInputStream45.read(byteArray48, (-1), (int) (short) 1);
        byte[] byteArray57 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long58 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray57);
        int int61 = tarArchiveInputStream45.read(byteArray57, 8192, 40960);
        int int62 = arArchiveInputStream40.read(byteArray57);
        int int63 = arArchiveInputStream8.read(byteArray57);
        boolean boolean65 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray57, 24576);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[10]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 167774820L + "'", long58 == 167774820L);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        tarArchiveInputStream4.close();
        byte[] byteArray7 = new byte[] { (byte) 10 };
        int int10 = tarArchiveInputStream4.read(byteArray7, (-1), (int) (short) 1);
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long17 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray16);
        int int20 = tarArchiveInputStream4.read(byteArray16, 8192, 40960);
        int int21 = tarArchiveInputStream4.getRecordSize();
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream22, 0, 100);
        int int27 = tarArchiveInputStream26.getRecordSize();
        long long29 = tarArchiveInputStream26.skip((long) (short) 0);
        tarArchiveInputStream26.mark((int) '4');
        java.io.OutputStream outputStream32 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream32);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream33);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream34);
        tarArchiveInputStream26.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream35);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream37 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream26);
        arArchiveInputStream37.close();
        byte[] byteArray44 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long45 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray44);
        int int48 = arArchiveInputStream37.read(byteArray44, (int) '4', 0);
        int int49 = tarArchiveInputStream4.read(byteArray44);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 167774820L + "'", long17 == 167774820L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 167774820L + "'", long45 == 167774820L);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        int int30 = arArchiveInputStream8.read(byteArray25);
        java.io.InputStream inputStream31 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream32 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream31);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream31, 0, 100);
        tarArchiveInputStream35.reset();
        tarArchiveInputStream35.reset();
        java.io.InputStream inputStream38 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream41 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream38, "org.apache.commons.compress.archivers.ArchiveException", true);
        java.io.InputStream inputStream42 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream43 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream42);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream46 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream42, 0, 100);
        tarArchiveInputStream46.close();
        byte[] byteArray49 = new byte[] { (byte) 10 };
        int int52 = tarArchiveInputStream46.read(byteArray49, (-1), (int) (short) 1);
        byte[] byteArray58 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long59 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray58);
        int int62 = tarArchiveInputStream46.read(byteArray58, 8192, 40960);
        boolean boolean64 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray58, (int) (byte) 10);
        int int67 = zipArchiveInputStream41.read(byteArray58, (int) (byte) 100, 49152);
        int int70 = tarArchiveInputStream35.read(byteArray58, 24576, (int) (short) 10);
        int int71 = arArchiveInputStream8.read(byteArray58);
        java.io.InputStream inputStream72 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream73 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream72);
        byte[] byteArray79 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long80 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray79);
        boolean boolean82 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray79, (int) (short) 1);
        int int85 = zipArchiveInputStream73.read(byteArray79, (int) (short) 10, 4);
        int int88 = arArchiveInputStream8.read(byteArray79, 24576, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream91 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream8, (int) (short) 1, 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[10]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 167774820L + "'", long59 == 167774820L);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 167774820L + "'", long80 == 167774820L);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray6);
        boolean boolean9 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray6, 1);
        boolean boolean11 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray6, 1024);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream1.write(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        long long5 = org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream1, (java.io.OutputStream) tarArchiveOutputStream3);
        cpioArchiveInputStream1.closeEntry();
        int int7 = cpioArchiveInputStream1.available();
        long long9 = cpioArchiveInputStream1.skip((long) 8192);
        long long11 = cpioArchiveInputStream1.skip(1712709668270L);
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream12);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream13);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15);
        tarArchiveOutputStream16.closeEntry();
        long long18 = org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream1, (java.io.OutputStream) tarArchiveOutputStream16);
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long25 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray24);
        boolean boolean27 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray24, (int) (short) 0);
        boolean boolean29 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray24, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream16.write(byteArray24);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '5' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 167774820L + "'", long25 == 167774820L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long6 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray5);
        boolean boolean8 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray5, (int) (short) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray5, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 55");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 167774820L + "'", long6 == 167774820L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        java.lang.String str2 = tarArchiveOutputStream1.getDefaultFileExtension();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) ' ', 2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, 4096);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray12);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray12);
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray12, (int) (short) 4);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.write(byteArray12, 40960, 49152);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '49152' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tar" + "'", str2, "tar");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        java.lang.String str2 = tarArchiveOutputStream1.getDefaultFileExtension();
        tarArchiveOutputStream1.closeEntry();
        int int4 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        tarArchiveOutputStream1.setBufferDebug(true);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray13);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong15 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray13);
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream8.write(byteArray13, 40960, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tar" + "'", str2, "tar");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        int int30 = arArchiveInputStream8.read(byteArray25);
        arArchiveInputStream8.close();
        int int32 = arArchiveInputStream8.read();
        java.io.InputStream inputStream33 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream34 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream33);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream33, 0, 100);
        int int38 = tarArchiveInputStream37.getRecordSize();
        long long40 = tarArchiveInputStream37.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream41 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream37);
        java.io.InputStream inputStream42 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream43 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream42);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream46 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream42, 0, 100);
        tarArchiveInputStream46.close();
        byte[] byteArray49 = new byte[] { (byte) 10 };
        int int52 = tarArchiveInputStream46.read(byteArray49, (-1), (int) (short) 1);
        byte[] byteArray58 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long59 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray58);
        int int62 = tarArchiveInputStream46.read(byteArray58, 8192, 40960);
        int int63 = arArchiveInputStream41.read(byteArray58);
        arArchiveInputStream41.close();
        int int65 = arArchiveInputStream41.read();
        int int66 = arArchiveInputStream41.read();
        byte[] byteArray71 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong72 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray71);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong73 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray71);
        long long74 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray71);
        int int75 = arArchiveInputStream41.read(byteArray71);
        int int76 = arArchiveInputStream8.read(byteArray71);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[10]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 167774820L + "'", long59 == 167774820L);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 174325761L + "'", long74 == 174325761L);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        int int9 = tarArchiveInputStream4.available();
        tarArchiveInputStream4.setDebug(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = tarArchiveInputStream4.getNextTarEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: input buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry2 = arArchiveInputStream1.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.closeArchiveEntry();
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long9 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray8);
        boolean boolean11 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray8, (int) (short) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray8, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream1.write(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '5' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 167774820L + "'", long9 == 167774820L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) (short) 0);
        tarArchiveInputStream4.mark((int) '4');
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12);
        tarArchiveInputStream4.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream13);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        arArchiveInputStream15.close();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong22 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray21);
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray21, 1);
        int int27 = arArchiveInputStream15.read(byteArray21, (int) (short) 2, 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        boolean boolean31 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray25, (int) (byte) 10);
        int int34 = arArchiveInputStream8.read(byteArray25, 0, 29127);
        arArchiveInputStream8.close();
        arArchiveInputStream8.close();
        arArchiveInputStream8.close();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        int int30 = arArchiveInputStream8.read(byteArray25);
        arArchiveInputStream8.close();
        int int32 = arArchiveInputStream8.read();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry33 = arArchiveInputStream8.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: failed to read header");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        int int30 = arArchiveInputStream8.read(byteArray25);
        java.io.InputStream inputStream31 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream32 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream31);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream31, 0, 100);
        tarArchiveInputStream35.reset();
        tarArchiveInputStream35.reset();
        java.io.InputStream inputStream38 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream41 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream38, "org.apache.commons.compress.archivers.ArchiveException", true);
        java.io.InputStream inputStream42 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream43 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream42);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream46 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream42, 0, 100);
        tarArchiveInputStream46.close();
        byte[] byteArray49 = new byte[] { (byte) 10 };
        int int52 = tarArchiveInputStream46.read(byteArray49, (-1), (int) (short) 1);
        byte[] byteArray58 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long59 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray58);
        int int62 = tarArchiveInputStream46.read(byteArray58, 8192, 40960);
        boolean boolean64 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray58, (int) (byte) 10);
        int int67 = zipArchiveInputStream41.read(byteArray58, (int) (byte) 100, 49152);
        int int70 = tarArchiveInputStream35.read(byteArray58, 24576, (int) (short) 10);
        int int71 = arArchiveInputStream8.read(byteArray58);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream74 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream8, 16, (int) (byte) -1);
        boolean boolean75 = tarArchiveInputStream74.markSupported();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[10]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 167774820L + "'", long59 == 167774820L);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) (short) 0);
        java.io.OutputStream outputStream8 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        tarArchiveOutputStream11.closeEntry();
        tarArchiveInputStream4.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream11);
        int int15 = tarArchiveInputStream4.getRecordSize();
        tarArchiveInputStream4.mark((int) (short) 8);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream18 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        tarArchiveInputStream4.setDebug(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        int int30 = arArchiveInputStream8.read(byteArray25);
        arArchiveInputStream8.close();
        java.io.InputStream inputStream32 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream35 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream32, "org.apache.commons.compress.archivers.ArchiveException", true);
        java.io.InputStream inputStream36 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream37 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream36);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream36, 0, 100);
        tarArchiveInputStream40.close();
        byte[] byteArray43 = new byte[] { (byte) 10 };
        int int46 = tarArchiveInputStream40.read(byteArray43, (-1), (int) (short) 1);
        byte[] byteArray52 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long53 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray52);
        int int56 = tarArchiveInputStream40.read(byteArray52, 8192, 40960);
        boolean boolean58 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray52, (int) (byte) 10);
        int int61 = zipArchiveInputStream35.read(byteArray52, (int) (byte) 100, 49152);
        boolean boolean63 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray52, 1);
        int int64 = arArchiveInputStream8.read(byteArray52);
        boolean boolean65 = arArchiveInputStream8.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry66 = arArchiveInputStream8.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: failed to read header");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[10]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 167774820L + "'", long53 == 167774820L);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        long long5 = org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream1, (java.io.OutputStream) tarArchiveOutputStream3);
        cpioArchiveInputStream1.closeEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream8);
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        long long13 = org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream9, (java.io.OutputStream) tarArchiveOutputStream11);
        cpioArchiveInputStream9.closeEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream9);
        long long17 = jarArchiveInputStream15.skip((long) (short) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = jarArchiveInputStream15.getNextZipEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry19 = jarArchiveInputStream15.getNextJarEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = jarArchiveInputStream15.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = jarArchiveInputStream15.getNextZipEntry();
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong27 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray26);
        boolean boolean29 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray26, 1);
        int int30 = jarArchiveInputStream15.read(byteArray26);
        int int33 = jarArchiveInputStream7.read(byteArray26, 8, 61440);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry34 = jarArchiveInputStream7.getNextEntry();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry18);
        org.junit.Assert.assertNull(jarArchiveEntry19);
        org.junit.Assert.assertNull(archiveEntry20);
        org.junit.Assert.assertNull(zipArchiveEntry21);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(archiveEntry34);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        int int30 = arArchiveInputStream8.read(byteArray25);
        arArchiveInputStream8.close();
        int int32 = arArchiveInputStream8.read();
        int int33 = arArchiveInputStream8.read();
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong39 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray38);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong40 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray38);
        long long41 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray38);
        int int42 = arArchiveInputStream8.read(byteArray38);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong44 = new org.apache.commons.compress.archivers.zip.ZipLong(100L);
        java.lang.Object obj45 = zipLong44.clone();
        long long46 = zipLong44.getValue();
        byte[] byteArray47 = zipLong44.getBytes();
        int int50 = arArchiveInputStream8.read(byteArray47, (int) (short) 10, 2);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream8, (int) (short) 3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry53 = arArchiveInputStream8.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: failed to read header");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 174325761L + "'", long41 == 174325761L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 100L + "'", long46 == 100L);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[100, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        int int9 = tarArchiveInputStream4.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        arArchiveOutputStream1.closeArchiveEntry();
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream3, 0, 100);
        int int8 = tarArchiveInputStream7.getRecordSize();
        long long10 = tarArchiveInputStream7.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream7);
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream12);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream12, 0, 100);
        tarArchiveInputStream16.close();
        byte[] byteArray19 = new byte[] { (byte) 10 };
        int int22 = tarArchiveInputStream16.read(byteArray19, (-1), (int) (short) 1);
        byte[] byteArray28 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long29 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray28);
        int int32 = tarArchiveInputStream16.read(byteArray28, 8192, 40960);
        int int33 = arArchiveInputStream11.read(byteArray28);
        arArchiveInputStream11.close();
        int int35 = arArchiveInputStream11.read();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong41 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray40);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong42 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray40);
        boolean boolean44 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray40, (int) (byte) 100);
        boolean boolean46 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray40, (int) (short) 4);
        boolean boolean48 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray40, 128);
        boolean boolean50 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray40, 32);
        int int51 = arArchiveInputStream11.read(byteArray40);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream1.write(byteArray40, 0, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 167774820L + "'", long29 == 167774820L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) (short) 0);
        tarArchiveInputStream4.mark((int) '4');
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12);
        tarArchiveInputStream4.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream13);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        arArchiveInputStream15.close();
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long23 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray22);
        int int26 = arArchiveInputStream15.read(byteArray22, (int) '4', 0);
        byte[] byteArray32 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long33 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray32);
        boolean boolean35 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray32, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong36 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray32);
        long long38 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray32, (int) (byte) 1);
        int int41 = arArchiveInputStream15.read(byteArray32, 49152, 2048);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 167774820L + "'", long23 == 167774820L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 167774820L + "'", long33 == 167774820L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 168427530L + "'", long38 == 168427530L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray4);
        boolean boolean8 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray4, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray4, (int) (short) 4);
        boolean boolean12 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray4, 128);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray4, 32);
        boolean boolean16 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray4, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        zipArchiveOutputStream5.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        zipArchiveOutputStream5.closeArchiveEntry();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray13);
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, 1);
        boolean boolean18 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray13, 1024);
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, 1024);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.write(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream1, 0, 100);
        int int6 = tarArchiveInputStream5.getRecordSize();
        long long8 = tarArchiveInputStream5.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        int int10 = arArchiveInputStream9.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream11 = archiveStreamFactory0.createArchiveInputStream((java.io.InputStream) arArchiveInputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        int int30 = arArchiveInputStream8.read(byteArray25);
        arArchiveInputStream8.close();
        int int32 = arArchiveInputStream8.read();
        int int33 = arArchiveInputStream8.read();
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong39 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray38);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong40 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray38);
        long long41 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray38);
        int int42 = arArchiveInputStream8.read(byteArray38);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong44 = new org.apache.commons.compress.archivers.zip.ZipLong(100L);
        java.lang.Object obj45 = zipLong44.clone();
        long long46 = zipLong44.getValue();
        byte[] byteArray47 = zipLong44.getBytes();
        int int50 = arArchiveInputStream8.read(byteArray47, (int) (short) 10, 2);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream8, (int) (short) 3);
        arArchiveInputStream8.close();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 174325761L + "'", long41 == 174325761L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 100L + "'", long46 == 100L);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[100, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        int int30 = arArchiveInputStream8.read(byteArray25);
        arArchiveInputStream8.close();
        java.io.InputStream inputStream32 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream35 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream32, "org.apache.commons.compress.archivers.ArchiveException", true);
        java.io.InputStream inputStream36 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream37 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream36);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream36, 0, 100);
        tarArchiveInputStream40.close();
        byte[] byteArray43 = new byte[] { (byte) 10 };
        int int46 = tarArchiveInputStream40.read(byteArray43, (-1), (int) (short) 1);
        byte[] byteArray52 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long53 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray52);
        int int56 = tarArchiveInputStream40.read(byteArray52, 8192, 40960);
        boolean boolean58 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray52, (int) (byte) 10);
        int int61 = zipArchiveInputStream35.read(byteArray52, (int) (byte) 100, 49152);
        boolean boolean63 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray52, 1);
        int int64 = arArchiveInputStream8.read(byteArray52);
        int int65 = arArchiveInputStream8.read();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[10]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 167774820L + "'", long53 == 167774820L);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong0 = org.apache.commons.compress.archivers.zip.ZipLong.LFH_SIG;
        byte[] byteArray1 = zipLong0.getBytes();
        boolean boolean3 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray1, (int) (short) 4);
        org.junit.Assert.assertNotNull(zipLong0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[80, 75, 3, 4]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        int int9 = arArchiveInputStream8.available();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        boolean boolean11 = jarArchiveInputStream10.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = jarArchiveInputStream10.getNextZipEntry();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(zipArchiveEntry12);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        int int30 = arArchiveInputStream8.read(byteArray25);
        arArchiveInputStream8.close();
        int int32 = arArchiveInputStream8.read();
        int int33 = arArchiveInputStream8.read();
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong39 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray38);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong40 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray38);
        long long41 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray38);
        int int42 = arArchiveInputStream8.read(byteArray38);
        byte[] byteArray46 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean48 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray46, 10);
        int int51 = arArchiveInputStream8.read(byteArray46, (int) (short) 4, (int) (short) 2);
        arArchiveInputStream8.close();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 174325761L + "'", long41 == 174325761L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[100, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        boolean boolean31 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray25, (int) (byte) 10);
        int int34 = arArchiveInputStream8.read(byteArray25, 0, 29127);
        arArchiveInputStream8.close();
        arArchiveInputStream8.close();
        byte[] byteArray42 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long43 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray42);
        boolean boolean45 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray42, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong46 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray42);
        long long48 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray42, (int) (byte) 1);
        int int51 = arArchiveInputStream8.read(byteArray42, 2, 0);
        byte[] byteArray57 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long58 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray57);
        boolean boolean60 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray57, (int) (short) 0);
        boolean boolean62 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray57, (int) ' ');
        int int65 = arArchiveInputStream8.read(byteArray57, (int) (short) -1, (int) (short) -1);
        boolean boolean67 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray57, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 167774820L + "'", long43 == 167774820L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 168427530L + "'", long48 == 168427530L);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 167774820L + "'", long58 == 167774820L);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) (short) 0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream2, 0, 100);
        int int7 = tarArchiveInputStream6.getRecordSize();
        long long9 = tarArchiveInputStream6.skip((long) 64);
        int int10 = tarArchiveInputStream6.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream6, "UTF8", false);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream14);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream14, 0, 100);
        int int19 = tarArchiveInputStream18.getRecordSize();
        long long21 = tarArchiveInputStream18.skip((long) (short) 0);
        tarArchiveInputStream18.mark((int) '4');
        java.io.OutputStream outputStream24 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream24);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream25);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream26);
        tarArchiveInputStream18.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream27);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream29 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream18);
        arArchiveInputStream29.close();
        byte[] byteArray36 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long37 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray36);
        int int40 = arArchiveInputStream29.read(byteArray36, (int) '4', 0);
        int int43 = tarArchiveInputStream6.read(byteArray36, 128, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream44 = archiveStreamFactory0.createArchiveInputStream("070707", (java.io.InputStream) tarArchiveInputStream6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: 070707 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 167774820L + "'", long37 == 167774820L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        int int9 = tarArchiveInputStream4.available();
        tarArchiveInputStream4.reset();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) (short) 0);
        tarArchiveInputStream4.mark((int) '4');
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12);
        tarArchiveInputStream4.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream13);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        arArchiveInputStream15.close();
        int int17 = arArchiveInputStream15.read();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream18 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream15);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream19);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream19, 0, 100);
        tarArchiveInputStream23.close();
        byte[] byteArray26 = new byte[] { (byte) 10 };
        int int29 = tarArchiveInputStream23.read(byteArray26, (-1), (int) (short) 1);
        byte[] byteArray35 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long36 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray35);
        int int39 = tarArchiveInputStream23.read(byteArray35, 8192, 40960);
        int int42 = arArchiveInputStream15.read(byteArray35, (int) (byte) 1, 49152);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 167774820L + "'", long36 == 167774820L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) (short) 0);
        tarArchiveInputStream4.mark((int) '4');
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12);
        tarArchiveInputStream4.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream13);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = arArchiveInputStream15.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: failed to read header");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        int int30 = arArchiveInputStream8.read(byteArray25);
        int int31 = arArchiveInputStream8.available();
        int int32 = arArchiveInputStream8.read();
        arArchiveInputStream8.close();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        zipArchiveOutputStream5.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray12);
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (short) 12);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream7.write(byteArray12, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '100' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        int int30 = arArchiveInputStream8.read(byteArray25);
        arArchiveInputStream8.close();
        int int32 = arArchiveInputStream8.read();
        int int33 = arArchiveInputStream8.read();
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong39 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray38);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong40 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray38);
        long long41 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray38);
        int int42 = arArchiveInputStream8.read(byteArray38);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream43 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream8.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 174325761L + "'", long41 == 174325761L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        tarArchiveInputStream4.reset();
        tarArchiveInputStream4.reset();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream4, (int) '#', (int) 'a');
        int int11 = tarArchiveInputStream10.available();
        tarArchiveInputStream10.setDebug(true);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray4, 1);
        boolean boolean9 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray4, 1024);
        boolean boolean11 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray4, 1024);
        boolean boolean13 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray4, 16384);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray4);
        boolean boolean8 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray4, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray4, (int) (short) 4);
        boolean boolean12 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray4, 128);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray4, 32);
        boolean boolean16 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray4, 100);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        long long5 = org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream1, (java.io.OutputStream) tarArchiveOutputStream3);
        cpioArchiveInputStream1.closeEntry();
        int int7 = cpioArchiveInputStream1.read();
        int int8 = cpioArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        cpioArchiveInputStream1.closeEntry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry11 = cpioArchiveInputStream1.getNextCPIOEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long6 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray5);
        boolean boolean8 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray5, (int) (short) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 167774820L + "'", long6 == 167774820L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        long long5 = org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream1, (java.io.OutputStream) tarArchiveOutputStream3);
        cpioArchiveInputStream1.closeEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream8);
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        long long13 = org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream9, (java.io.OutputStream) tarArchiveOutputStream11);
        cpioArchiveInputStream9.closeEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream9);
        long long17 = jarArchiveInputStream15.skip((long) (short) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = jarArchiveInputStream15.getNextZipEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry19 = jarArchiveInputStream15.getNextJarEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = jarArchiveInputStream15.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = jarArchiveInputStream15.getNextZipEntry();
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong27 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray26);
        boolean boolean29 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray26, 1);
        int int30 = jarArchiveInputStream15.read(byteArray26);
        int int33 = jarArchiveInputStream7.read(byteArray26, 8, 61440);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream7, (int) (byte) 10, 100);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveInputStream7.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry18);
        org.junit.Assert.assertNull(jarArchiveEntry19);
        org.junit.Assert.assertNull(archiveEntry20);
        org.junit.Assert.assertNull(zipArchiveEntry21);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) 8192);
        boolean boolean3 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray1, (int) (short) 8);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 32, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        boolean boolean31 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray25, (int) (byte) 10);
        int int34 = arArchiveInputStream8.read(byteArray25, 0, 29127);
        arArchiveInputStream8.close();
        java.io.InputStream inputStream36 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream37 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream36);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream36, 0, 100);
        tarArchiveInputStream40.close();
        byte[] byteArray43 = new byte[] { (byte) 10 };
        int int46 = tarArchiveInputStream40.read(byteArray43, (-1), (int) (short) 1);
        byte[] byteArray52 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long53 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray52);
        int int56 = tarArchiveInputStream40.read(byteArray52, 8192, 40960);
        int int57 = arArchiveInputStream8.read(byteArray52);
        byte[] byteArray59 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes(67324752L);
        int int60 = arArchiveInputStream8.read(byteArray59);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[10]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 167774820L + "'", long53 == 167774820L);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[80, 75, 3, 4]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        boolean boolean31 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray25, (int) (byte) 10);
        int int34 = arArchiveInputStream8.read(byteArray25, 0, 29127);
        arArchiveInputStream8.close();
        java.io.InputStream inputStream36 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream37 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream36);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream36, 0, 100);
        tarArchiveInputStream40.close();
        byte[] byteArray43 = new byte[] { (byte) 10 };
        int int46 = tarArchiveInputStream40.read(byteArray43, (-1), (int) (short) 1);
        byte[] byteArray52 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long53 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray52);
        int int56 = tarArchiveInputStream40.read(byteArray52, 8192, 40960);
        int int57 = arArchiveInputStream8.read(byteArray52);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong58 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray52);
        // The following exception was thrown during execution in test generation
        try {
            long long60 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray52, 8192);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8195");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[10]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 167774820L + "'", long53 == 167774820L);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        long long5 = org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream1, (java.io.OutputStream) tarArchiveOutputStream3);
        cpioArchiveInputStream1.closeEntry();
        int int7 = cpioArchiveInputStream1.read();
        int int8 = cpioArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = cpioArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        boolean boolean31 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray25, (int) (byte) 10);
        int int34 = arArchiveInputStream8.read(byteArray25, 0, 29127);
        arArchiveInputStream8.close();
        java.io.InputStream inputStream36 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream37 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream36);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream36, 0, 100);
        tarArchiveInputStream40.close();
        byte[] byteArray43 = new byte[] { (byte) 10 };
        int int46 = tarArchiveInputStream40.read(byteArray43, (-1), (int) (short) 1);
        byte[] byteArray52 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long53 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray52);
        int int56 = tarArchiveInputStream40.read(byteArray52, 8192, 40960);
        int int57 = arArchiveInputStream8.read(byteArray52);
        int int58 = arArchiveInputStream8.read();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[10]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 167774820L + "'", long53 == 167774820L);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        int int30 = arArchiveInputStream8.read(byteArray25);
        arArchiveInputStream8.close();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream8, 1024);
        int int34 = tarArchiveInputStream33.getRecordSize();
        long long36 = tarArchiveInputStream33.skip((long) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 512 + "'", int34 == 512);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        tarArchiveInputStream2.close();
        int int5 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray4);
        boolean boolean8 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray4, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray4, (int) (short) 4);
        boolean boolean12 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray4, 128);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray4, 32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong zipLong16 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 103");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        long long5 = org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream1, (java.io.OutputStream) tarArchiveOutputStream3);
        cpioArchiveInputStream1.closeEntry();
        int int7 = cpioArchiveInputStream1.read();
        int int8 = cpioArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        int int10 = cpioArchiveInputStream1.available();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream2, 0, 100);
        tarArchiveInputStream6.reset();
        tarArchiveInputStream6.reset();
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9, "org.apache.commons.compress.archivers.ArchiveException", true);
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream13);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream13, 0, 100);
        tarArchiveInputStream17.close();
        byte[] byteArray20 = new byte[] { (byte) 10 };
        int int23 = tarArchiveInputStream17.read(byteArray20, (-1), (int) (short) 1);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long30 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray29);
        int int33 = tarArchiveInputStream17.read(byteArray29, 8192, 40960);
        boolean boolean35 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray29, (int) (byte) 10);
        int int38 = zipArchiveInputStream12.read(byteArray29, (int) (byte) 100, 49152);
        int int41 = tarArchiveInputStream6.read(byteArray29, 24576, (int) (short) 10);
        org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream42 = archiveStreamFactory0.createArchiveInputStream("tar", (java.io.InputStream) tarArchiveInputStream6);
        java.io.InputStream inputStream44 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream45 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream44);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream48 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream44, 0, 100);
        int int49 = tarArchiveInputStream48.getRecordSize();
        long long51 = tarArchiveInputStream48.skip((long) (short) 0);
        tarArchiveInputStream48.mark((int) '4');
        java.io.OutputStream outputStream54 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream55 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream54);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream56 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream55);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream57 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream56);
        tarArchiveInputStream48.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream57);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream59 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream48);
        arArchiveInputStream59.close();
        int int61 = arArchiveInputStream59.read();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream62 = archiveStreamFactory0.createArchiveInputStream("`\n", (java.io.InputStream) arArchiveInputStream59);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: `? not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 167774820L + "'", long30 == 167774820L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(archiveInputStream42);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        int int9 = tarArchiveInputStream4.available();
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream13);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream13);
        zipArchiveOutputStream15.closeEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream17 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream15);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream15, (int) (byte) 10);
        tarArchiveInputStream4.copyEntryContents((java.io.OutputStream) zipArchiveOutputStream15);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream15.setEncoding("org.apache.commons.compress.archivers.ArchiveException: 070702");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: org.apache.commons.compress.archivers.ArchiveException: 070702");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        boolean boolean31 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray25, (int) (byte) 10);
        int int34 = arArchiveInputStream8.read(byteArray25, 0, 29127);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong zipLong36 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray25, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 55");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        tarArchiveInputStream4.close();
        byte[] byteArray7 = new byte[] { (byte) 10 };
        int int10 = tarArchiveInputStream4.read(byteArray7, (-1), (int) (short) 1);
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long17 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray16);
        int int20 = tarArchiveInputStream4.read(byteArray16, 8192, 40960);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, 52);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 167774820L + "'", long17 == 167774820L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        boolean boolean31 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray25, (int) (byte) 10);
        int int34 = arArchiveInputStream8.read(byteArray25, 0, 29127);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong35 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray25);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        tarArchiveInputStream4.close();
        byte[] byteArray7 = new byte[] { (byte) 10 };
        int int10 = tarArchiveInputStream4.read(byteArray7, (-1), (int) (short) 1);
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream11);
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14);
        long long16 = org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream12, (java.io.OutputStream) tarArchiveOutputStream14);
        cpioArchiveInputStream12.closeEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream18 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream12);
        long long20 = jarArchiveInputStream18.skip((long) (short) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = jarArchiveInputStream18.getNextZipEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry22 = jarArchiveInputStream18.getNextJarEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry23 = jarArchiveInputStream18.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = jarArchiveInputStream18.getNextZipEntry();
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong30 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray29);
        boolean boolean32 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray29, 1);
        int int33 = jarArchiveInputStream18.read(byteArray29);
        int int36 = tarArchiveInputStream4.read(byteArray29, 1024, 40960);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry21);
        org.junit.Assert.assertNull(jarArchiveEntry22);
        org.junit.Assert.assertNull(archiveEntry23);
        org.junit.Assert.assertNull(zipArchiveEntry24);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        long long5 = org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream1, (java.io.OutputStream) tarArchiveOutputStream3);
        cpioArchiveInputStream1.closeEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream8);
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        long long13 = org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream9, (java.io.OutputStream) tarArchiveOutputStream11);
        cpioArchiveInputStream9.closeEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream9);
        long long17 = jarArchiveInputStream15.skip((long) (short) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = jarArchiveInputStream15.getNextZipEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry19 = jarArchiveInputStream15.getNextJarEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = jarArchiveInputStream15.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = jarArchiveInputStream15.getNextZipEntry();
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong27 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray26);
        boolean boolean29 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray26, 1);
        int int30 = jarArchiveInputStream15.read(byteArray26);
        int int33 = jarArchiveInputStream7.read(byteArray26, 8, 61440);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream7, (int) (byte) 10, 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream39 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) jarArchiveInputStream7, "UTF8", false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry18);
        org.junit.Assert.assertNull(jarArchiveEntry19);
        org.junit.Assert.assertNull(archiveEntry20);
        org.junit.Assert.assertNull(zipArchiveEntry21);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        int int30 = arArchiveInputStream8.read(byteArray25);
        arArchiveInputStream8.close();
        int int32 = arArchiveInputStream8.read();
        int int33 = arArchiveInputStream8.read();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry34 = arArchiveInputStream8.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: failed to read header");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        tarArchiveInputStream4.reset();
        tarArchiveInputStream4.reset();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream4, (int) '#', (int) 'a');
        int int11 = tarArchiveInputStream10.available();
        tarArchiveInputStream10.setDebug(true);
        long long15 = tarArchiveInputStream10.skip(168427530L);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = tarArchiveInputStream10.getNextTarEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream17 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry16);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        int int30 = arArchiveInputStream8.read(byteArray25);
        java.io.InputStream inputStream31 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream32 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream31);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream31, 0, 100);
        tarArchiveInputStream35.reset();
        tarArchiveInputStream35.reset();
        java.io.InputStream inputStream38 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream41 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream38, "org.apache.commons.compress.archivers.ArchiveException", true);
        java.io.InputStream inputStream42 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream43 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream42);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream46 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream42, 0, 100);
        tarArchiveInputStream46.close();
        byte[] byteArray49 = new byte[] { (byte) 10 };
        int int52 = tarArchiveInputStream46.read(byteArray49, (-1), (int) (short) 1);
        byte[] byteArray58 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long59 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray58);
        int int62 = tarArchiveInputStream46.read(byteArray58, 8192, 40960);
        boolean boolean64 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray58, (int) (byte) 10);
        int int67 = zipArchiveInputStream41.read(byteArray58, (int) (byte) 100, 49152);
        int int70 = tarArchiveInputStream35.read(byteArray58, 24576, (int) (short) 10);
        int int71 = arArchiveInputStream8.read(byteArray58);
        boolean boolean73 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray58, (int) (short) 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[10]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 167774820L + "'", long59 == 167774820L);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray4, 1);
        long long9 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 174325761L + "'", long9 == 174325761L);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, 0, 100);
        tarArchiveInputStream13.close();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        int int19 = tarArchiveInputStream13.read(byteArray16, (-1), (int) (short) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray25);
        int int29 = tarArchiveInputStream13.read(byteArray25, 8192, 40960);
        int int30 = arArchiveInputStream8.read(byteArray25);
        arArchiveInputStream8.close();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream8, 1024);
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong39 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray38);
        boolean boolean41 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray38, 1);
        int int44 = tarArchiveInputStream33.read(byteArray38, 2, 0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream45 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream33);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream48 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) arArchiveInputStream45, "070702", true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 167774820L + "'", long26 == 167774820L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 0, 100);
        int int5 = tarArchiveInputStream4.getRecordSize();
        long long7 = tarArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        long long10 = cpioArchiveInputStream8.skip(0L);
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream11);
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14);
        long long16 = org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream12, (java.io.OutputStream) tarArchiveOutputStream14);
        cpioArchiveInputStream12.closeEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream18 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream12);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream19);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream21);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        long long24 = org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream20, (java.io.OutputStream) tarArchiveOutputStream22);
        cpioArchiveInputStream20.closeEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream26 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream20);
        long long28 = jarArchiveInputStream26.skip((long) (short) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = jarArchiveInputStream26.getNextZipEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry30 = jarArchiveInputStream26.getNextJarEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry31 = jarArchiveInputStream26.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = jarArchiveInputStream26.getNextZipEntry();
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong38 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray37);
        boolean boolean40 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray37, 1);
        int int41 = jarArchiveInputStream26.read(byteArray37);
        int int44 = jarArchiveInputStream18.read(byteArray37, 8, 61440);
        boolean boolean46 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray37, 128);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = cpioArchiveInputStream8.read(byteArray37, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry29);
        org.junit.Assert.assertNull(jarArchiveEntry30);
        org.junit.Assert.assertNull(archiveEntry31);
        org.junit.Assert.assertNull(zipArchiveEntry32);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        java.lang.String str3 = tarArchiveOutputStream2.getDefaultFileExtension();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        boolean boolean5 = jarArchiveOutputStream4.isSeekable();
        java.lang.String str6 = jarArchiveOutputStream4.getEncoding();
        java.lang.String str7 = jarArchiveOutputStream4.getEncoding();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) '#');
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream11, 0, 100);
        int int16 = tarArchiveInputStream15.getRecordSize();
        long long18 = tarArchiveInputStream15.skip((long) 64);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream19 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream15);
        java.io.InputStream inputStream20 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream20);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream20, 0, 100);
        tarArchiveInputStream24.close();
        byte[] byteArray27 = new byte[] { (byte) 10 };
        int int30 = tarArchiveInputStream24.read(byteArray27, (-1), (int) (short) 1);
        byte[] byteArray36 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        long long37 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray36);
        int int40 = tarArchiveInputStream24.read(byteArray36, 8192, 40960);
        int int41 = arArchiveInputStream19.read(byteArray36);
        boolean boolean43 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray36, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream10.write(byteArray36, (int) (byte) 1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tar" + "'", str3, "tar");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[10]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[100, 10, 0, 10, 10]");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 167774820L + "'", long37 == 167774820L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray4);
        boolean boolean8 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray4, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray4, (int) (short) 4);
        boolean boolean12 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray4, 128);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray4, 32);
        boolean boolean16 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray4, (int) (short) 12);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }
}


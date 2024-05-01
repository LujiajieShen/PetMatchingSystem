package org.apache.commons.compress.archivers.cpio;

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
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry3.setTime((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry3);
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean4 = cpioArchiveEntry3.isSocket();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry3.setTime((long) (byte) 1);
        long long6 = cpioArchiveEntry3.getMode();
        boolean boolean7 = cpioArchiveEntry3.isBlockDevice();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry4.setNumberOfLinks((long) 1);
        cpioArchiveEntry4.setDeviceMaj((long) 2048);
        cpioArchiveEntry4.setSize((long) 8);
        java.lang.String str11 = cpioArchiveEntry4.getName();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.putNextEntry(cpioArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "070702" + "'", str11, "070702");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.putNextEntry(zipArchiveEntry3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.write(32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
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
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean6 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray4, 2);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.write(byteArray4, 32, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.setEncoding("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry2 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.putArchiveEntry(archiveEntry2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.write(40960);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, 2048);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean8 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray6, 2);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.write(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.closeArchiveEntry();
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
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        boolean boolean4 = jarArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.putNextEntry(zipArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream2.setDebug(true);
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.write(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream6.write(byteArray14, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 1, 100]");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        boolean boolean4 = jarArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean7 = cpioArchiveEntry6.isSocket();
        boolean boolean8 = cpioArchiveEntry6.isPipe();
        cpioArchiveEntry6.setRemoteDeviceMaj((long) 29127);
        boolean boolean11 = cpioArchiveEntry6.isDirectory();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.write(0);
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
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream3.write((int) (short) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream3.setLongFileMode((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry3.setNumberOfLinks((long) 1);
        cpioArchiveEntry3.setDeviceMaj((long) 2048);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.putNextEntry(cpioArchiveEntry3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, 2048);
        jarArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream2.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        tarArchiveInputStream6.reset();
        java.io.OutputStream outputStream8 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream8);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream9);
        jarArchiveOutputStream10.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream6, (java.io.OutputStream) jarArchiveOutputStream10, 100);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream14);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream15);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean21 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray19, 2);
        boolean boolean23 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray19, 49152);
        int int24 = tarArchiveInputStream16.read(byteArray19);
        int int25 = tarArchiveInputStream6.read(byteArray19);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.write(byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream9);
        int int11 = tarArchiveInputStream10.getRecordSize();
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream12);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream13);
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean19 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray17, 2);
        boolean boolean21 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray17, 49152);
        int int22 = tarArchiveInputStream14.read(byteArray17);
        int int23 = tarArchiveInputStream10.read(byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream7.write(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry2 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.putArchiveEntry(archiveEntry2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, 2048);
        jarArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream2.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, (short) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        tarArchiveInputStream12.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream15);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream16);
        tarArchiveInputStream17.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream17);
        long long21 = tarArchiveInputStream17.skip((long) (byte) -1);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean26 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray24, 2);
        int int29 = tarArchiveInputStream17.read(byteArray24, (int) 'a', (-1));
        int int32 = tarArchiveInputStream14.read(byteArray24, (int) (byte) 100, 1024);
        tarArchiveInputStream14.close();
        java.io.InputStream inputStream34 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream35 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream34);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream35);
        tarArchiveInputStream36.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream36);
        java.io.InputStream inputStream39 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream40 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream39);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream40);
        tarArchiveInputStream41.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream41);
        long long45 = tarArchiveInputStream41.skip((long) (byte) -1);
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean50 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray48, 2);
        int int53 = tarArchiveInputStream41.read(byteArray48, (int) 'a', (-1));
        int int56 = tarArchiveInputStream38.read(byteArray48, (int) (byte) 100, 1024);
        int int57 = tarArchiveInputStream14.read(byteArray48);
        int int58 = tarArchiveInputStream2.read(byteArray48);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry59 = tarArchiveInputStream2.getNextTarEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        tarArchiveOutputStream3.setDebug(false);
        java.io.OutputStream outputStream8 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream8);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream9);
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray13, 2);
        boolean boolean17 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray13, 49152);
        cpioArchiveOutputStream9.write(byteArray13, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.write(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        java.io.OutputStream outputStream8 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream8);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream9);
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray13, 2);
        boolean boolean17 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray13, 49152);
        cpioArchiveOutputStream9.write(byteArray13, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream7.write(byteArray13, (int) (short) 12, 1024);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1024' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        jarArchiveOutputStream6.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream6.putArchiveEntry(archiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.write(byteArray7, 0, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, -1]");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry4.setNumberOfLinks((long) 1);
        cpioArchiveEntry4.setDeviceMaj((long) 2048);
        cpioArchiveEntry4.setSize((long) 8);
        java.lang.String str11 = cpioArchiveEntry4.getName();
        cpioArchiveEntry4.setMode((long) 16384);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.putNextEntry(cpioArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "070702" + "'", str11, "070702");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.closeEntry();
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.setMethod(0);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 8);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.write(128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream6.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.closeEntry();
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.setMethod(0);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.write((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.close();
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, 2048);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean8 = cpioArchiveEntry7.isSocket();
        boolean boolean9 = cpioArchiveEntry7.isCharacterDevice();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream5.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        jarArchiveOutputStream6.setFallbackToUTF8(true);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean16 = cpioArchiveEntry15.isRegularFile();
        long long17 = cpioArchiveEntry15.getGID();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream6.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        int int8 = tarArchiveInputStream7.getRecordSize();
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream10);
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean16 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray14, 2);
        boolean boolean18 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray14, 49152);
        int int19 = tarArchiveInputStream11.read(byteArray14);
        int int20 = tarArchiveInputStream7.read(byteArray14);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream7);
        int int22 = cpioArchiveInputStream21.available();
        int int23 = cpioArchiveInputStream21.available();
        java.io.InputStream inputStream24 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream25 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream24);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream25);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean31 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray29, 2);
        boolean boolean33 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray29, 49152);
        int int34 = tarArchiveInputStream26.read(byteArray29);
        int int37 = cpioArchiveInputStream21.read(byteArray29, (int) (short) 2, 0);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream4.write(byteArray29, (int) 'a', 61440);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray15, 2);
        boolean boolean19 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray15, 49152);
        int int20 = tarArchiveInputStream12.read(byteArray15);
        int int21 = tarArchiveInputStream2.read(byteArray15);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream23);
        tarArchiveInputStream24.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream24);
        long long28 = tarArchiveInputStream24.skip((long) (byte) -1);
        java.io.OutputStream outputStream29 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream30 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream29);
        jarArchiveOutputStream30.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream30);
        tarArchiveOutputStream32.setDebug(false);
        tarArchiveInputStream24.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream37 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32);
        java.io.InputStream inputStream38 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream39 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream38);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream39);
        int int41 = tarArchiveInputStream40.getRecordSize();
        java.io.InputStream inputStream42 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream43 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream42);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream44 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream43);
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean49 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray47, 2);
        boolean boolean51 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray47, 49152);
        int int52 = tarArchiveInputStream44.read(byteArray47);
        int int53 = tarArchiveInputStream40.read(byteArray47);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream54 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream40);
        int int55 = cpioArchiveInputStream54.available();
        int int56 = cpioArchiveInputStream54.available();
        java.io.InputStream inputStream57 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream58 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream57);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream59 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream58);
        byte[] byteArray62 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean64 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray62, 2);
        boolean boolean66 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray62, 49152);
        int int67 = tarArchiveInputStream59.read(byteArray62);
        int int70 = cpioArchiveInputStream54.read(byteArray62, (int) (short) 2, 0);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream37.write(byteArray62, 0, 64);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '64' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 512 + "'", int41 == 512);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream3);
        tarArchiveInputStream4.reset();
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream6);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream7);
        jarArchiveOutputStream8.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream4, (java.io.OutputStream) jarArchiveOutputStream8, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        jarArchiveOutputStream8.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream14 = archiveStreamFactory0.createArchiveOutputStream("always", (java.io.OutputStream) jarArchiveOutputStream8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: always not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream7);
        jarArchiveOutputStream8.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream10.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream10);
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream16 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream15);
        jarArchiveOutputStream16.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream16);
        tarArchiveOutputStream18.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream18);
        tarArchiveOutputStream18.setLongFileMode((int) (short) 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream18);
        java.io.InputStream inputStream25 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream26 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream25);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream26);
        tarArchiveInputStream27.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream27);
        long long31 = tarArchiveInputStream27.skip((long) (byte) -1);
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean36 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray34, 2);
        int int39 = tarArchiveInputStream27.read(byteArray34, (int) 'a', (-1));
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream18.write(byteArray34, 61440, 2048);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2048' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray15, 2);
        boolean boolean19 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray15, 49152);
        int int20 = tarArchiveInputStream12.read(byteArray15);
        int int21 = tarArchiveInputStream2.read(byteArray15);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream23);
        tarArchiveInputStream24.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream24);
        long long28 = tarArchiveInputStream24.skip((long) (byte) -1);
        java.io.OutputStream outputStream29 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream30 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream29);
        jarArchiveOutputStream30.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream30);
        tarArchiveOutputStream32.setDebug(false);
        tarArchiveInputStream24.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream37 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream37.write(256);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        tarArchiveInputStream12.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream15);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream16);
        tarArchiveInputStream17.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream17);
        long long21 = tarArchiveInputStream17.skip((long) (byte) -1);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean26 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray24, 2);
        int int29 = tarArchiveInputStream17.read(byteArray24, (int) 'a', (-1));
        int int32 = tarArchiveInputStream14.read(byteArray24, (int) (byte) 100, 1024);
        tarArchiveInputStream14.close();
        java.io.InputStream inputStream34 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream35 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream34);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream35);
        tarArchiveInputStream36.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream36);
        java.io.InputStream inputStream39 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream40 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream39);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream40);
        tarArchiveInputStream41.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream41);
        long long45 = tarArchiveInputStream41.skip((long) (byte) -1);
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean50 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray48, 2);
        int int53 = tarArchiveInputStream41.read(byteArray48, (int) 'a', (-1));
        int int56 = tarArchiveInputStream38.read(byteArray48, (int) (byte) 100, 1024);
        int int57 = tarArchiveInputStream14.read(byteArray48);
        int int58 = tarArchiveInputStream2.read(byteArray48);
        int int59 = tarArchiveInputStream2.getRecordSize();
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 512 + "'", int59 == 512);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, 2048);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean7 = cpioArchiveEntry6.isSocket();
        long long8 = cpioArchiveEntry6.getTime();
        cpioArchiveEntry6.setDeviceMaj((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream7);
        jarArchiveOutputStream8.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream10.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream10);
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream16 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream15);
        jarArchiveOutputStream16.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream16);
        tarArchiveOutputStream18.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream18);
        tarArchiveOutputStream18.setLongFileMode((int) (short) 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream18);
        tarArchiveOutputStream18.setBufferDebug(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream28 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream18, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        cpioArchiveOutputStream1.flush();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        tarArchiveInputStream6.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream6);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        tarArchiveInputStream12.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream15);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream16);
        tarArchiveInputStream17.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream17);
        long long21 = tarArchiveInputStream17.skip((long) (byte) -1);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean26 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray24, 2);
        int int29 = tarArchiveInputStream17.read(byteArray24, (int) 'a', (-1));
        int int32 = tarArchiveInputStream14.read(byteArray24, (int) (byte) 100, 1024);
        tarArchiveInputStream14.close();
        java.io.InputStream inputStream34 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream35 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream34);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream35);
        tarArchiveInputStream36.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream36);
        java.io.InputStream inputStream39 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream40 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream39);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream40);
        tarArchiveInputStream41.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream41);
        long long45 = tarArchiveInputStream41.skip((long) (byte) -1);
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean50 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray48, 2);
        int int53 = tarArchiveInputStream41.read(byteArray48, (int) 'a', (-1));
        int int56 = tarArchiveInputStream38.read(byteArray48, (int) (byte) 100, 1024);
        int int57 = tarArchiveInputStream14.read(byteArray48);
        int int58 = zipArchiveInputStream9.read(byteArray48);
        boolean boolean60 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray48, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.write(byteArray48);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        arArchiveOutputStream4.closeArchiveEntry();
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream6);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream7);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean13 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray11, 2);
        boolean boolean15 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray11, 49152);
        cpioArchiveOutputStream7.write(byteArray11, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream4.write(byteArray11, (int) (short) 1, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean9 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray7, 2);
        boolean boolean11 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray7, 49152);
        cpioArchiveOutputStream3.write(byteArray7, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream15 = archiveStreamFactory0.createArchiveOutputStream("hi!", (java.io.OutputStream) cpioArchiveOutputStream3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: hi! not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry4.setTime((long) (byte) 1);
        long long7 = cpioArchiveEntry4.getHeaderSize();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry5.setNumberOfLinks((long) 1);
        cpioArchiveEntry5.setDeviceMaj((long) 2048);
        cpioArchiveEntry5.setSize((long) 8);
        java.lang.String str12 = cpioArchiveEntry5.getName();
        cpioArchiveEntry5.setDeviceMin((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream3.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "070702" + "'", str12, "070702");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        int int8 = tarArchiveInputStream7.getRecordSize();
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream10);
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean16 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray14, 2);
        boolean boolean18 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray14, 49152);
        int int19 = tarArchiveInputStream11.read(byteArray14);
        int int20 = tarArchiveInputStream7.read(byteArray14);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream7);
        int int22 = cpioArchiveInputStream21.available();
        int int23 = cpioArchiveInputStream21.available();
        java.io.InputStream inputStream24 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream25 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream24);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream25);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean31 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray29, 2);
        boolean boolean33 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray29, 49152);
        int int34 = tarArchiveInputStream26.read(byteArray29);
        int int37 = cpioArchiveInputStream21.read(byteArray29, (int) (short) 2, 0);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream4.write(byteArray29, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream3);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean10 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray8, 2);
        boolean boolean12 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray8, 49152);
        cpioArchiveOutputStream4.write(byteArray8, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = arArchiveInputStream1.read(byteArray8, 40960, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        arArchiveOutputStream4.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream4);
        arArchiveOutputStream4.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream4.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        int int4 = tarArchiveOutputStream3.getRecordSize();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.write(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray15, 2);
        boolean boolean19 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray15, 49152);
        int int20 = tarArchiveInputStream12.read(byteArray15);
        int int21 = tarArchiveInputStream2.read(byteArray15);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream23);
        tarArchiveInputStream24.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream24);
        long long28 = tarArchiveInputStream24.skip((long) (byte) -1);
        java.io.OutputStream outputStream29 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream30 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream29);
        jarArchiveOutputStream30.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream30);
        tarArchiveOutputStream32.setDebug(false);
        tarArchiveInputStream24.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream37 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32);
        int int38 = tarArchiveOutputStream32.getRecordSize();
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 512 + "'", int38 == 512);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream3);
        tarArchiveInputStream4.reset();
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream6);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream7);
        jarArchiveOutputStream8.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream4, (java.io.OutputStream) jarArchiveOutputStream8, 100);
        int int12 = tarArchiveInputStream4.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream13 = archiveStreamFactory0.createArchiveInputStream("070702", (java.io.InputStream) tarArchiveInputStream4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: 070702 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.closeEntry();
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        byte[] byteArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.write(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        jarArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        jarArchiveOutputStream6.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream7);
        jarArchiveOutputStream8.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream10.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream10);
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream16 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream15);
        jarArchiveOutputStream16.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream16);
        tarArchiveOutputStream18.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream18);
        tarArchiveOutputStream18.setLongFileMode((int) (short) 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream18);
        tarArchiveOutputStream18.setBufferDebug(true);
        java.io.InputStream inputStream27 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream28 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream27);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream28);
        tarArchiveInputStream29.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream29);
        long long33 = tarArchiveInputStream29.skip((long) (byte) -1);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean38 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray36, 2);
        int int41 = tarArchiveInputStream29.read(byteArray36, (int) 'a', (-1));
        boolean boolean43 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray36, 0);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream18.write(byteArray36);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        jarArchiveOutputStream6.setFallbackToUTF8(true);
        jarArchiveOutputStream6.flush();
        jarArchiveOutputStream6.setComment("always");
        java.lang.Class<?> wildcardClass16 = jarArchiveOutputStream6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        tarArchiveInputStream8.reset();
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream12 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11);
        jarArchiveOutputStream12.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream8, (java.io.OutputStream) jarArchiveOutputStream12, 100);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream17 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream16);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream17);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean23 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray21, 2);
        boolean boolean25 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray21, 49152);
        int int26 = tarArchiveInputStream18.read(byteArray21);
        int int27 = tarArchiveInputStream8.read(byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = zipArchiveInputStream5.read(byteArray21, 64, 61440);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream4);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream4.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        arArchiveOutputStream4.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream4);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream4.write(8192);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = null;
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.putNextEntry(zipArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream4.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream2.setDebug(true);
        int int5 = tarArchiveOutputStream2.getRecordSize();
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        tarArchiveInputStream8.reset();
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream12 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11);
        jarArchiveOutputStream12.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream8, (java.io.OutputStream) jarArchiveOutputStream12, 100);
        int int16 = tarArchiveInputStream8.available();
        int int17 = tarArchiveInputStream8.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream8);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream19 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream18);
        java.io.InputStream inputStream20 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream21 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream20);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream21);
        int int23 = tarArchiveInputStream22.getRecordSize();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream24 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream22);
        java.io.InputStream inputStream25 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream26 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream25);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream26);
        tarArchiveInputStream27.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream27);
        long long31 = tarArchiveInputStream27.skip((long) (byte) -1);
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean36 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray34, 2);
        int int39 = tarArchiveInputStream27.read(byteArray34, (int) 'a', (-1));
        int int40 = tarArchiveInputStream22.read(byteArray34);
        int int43 = arArchiveInputStream19.read(byteArray34, (int) (short) 1, 1024);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.write(byteArray34);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.closeEntry();
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        jarArchiveOutputStream2.setMethod((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, 2048);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        tarArchiveInputStream8.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream8);
        long long12 = tarArchiveInputStream8.skip((long) (byte) -1);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray15, 2);
        int int20 = tarArchiveInputStream8.read(byteArray15, (int) 'a', (-1));
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray15, 0);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream5.write(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry4.setNumberOfLinks((long) 1);
        cpioArchiveEntry4.setDeviceMaj((long) 2048);
        cpioArchiveEntry4.setSize((long) 8);
        long long11 = cpioArchiveEntry4.getHeaderSize();
        cpioArchiveEntry4.setTime((long) 16384);
        boolean boolean14 = cpioArchiveEntry4.isNetwork();
        boolean boolean15 = cpioArchiveEntry4.isSocket();
        cpioArchiveEntry4.setFormat((short) 8);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        java.lang.String str4 = jarArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.putNextEntry(zipArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        arArchiveOutputStream4.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream4);
        jarArchiveOutputStream6.setUseLanguageEncodingFlag(true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream14);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream15);
        int int17 = tarArchiveInputStream16.getRecordSize();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream18 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream16);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream20 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream19);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream20);
        tarArchiveInputStream21.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream21);
        long long25 = tarArchiveInputStream21.skip((long) (byte) -1);
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean30 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray28, 2);
        int int33 = tarArchiveInputStream21.read(byteArray28, (int) 'a', (-1));
        int int34 = tarArchiveInputStream16.read(byteArray28);
        int int37 = arArchiveInputStream13.read(byteArray28, (int) (short) 1, 1024);
        byte[] byteArray38 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int39 = arArchiveInputStream13.read(byteArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        int int13 = tarArchiveInputStream2.read();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream7.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream3.write(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, 2048);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry6 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream5.putNextEntry(cpioArchiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        long long6 = tarArchiveInputStream2.skip((long) (byte) -1);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream7);
        jarArchiveOutputStream8.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream10.setDebug(false);
        tarArchiveInputStream2.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream14 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream15);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream17 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream16);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean22 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray20, 2);
        boolean boolean24 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray20, 49152);
        cpioArchiveOutputStream16.write(byteArray20, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream14.write(byteArray20);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1, (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.closeEntry();
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.setMethod(0);
        jarArchiveOutputStream2.closeArchiveEntry();
        jarArchiveOutputStream2.closeEntry();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        jarArchiveOutputStream6.setFallbackToUTF8(true);
        jarArchiveOutputStream6.closeArchiveEntry();
        boolean boolean14 = jarArchiveOutputStream6.isSeekable();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        jarArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream11.write((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.closeEntry();
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.setMethod(0);
        jarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.putNextEntry(zipArchiveEntry9);
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
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        arArchiveOutputStream4.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream4);
        arArchiveOutputStream4.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean10 = cpioArchiveEntry9.isSocket();
        boolean boolean11 = cpioArchiveEntry9.isCharacterDevice();
        long long12 = cpioArchiveEntry9.getSize();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream4.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream3.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean4 = cpioArchiveEntry3.isSocket();
        cpioArchiveEntry3.setTime((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.closeEntry();
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.setMethod(0);
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream9);
        int int11 = tarArchiveInputStream10.getRecordSize();
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream12);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream13);
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean19 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray17, 2);
        boolean boolean21 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray17, 49152);
        int int22 = tarArchiveInputStream14.read(byteArray17);
        int int23 = tarArchiveInputStream10.read(byteArray17);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream10);
        int int25 = cpioArchiveInputStream24.available();
        int int26 = cpioArchiveInputStream24.available();
        java.io.InputStream inputStream27 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream28 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream27);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream28);
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean34 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray32, 2);
        boolean boolean36 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray32, 49152);
        int int37 = tarArchiveInputStream29.read(byteArray32);
        int int40 = cpioArchiveInputStream24.read(byteArray32, (int) (short) 2, 0);
        boolean boolean42 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray32, 64);
        boolean boolean44 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray32, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.write(byteArray32, 1024, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, (int) (short) 100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        jarArchiveOutputStream4.flush();
        jarArchiveOutputStream4.closeEntry();
        jarArchiveOutputStream4.flush();
        jarArchiveOutputStream4.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream4.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, 2048);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        jarArchiveOutputStream2.setMethod(4);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.closeEntry();
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.setComment("org.apache.commons.compress.archivers.ArchiveException");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream7);
        jarArchiveOutputStream8.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream10.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream10);
        tarArchiveOutputStream10.setLongFileMode(49152);
        java.lang.String str17 = tarArchiveOutputStream10.getName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream10.putNextEntry(tarArchiveEntry18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "tar" + "'", str17, "tar");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        arArchiveOutputStream4.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream4);
        arArchiveOutputStream4.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream4.write((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        arArchiveOutputStream4.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean9 = cpioArchiveEntry8.isSocket();
        long long10 = cpioArchiveEntry8.getTime();
        cpioArchiveEntry8.setDeviceMaj((long) '#');
        long long13 = cpioArchiveEntry8.getSize();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream4.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream7);
        jarArchiveOutputStream8.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream10.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = jarArchiveInputStream15.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = jarArchiveInputStream15.getNextEntry();
        org.junit.Assert.assertNull(archiveEntry16);
        org.junit.Assert.assertNull(archiveEntry17);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        arArchiveOutputStream4.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream4);
        arArchiveOutputStream4.closeArchiveEntry();
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream9);
        tarArchiveInputStream10.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream10);
        long long14 = tarArchiveInputStream10.skip((long) (byte) -1);
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean19 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray17, 2);
        int int22 = tarArchiveInputStream10.read(byteArray17, (int) 'a', (-1));
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream4.write(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray15, 2);
        boolean boolean19 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray15, 49152);
        int int20 = tarArchiveInputStream12.read(byteArray15);
        int int21 = tarArchiveInputStream2.read(byteArray15);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream23);
        tarArchiveInputStream24.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream24);
        long long28 = tarArchiveInputStream24.skip((long) (byte) -1);
        java.io.OutputStream outputStream29 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream30 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream29);
        jarArchiveOutputStream30.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream30);
        tarArchiveOutputStream32.setDebug(false);
        tarArchiveInputStream24.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream37 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32, 10, 16);
        tarArchiveOutputStream32.finish();
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry4.setNumberOfLinks((long) 1);
        cpioArchiveEntry4.setDeviceMaj((long) 2048);
        cpioArchiveEntry4.setSize((long) 8);
        cpioArchiveEntry4.setRemoteDeviceMin((long) (short) 0);
        long long13 = cpioArchiveEntry4.getChksum();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, 2048);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream4.putNextEntry(tarArchiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int3 = tarArchiveInputStream2.getRecordSize();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        tarArchiveInputStream7.reset();
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream9);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        jarArchiveOutputStream11.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream7, (java.io.OutputStream) jarArchiveOutputStream11, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream11);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream15, 0);
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream19 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream18);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream19);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean25 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray23, 2);
        boolean boolean27 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray23, 49152);
        int int28 = tarArchiveInputStream20.read(byteArray23);
        boolean boolean30 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray23, 2);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream15.write(byteArray23);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        java.lang.String str8 = tarArchiveOutputStream3.getDefaultFileExtension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tar" + "'", str8, "tar");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        java.lang.String str9 = tarArchiveOutputStream8.getDefaultFileExtension();
        tarArchiveOutputStream8.setDebug(true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "tar" + "'", str9, "tar");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, 2048);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean8 = cpioArchiveEntry7.isSocket();
        cpioArchiveEntry7.setTime((long) (short) 10);
        long long11 = cpioArchiveEntry7.getHeaderSize();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream5.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        boolean boolean13 = tarArchiveInputStream12.markSupported();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        jarArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        jarArchiveOutputStream6.closeArchiveEntry();
        java.lang.String str13 = jarArchiveOutputStream6.getEncoding();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTF8" + "'", str13, "UTF8");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, (int) (short) 100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        boolean boolean7 = jarArchiveOutputStream2.isSeekable();
        byte[] byteArray11 = org.apache.commons.compress.archivers.cpio.CpioUtil.long2byteArray((long) 256, (int) (short) 10, true);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.write(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0, 0, 0, 0, 0, 0, 0, 1, 0]");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream7);
        jarArchiveOutputStream8.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream10.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream10);
        tarArchiveOutputStream10.setLongFileMode(49152);
        java.lang.String str17 = tarArchiveOutputStream10.getName();
        tarArchiveOutputStream10.closeEntry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "tar" + "'", str17, "tar");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        jarArchiveOutputStream6.closeEntry();
        jarArchiveOutputStream6.flush();
        jarArchiveOutputStream6.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy12);
        jarArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy12);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy12);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        java.lang.String str4 = jarArchiveOutputStream2.getEncoding();
        jarArchiveOutputStream2.closeArchiveEntry();
        jarArchiveOutputStream2.setMethod((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.write(byteArray4, 29127, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        cpioArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.write(4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        int int7 = tarArchiveOutputStream3.getRecordSize();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.putArchiveEntry(archiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        tarArchiveInputStream3.reset();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        jarArchiveOutputStream7.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream3, (java.io.OutputStream) jarArchiveOutputStream7, 100);
        int int11 = tarArchiveInputStream3.available();
        int int12 = tarArchiveInputStream3.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream3, (int) (short) 4, (int) 'a');
        tarArchiveInputStream15.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream17 = archiveStreamFactory0.createArchiveInputStream((java.io.InputStream) tarArchiveInputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        arArchiveOutputStream4.closeArchiveEntry();
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        tarArchiveInputStream8.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream8);
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream12);
        tarArchiveInputStream13.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream13);
        long long17 = tarArchiveInputStream13.skip((long) (byte) -1);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean22 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray20, 2);
        int int25 = tarArchiveInputStream13.read(byteArray20, (int) 'a', (-1));
        int int28 = tarArchiveInputStream10.read(byteArray20, (int) (byte) 100, 1024);
        java.io.OutputStream outputStream29 = null;
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream10, outputStream29, 4);
        int int32 = tarArchiveInputStream10.available();
        long long34 = tarArchiveInputStream10.skip(0L);
        java.io.InputStream inputStream35 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream36 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream35);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream36);
        int int38 = tarArchiveInputStream37.getRecordSize();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream39 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream37);
        java.io.InputStream inputStream40 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream41 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream40);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream42 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream41);
        tarArchiveInputStream42.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream44 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream42);
        long long46 = tarArchiveInputStream42.skip((long) (byte) -1);
        byte[] byteArray49 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean51 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray49, 2);
        int int54 = tarArchiveInputStream42.read(byteArray49, (int) 'a', (-1));
        int int55 = tarArchiveInputStream37.read(byteArray49);
        boolean boolean57 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray49, 2048);
        int int58 = tarArchiveInputStream10.read(byteArray49);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream4.write(byteArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 512 + "'", int38 == 512);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream7);
        jarArchiveOutputStream8.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream10.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = jarArchiveInputStream15.getNextEntry();
        java.io.InputStream inputStream17 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream18 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream17);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream18);
        int int20 = tarArchiveInputStream19.getRecordSize();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream21 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream19);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream23);
        tarArchiveInputStream24.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream24);
        long long28 = tarArchiveInputStream24.skip((long) (byte) -1);
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean33 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray31, 2);
        int int36 = tarArchiveInputStream24.read(byteArray31, (int) 'a', (-1));
        int int37 = tarArchiveInputStream19.read(byteArray31);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = jarArchiveInputStream15.read(byteArray31, 256, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(archiveEntry16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        jarArchiveOutputStream1.setLevel((-1));
        jarArchiveOutputStream1.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream7);
        jarArchiveOutputStream8.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream10.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream10);
        tarArchiveOutputStream10.setLongFileMode(49152);
        java.lang.String str17 = tarArchiveOutputStream10.getName();
        tarArchiveOutputStream10.closeEntry();
        tarArchiveOutputStream10.closeArchiveEntry();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "tar" + "'", str17, "tar");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean5 = cpioArchiveEntry4.isSocket();
        boolean boolean6 = cpioArchiveEntry4.isPipe();
        cpioArchiveEntry4.setRemoteDeviceMaj((long) 29127);
        cpioArchiveEntry4.setRemoteDeviceMin((long) 'a');
        long long11 = cpioArchiveEntry4.getMode();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream7);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        tarArchiveInputStream9.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream9);
        long long13 = tarArchiveInputStream9.skip((long) (byte) -1);
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean18 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray16, 2);
        int int21 = tarArchiveInputStream9.read(byteArray16, (int) 'a', (-1));
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.write(byteArray16, (int) (short) -1, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.closeEntry();
        jarArchiveOutputStream2.flush();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.write((int) (short) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream3);
        tarArchiveInputStream4.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream9);
        jarArchiveOutputStream10.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream10);
        tarArchiveOutputStream12.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream8, (java.io.OutputStream) tarArchiveOutputStream12);
        tarArchiveOutputStream12.setLongFileMode(49152);
        java.lang.String str19 = tarArchiveOutputStream12.getName();
        tarArchiveOutputStream12.closeEntry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream21 = archiveStreamFactory0.createArchiveOutputStream("hi!", (java.io.OutputStream) tarArchiveOutputStream12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: hi! not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "tar" + "'", str19, "tar");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream7);
        jarArchiveOutputStream8.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream10.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = jarArchiveInputStream15.getNextEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry17 = jarArchiveInputStream15.getNextJarEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = jarArchiveInputStream15.getNextZipEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry19 = jarArchiveInputStream15.getNextJarEntry();
        org.junit.Assert.assertNull(archiveEntry16);
        org.junit.Assert.assertNull(jarArchiveEntry17);
        org.junit.Assert.assertNull(zipArchiveEntry18);
        org.junit.Assert.assertNull(jarArchiveEntry19);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray15, 2);
        boolean boolean19 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray15, 49152);
        int int20 = tarArchiveInputStream12.read(byteArray15);
        int int21 = tarArchiveInputStream2.read(byteArray15);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream23);
        tarArchiveInputStream24.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream24);
        long long28 = tarArchiveInputStream24.skip((long) (byte) -1);
        java.io.OutputStream outputStream29 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream30 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream29);
        jarArchiveOutputStream30.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream30);
        tarArchiveOutputStream32.setDebug(false);
        tarArchiveInputStream24.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream37 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32);
        tarArchiveOutputStream32.finish();
        tarArchiveOutputStream32.finish();
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry3.setRemoteDeviceMin((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        jarArchiveOutputStream1.closeArchiveEntry();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        boolean boolean13 = tarArchiveInputStream2.markSupported();
        int int14 = tarArchiveInputStream2.available();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        tarArchiveInputStream8.reset();
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream12 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11);
        jarArchiveOutputStream12.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream8, (java.io.OutputStream) jarArchiveOutputStream12, 100);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream17 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream16);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream17);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean23 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray21, 2);
        boolean boolean25 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray21, 49152);
        int int26 = tarArchiveInputStream18.read(byteArray21);
        int int27 = tarArchiveInputStream8.read(byteArray21);
        java.io.InputStream inputStream28 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream29 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream28);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream29);
        tarArchiveInputStream30.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream30);
        long long34 = tarArchiveInputStream30.skip((long) (byte) -1);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean39 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray37, 2);
        int int42 = tarArchiveInputStream30.read(byteArray37, (int) 'a', (-1));
        boolean boolean44 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray37, (int) '#');
        int int45 = tarArchiveInputStream8.read(byteArray37);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream5.write(byteArray37, 32, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry9.setNumberOfLinks((long) 1);
        cpioArchiveEntry9.setDeviceMaj((long) 2048);
        cpioArchiveEntry9.setSize((long) 8);
        cpioArchiveEntry9.setRemoteDeviceMin((long) (short) 0);
        short short18 = cpioArchiveEntry9.getFormat();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream7.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 1 + "'", short18 == (short) 1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream4.write(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        tarArchiveInputStream3.reset();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        jarArchiveOutputStream7.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream3, (java.io.OutputStream) jarArchiveOutputStream7, 100);
        int int11 = tarArchiveInputStream3.available();
        int int12 = tarArchiveInputStream3.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = tarArchiveInputStream13.getNextEntry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream15 = archiveStreamFactory0.createArchiveInputStream((java.io.InputStream) tarArchiveInputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(archiveEntry14);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        java.lang.String str8 = tarArchiveOutputStream3.getDefaultFileExtension();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tar" + "'", str8, "tar");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream3.finish();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.closeEntry();
        jarArchiveOutputStream2.flush();
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream6);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream7);
        jarArchiveOutputStream8.flush();
        jarArchiveOutputStream8.closeEntry();
        jarArchiveOutputStream8.flush();
        jarArchiveOutputStream8.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream8.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy14);
        java.lang.String str16 = unicodeExtraFieldPolicy14.toString();
        jarArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy14);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "always" + "'", str16, "always");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream1.flush();
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.write(byteArray5, (int) '4', (int) (short) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100]");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        tarArchiveInputStream6.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream6);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        tarArchiveInputStream12.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream15);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream16);
        tarArchiveInputStream17.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream17);
        long long21 = tarArchiveInputStream17.skip((long) (byte) -1);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean26 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray24, 2);
        int int29 = tarArchiveInputStream17.read(byteArray24, (int) 'a', (-1));
        int int32 = tarArchiveInputStream14.read(byteArray24, (int) (byte) 100, 1024);
        tarArchiveInputStream14.close();
        java.io.InputStream inputStream34 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream35 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream34);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream35);
        tarArchiveInputStream36.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream36);
        java.io.InputStream inputStream39 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream40 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream39);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream40);
        tarArchiveInputStream41.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream41);
        long long45 = tarArchiveInputStream41.skip((long) (byte) -1);
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean50 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray48, 2);
        int int53 = tarArchiveInputStream41.read(byteArray48, (int) 'a', (-1));
        int int56 = tarArchiveInputStream38.read(byteArray48, (int) (byte) 100, 1024);
        int int57 = tarArchiveInputStream14.read(byteArray48);
        int int58 = zipArchiveInputStream9.read(byteArray48);
        boolean boolean60 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray48, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream3.write(byteArray48, (int) (byte) 1, 16384);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 4);
        tarArchiveOutputStream3.setLongFileMode(0);
        tarArchiveOutputStream3.closeArchiveEntry();
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream14 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream13);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream14);
        tarArchiveInputStream15.reset();
        java.io.OutputStream outputStream17 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream17);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream19 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        jarArchiveOutputStream19.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream15, (java.io.OutputStream) jarArchiveOutputStream19, 100);
        int int23 = tarArchiveInputStream15.available();
        int int24 = tarArchiveInputStream15.read();
        byte[] byteArray28 = new byte[] { (byte) -1, (byte) 1, (byte) 100 };
        boolean boolean30 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray28, (int) (short) 4);
        boolean boolean32 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray28, (int) (short) 12);
        int int35 = tarArchiveInputStream15.read(byteArray28, (int) ' ', 64);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.write(byteArray28);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '3' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        tarArchiveInputStream2.setDebug(false);
        int int14 = tarArchiveInputStream2.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = tarArchiveInputStream2.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, (int) (short) 100);
        tarArchiveOutputStream5.closeArchiveEntry();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        tarArchiveOutputStream10.finish();
        tarArchiveOutputStream10.finish();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        tarArchiveInputStream12.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream15);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream16);
        tarArchiveInputStream17.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream17);
        long long21 = tarArchiveInputStream17.skip((long) (byte) -1);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean26 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray24, 2);
        int int29 = tarArchiveInputStream17.read(byteArray24, (int) 'a', (-1));
        int int32 = tarArchiveInputStream14.read(byteArray24, (int) (byte) 100, 1024);
        tarArchiveInputStream14.close();
        java.io.InputStream inputStream34 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream35 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream34);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream35);
        tarArchiveInputStream36.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream36);
        java.io.InputStream inputStream39 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream40 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream39);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream40);
        tarArchiveInputStream41.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream41);
        long long45 = tarArchiveInputStream41.skip((long) (byte) -1);
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean50 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray48, 2);
        int int53 = tarArchiveInputStream41.read(byteArray48, (int) 'a', (-1));
        int int56 = tarArchiveInputStream38.read(byteArray48, (int) (byte) 100, 1024);
        int int57 = tarArchiveInputStream14.read(byteArray48);
        int int58 = tarArchiveInputStream2.read(byteArray48);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream59 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry60 = zipArchiveInputStream59.getNextZipEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry61 = zipArchiveInputStream59.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry62 = zipArchiveInputStream59.getNextEntry();
        java.io.InputStream inputStream63 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream64 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream63);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream65 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream64);
        int int66 = tarArchiveInputStream65.getRecordSize();
        java.io.InputStream inputStream67 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream68 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream67);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream69 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream68);
        byte[] byteArray72 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean74 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray72, 2);
        boolean boolean76 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray72, 49152);
        int int77 = tarArchiveInputStream69.read(byteArray72);
        int int78 = tarArchiveInputStream65.read(byteArray72);
        // The following exception was thrown during execution in test generation
        try {
            int int81 = zipArchiveInputStream59.read(byteArray72, 8, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry60);
        org.junit.Assert.assertNull(archiveEntry61);
        org.junit.Assert.assertNull(archiveEntry62);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 512 + "'", int66 == 512);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = zipArchiveInputStream5.getNextZipEntry();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream7);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        tarArchiveInputStream9.reset();
        java.io.OutputStream outputStream11 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream11);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream13 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        jarArchiveOutputStream13.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream9, (java.io.OutputStream) jarArchiveOutputStream13, 100);
        int int17 = tarArchiveInputStream9.available();
        int int18 = tarArchiveInputStream9.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream9);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream20 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream19);
        java.io.InputStream inputStream21 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream22 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream21);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream22);
        int int24 = tarArchiveInputStream23.getRecordSize();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream25 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream23);
        java.io.InputStream inputStream26 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream27 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream26);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream27);
        tarArchiveInputStream28.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream28);
        long long32 = tarArchiveInputStream28.skip((long) (byte) -1);
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean37 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray35, 2);
        int int40 = tarArchiveInputStream28.read(byteArray35, (int) 'a', (-1));
        int int41 = tarArchiveInputStream23.read(byteArray35);
        int int44 = arArchiveInputStream20.read(byteArray35, (int) (short) 1, 1024);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = zipArchiveInputStream5.read(byteArray35, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(zipArchiveEntry6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream3);
        tarArchiveInputStream4.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream9);
        jarArchiveOutputStream10.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream10);
        tarArchiveOutputStream12.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream8, (java.io.OutputStream) tarArchiveOutputStream12);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream17 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = jarArchiveInputStream17.getNextEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry19 = jarArchiveInputStream17.getNextJarEntry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream20 = archiveStreamFactory0.createArchiveInputStream("070707", (java.io.InputStream) jarArchiveInputStream17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: 070707 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(archiveEntry18);
        org.junit.Assert.assertNull(jarArchiveEntry19);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        arArchiveOutputStream4.closeArchiveEntry();
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        tarArchiveInputStream8.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream8);
        long long12 = tarArchiveInputStream8.skip((long) (byte) -1);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray15, 2);
        int int20 = tarArchiveInputStream8.read(byteArray15, (int) 'a', (-1));
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream4.write(byteArray15, (int) (short) 2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = tarArchiveInputStream12.getNextEntry();
        int int14 = tarArchiveInputStream12.getRecordSize();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(archiveEntry13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int3 = tarArchiveInputStream2.getRecordSize();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        tarArchiveInputStream7.reset();
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream9);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        jarArchiveOutputStream11.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream7, (java.io.OutputStream) jarArchiveOutputStream11, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream11);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream15, 0);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream15.write(32);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        arArchiveOutputStream4.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry7.setNumberOfLinks((long) 1);
        cpioArchiveEntry7.setDeviceMaj((long) 2048);
        cpioArchiveEntry7.setSize((long) 8);
        java.lang.String str14 = cpioArchiveEntry7.getName();
        cpioArchiveEntry7.setMode((long) 16384);
        long long17 = cpioArchiveEntry7.getChksum();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream4.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "070702" + "'", str14, "070702");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, 2048);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream4);
        tarArchiveOutputStream5.setBufferDebug(false);
        tarArchiveOutputStream5.setBufferDebug(false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        short short10 = cpioArchiveEntry9.getFormat();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream7.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        long long6 = tarArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2, (int) (short) 3);
        int int9 = tarArchiveInputStream8.read();
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        tarArchiveInputStream12.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream15);
        java.io.OutputStream outputStream17 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream18 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream17);
        jarArchiveOutputStream18.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream18);
        tarArchiveOutputStream20.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream20);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream16, (java.io.OutputStream) tarArchiveOutputStream20);
        tarArchiveInputStream8.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream20);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream20.write(2048);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream3);
        tarArchiveInputStream4.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream9);
        jarArchiveOutputStream10.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream10);
        tarArchiveOutputStream12.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream8, (java.io.OutputStream) tarArchiveOutputStream12);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream17 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = jarArchiveInputStream17.getNextEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry19 = jarArchiveInputStream17.getNextJarEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = jarArchiveInputStream17.getNextZipEntry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream21 = archiveStreamFactory0.createArchiveInputStream("070702", (java.io.InputStream) jarArchiveInputStream17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: 070702 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(archiveEntry18);
        org.junit.Assert.assertNull(jarArchiveEntry19);
        org.junit.Assert.assertNull(zipArchiveEntry20);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray15, 2);
        boolean boolean19 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray15, 49152);
        int int20 = tarArchiveInputStream12.read(byteArray15);
        int int21 = tarArchiveInputStream2.read(byteArray15);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream23);
        tarArchiveInputStream24.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream24);
        long long28 = tarArchiveInputStream24.skip((long) (byte) -1);
        java.io.OutputStream outputStream29 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream30 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream29);
        jarArchiveOutputStream30.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream30);
        tarArchiveOutputStream32.setDebug(false);
        tarArchiveInputStream24.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream37 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry39 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry39.setTime((long) (byte) 1);
        long long42 = cpioArchiveEntry39.getInode();
        java.lang.String str43 = cpioArchiveEntry39.getName();
        cpioArchiveEntry39.setDeviceMaj((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream37.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry39);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "070702" + "'", str43, "070702");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream7);
        jarArchiveOutputStream8.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream10.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        byte[] byteArray19 = org.apache.commons.compress.archivers.cpio.CpioUtil.long2byteArray((long) 256, (int) (short) 10, true);
        long long21 = org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(byteArray19, false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = jarArchiveInputStream15.read(byteArray19, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0, 0, 0, 0, 0, 0, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        tarArchiveInputStream12.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream15);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream16);
        tarArchiveInputStream17.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream17);
        long long21 = tarArchiveInputStream17.skip((long) (byte) -1);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean26 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray24, 2);
        int int29 = tarArchiveInputStream17.read(byteArray24, (int) 'a', (-1));
        int int32 = tarArchiveInputStream14.read(byteArray24, (int) (byte) 100, 1024);
        tarArchiveInputStream14.close();
        java.io.InputStream inputStream34 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream35 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream34);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream35);
        tarArchiveInputStream36.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream36);
        java.io.InputStream inputStream39 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream40 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream39);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream40);
        tarArchiveInputStream41.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream41);
        long long45 = tarArchiveInputStream41.skip((long) (byte) -1);
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean50 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray48, 2);
        int int53 = tarArchiveInputStream41.read(byteArray48, (int) 'a', (-1));
        int int56 = tarArchiveInputStream38.read(byteArray48, (int) (byte) 100, 1024);
        int int57 = tarArchiveInputStream14.read(byteArray48);
        int int58 = tarArchiveInputStream2.read(byteArray48);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream59 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry60 = zipArchiveInputStream59.getNextZipEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry61 = zipArchiveInputStream59.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry62 = zipArchiveInputStream59.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry63 = zipArchiveInputStream59.getNextZipEntry();
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry60);
        org.junit.Assert.assertNull(archiveEntry61);
        org.junit.Assert.assertNull(archiveEntry62);
        org.junit.Assert.assertNull(zipArchiveEntry63);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        arArchiveOutputStream4.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream4);
        arArchiveOutputStream4.closeArchiveEntry();
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream9);
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray13, 2);
        boolean boolean17 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray13, 49152);
        int int18 = tarArchiveInputStream10.read(byteArray13);
        boolean boolean20 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray13, 2);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream4.write(byteArray13, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream7);
        jarArchiveOutputStream8.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream10.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream10);
        tarArchiveOutputStream10.setLongFileMode(49152);
        java.lang.String str17 = tarArchiveOutputStream10.getDefaultFileExtension();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream10.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "tar" + "'", str17, "tar");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        long long13 = tarArchiveInputStream2.skip((long) 8);
        boolean boolean14 = tarArchiveInputStream2.markSupported();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray15, 2);
        boolean boolean19 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray15, 49152);
        int int20 = tarArchiveInputStream12.read(byteArray15);
        int int21 = tarArchiveInputStream2.read(byteArray15);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream23);
        tarArchiveInputStream24.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream24);
        long long28 = tarArchiveInputStream24.skip((long) (byte) -1);
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean33 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray31, 2);
        int int36 = tarArchiveInputStream24.read(byteArray31, (int) 'a', (-1));
        boolean boolean38 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray31, 0);
        int int41 = tarArchiveInputStream2.read(byteArray31, 32768, 1);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        java.io.OutputStream outputStream11 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream12 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream11);
        jarArchiveOutputStream12.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream12);
        tarArchiveOutputStream14.setDebug(false);
        tarArchiveOutputStream14.setDebug(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14, 4);
        tarArchiveOutputStream14.setLongFileMode(0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream14, 64);
        tarArchiveOutputStream14.setLongFileMode(10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        long long13 = tarArchiveInputStream2.skip((long) 8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = tarArchiveInputStream2.getNextTarEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        tarArchiveOutputStream10.setLongFileMode(100);
        int int13 = tarArchiveOutputStream10.getRecordSize();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        tarArchiveInputStream7.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream7);
        long long11 = tarArchiveInputStream7.skip((long) (byte) -1);
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean16 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray14, 2);
        int int19 = tarArchiveInputStream7.read(byteArray14, (int) 'a', (-1));
        int int22 = tarArchiveInputStream4.read(byteArray14, (int) (byte) 100, 1024);
        java.io.OutputStream outputStream23 = null;
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream4, outputStream23, 4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry26 = tarArchiveInputStream4.getNextEntry();
        java.io.InputStream inputStream27 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream28 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream27);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream28);
        tarArchiveInputStream29.reset();
        java.io.OutputStream outputStream31 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream32 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream31);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream33 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream32);
        jarArchiveOutputStream33.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream29, (java.io.OutputStream) jarArchiveOutputStream33, 100);
        java.io.InputStream inputStream37 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream38 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream37);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream39 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream38);
        byte[] byteArray42 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean44 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray42, 2);
        boolean boolean46 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray42, 49152);
        int int47 = tarArchiveInputStream39.read(byteArray42);
        int int48 = tarArchiveInputStream29.read(byteArray42);
        java.io.InputStream inputStream49 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream50 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream49);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream51 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream50);
        tarArchiveInputStream51.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream53 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream51);
        long long55 = tarArchiveInputStream51.skip((long) (byte) -1);
        java.io.OutputStream outputStream56 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream57 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream56);
        jarArchiveOutputStream57.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream59 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream57);
        tarArchiveOutputStream59.setDebug(false);
        tarArchiveInputStream51.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream59);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream29, (java.io.OutputStream) tarArchiveOutputStream59);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream64 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream59);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream67 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream59, 10, 16);
        tarArchiveInputStream4.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream59);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(archiveEntry26);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream4);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream6);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream7);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveInputStream2.copyEntryContents((java.io.OutputStream) jarArchiveOutputStream8);
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream12);
        int int14 = tarArchiveInputStream13.getRecordSize();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream13);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream17 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream16);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream17);
        tarArchiveInputStream18.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream18);
        long long22 = tarArchiveInputStream18.skip((long) (byte) -1);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean27 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray25, 2);
        int int30 = tarArchiveInputStream18.read(byteArray25, (int) 'a', (-1));
        int int31 = tarArchiveInputStream13.read(byteArray25);
        int int32 = tarArchiveInputStream2.read(byteArray25);
        tarArchiveInputStream2.close();
        java.io.OutputStream outputStream34 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream35 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream34);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream36 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream35);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream36, 2048);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream39 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream38);
        int int40 = tarArchiveOutputStream38.getRecordSize();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream38);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 512 + "'", int40 == 512);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.closeEntry();
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        java.lang.String str10 = jarArchiveOutputStream2.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        tarArchiveInputStream12.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream15);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream16);
        tarArchiveInputStream17.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream17);
        long long21 = tarArchiveInputStream17.skip((long) (byte) -1);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean26 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray24, 2);
        int int29 = tarArchiveInputStream17.read(byteArray24, (int) 'a', (-1));
        int int32 = tarArchiveInputStream14.read(byteArray24, (int) (byte) 100, 1024);
        tarArchiveInputStream14.close();
        java.io.InputStream inputStream34 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream35 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream34);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream35);
        tarArchiveInputStream36.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream36);
        java.io.InputStream inputStream39 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream40 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream39);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream40);
        tarArchiveInputStream41.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream41);
        long long45 = tarArchiveInputStream41.skip((long) (byte) -1);
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean50 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray48, 2);
        int int53 = tarArchiveInputStream41.read(byteArray48, (int) 'a', (-1));
        int int56 = tarArchiveInputStream38.read(byteArray48, (int) (byte) 100, 1024);
        int int57 = tarArchiveInputStream14.read(byteArray48);
        int int58 = tarArchiveInputStream2.read(byteArray48);
        long long60 = tarArchiveInputStream2.skip((long) 2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry61 = tarArchiveInputStream2.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, (int) (short) 100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.setEncoding("org.apache.commons.compress.archivers.ArchiveException: 070707");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: org.apache.commons.compress.archivers.ArchiveException: 070707");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        boolean boolean13 = tarArchiveInputStream2.markSupported();
        java.lang.Class<?> wildcardClass14 = tarArchiveInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        java.lang.String str4 = jarArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        jarArchiveOutputStream6.closeArchiveEntry();
        jarArchiveOutputStream6.flush();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry7.setRemoteDeviceMin((long) 1);
        cpioArchiveEntry7.setDeviceMin(110L);
        java.lang.String str12 = cpioArchiveEntry7.getName();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream5.putNextEntry(cpioArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "070702" + "'", str12, "070702");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        boolean boolean13 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, outputStream14, (int) (short) 1);
        java.io.InputStream inputStream17 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream18 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream17);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream18);
        tarArchiveInputStream19.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream19);
        long long23 = tarArchiveInputStream19.skip((long) (byte) -1);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean28 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray26, 2);
        int int31 = tarArchiveInputStream19.read(byteArray26, (int) 'a', (-1));
        boolean boolean33 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray26, (int) '#');
        int int36 = tarArchiveInputStream2.read(byteArray26, 256, (int) '4');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        jarArchiveOutputStream6.setFallbackToUTF8(true);
        jarArchiveOutputStream6.flush();
        jarArchiveOutputStream6.setComment("always");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6, 128);
        tarArchiveOutputStream17.setLongFileMode(4096);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        tarArchiveInputStream7.reset();
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream9);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        jarArchiveOutputStream11.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream7, (java.io.OutputStream) jarArchiveOutputStream11, 100);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream15);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream16);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean22 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray20, 2);
        boolean boolean24 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray20, 49152);
        int int25 = tarArchiveInputStream17.read(byteArray20);
        int int26 = tarArchiveInputStream7.read(byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream1.write(byteArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream13);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        jarArchiveOutputStream15.flush();
        jarArchiveOutputStream15.closeEntry();
        jarArchiveOutputStream15.flush();
        jarArchiveOutputStream15.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy21 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        jarArchiveOutputStream15.setMethod((int) (byte) 10);
        jarArchiveOutputStream15.flush();
        tarArchiveInputStream2.copyEntryContents((java.io.OutputStream) jarArchiveOutputStream15);
        tarArchiveInputStream2.close();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy21);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry14.setNumberOfLinks((long) 1);
        cpioArchiveEntry14.setDeviceMaj((long) 2048);
        cpioArchiveEntry14.setSize((long) 8);
        java.lang.String str21 = cpioArchiveEntry14.getName();
        long long22 = cpioArchiveEntry14.getRemoteDeviceMaj();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "070702" + "'", str21, "070702");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray15, 2);
        boolean boolean19 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray15, 49152);
        int int20 = tarArchiveInputStream12.read(byteArray15);
        int int21 = tarArchiveInputStream2.read(byteArray15);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream23);
        tarArchiveInputStream24.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream24);
        long long28 = tarArchiveInputStream24.skip((long) (byte) -1);
        java.io.OutputStream outputStream29 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream30 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream29);
        jarArchiveOutputStream30.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream30);
        tarArchiveOutputStream32.setDebug(false);
        tarArchiveInputStream24.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream37 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32, 10, 16);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry41 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream40.putNextEntry(tarArchiveEntry41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        jarArchiveOutputStream6.closeArchiveEntry();
        jarArchiveOutputStream6.setEncoding("org.apache.commons.compress.archivers.ArchiveException");
        boolean boolean13 = jarArchiveOutputStream6.isSeekable();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        tarArchiveInputStream12.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream15);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream16);
        tarArchiveInputStream17.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream17);
        long long21 = tarArchiveInputStream17.skip((long) (byte) -1);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean26 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray24, 2);
        int int29 = tarArchiveInputStream17.read(byteArray24, (int) 'a', (-1));
        int int32 = tarArchiveInputStream14.read(byteArray24, (int) (byte) 100, 1024);
        tarArchiveInputStream14.close();
        java.io.InputStream inputStream34 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream35 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream34);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream35);
        tarArchiveInputStream36.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream36);
        java.io.InputStream inputStream39 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream40 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream39);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream40);
        tarArchiveInputStream41.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream41);
        long long45 = tarArchiveInputStream41.skip((long) (byte) -1);
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean50 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray48, 2);
        int int53 = tarArchiveInputStream41.read(byteArray48, (int) 'a', (-1));
        int int56 = tarArchiveInputStream38.read(byteArray48, (int) (byte) 100, 1024);
        int int57 = tarArchiveInputStream14.read(byteArray48);
        int int58 = tarArchiveInputStream2.read(byteArray48);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream59 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry60 = zipArchiveInputStream59.getNextZipEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry61 = zipArchiveInputStream59.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry62 = zipArchiveInputStream59.getNextEntry();
        java.io.InputStream inputStream63 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream64 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream63);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream65 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream64);
        tarArchiveInputStream65.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream67 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream65);
        long long69 = tarArchiveInputStream65.skip((long) (byte) -1);
        byte[] byteArray72 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean74 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray72, 2);
        int int77 = tarArchiveInputStream65.read(byteArray72, (int) 'a', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int80 = zipArchiveInputStream59.read(byteArray72, (int) '#', 32768);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry60);
        org.junit.Assert.assertNull(archiveEntry61);
        org.junit.Assert.assertNull(archiveEntry62);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.closeEntry();
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        jarArchiveOutputStream2.setMethod((int) (byte) 10);
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream12);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream14 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream13);
        jarArchiveOutputStream14.flush();
        jarArchiveOutputStream14.closeEntry();
        jarArchiveOutputStream14.flush();
        jarArchiveOutputStream14.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy20 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream14.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy20);
        java.lang.String str22 = unicodeExtraFieldPolicy20.toString();
        java.lang.String str23 = unicodeExtraFieldPolicy20.toString();
        java.lang.String str24 = unicodeExtraFieldPolicy20.toString();
        jarArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy20);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "always" + "'", str22, "always");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "always" + "'", str23, "always");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "always" + "'", str24, "always");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray15, 2);
        boolean boolean19 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray15, 49152);
        int int20 = tarArchiveInputStream12.read(byteArray15);
        long long22 = org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(byteArray15, false);
        int int25 = tarArchiveInputStream2.read(byteArray15, 4, 1024);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 25610L + "'", long22 == 25610L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream3 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream2);
        jarArchiveOutputStream3.flush();
        jarArchiveOutputStream3.closeEntry();
        jarArchiveOutputStream3.flush();
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream7);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream9 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream8);
        jarArchiveOutputStream9.flush();
        jarArchiveOutputStream9.closeEntry();
        jarArchiveOutputStream9.flush();
        jarArchiveOutputStream9.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream9.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        java.lang.String str17 = unicodeExtraFieldPolicy15.toString();
        jarArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.utils.IOUtils.copy(inputStream0, (java.io.OutputStream) jarArchiveOutputStream3, 4096);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "always" + "'", str17, "always");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        boolean boolean14 = tarArchiveInputStream2.markSupported();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream3 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream3);
        java.lang.String str5 = jarArchiveOutputStream3.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.utils.IOUtils.copy(inputStream0, (java.io.OutputStream) zipArchiveOutputStream6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.closeEntry();
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.setMethod(0);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.setEncoding("org.apache.commons.compress.archivers.ArchiveException: 070707");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: org.apache.commons.compress.archivers.ArchiveException: 070707");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream3.setLongFileMode((int) (short) 0);
        tarArchiveOutputStream3.flush();
        java.lang.String str10 = tarArchiveOutputStream3.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "tar" + "'", str10, "tar");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        java.lang.String str4 = jarArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        zipArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean9 = cpioArchiveEntry8.isSocket();
        long long10 = cpioArchiveEntry8.getTime();
        cpioArchiveEntry8.setDeviceMaj((long) '#');
        boolean boolean13 = cpioArchiveEntry8.isRegularFile();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream14);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream15);
        tarArchiveInputStream16.mark(32);
        int int19 = tarArchiveInputStream16.read();
        tarArchiveInputStream16.close();
        java.io.InputStream inputStream21 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream22 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream21);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream22);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean28 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray26, 2);
        boolean boolean30 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray26, 49152);
        int int31 = tarArchiveInputStream23.read(byteArray26);
        long long33 = org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(byteArray26, true);
        int int36 = tarArchiveInputStream16.read(byteArray26, 1024, (int) (byte) -1);
        int int37 = arArchiveInputStream13.read(byteArray26);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry38 = arArchiveInputStream13.getNextEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry39 = arArchiveInputStream13.getNextArEntry();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 2660L + "'", long33 == 2660L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(archiveEntry38);
        org.junit.Assert.assertNull(arArchiveEntry39);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, (int) (short) 100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray15, 2);
        boolean boolean19 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray15, 49152);
        int int20 = tarArchiveInputStream12.read(byteArray15);
        int int21 = tarArchiveInputStream2.read(byteArray15);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream23);
        tarArchiveInputStream24.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream24);
        long long28 = tarArchiveInputStream24.skip((long) (byte) -1);
        java.io.OutputStream outputStream29 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream30 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream29);
        jarArchiveOutputStream30.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream30);
        tarArchiveOutputStream32.setDebug(false);
        tarArchiveInputStream24.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream37 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32);
        jarArchiveOutputStream37.setMethod(64);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream6);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream7);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveInputStream2.copyEntryContents((java.io.OutputStream) jarArchiveOutputStream8);
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream12);
        int int14 = tarArchiveInputStream13.getRecordSize();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream13);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream17 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream16);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream17);
        tarArchiveInputStream18.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream18);
        long long22 = tarArchiveInputStream18.skip((long) (byte) -1);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean27 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray25, 2);
        int int30 = tarArchiveInputStream18.read(byteArray25, (int) 'a', (-1));
        int int31 = tarArchiveInputStream13.read(byteArray25);
        int int32 = tarArchiveInputStream2.read(byteArray25);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream33 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry34 = jarArchiveInputStream33.getNextEntry();
        byte[] byteArray35 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int36 = jarArchiveInputStream33.read(byteArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(archiveEntry34);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream13);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        jarArchiveOutputStream15.flush();
        jarArchiveOutputStream15.closeEntry();
        jarArchiveOutputStream15.flush();
        jarArchiveOutputStream15.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy21 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        jarArchiveOutputStream15.setMethod((int) (byte) 10);
        jarArchiveOutputStream15.flush();
        tarArchiveInputStream2.copyEntryContents((java.io.OutputStream) jarArchiveOutputStream15);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream27 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream28 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream29 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream28);
        jarArchiveOutputStream29.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream29);
        tarArchiveOutputStream31.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream34 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream31);
        tarArchiveOutputStream31.flush();
        java.io.InputStream inputStream36 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream37 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream36);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream37);
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean43 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray41, 2);
        boolean boolean45 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray41, 49152);
        int int46 = tarArchiveInputStream38.read(byteArray41);
        long long48 = org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(byteArray41, true);
        tarArchiveOutputStream31.write(byteArray41, 49152, (int) (byte) -1);
        int int54 = arArchiveInputStream27.read(byteArray41, 10, 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy21);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 2660L + "'", long48 == 2660L);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream4);
        byte[] byteArray9 = org.apache.commons.compress.archivers.cpio.CpioUtil.long2byteArray((long) (short) 3, (int) (byte) 100, false);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream4.write(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0]");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.closeEntry();
        jarArchiveOutputStream2.setEncoding("tar");
        jarArchiveOutputStream2.setComment("070702");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 1, (byte) 100 };
        boolean boolean10 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray8, (int) (short) 4);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray8, (int) (short) 4);
        boolean boolean14 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray8, 40960);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream4.write(byteArray8, 1024, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 4);
        tarArchiveOutputStream3.setLongFileMode(0);
        java.lang.String str12 = tarArchiveOutputStream3.getDefaultFileExtension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "tar" + "'", str12, "tar");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, 2048);
        jarArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        jarArchiveOutputStream6.closeArchiveEntry();
        jarArchiveOutputStream6.setEncoding("org.apache.commons.compress.archivers.ArchiveException");
        jarArchiveOutputStream6.closeArchiveEntry();
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream14);
        jarArchiveOutputStream15.closeEntry();
        java.io.OutputStream outputStream17 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream17);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream19 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        jarArchiveOutputStream19.flush();
        jarArchiveOutputStream19.closeEntry();
        jarArchiveOutputStream19.flush();
        jarArchiveOutputStream19.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy25 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream19.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy25);
        java.lang.String str27 = unicodeExtraFieldPolicy25.toString();
        java.lang.String str28 = unicodeExtraFieldPolicy25.toString();
        jarArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy25);
        jarArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy25);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "always" + "'", str27, "always");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "always" + "'", str28, "always");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream4.write((int) (short) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream1.setEncoding("org.apache.commons.compress.archivers.ArchiveException: always");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: org.apache.commons.compress.archivers.ArchiveException: always");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = tarArchiveInputStream12.getNextEntry();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(archiveEntry14);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, 2048);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream4);
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        tarArchiveInputStream8.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream8);
        long long12 = tarArchiveInputStream8.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream8, (int) (short) 3);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 1 };
        int int20 = tarArchiveInputStream8.read(byteArray19);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream4.write(byteArray19, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '100' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        jarArchiveOutputStream6.setFallbackToUTF8(true);
        jarArchiveOutputStream6.flush();
        jarArchiveOutputStream6.setComment("always");
        jarArchiveOutputStream6.closeEntry();
        jarArchiveOutputStream6.setUseLanguageEncodingFlag(false);
        jarArchiveOutputStream6.flush();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, 2048);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream4);
        tarArchiveOutputStream4.flush();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        jarArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        jarArchiveOutputStream6.closeArchiveEntry();
        jarArchiveOutputStream6.setFallbackToUTF8(true);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream6.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream7);
        jarArchiveOutputStream8.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream10.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = jarArchiveInputStream15.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = jarArchiveInputStream15.getNextZipEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) jarArchiveInputStream15);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean23 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray21, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = cpioArchiveInputStream18.read(byteArray21, (int) (byte) 0, 4096);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(archiveEntry16);
        org.junit.Assert.assertNull(zipArchiveEntry17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        long long6 = tarArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2, (int) (short) 3);
        int int9 = tarArchiveInputStream8.read();
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        tarArchiveInputStream12.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream15);
        java.io.OutputStream outputStream17 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream18 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream17);
        jarArchiveOutputStream18.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream18);
        tarArchiveOutputStream20.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream20);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream16, (java.io.OutputStream) tarArchiveOutputStream20);
        tarArchiveInputStream8.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream20);
        java.lang.String str26 = tarArchiveOutputStream20.getName();
        java.lang.String str27 = tarArchiveOutputStream20.getDefaultFileExtension();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "tar" + "'", str26, "tar");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "tar" + "'", str27, "tar");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream7);
        jarArchiveOutputStream8.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream10.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream10);
        tarArchiveOutputStream10.setLongFileMode(49152);
        java.lang.String str17 = tarArchiveOutputStream10.getName();
        tarArchiveOutputStream10.closeEntry();
        java.lang.String str19 = tarArchiveOutputStream10.getName();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean22 = cpioArchiveEntry21.isSocket();
        long long23 = cpioArchiveEntry21.getTime();
        boolean boolean24 = cpioArchiveEntry21.isPipe();
        long long25 = cpioArchiveEntry21.getHeaderSize();
        long long26 = cpioArchiveEntry21.getGID();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream10.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "tar" + "'", str17, "tar");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "tar" + "'", str19, "tar");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 110L + "'", long25 == 110L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream3);
        jarArchiveOutputStream4.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        tarArchiveOutputStream6.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream6.flush();
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream12);
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean18 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray16, 2);
        boolean boolean20 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray16, 49152);
        int int21 = tarArchiveInputStream13.read(byteArray16);
        long long23 = org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(byteArray16, true);
        tarArchiveOutputStream6.write(byteArray16, 49152, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = arArchiveInputStream1.read(byteArray16, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 2660L + "'", long23 == 2660L);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        jarArchiveOutputStream6.setFallbackToUTF8(true);
        jarArchiveOutputStream6.flush();
        jarArchiveOutputStream6.setComment("always");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6, 128);
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream19 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream18);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream19);
        tarArchiveInputStream20.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream20);
        long long24 = tarArchiveInputStream20.skip((long) (byte) -1);
        java.io.OutputStream outputStream25 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream26 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream25);
        jarArchiveOutputStream26.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream26);
        tarArchiveOutputStream28.setDebug(false);
        tarArchiveInputStream20.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream28);
        byte[] byteArray34 = new byte[] { (byte) -1, (byte) -1 };
        tarArchiveOutputStream28.write(byteArray34, (int) ' ', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream6.write(byteArray34, 61440, 8192);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-1, -1]");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream3);
        tarArchiveInputStream4.reset();
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream6);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream7);
        jarArchiveOutputStream8.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream4, (java.io.OutputStream) jarArchiveOutputStream8, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream12.setLongFileMode(100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12, 4096, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream18 = archiveStreamFactory0.createArchiveOutputStream("070701", (java.io.OutputStream) tarArchiveOutputStream12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: 070701 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, (int) (short) 100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        boolean boolean7 = jarArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream8.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        int int14 = arArchiveInputStream13.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = arArchiveInputStream13.getNextEntry();
        byte[] byteArray19 = org.apache.commons.compress.archivers.cpio.CpioUtil.long2byteArray((long) 256, (int) (short) 10, true);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray19, 0);
        int int22 = arArchiveInputStream13.read(byteArray19);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(archiveEntry15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0, 0, 0, 0, 0, 0, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream7);
        jarArchiveOutputStream8.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream10.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = jarArchiveInputStream15.getNextEntry();
        boolean boolean17 = jarArchiveInputStream15.markSupported();
        org.junit.Assert.assertNull(archiveEntry16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry12.setNumberOfLinks((long) 1);
        cpioArchiveEntry12.setDeviceMaj((long) 2048);
        cpioArchiveEntry12.setSize((long) 8);
        java.lang.String str19 = cpioArchiveEntry12.getName();
        long long20 = cpioArchiveEntry12.getRemoteDeviceMaj();
        long long21 = cpioArchiveEntry12.getInode();
        boolean boolean22 = cpioArchiveEntry12.isSymbolicLink();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream10.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "070702" + "'", str19, "070702");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        long long6 = tarArchiveInputStream2.skip((long) (byte) -1);
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean11 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray9, 2);
        int int14 = tarArchiveInputStream2.read(byteArray9, (int) 'a', (-1));
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream16 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream15);
        jarArchiveOutputStream16.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream16);
        tarArchiveOutputStream18.setDebug(false);
        tarArchiveOutputStream18.setDebug(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream18, 4);
        tarArchiveOutputStream18.setLongFileMode(0);
        java.lang.String str27 = tarArchiveOutputStream18.getName();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream18);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream30 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream18, (short) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "tar" + "'", str27, "tar");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.closeEntry();
        jarArchiveOutputStream2.flush();
        java.lang.String str6 = jarArchiveOutputStream2.getEncoding();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream14);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream15);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean21 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray19, 2);
        boolean boolean23 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray19, 49152);
        int int24 = tarArchiveInputStream16.read(byteArray19);
        int int27 = arArchiveInputStream13.read(byteArray19, (int) ' ', (int) '4');
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry28 = arArchiveInputStream13.getNextArEntry();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(arArchiveEntry28);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream7);
        jarArchiveOutputStream8.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream10.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream10);
        tarArchiveOutputStream10.setLongFileMode(49152);
        java.lang.String str17 = tarArchiveOutputStream10.getName();
        tarArchiveOutputStream10.closeEntry();
        java.lang.String str19 = tarArchiveOutputStream10.getName();
        tarArchiveOutputStream10.setLongFileMode((int) '#');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "tar" + "'", str17, "tar");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "tar" + "'", str19, "tar");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray15, 2);
        boolean boolean19 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray15, 49152);
        int int20 = tarArchiveInputStream12.read(byteArray15);
        int int21 = tarArchiveInputStream2.read(byteArray15);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream23);
        tarArchiveInputStream24.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream24);
        long long28 = tarArchiveInputStream24.skip((long) (byte) -1);
        java.io.OutputStream outputStream29 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream30 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream29);
        jarArchiveOutputStream30.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream30);
        tarArchiveOutputStream32.setDebug(false);
        tarArchiveInputStream24.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream32);
        java.lang.String str37 = tarArchiveOutputStream32.getDefaultFileExtension();
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "tar" + "'", str37, "tar");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray15, 2);
        boolean boolean19 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray15, 49152);
        int int20 = tarArchiveInputStream12.read(byteArray15);
        int int21 = tarArchiveInputStream2.read(byteArray15);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream23);
        tarArchiveInputStream24.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream24);
        long long28 = tarArchiveInputStream24.skip((long) (byte) -1);
        java.io.OutputStream outputStream29 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream30 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream29);
        jarArchiveOutputStream30.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream30);
        tarArchiveOutputStream32.setDebug(false);
        tarArchiveInputStream24.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream37 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32);
        byte[] byteArray41 = new byte[] { (byte) -1, (byte) 1, (byte) 100 };
        boolean boolean43 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray41, (int) (short) 4);
        boolean boolean45 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray41, (int) (short) 4);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream37.write(byteArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[-1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean6 = cpioArchiveEntry5.isSocket();
        boolean boolean7 = cpioArchiveEntry5.isPipe();
        cpioArchiveEntry5.setRemoteDeviceMaj((long) 29127);
        cpioArchiveEntry5.setRemoteDeviceMin((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        cpioArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.write((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, (int) (short) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray15, 2);
        boolean boolean19 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray15, 49152);
        int int20 = tarArchiveInputStream12.read(byteArray15);
        int int21 = tarArchiveInputStream2.read(byteArray15);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream23);
        tarArchiveInputStream24.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream24);
        long long28 = tarArchiveInputStream24.skip((long) (byte) -1);
        java.io.OutputStream outputStream29 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream30 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream29);
        jarArchiveOutputStream30.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream30);
        tarArchiveOutputStream32.setDebug(false);
        tarArchiveInputStream24.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream37 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry38 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream32.putNextEntry(tarArchiveEntry38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        int int7 = tarArchiveOutputStream3.getRecordSize();
        java.lang.String str8 = tarArchiveOutputStream3.getDefaultFileExtension();
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream10);
        tarArchiveInputStream11.reset();
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream13);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        jarArchiveOutputStream15.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream11, (java.io.OutputStream) jarArchiveOutputStream15, 100);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream20 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream19);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream20);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean26 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray24, 2);
        boolean boolean28 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray24, 49152);
        int int29 = tarArchiveInputStream21.read(byteArray24);
        int int30 = tarArchiveInputStream11.read(byteArray24);
        java.io.InputStream inputStream31 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream32 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream31);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream32);
        tarArchiveInputStream33.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream33);
        long long37 = tarArchiveInputStream33.skip((long) (byte) -1);
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean42 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray40, 2);
        int int45 = tarArchiveInputStream33.read(byteArray40, (int) 'a', (-1));
        boolean boolean47 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray40, (int) '#');
        int int48 = tarArchiveInputStream11.read(byteArray40);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.write(byteArray40, (int) (byte) 1, 4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tar" + "'", str8, "tar");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.closeEntry();
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream12 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream12);
        java.lang.String str14 = jarArchiveOutputStream12.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy16 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        jarArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = null;
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.putNextEntry(zipArchiveEntry19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF8" + "'", str14, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy16);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.closeEntry();
        jarArchiveOutputStream2.flush();
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream6);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream7);
        jarArchiveOutputStream8.flush();
        jarArchiveOutputStream8.closeEntry();
        jarArchiveOutputStream8.flush();
        jarArchiveOutputStream8.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream8.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy14);
        java.lang.String str16 = unicodeExtraFieldPolicy14.toString();
        jarArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy14);
        java.lang.Class<?> wildcardClass18 = jarArchiveOutputStream2.getClass();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "always" + "'", str16, "always");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray15, 2);
        boolean boolean19 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray15, 49152);
        int int20 = tarArchiveInputStream12.read(byteArray15);
        int int21 = tarArchiveInputStream2.read(byteArray15);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream23);
        tarArchiveInputStream24.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream24);
        long long28 = tarArchiveInputStream24.skip((long) (byte) -1);
        java.io.OutputStream outputStream29 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream30 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream29);
        jarArchiveOutputStream30.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream30);
        tarArchiveOutputStream32.setDebug(false);
        tarArchiveInputStream24.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream37 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32, 10, 16);
        java.lang.String str41 = tarArchiveOutputStream40.getName();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream40.write((int) (short) 8);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "tar" + "'", str41, "tar");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream3.setLongFileMode((int) (short) 0);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 1, (byte) 100 };
        boolean boolean14 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray12, (int) (short) 4);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray12, (int) (short) 4);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.write(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '3' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 1, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray15, (int) (short) 4);
        boolean boolean19 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray15, (int) (short) 12);
        int int22 = tarArchiveInputStream2.read(byteArray15, (int) ' ', 64);
        long long24 = tarArchiveInputStream2.skip(0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        arArchiveOutputStream4.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream4);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream7);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        int int10 = tarArchiveInputStream9.getRecordSize();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream9);
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream12);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream13);
        tarArchiveInputStream14.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream14);
        long long18 = tarArchiveInputStream14.skip((long) (byte) -1);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean23 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray21, 2);
        int int26 = tarArchiveInputStream14.read(byteArray21, (int) 'a', (-1));
        int int27 = tarArchiveInputStream9.read(byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream6.write(byteArray21, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        jarArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        jarArchiveOutputStream6.closeArchiveEntry();
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream14 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream13);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream14);
        tarArchiveInputStream15.mark(32);
        int int18 = tarArchiveInputStream15.read();
        tarArchiveInputStream15.close();
        java.io.InputStream inputStream20 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream21 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream20);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream21);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean27 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray25, 2);
        boolean boolean29 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray25, 49152);
        int int30 = tarArchiveInputStream22.read(byteArray25);
        long long32 = org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(byteArray25, true);
        int int35 = tarArchiveInputStream15.read(byteArray25, 1024, (int) (byte) -1);
        boolean boolean37 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray25, 29127);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream6.write(byteArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 2660L + "'", long32 == 2660L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        jarArchiveOutputStream6.setFallbackToUTF8(true);
        jarArchiveOutputStream6.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream6.write((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.closeEntry();
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        java.lang.String str10 = jarArchiveOutputStream2.getEncoding();
        jarArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        int int9 = tarArchiveOutputStream3.getRecordSize();
        java.lang.String str10 = tarArchiveOutputStream3.getDefaultFileExtension();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "tar" + "'", str10, "tar");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        cpioArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.write(29127);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream10.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream7.write((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream13);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        jarArchiveOutputStream15.flush();
        jarArchiveOutputStream15.closeEntry();
        jarArchiveOutputStream15.flush();
        jarArchiveOutputStream15.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy21 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        jarArchiveOutputStream15.setMethod((int) (byte) 10);
        jarArchiveOutputStream15.flush();
        tarArchiveInputStream2.copyEntryContents((java.io.OutputStream) jarArchiveOutputStream15);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = null;
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream15.putNextEntry(zipArchiveEntry27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy21);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, 2048);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream4);
        tarArchiveOutputStream4.setBufferDebug(true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        java.lang.String str4 = jarArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.setEncoding("org.apache.commons.compress.archivers.ArchiveException: 070707");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: org.apache.commons.compress.archivers.ArchiveException: 070707");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        int int14 = arArchiveInputStream13.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = arArchiveInputStream13.getNextEntry();
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream17 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream16);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream17);
        int int19 = tarArchiveInputStream18.getRecordSize();
        java.io.InputStream inputStream20 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream21 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream20);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream21);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean27 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray25, 2);
        boolean boolean29 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray25, 49152);
        int int30 = tarArchiveInputStream22.read(byteArray25);
        int int31 = tarArchiveInputStream18.read(byteArray25);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream32 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream18);
        int int33 = cpioArchiveInputStream32.available();
        int int34 = cpioArchiveInputStream32.available();
        java.io.InputStream inputStream35 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream36 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream35);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream36);
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean42 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray40, 2);
        boolean boolean44 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray40, 49152);
        int int45 = tarArchiveInputStream37.read(byteArray40);
        int int48 = cpioArchiveInputStream32.read(byteArray40, (int) (short) 2, 0);
        boolean boolean50 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray40, 64);
        int int51 = arArchiveInputStream13.read(byteArray40);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(archiveEntry15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2, (int) (short) 4, (int) 'a');
        long long16 = tarArchiveInputStream2.skip((long) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream6);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream7);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveInputStream2.copyEntryContents((java.io.OutputStream) jarArchiveOutputStream8);
        jarArchiveOutputStream8.flush();
        jarArchiveOutputStream8.closeArchiveEntry();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream7);
        jarArchiveOutputStream8.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream10.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream10);
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream16 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream15);
        jarArchiveOutputStream16.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream16);
        tarArchiveOutputStream18.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream18);
        tarArchiveOutputStream18.setLongFileMode((int) (short) 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream18);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = zipArchiveInputStream6.getNextZipEntry();
        int int26 = zipArchiveInputStream6.read();
        int int27 = zipArchiveInputStream6.read();
        org.junit.Assert.assertNull(zipArchiveEntry25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream3.setLongFileMode((int) (short) 0);
        tarArchiveOutputStream3.flush();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream6);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream7);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveInputStream2.copyEntryContents((java.io.OutputStream) jarArchiveOutputStream8);
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream12);
        int int14 = tarArchiveInputStream13.getRecordSize();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream13);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream17 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream16);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream17);
        tarArchiveInputStream18.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream18);
        long long22 = tarArchiveInputStream18.skip((long) (byte) -1);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean27 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray25, 2);
        int int30 = tarArchiveInputStream18.read(byteArray25, (int) 'a', (-1));
        int int31 = tarArchiveInputStream13.read(byteArray25);
        int int32 = tarArchiveInputStream2.read(byteArray25);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream33 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream33);
        long long36 = tarArchiveInputStream34.skip((long) 'a');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, 2048);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, 512);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int3 = tarArchiveInputStream2.getRecordSize();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        tarArchiveInputStream7.reset();
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream9);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        jarArchiveOutputStream11.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream7, (java.io.OutputStream) jarArchiveOutputStream11, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream11);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream15, 0);
        int int18 = tarArchiveInputStream2.available();
        tarArchiveInputStream2.close();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, 2048);
        jarArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream2.closeArchiveEntry();
        jarArchiveOutputStream2.closeArchiveEntry();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        int int14 = tarArchiveInputStream12.read();
        boolean boolean15 = tarArchiveInputStream12.markSupported();
        tarArchiveInputStream12.close();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, (int) (short) 100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        boolean boolean7 = jarArchiveOutputStream2.isSeekable();
        java.lang.String str8 = jarArchiveOutputStream2.getEncoding();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, (int) (short) 100);
        jarArchiveOutputStream2.closeArchiveEntry();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream14);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream15);
        tarArchiveInputStream16.mark(32);
        int int19 = tarArchiveInputStream16.read();
        tarArchiveInputStream16.close();
        java.io.InputStream inputStream21 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream22 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream21);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream22);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean28 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray26, 2);
        boolean boolean30 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray26, 49152);
        int int31 = tarArchiveInputStream23.read(byteArray26);
        long long33 = org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(byteArray26, true);
        int int36 = tarArchiveInputStream16.read(byteArray26, 1024, (int) (byte) -1);
        int int37 = arArchiveInputStream13.read(byteArray26);
        arArchiveInputStream13.close();
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry39 = arArchiveInputStream13.getNextArEntry();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 2660L + "'", long33 == 2660L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(arArchiveEntry39);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        jarArchiveOutputStream6.setFallbackToUTF8(true);
        jarArchiveOutputStream6.flush();
        jarArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream15.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        long long13 = tarArchiveInputStream2.skip((long) 8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream3.flush();
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream9);
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray13, 2);
        boolean boolean17 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray13, 49152);
        int int18 = tarArchiveInputStream10.read(byteArray13);
        long long20 = org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(byteArray13, true);
        tarArchiveOutputStream3.write(byteArray13, 49152, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.write((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2660L + "'", long20 == 2660L);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream4);
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        int int9 = tarArchiveInputStream8.getRecordSize();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream8);
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream12);
        tarArchiveInputStream13.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream13);
        long long17 = tarArchiveInputStream13.skip((long) (byte) -1);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean22 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray20, 2);
        int int25 = tarArchiveInputStream13.read(byteArray20, (int) 'a', (-1));
        int int26 = tarArchiveInputStream8.read(byteArray20);
        boolean boolean28 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray20, 2048);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream4.write(byteArray20, (int) (short) 2, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        int int9 = tarArchiveOutputStream3.getRecordSize();
        tarArchiveOutputStream3.flush();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        jarArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        long long4 = tarArchiveInputStream2.skip(16384L);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        tarArchiveInputStream7.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream7);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream13 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream12);
        jarArchiveOutputStream13.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream13);
        tarArchiveOutputStream15.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream11, (java.io.OutputStream) tarArchiveOutputStream15);
        tarArchiveOutputStream15.setLongFileMode(49152);
        java.lang.String str22 = tarArchiveOutputStream15.getName();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream15);
        java.io.InputStream inputStream24 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream25 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream24);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream25);
        tarArchiveInputStream26.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream26);
        java.io.InputStream inputStream30 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream31 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream30);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream31);
        tarArchiveInputStream32.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream32);
        java.io.InputStream inputStream35 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream36 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream35);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream36);
        tarArchiveInputStream37.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream39 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream37);
        long long41 = tarArchiveInputStream37.skip((long) (byte) -1);
        byte[] byteArray44 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean46 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray44, 2);
        int int49 = tarArchiveInputStream37.read(byteArray44, (int) 'a', (-1));
        int int52 = tarArchiveInputStream34.read(byteArray44, (int) (byte) 100, 1024);
        tarArchiveInputStream34.close();
        java.io.InputStream inputStream54 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream55 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream54);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream56 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream55);
        tarArchiveInputStream56.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream58 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream56);
        java.io.InputStream inputStream59 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream60 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream59);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream61 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream60);
        tarArchiveInputStream61.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream63 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream61);
        long long65 = tarArchiveInputStream61.skip((long) (byte) -1);
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean70 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray68, 2);
        int int73 = tarArchiveInputStream61.read(byteArray68, (int) 'a', (-1));
        int int76 = tarArchiveInputStream58.read(byteArray68, (int) (byte) 100, 1024);
        int int77 = tarArchiveInputStream34.read(byteArray68);
        int int78 = zipArchiveInputStream29.read(byteArray68);
        boolean boolean80 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray68, (int) (byte) 10);
        int int81 = tarArchiveInputStream2.read(byteArray68);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "tar" + "'", str22, "tar");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray15, 2);
        boolean boolean19 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray15, 49152);
        int int20 = tarArchiveInputStream12.read(byteArray15);
        int int21 = tarArchiveInputStream2.read(byteArray15);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream23);
        tarArchiveInputStream24.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream24);
        long long28 = tarArchiveInputStream24.skip((long) (byte) -1);
        java.io.OutputStream outputStream29 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream30 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream29);
        jarArchiveOutputStream30.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream30);
        tarArchiveOutputStream32.setDebug(false);
        tarArchiveInputStream24.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream37 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32, 10, 16);
        tarArchiveOutputStream32.flush();
        tarArchiveOutputStream32.setBufferDebug(true);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream7);
        jarArchiveOutputStream8.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream10.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = jarArchiveInputStream15.getNextEntry();
        int int17 = jarArchiveInputStream15.read();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry18 = jarArchiveInputStream15.getNextJarEntry();
        org.junit.Assert.assertNull(archiveEntry16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(jarArchiveEntry18);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream3);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        jarArchiveOutputStream5.flush();
        jarArchiveOutputStream5.closeEntry();
        jarArchiveOutputStream5.flush();
        jarArchiveOutputStream5.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy11);
        java.lang.String str13 = unicodeExtraFieldPolicy11.toString();
        java.lang.String str14 = unicodeExtraFieldPolicy11.toString();
        jarArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy11);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = null;
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream1.putNextEntry(zipArchiveEntry16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "always" + "'", str13, "always");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "always" + "'", str14, "always");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray15, 2);
        boolean boolean19 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray15, 49152);
        int int20 = tarArchiveInputStream12.read(byteArray15);
        int int21 = tarArchiveInputStream2.read(byteArray15);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream23);
        tarArchiveInputStream24.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream24);
        long long28 = tarArchiveInputStream24.skip((long) (byte) -1);
        java.io.OutputStream outputStream29 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream30 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream29);
        jarArchiveOutputStream30.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream30);
        tarArchiveOutputStream32.setDebug(false);
        tarArchiveInputStream24.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream37 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32, 10, 16);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream41 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = tarArchiveInputStream2.getNextTarEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.closeEntry();
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.setMethod(0);
        jarArchiveOutputStream2.closeArchiveEntry();
        jarArchiveOutputStream2.setFallbackToUTF8(true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, 2048);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream8 = archiveStreamFactory0.createArchiveOutputStream("070701", (java.io.OutputStream) cpioArchiveOutputStream7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: 070701 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        int int10 = tarArchiveInputStream2.read(byteArray5);
        long long12 = tarArchiveInputStream2.skip(110L);
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream13);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        jarArchiveOutputStream15.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream15, 29127);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream20 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream19);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream20);
        tarArchiveInputStream21.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream21);
        long long25 = tarArchiveInputStream21.skip((long) (byte) -1);
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean30 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray28, 2);
        int int33 = tarArchiveInputStream21.read(byteArray28, (int) 'a', (-1));
        boolean boolean35 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray28, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream15.write(byteArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream14);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream15);
        tarArchiveInputStream16.mark(32);
        int int19 = tarArchiveInputStream16.read();
        tarArchiveInputStream16.close();
        java.io.InputStream inputStream21 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream22 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream21);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream22);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean28 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray26, 2);
        boolean boolean30 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray26, 49152);
        int int31 = tarArchiveInputStream23.read(byteArray26);
        long long33 = org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(byteArray26, true);
        int int36 = tarArchiveInputStream16.read(byteArray26, 1024, (int) (byte) -1);
        int int37 = arArchiveInputStream13.read(byteArray26);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry38 = arArchiveInputStream13.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry39 = arArchiveInputStream13.getNextEntry();
        java.io.InputStream inputStream40 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream41 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream40);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream42 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream41);
        tarArchiveInputStream42.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream44 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream42);
        long long46 = tarArchiveInputStream42.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream48 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream42, (int) (short) 3);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream49 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream48);
        tarArchiveInputStream49.reset();
        java.io.InputStream inputStream51 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream52 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream51);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream53 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream52);
        int int54 = tarArchiveInputStream53.getRecordSize();
        java.io.InputStream inputStream55 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream56 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream55);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream57 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream56);
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean62 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray60, 2);
        boolean boolean64 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray60, 49152);
        int int65 = tarArchiveInputStream57.read(byteArray60);
        int int66 = tarArchiveInputStream53.read(byteArray60);
        int int67 = tarArchiveInputStream49.read(byteArray60);
        boolean boolean69 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray60, 29127);
        int int72 = arArchiveInputStream13.read(byteArray60, (int) (short) -1, (int) (byte) 10);
        int int73 = arArchiveInputStream13.read();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 2660L + "'", long33 == 2660L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(archiveEntry38);
        org.junit.Assert.assertNull(archiveEntry39);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 512 + "'", int54 == 512);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        int int12 = tarArchiveInputStream2.read();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, 2048);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean8 = cpioArchiveEntry7.isSocket();
        boolean boolean9 = cpioArchiveEntry7.isCharacterDevice();
        java.lang.String str10 = cpioArchiveEntry7.getName();
        long long11 = cpioArchiveEntry7.getChksum();
        cpioArchiveEntry7.setDeviceMaj(0L);
        long long14 = cpioArchiveEntry7.getMode();
        long long15 = cpioArchiveEntry7.getRemoteDeviceMin();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream5.putNextEntry(cpioArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "070702" + "'", str10, "070702");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        jarArchiveOutputStream1.setComment("org.apache.commons.compress.archivers.ArchiveException");
        jarArchiveOutputStream1.setFallbackToUTF8(true);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream7);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        tarArchiveInputStream9.reset();
        java.io.OutputStream outputStream11 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream11);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream13 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        jarArchiveOutputStream13.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream9, (java.io.OutputStream) jarArchiveOutputStream13, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream13);
        jarArchiveOutputStream13.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy19 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        jarArchiveOutputStream13.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy19);
        jarArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy19);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy19);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream7);
        jarArchiveOutputStream8.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream10.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = jarArchiveInputStream15.getNextEntry();
        int int17 = jarArchiveInputStream15.read();
        org.junit.Assert.assertNull(archiveEntry16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        long long4 = tarArchiveInputStream2.skip(16384L);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        tarArchiveInputStream7.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream7);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream13 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream12);
        jarArchiveOutputStream13.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream13);
        tarArchiveOutputStream15.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream11, (java.io.OutputStream) tarArchiveOutputStream15);
        tarArchiveOutputStream15.setLongFileMode(49152);
        java.lang.String str22 = tarArchiveOutputStream15.getName();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream15);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream15.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "tar" + "'", str22, "tar");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, (int) (short) 100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        boolean boolean7 = jarArchiveOutputStream2.isSeekable();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.write((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream14);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream15);
        tarArchiveInputStream16.mark(32);
        int int19 = tarArchiveInputStream16.read();
        tarArchiveInputStream16.close();
        java.io.InputStream inputStream21 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream22 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream21);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream22);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean28 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray26, 2);
        boolean boolean30 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray26, 49152);
        int int31 = tarArchiveInputStream23.read(byteArray26);
        long long33 = org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(byteArray26, true);
        int int36 = tarArchiveInputStream16.read(byteArray26, 1024, (int) (byte) -1);
        int int37 = arArchiveInputStream13.read(byteArray26);
        arArchiveInputStream13.close();
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean43 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray41, 2);
        boolean boolean45 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray41, 49152);
        int int48 = arArchiveInputStream13.read(byteArray41, (int) (short) 0, 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 2660L + "'", long33 == 2660L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }
}


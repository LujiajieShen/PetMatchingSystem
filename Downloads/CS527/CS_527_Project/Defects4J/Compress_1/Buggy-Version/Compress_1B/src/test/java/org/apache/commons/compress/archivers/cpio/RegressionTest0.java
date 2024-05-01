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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
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
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
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
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream1.close();
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.write(byteArray5, 32, 4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean8 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray6, 2);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.write(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
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
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream6 = archiveStreamFactory0.createArchiveOutputStream("hi!", (java.io.OutputStream) tarArchiveOutputStream5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: hi! not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.putArchiveEntry(archiveEntry3);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
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
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2048' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry3.setTime((long) (byte) 1);
        long long6 = cpioArchiveEntry3.getMode();
        cpioArchiveEntry3.setMode((long) (byte) 100);
        boolean boolean9 = cpioArchiveEntry3.isSymbolicLink();
        long long10 = cpioArchiveEntry3.getInode();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.write((int) '4');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry6.setTime((long) (byte) 1);
        long long9 = cpioArchiveEntry6.getMode();
        cpioArchiveEntry6.setMode((long) (byte) 100);
        boolean boolean12 = cpioArchiveEntry6.isSymbolicLink();
        long long13 = cpioArchiveEntry6.getInode();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, (int) (short) 12);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean9 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray7, 2);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.write(byteArray7, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, (int) (short) 12);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry6.setTime((long) (byte) 1);
        long long9 = cpioArchiveEntry6.getMode();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream4.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray15, 2);
        boolean boolean19 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray15, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.write(byteArray15, (int) (short) 2, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 64, 512);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream18.write((int) (short) 8);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream17 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream16);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream17);
        tarArchiveInputStream18.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream18);
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 100, (byte) 0 };
        int int27 = tarArchiveInputStream20.read(byteArray24, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.write(byteArray24, 128, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream15.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.write(100);
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
        cpioArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean6 = cpioArchiveEntry5.isSocket();
        long long7 = cpioArchiveEntry5.getTime();
        boolean boolean8 = cpioArchiveEntry5.isPipe();
        boolean boolean9 = cpioArchiveEntry5.isCharacterDevice();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.write((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry7.setNumberOfLinks((long) 1);
        cpioArchiveEntry7.setDeviceMaj((long) 2048);
        java.lang.String str12 = cpioArchiveEntry7.getName();
        java.lang.String str13 = cpioArchiveEntry7.getName();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "070702" + "'", str12, "070702");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "070702" + "'", str13, "070702");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        tarArchiveInputStream7.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream7);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 100, (byte) 0 };
        int int16 = tarArchiveInputStream9.read(byteArray13, (int) (byte) 0, 0);
        byte[] byteArray17 = new byte[] {};
        int int20 = tarArchiveInputStream9.read(byteArray17, 0, 1024);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream4.write(byteArray17, 49152, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        int int21 = tarArchiveInputStream2.available();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.setLevel((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean9 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray7, 2);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream4.write(byteArray7, 8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.putNextEntry(zipArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
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
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        cpioArchiveOutputStream1.close();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.setLevel(16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        cpioArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean6 = cpioArchiveEntry5.isSocket();
        long long7 = cpioArchiveEntry5.getTime();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.putNextEntry(cpioArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream2.setBufferDebug(false);
        java.lang.String str5 = tarArchiveOutputStream2.getDefaultFileExtension();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.write(256);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "tar" + "'", str5, "tar");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        tarArchiveOutputStream5.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, 2048, 32768);
        int int10 = tarArchiveOutputStream9.getRecordSize();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32768 + "'", int10 == 32768);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
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
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
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
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        int int15 = tarArchiveInputStream7.read(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream4.write(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream21);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream23 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        jarArchiveOutputStream23.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream23);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) jarArchiveInputStream20, (java.io.OutputStream) jarArchiveOutputStream23);
        java.io.InputStream inputStream28 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream29 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream28);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream29);
        tarArchiveInputStream30.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream33 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream30);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream34 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream33);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean39 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray37, 2);
        boolean boolean41 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray37, (int) (byte) 10);
        int int42 = arArchiveInputStream34.read(byteArray37);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = jarArchiveInputStream20.read(byteArray37, 29127, 29127);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream6 = archiveStreamFactory0.createArchiveOutputStream("org.apache.commons.compress.archivers.ArchiveException", (java.io.OutputStream) jarArchiveOutputStream4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: org.apache.commons.compress.archivers.ArchiveException not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry14.setTime((long) (byte) 1);
        long long17 = cpioArchiveEntry14.getMode();
        cpioArchiveEntry14.setMode((long) (byte) 100);
        boolean boolean20 = cpioArchiveEntry14.isSymbolicLink();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.putNextEntry(cpioArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        java.lang.String str3 = tarArchiveOutputStream2.getName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.putNextEntry(tarArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tar" + "'", str3, "tar");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream3 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream2);
        boolean boolean4 = jarArchiveOutputStream3.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.utils.IOUtils.copy(inputStream0, (java.io.OutputStream) jarArchiveOutputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream2.setMethod((int) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.putNextEntry(zipArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean8 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray6, 2);
        boolean boolean10 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray6, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.write(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry4.setTime((long) (byte) 1);
        long long7 = cpioArchiveEntry4.getMode();
        boolean boolean8 = cpioArchiveEntry4.isBlockDevice();
        cpioArchiveEntry4.setRemoteDeviceMin((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream7);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        tarArchiveInputStream9.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream9);
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 100, (byte) 0 };
        int int18 = tarArchiveInputStream11.read(byteArray15, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.write(byteArray15, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 64, 512);
        int int19 = tarArchiveOutputStream18.getRecordSize();
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean24 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray22, 2);
        boolean boolean26 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray22, 49152);
        boolean boolean28 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray22, 29127);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream18.write(byteArray22);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2, (int) 'a');
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        cpioArchiveInputStream5.close();
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream7);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream9 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream8);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean14 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray12, 2);
        boolean boolean16 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray12, 49152);
        cpioArchiveOutputStream8.write(byteArray12, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = cpioArchiveInputStream5.read(byteArray12, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream3);
        tarArchiveInputStream4.reset();
        boolean boolean6 = tarArchiveInputStream4.markSupported();
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream7);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream9 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream8);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean14 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray12, 2);
        boolean boolean16 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray12, 49152);
        cpioArchiveOutputStream8.write(byteArray12, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream4, (java.io.OutputStream) cpioArchiveOutputStream8, 100);
        java.io.OutputStream outputStream22 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream22);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream24 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream23);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream24);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream25, 2048);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream4, (java.io.OutputStream) tarArchiveOutputStream27);
        java.lang.String str29 = tarArchiveOutputStream27.getDefaultFileExtension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream30 = archiveStreamFactory0.createArchiveOutputStream("always", (java.io.OutputStream) tarArchiveOutputStream27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: always not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "tar" + "'", str29, "tar");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean11 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray9, 2);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream6.write(byteArray9, (int) (short) 3, (int) (short) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        cpioArchiveOutputStream1.close();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        tarArchiveInputStream6.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream6);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 100, (byte) 0 };
        int int15 = tarArchiveInputStream8.read(byteArray12, (int) (byte) 0, 0);
        byte[] byteArray16 = new byte[] {};
        int int19 = tarArchiveInputStream8.read(byteArray16, 0, 1024);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.write(byteArray16, 29127, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        jarArchiveOutputStream2.setMethod(0);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy4 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy4);
        java.lang.String str6 = unicodeExtraFieldPolicy4.toString();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "always" + "'", str6, "always");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        tarArchiveOutputStream5.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream9);
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray13, 2);
        boolean boolean17 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray13, 49152);
        int int18 = tarArchiveInputStream10.read(byteArray13);
        arArchiveOutputStream7.write(byteArray13, 512, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream7.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream7);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream9 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, 2048);
        tarArchiveOutputStream12.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream14 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream15);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream16);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean22 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray20, 2);
        boolean boolean24 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray20, 49152);
        int int25 = tarArchiveInputStream17.read(byteArray20);
        arArchiveOutputStream14.write(byteArray20, 512, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.write(byteArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.putNextEntry(zipArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
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
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        tarArchiveOutputStream5.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, 2048, 32768);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2048' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.setFallbackToUTF8(false);
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean11 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray9, 2);
        boolean boolean13 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray9, 49152);
        cpioArchiveOutputStream5.write(byteArray9, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream1.write(byteArray9, 0, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 64, 512);
        tarArchiveOutputStream18.setDebug(false);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream21);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream23 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean28 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray26, 2);
        boolean boolean30 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray26, 49152);
        cpioArchiveOutputStream22.write(byteArray26, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream18.write(byteArray26);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
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
        jarArchiveOutputStream2.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry9.setNumberOfLinks((long) 1);
        cpioArchiveEntry9.setDeviceMaj((long) 2048);
        java.lang.String str14 = cpioArchiveEntry9.getName();
        boolean boolean15 = cpioArchiveEntry9.isDirectory();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "070702" + "'", str14, "070702");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream2.setBufferDebug(false);
        java.lang.String str5 = tarArchiveOutputStream2.getDefaultFileExtension();
        java.lang.String str6 = tarArchiveOutputStream2.getName();
        tarArchiveOutputStream2.closeEntry();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.write(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "tar" + "'", str5, "tar");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "tar" + "'", str6, "tar");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        zipArchiveOutputStream4.closeArchiveEntry();
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean10 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray8, 2);
        boolean boolean12 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray8, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream4.write(byteArray8, (int) (byte) 100, 49152);
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
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream3);
        tarArchiveInputStream4.reset();
        boolean boolean6 = tarArchiveInputStream4.markSupported();
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream7);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream9 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream8);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean14 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray12, 2);
        boolean boolean16 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray12, 49152);
        cpioArchiveOutputStream8.write(byteArray12, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream4, (java.io.OutputStream) cpioArchiveOutputStream8, 100);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream22 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        tarArchiveInputStream4.setDebug(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream26 = archiveStreamFactory0.createArchiveInputStream("070702", (java.io.InputStream) tarArchiveInputStream4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: 070702 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream2.setMethod((int) (byte) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream7.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream7);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        tarArchiveInputStream9.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream9);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = zipArchiveInputStream12.getNextEntry();
        int int14 = zipArchiveInputStream12.read();
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream15);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream16);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream17, (int) 'a');
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream17);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean25 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray23, 2);
        boolean boolean27 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray23, (int) (byte) 10);
        boolean boolean29 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray23, 100);
        int int32 = tarArchiveInputStream17.read(byteArray23, 0, (int) (short) -1);
        int int33 = zipArchiveInputStream12.read(byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.write(byteArray23, (int) '#', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(archiveEntry13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean8 = cpioArchiveEntry7.isSocket();
        long long9 = cpioArchiveEntry7.getTime();
        cpioArchiveEntry7.setDeviceMaj((long) '#');
        long long12 = cpioArchiveEntry7.getGID();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        java.io.OutputStream outputStream20 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream20);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream22 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream21);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23, 2048);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream25);
        java.lang.String str27 = tarArchiveOutputStream25.getDefaultFileExtension();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream25.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2048' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "tar" + "'", str27, "tar");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        tarArchiveOutputStream5.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, 2048, 32768);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.putNextEntry(tarArchiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        jarArchiveOutputStream1.closeArchiveEntry();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean11 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray9, 2);
        boolean boolean13 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray9, 49152);
        cpioArchiveOutputStream5.write(byteArray9, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream1.write(byteArray9, 29127, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        jarArchiveOutputStream2.closeArchiveEntry();
        jarArchiveOutputStream2.setLevel((int) (short) -1);
        jarArchiveOutputStream2.setFallbackToUTF8(true);
        jarArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry12.setTime((long) (byte) 1);
        long long15 = cpioArchiveEntry12.getMode();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        jarArchiveOutputStream2.closeArchiveEntry();
        jarArchiveOutputStream2.setLevel((int) (short) -1);
        jarArchiveOutputStream2.setFallbackToUTF8(true);
        jarArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.putNextEntry(zipArchiveEntry11);
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean6 = cpioArchiveEntry5.isSocket();
        long long7 = cpioArchiveEntry5.getTime();
        cpioArchiveEntry5.setDeviceMaj((long) '#');
        long long10 = cpioArchiveEntry5.getHeaderSize();
        long long11 = cpioArchiveEntry5.getMode();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        zipArchiveOutputStream5.setFallbackToUTF8(false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        tarArchiveOutputStream5.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream7.putArchiveEntry(archiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '8' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
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
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        tarArchiveOutputStream5.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream9);
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray13, 2);
        boolean boolean17 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray13, 49152);
        int int18 = tarArchiveInputStream10.read(byteArray13);
        arArchiveOutputStream7.write(byteArray13, 512, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream7.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        zipArchiveOutputStream5.closeArchiveEntry();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream7);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream9);
        byte[] byteArray12 = new byte[] { (byte) 0 };
        boolean boolean14 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray12, 8);
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, 32768);
        int int17 = tarArchiveInputStream10.read(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.write(byteArray12, (int) (short) 10, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        zipArchiveOutputStream4.closeArchiveEntry();
        zipArchiveOutputStream4.closeArchiveEntry();
        zipArchiveOutputStream4.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream4.setLevel(2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 2048");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        int int6 = tarArchiveInputStream2.available();
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream7);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream7);
        tarArchiveOutputStream9.setBufferDebug(false);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream9);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream9.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: writing to an input buffer");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 64, 512);
        int int19 = tarArchiveOutputStream18.getRecordSize();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry21.setTime((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream18.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream7);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream9 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream8);
        jarArchiveOutputStream9.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) zipArchiveOutputStream12, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream21 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry22 = arArchiveInputStream21.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: failed to read header");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream2.setMethod((int) (byte) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        boolean boolean4 = jarArchiveOutputStream2.isSeekable();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.write(byteArray10, (int) (short) 100, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        cpioArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry18.setNumberOfLinks((long) 1);
        cpioArchiveEntry18.setDeviceMaj((long) 2048);
        cpioArchiveEntry18.setSize((long) 8);
        cpioArchiveEntry18.setRemoteDeviceMin((long) (short) 0);
        java.lang.String str27 = cpioArchiveEntry18.getName();
        cpioArchiveEntry18.setChksum((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.putNextEntry(cpioArchiveEntry18);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "070702" + "'", str27, "070702");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        jarArchiveOutputStream2.closeArchiveEntry();
        jarArchiveOutputStream2.setLevel((int) (short) -1);
        jarArchiveOutputStream2.setFallbackToUTF8(true);
        jarArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.setLevel(24576);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 24576");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        java.io.OutputStream outputStream20 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream20);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream22 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream21);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23, 2048);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream25);
        tarArchiveInputStream2.setDebug(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        java.lang.String str3 = tarArchiveOutputStream2.getName();
        tarArchiveOutputStream2.closeArchiveEntry();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tar" + "'", str3, "tar");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        tarArchiveOutputStream5.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        int int8 = tarArchiveOutputStream5.getRecordSize();
        java.lang.String str9 = tarArchiveOutputStream5.getDefaultFileExtension();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "tar" + "'", str9, "tar");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry8.setNumberOfLinks((long) 1);
        cpioArchiveEntry8.setDeviceMaj((long) 2048);
        cpioArchiveEntry8.setSize((long) 8);
        cpioArchiveEntry8.setRemoteDeviceMin((long) (short) 0);
        long long17 = cpioArchiveEntry8.getChksum();
        long long18 = cpioArchiveEntry8.getHeaderSize();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream6.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 110L + "'", long18 == 110L);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream21);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream23 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        jarArchiveOutputStream23.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream23);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) jarArchiveInputStream20, (java.io.OutputStream) jarArchiveOutputStream23);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = jarArchiveInputStream20.getNextZipEntry();
        byte[] byteArray30 = new byte[] { (byte) 0 };
        boolean boolean32 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray30, 8);
        boolean boolean34 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray30, 32768);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = jarArchiveInputStream20.read(byteArray30, 36864, 512);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(zipArchiveEntry28);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        jarArchiveOutputStream2.closeArchiveEntry();
        jarArchiveOutputStream2.setEncoding("070702");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.write((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy4 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy4);
        jarArchiveOutputStream2.closeArchiveEntry();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy4);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        zipArchiveOutputStream4.closeArchiveEntry();
        zipArchiveOutputStream4.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream4);
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream9);
        tarArchiveInputStream10.mark(32);
        tarArchiveInputStream10.close();
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream14);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream15);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream16, (int) 'a');
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream16);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean24 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray22, 2);
        boolean boolean26 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray22, (int) (byte) 10);
        boolean boolean28 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray22, 100);
        int int31 = tarArchiveInputStream16.read(byteArray22, 0, (int) (short) -1);
        int int32 = tarArchiveInputStream10.read(byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream7.write(byteArray22, 10, (int) (short) 3);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '3' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 64, 512);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry20.setTime((long) (byte) 1);
        long long23 = cpioArchiveEntry20.getMode();
        boolean boolean24 = cpioArchiveEntry20.isBlockDevice();
        long long25 = cpioArchiveEntry20.getSize();
        boolean boolean26 = cpioArchiveEntry20.isDirectory();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream18.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        tarArchiveInputStream7.mark(32);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean14 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray12, 2);
        boolean boolean16 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray12, (int) (byte) 10);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, 100);
        int int21 = tarArchiveInputStream7.read(byteArray12, (int) (short) 1, 4);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream4.write(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        java.lang.String str3 = tarArchiveOutputStream2.getName();
        tarArchiveOutputStream2.closeEntry();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: writing to an input buffer");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tar" + "'", str3, "tar");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        tarArchiveInputStream6.reset();
        boolean boolean8 = tarArchiveInputStream6.markSupported();
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream9);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean16 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray14, 2);
        boolean boolean18 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray14, 49152);
        cpioArchiveOutputStream10.write(byteArray14, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream6, (java.io.OutputStream) cpioArchiveOutputStream10, 100);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream24 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream6);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream25 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream6);
        java.io.InputStream inputStream26 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream27 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream26);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream27);
        tarArchiveInputStream28.mark(32);
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray33, 2);
        boolean boolean37 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray33, (int) (byte) 10);
        boolean boolean39 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray33, 100);
        int int42 = tarArchiveInputStream28.read(byteArray33, (int) (short) 1, 4);
        int int43 = arArchiveInputStream25.read(byteArray33);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.write(byteArray33, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        jarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry6.setNumberOfLinks((long) 1);
        cpioArchiveEntry6.setDeviceMaj((long) 2048);
        cpioArchiveEntry6.setSize((long) 8);
        cpioArchiveEntry6.setRemoteDeviceMin((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        tarArchiveOutputStream5.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream7.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2048' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream2.setBufferDebug(false);
        java.lang.String str5 = tarArchiveOutputStream2.getDefaultFileExtension();
        java.lang.String str6 = tarArchiveOutputStream2.getName();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.write((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "tar" + "'", str5, "tar");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "tar" + "'", str6, "tar");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream3.setLongFileMode(16);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean22 = cpioArchiveEntry21.isSocket();
        long long23 = cpioArchiveEntry21.getTime();
        boolean boolean24 = cpioArchiveEntry21.isPipe();
        short short25 = cpioArchiveEntry21.getFormat();
        cpioArchiveEntry21.setSize(0L);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 1 + "'", short25 == (short) 1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean6 = cpioArchiveEntry5.isSocket();
        cpioArchiveEntry5.setTime((long) (short) 10);
        long long9 = cpioArchiveEntry5.getHeaderSize();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 110L + "'", long9 == 110L);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        tarArchiveOutputStream5.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry9.setTime((long) (byte) 1);
        long long12 = cpioArchiveEntry9.getMode();
        cpioArchiveEntry9.setMode((long) (byte) 100);
        boolean boolean15 = cpioArchiveEntry9.isSymbolicLink();
        long long16 = cpioArchiveEntry9.getInode();
        cpioArchiveEntry9.setDeviceMin((long) 256);
        long long19 = cpioArchiveEntry9.getHeaderSize();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream7.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 110L + "'", long19 == 110L);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        tarArchiveOutputStream15.setDebug(false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        jarArchiveOutputStream2.closeArchiveEntry();
        jarArchiveOutputStream2.setEncoding("070702");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, (int) (short) 1);
        byte[] byteArray12 = org.apache.commons.compress.archivers.cpio.CpioUtil.long2byteArray((long) 61440, 1024, false);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.write(byteArray12, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -16]");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        arArchiveOutputStream6.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream6.write(64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        tarArchiveOutputStream3.closeEntry();
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream7);
        tarArchiveInputStream8.close();
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean14 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray12, 2);
        boolean boolean16 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray12, (int) (byte) 10);
        int int17 = tarArchiveInputStream8.read(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.write(byteArray12, 2048, 36864);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '36864' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream3.setBufferDebug(false);
        java.lang.String str9 = tarArchiveOutputStream3.getDefaultFileExtension();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "tar" + "'", str9, "tar");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 64, 512);
        tarArchiveOutputStream15.setLongFileMode((int) 'a');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        zipArchiveOutputStream5.setMethod((int) (short) 4);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        tarArchiveOutputStream5.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, 2048, 32768);
        tarArchiveOutputStream5.setDebug(false);
        int int12 = tarArchiveOutputStream5.getRecordSize();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean15 = cpioArchiveEntry14.isSocket();
        boolean boolean16 = cpioArchiveEntry14.isPipe();
        cpioArchiveEntry14.setRemoteDeviceMaj((long) 29127);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean5 = cpioArchiveEntry4.isSocket();
        boolean boolean6 = cpioArchiveEntry4.isCharacterDevice();
        java.lang.String str7 = cpioArchiveEntry4.getName();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "070702" + "'", str7, "070702");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        jarArchiveOutputStream2.closeArchiveEntry();
        jarArchiveOutputStream2.setEncoding("070702");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, (int) (short) 1);
        jarArchiveOutputStream2.flush();
        java.lang.String str10 = jarArchiveOutputStream2.getEncoding();
        java.io.OutputStream outputStream11 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream11);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream13 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        jarArchiveOutputStream13.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream13);
        zipArchiveOutputStream16.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy19 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream16.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy19);
        jarArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy19);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "070702" + "'", str10, "070702");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy19);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream21 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        tarArchiveInputStream2.setDebug(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry24 = tarArchiveInputStream2.getNextTarEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 64, 512);
        tarArchiveOutputStream15.flush();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream15.close();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream21);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream23 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        jarArchiveOutputStream23.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream23);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) jarArchiveInputStream20, (java.io.OutputStream) jarArchiveOutputStream23);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = jarArchiveInputStream20.getNextZipEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry29 = jarArchiveInputStream20.getNextJarEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = jarArchiveInputStream20.getNextEntry();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(zipArchiveEntry28);
        org.junit.Assert.assertNull(jarArchiveEntry29);
        org.junit.Assert.assertNull(archiveEntry30);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream3);
        tarArchiveInputStream4.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        int int8 = tarArchiveInputStream4.available();
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9);
        tarArchiveOutputStream11.setBufferDebug(false);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream4, (java.io.OutputStream) tarArchiveOutputStream11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream15 = archiveStreamFactory0.createArchiveInputStream("", (java.io.InputStream) tarArchiveInputStream4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver:  not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream3.closeEntry();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        arArchiveOutputStream6.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream6.write((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int3 = tarArchiveInputStream2.getRecordSize();
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (int) (short) 100, 64);
        tarArchiveInputStream2.copyEntryContents((java.io.OutputStream) cpioArchiveOutputStream6);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.write(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        cpioArchiveOutputStream3.close();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        jarArchiveOutputStream5.closeArchiveEntry();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        boolean boolean3 = jarArchiveOutputStream2.isSeekable();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        tarArchiveInputStream6.mark(32);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean13 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray11, 2);
        boolean boolean15 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray11, (int) (byte) 10);
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, 100);
        int int20 = tarArchiveInputStream6.read(byteArray11, (int) (short) 1, 4);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.write(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        jarArchiveOutputStream2.closeArchiveEntry();
        jarArchiveOutputStream2.setLevel((int) (short) -1);
        jarArchiveOutputStream2.setMethod((int) (byte) 0);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream9);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean16 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray14, 2);
        boolean boolean18 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray14, 49152);
        cpioArchiveOutputStream10.write(byteArray14, 0, 0);
        boolean boolean23 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray14, 8);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.write(byteArray14, 49152, 1024);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream2.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream3.setBufferDebug(false);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream10);
        tarArchiveInputStream11.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream11);
        long long15 = tarArchiveInputStream11.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream11);
        byte[] byteArray18 = new byte[] { (byte) 0 };
        boolean boolean20 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray18, 8);
        boolean boolean22 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray18, 256);
        int int25 = arArchiveInputStream16.read(byteArray18, (int) (short) 8, 256);
        java.io.OutputStream outputStream26 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream26);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream28 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream27);
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean33 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray31, 2);
        boolean boolean35 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray31, 49152);
        cpioArchiveOutputStream27.write(byteArray31, 0, 0);
        int int39 = arArchiveInputStream16.read(byteArray31);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.write(byteArray31);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 64, 512);
        tarArchiveOutputStream15.flush();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        zipArchiveOutputStream5.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.putNextEntry(zipArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream21);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream23 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        jarArchiveOutputStream23.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream23);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) jarArchiveInputStream20, (java.io.OutputStream) jarArchiveOutputStream23);
        jarArchiveOutputStream23.flush();
        jarArchiveOutputStream23.setFallbackToUTF8(true);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream23.write(24576);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 64, 512);
        java.lang.String str19 = tarArchiveOutputStream15.getDefaultFileExtension();
        java.lang.String str20 = tarArchiveOutputStream15.getName();
        tarArchiveOutputStream15.setLongFileMode(2048);
        java.lang.String str23 = tarArchiveOutputStream15.getName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry24 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream15.putNextEntry(tarArchiveEntry24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "tar" + "'", str19, "tar");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "tar" + "'", str20, "tar");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "tar" + "'", str23, "tar");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        int int7 = tarArchiveInputStream2.getRecordSize();
        java.io.OutputStream outputStream8 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream8);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream9);
        jarArchiveOutputStream10.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream10);
        zipArchiveOutputStream13.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream13);
        tarArchiveInputStream2.copyEntryContents((java.io.OutputStream) cpioArchiveOutputStream15);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream15.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        arArchiveOutputStream6.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream6.write((int) (short) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        tarArchiveInputStream7.reset();
        boolean boolean9 = tarArchiveInputStream7.markSupported();
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream12 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray15, 2);
        boolean boolean19 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray15, 49152);
        cpioArchiveOutputStream11.write(byteArray15, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream7, (java.io.OutputStream) cpioArchiveOutputStream11, 100);
        tarArchiveInputStream2.copyEntryContents((java.io.OutputStream) cpioArchiveOutputStream11);
        boolean boolean26 = tarArchiveInputStream2.markSupported();
        tarArchiveInputStream2.setDebug(true);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream29 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, (int) (short) 12);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream4);
        jarArchiveOutputStream5.setMethod((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream5, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        cpioArchiveOutputStream3.close();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry7.setTime((long) (byte) 1);
        long long10 = cpioArchiveEntry7.getInode();
        long long11 = cpioArchiveEntry7.getNumberOfLinks();
        cpioArchiveEntry7.setUID(0L);
        long long14 = cpioArchiveEntry7.getRemoteDeviceMin();
        cpioArchiveEntry7.setChksum((long) 36864);
        long long17 = cpioArchiveEntry7.getNumberOfLinks();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream3.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        java.io.OutputStream outputStream20 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream20);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream22 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream21);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23, 2048);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream25);
        java.lang.String str27 = tarArchiveOutputStream25.getDefaultFileExtension();
        java.lang.String str28 = tarArchiveOutputStream25.getDefaultFileExtension();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "tar" + "'", str27, "tar");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "tar" + "'", str28, "tar");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, (int) (short) 12);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream7);
        tarArchiveInputStream8.close();
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean14 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray12, 2);
        boolean boolean16 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray12, (int) (byte) 10);
        int int17 = tarArchiveInputStream8.read(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.write(byteArray12, 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        jarArchiveOutputStream2.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.write(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        jarArchiveOutputStream4.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream4.setMethod((int) (byte) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream10 = archiveStreamFactory0.createArchiveOutputStream("org.apache.commons.compress.archivers.ArchiveException: 070701", (java.io.OutputStream) jarArchiveOutputStream4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: org.apache.commons.compress.archivers.ArchiveException: 070701 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        jarArchiveOutputStream2.closeArchiveEntry();
        jarArchiveOutputStream2.setEncoding("070702");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, (int) (short) 1);
        jarArchiveOutputStream2.flush();
        java.lang.String str10 = jarArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.putNextEntry(zipArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "070702" + "'", str10, "070702");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        jarArchiveOutputStream2.closeArchiveEntry();
        jarArchiveOutputStream2.setEncoding("070702");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, (int) (short) 1);
        tarArchiveOutputStream8.closeEntry();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        long long6 = tarArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        byte[] byteArray9 = new byte[] { (byte) 0 };
        boolean boolean11 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray9, 8);
        boolean boolean13 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray9, 256);
        int int16 = arArchiveInputStream7.read(byteArray9, (int) (short) 8, 256);
        java.io.OutputStream outputStream17 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream17);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream19 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean24 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray22, 2);
        boolean boolean26 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray22, 49152);
        cpioArchiveOutputStream18.write(byteArray22, 0, 0);
        int int30 = arArchiveInputStream7.read(byteArray22);
        boolean boolean32 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray22, (int) 'a');
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.putNextEntry(zipArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
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
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        tarArchiveOutputStream5.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, 2048, 32768);
        tarArchiveOutputStream5.setDebug(false);
        int int12 = tarArchiveOutputStream5.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2048' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        java.io.OutputStream outputStream20 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream20);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream22 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream21);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23, 2048);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream25);
        tarArchiveInputStream2.reset();
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean32 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray30, 2);
        boolean boolean34 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray30, (int) (byte) 10);
        boolean boolean36 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray30, 100);
        boolean boolean38 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray30, 16384);
        int int41 = tarArchiveInputStream2.read(byteArray30, 0, (int) (short) 4);
        boolean boolean42 = tarArchiveInputStream2.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream45 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2, 24576, (int) (short) 2);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry46 = tarArchiveInputStream45.getNextTarEntry();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(tarArchiveEntry46);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        jarArchiveOutputStream2.closeArchiveEntry();
        jarArchiveOutputStream2.setLevel((int) (short) -1);
        jarArchiveOutputStream2.closeEntry();
        java.lang.String str8 = jarArchiveOutputStream2.getEncoding();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        cpioArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray19 = new byte[] { (byte) 0 };
        boolean boolean21 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray19, 8);
        boolean boolean23 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray19, 256);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream17.write(byteArray19, 2, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        tarArchiveOutputStream3.flush();
        tarArchiveOutputStream3.closeArchiveEntry();
        tarArchiveOutputStream3.closeArchiveEntry();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        jarArchiveOutputStream2.closeArchiveEntry();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        tarArchiveInputStream2.close();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean11 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray9, 2);
        boolean boolean13 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray9, 49152);
        int int14 = arArchiveInputStream6.read(byteArray9);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream16);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream18 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream18);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream19, 2048);
        tarArchiveOutputStream21.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream21);
        int int24 = tarArchiveOutputStream21.getRecordSize();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream15, (java.io.OutputStream) tarArchiveOutputStream21);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry26 = cpioArchiveInputStream15.getNextCPIOEntry();
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream21);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream23 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        jarArchiveOutputStream23.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream23);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) jarArchiveInputStream20, (java.io.OutputStream) jarArchiveOutputStream23);
        jarArchiveOutputStream23.flush();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream23.write((int) (short) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream14 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream13);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream14);
        tarArchiveInputStream15.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream15);
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 100, (byte) 0 };
        int int24 = tarArchiveInputStream17.read(byteArray21, (int) (byte) 0, 0);
        byte[] byteArray25 = new byte[] {};
        int int28 = tarArchiveInputStream17.read(byteArray25, 0, 1024);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.write(byteArray25, 32, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, (int) (short) 12);
        byte[] byteArray6 = new byte[] { (byte) 0 };
        boolean boolean8 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray6, 8);
        boolean boolean10 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray6, 32768);
        boolean boolean12 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray6, 4096);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.write(byteArray6, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.write(36864);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        java.lang.String str6 = tarArchiveOutputStream5.getDefaultFileExtension();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "tar" + "'", str6, "tar");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        java.io.OutputStream outputStream20 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream20);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream22 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream21);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23, 2048);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream25);
        java.lang.String str27 = tarArchiveOutputStream25.getDefaultFileExtension();
        java.io.InputStream inputStream28 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream29 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream28);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream29);
        tarArchiveInputStream30.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream30);
        long long34 = tarArchiveInputStream30.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream35 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream30);
        byte[] byteArray37 = new byte[] { (byte) 0 };
        boolean boolean39 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray37, 8);
        boolean boolean41 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray37, 256);
        int int44 = arArchiveInputStream35.read(byteArray37, (int) (short) 8, 256);
        boolean boolean46 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray37, 1);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream25.write(byteArray37);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "tar" + "'", str27, "tar");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        tarArchiveInputStream7.mark(32);
        tarArchiveInputStream7.close();
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream12);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream13, (int) 'a');
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean21 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray19, 2);
        boolean boolean23 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray19, (int) (byte) 10);
        boolean boolean25 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, 100);
        int int28 = tarArchiveInputStream13.read(byteArray19, 0, (int) (short) -1);
        int int29 = tarArchiveInputStream7.read(byteArray19);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream4.write(byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, 2048);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream9 = archiveStreamFactory0.createArchiveOutputStream("070702", (java.io.OutputStream) arArchiveOutputStream8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: 070702 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 64, 512);
        java.lang.String str19 = tarArchiveOutputStream15.getName();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15);
        tarArchiveOutputStream15.setBufferDebug(false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "tar" + "'", str19, "tar");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        arArchiveOutputStream6.closeArchiveEntry();
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream9);
        tarArchiveInputStream10.reset();
        boolean boolean12 = tarArchiveInputStream10.markSupported();
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream13);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean20 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray18, 2);
        boolean boolean22 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray18, 49152);
        cpioArchiveOutputStream14.write(byteArray18, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream10, (java.io.OutputStream) cpioArchiveOutputStream14, 100);
        java.io.OutputStream outputStream28 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream28);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream30 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream29);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream30);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream31, 2048);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream10, (java.io.OutputStream) tarArchiveOutputStream33);
        tarArchiveInputStream10.reset();
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean40 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray38, 2);
        boolean boolean42 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray38, (int) (byte) 10);
        boolean boolean44 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray38, 100);
        boolean boolean46 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray38, 16384);
        int int49 = tarArchiveInputStream10.read(byteArray38, 0, (int) (short) 4);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream6.write(byteArray38, (int) (short) 2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
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
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        java.lang.String str3 = tarArchiveOutputStream2.getName();
        tarArchiveOutputStream2.closeEntry();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tar" + "'", str3, "tar");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        tarArchiveInputStream2.close();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean11 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray9, 2);
        boolean boolean13 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray9, 49152);
        int int14 = arArchiveInputStream6.read(byteArray9);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream16);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream18 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream18);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream19, 2048);
        tarArchiveOutputStream21.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream21);
        int int24 = tarArchiveOutputStream21.getRecordSize();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream15, (java.io.OutputStream) tarArchiveOutputStream21);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream15);
        zipArchiveInputStream26.close();
        int int28 = zipArchiveInputStream26.available();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = zipArchiveInputStream26.getNextZipEntry();
        int int30 = zipArchiveInputStream26.available();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(zipArchiveEntry29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        long long6 = tarArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        byte[] byteArray9 = new byte[] { (byte) 0 };
        boolean boolean11 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray9, 8);
        boolean boolean13 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray9, 256);
        int int16 = arArchiveInputStream7.read(byteArray9, (int) (short) 8, 256);
        java.io.OutputStream outputStream17 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream17);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream19 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean24 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray22, 2);
        boolean boolean26 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray22, 49152);
        cpioArchiveOutputStream18.write(byteArray22, 0, 0);
        int int30 = arArchiveInputStream7.read(byteArray22);
        int int31 = arArchiveInputStream7.read();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        java.io.OutputStream outputStream20 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream20);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream22 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream21);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23, 2048);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream25);
        byte[] byteArray31 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 10 };
        int int32 = tarArchiveInputStream2.read(byteArray31);
        boolean boolean34 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray31, 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream3.write((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        arArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean10 = cpioArchiveEntry9.isRegularFile();
        boolean boolean11 = cpioArchiveEntry9.isBlockDevice();
        boolean boolean12 = cpioArchiveEntry9.isNetwork();
        long long13 = cpioArchiveEntry9.getNumberOfLinks();
        long long14 = cpioArchiveEntry9.getNumberOfLinks();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream6.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream21);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream23 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        jarArchiveOutputStream23.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream23);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) jarArchiveInputStream20, (java.io.OutputStream) jarArchiveOutputStream23);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = jarArchiveInputStream20.getNextZipEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry29 = jarArchiveInputStream20.getNextJarEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry30 = jarArchiveInputStream20.getNextZipEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry31 = jarArchiveInputStream20.getNextJarEntry();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(zipArchiveEntry28);
        org.junit.Assert.assertNull(jarArchiveEntry29);
        org.junit.Assert.assertNull(zipArchiveEntry30);
        org.junit.Assert.assertNull(jarArchiveEntry31);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        int int4 = tarArchiveOutputStream3.getRecordSize();
        int int5 = tarArchiveOutputStream3.getRecordSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry8.setTime((long) (byte) 1);
        boolean boolean11 = cpioArchiveEntry8.isDirectory();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream6.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        zipArchiveOutputStream4.closeArchiveEntry();
        zipArchiveOutputStream4.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream4);
        int int8 = tarArchiveOutputStream7.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream7.write(2048);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        java.io.OutputStream outputStream8 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream8);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream9);
        jarArchiveOutputStream10.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream10);
        zipArchiveOutputStream13.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy16 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream13.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy16);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream3);
        tarArchiveInputStream4.mark(32);
        tarArchiveInputStream4.close();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean13 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray11, 2);
        boolean boolean15 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray11, 49152);
        int int16 = arArchiveInputStream8.read(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        java.io.OutputStream outputStream18 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream18);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream19);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream20);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream21, 2048);
        tarArchiveOutputStream23.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream25 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23);
        int int26 = tarArchiveOutputStream23.getRecordSize();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream17, (java.io.OutputStream) tarArchiveOutputStream23);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream29 = archiveStreamFactory0.createArchiveInputStream("org.apache.commons.compress.archivers.ArchiveException: 070701", (java.io.InputStream) zipArchiveInputStream28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: org.apache.commons.compress.archivers.ArchiveException: 070701 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 512 + "'", int26 == 512);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        tarArchiveInputStream7.reset();
        boolean boolean9 = tarArchiveInputStream7.markSupported();
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream12 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray15, 2);
        boolean boolean19 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray15, 49152);
        cpioArchiveOutputStream11.write(byteArray15, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream7, (java.io.OutputStream) cpioArchiveOutputStream11, 100);
        tarArchiveInputStream2.copyEntryContents((java.io.OutputStream) cpioArchiveOutputStream11);
        boolean boolean26 = tarArchiveInputStream2.markSupported();
        int int27 = tarArchiveInputStream2.getRecordSize();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream28 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.InputStream inputStream29 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream30 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream29);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream30);
        tarArchiveInputStream31.mark(32);
        tarArchiveInputStream31.close();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream35 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream31);
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean40 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray38, 2);
        boolean boolean42 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray38, 49152);
        int int43 = arArchiveInputStream35.read(byteArray38);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = jarArchiveInputStream28.read(byteArray38, 29127, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 512 + "'", int27 == 512);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        jarArchiveOutputStream4.closeArchiveEntry();
        jarArchiveOutputStream4.setEncoding("070702");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (short) 1);
        jarArchiveOutputStream4.flush();
        java.lang.String str12 = jarArchiveOutputStream4.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream13 = archiveStreamFactory0.createArchiveOutputStream("", (java.io.OutputStream) jarArchiveOutputStream4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver:  not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "070702" + "'", str12, "070702");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        tarArchiveOutputStream5.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, 2048, 32768);
        tarArchiveOutputStream5.setDebug(false);
        java.lang.String str12 = tarArchiveOutputStream5.getName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "tar" + "'", str12, "tar");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean5 = cpioArchiveEntry4.isSocket();
        long long6 = cpioArchiveEntry4.getTime();
        cpioArchiveEntry4.setDeviceMaj((long) '#');
        cpioArchiveEntry4.setDeviceMin((long) 8192);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry6.setTime((long) (byte) 1);
        long long9 = cpioArchiveEntry6.getMode();
        boolean boolean10 = cpioArchiveEntry6.isBlockDevice();
        cpioArchiveEntry6.setRemoteDeviceMin((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 64, 512);
        int int19 = tarArchiveOutputStream18.getRecordSize();
        tarArchiveOutputStream18.setBufferDebug(false);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream18.write((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.flush();
        java.lang.String str4 = jarArchiveOutputStream2.getEncoding();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int3 = tarArchiveOutputStream2.getRecordSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        java.io.OutputStream outputStream20 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream20);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream22 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream21);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23, 2048);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream25);
        byte[] byteArray31 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 10 };
        int int32 = tarArchiveInputStream2.read(byteArray31);
        boolean boolean34 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray31, 0);
        boolean boolean36 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray31, (int) (short) 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        boolean boolean3 = jarArchiveOutputStream2.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.write((int) (short) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        boolean boolean3 = jarArchiveOutputStream2.isSeekable();
        jarArchiveOutputStream2.flush();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        zipArchiveOutputStream5.setFallbackToUTF8(true);
        byte[] byteArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.write(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        tarArchiveInputStream2.close();
        long long7 = tarArchiveInputStream2.skip((long) (short) 2);
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream9);
        tarArchiveInputStream10.reset();
        boolean boolean12 = tarArchiveInputStream10.markSupported();
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream13);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean20 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray18, 2);
        boolean boolean22 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray18, 49152);
        cpioArchiveOutputStream14.write(byteArray18, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream10, (java.io.OutputStream) cpioArchiveOutputStream14, 100);
        java.io.OutputStream outputStream28 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream28);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream30 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream29);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream30);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream31, 2048);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream10, (java.io.OutputStream) tarArchiveOutputStream33);
        tarArchiveInputStream10.reset();
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean40 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray38, 2);
        boolean boolean42 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray38, (int) (byte) 10);
        boolean boolean44 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray38, 100);
        boolean boolean46 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray38, 16384);
        int int49 = tarArchiveInputStream10.read(byteArray38, 0, (int) (short) 4);
        int int52 = tarArchiveInputStream2.read(byteArray38, (int) (byte) 1, 36864);
        boolean boolean54 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray38, 32768);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 64, 512);
        java.lang.String str19 = tarArchiveOutputStream15.getDefaultFileExtension();
        java.lang.String str20 = tarArchiveOutputStream15.getName();
        tarArchiveOutputStream15.setLongFileMode(2048);
        java.lang.String str23 = tarArchiveOutputStream15.getName();
        tarArchiveOutputStream15.setBufferDebug(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, (int) (short) 10, (int) (short) 3);
        tarArchiveOutputStream15.setLongFileMode(1024);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "tar" + "'", str19, "tar");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "tar" + "'", str20, "tar");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "tar" + "'", str23, "tar");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        boolean boolean4 = jarArchiveOutputStream2.isSeekable();
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        tarArchiveInputStream7.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream7);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream7);
        byte[] byteArray14 = org.apache.commons.compress.archivers.cpio.CpioUtil.long2byteArray((long) 61440, 1024, false);
        int int15 = tarArchiveInputStream7.read(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.write(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -16]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        int int7 = tarArchiveInputStream2.getRecordSize();
        java.io.OutputStream outputStream8 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream8);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream9);
        jarArchiveOutputStream10.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream10);
        zipArchiveOutputStream13.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream13);
        tarArchiveInputStream2.copyEntryContents((java.io.OutputStream) cpioArchiveOutputStream15);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean19 = cpioArchiveEntry18.isSocket();
        boolean boolean20 = cpioArchiveEntry18.isPipe();
        cpioArchiveEntry18.setRemoteDeviceMaj((long) 29127);
        long long23 = cpioArchiveEntry18.getDeviceMin();
        java.lang.String str24 = cpioArchiveEntry18.getName();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream15.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "070702" + "'", str24, "070702");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream3.setBufferDebug(false);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.putNextEntry(tarArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream21);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream23 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        jarArchiveOutputStream23.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream23);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) jarArchiveInputStream20, (java.io.OutputStream) jarArchiveOutputStream23);
        byte[] byteArray28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int29 = jarArchiveInputStream20.read(byteArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        tarArchiveOutputStream3.setBufferDebug(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (short) 10, 1);
        java.lang.String str11 = tarArchiveOutputStream3.getName();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "tar" + "'", str11, "tar");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        java.io.OutputStream outputStream20 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream20);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream22 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream21);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23, 2048);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream25);
        tarArchiveOutputStream25.flush();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream28 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream25);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        jarArchiveOutputStream2.closeArchiveEntry();
        jarArchiveOutputStream2.setLevel((int) (short) -1);
        jarArchiveOutputStream2.closeArchiveEntry();
        boolean boolean8 = jarArchiveOutputStream2.isSeekable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream21);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream23 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        jarArchiveOutputStream23.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream23);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) jarArchiveInputStream20, (java.io.OutputStream) jarArchiveOutputStream23);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = jarArchiveInputStream20.getNextZipEntry();
        jarArchiveInputStream20.mark((int) (short) 10);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry31 = jarArchiveInputStream20.getNextJarEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = jarArchiveInputStream20.getNextEntry();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(zipArchiveEntry28);
        org.junit.Assert.assertNull(jarArchiveEntry31);
        org.junit.Assert.assertNull(archiveEntry32);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        zipArchiveOutputStream4.closeArchiveEntry();
        zipArchiveOutputStream4.closeArchiveEntry();
        zipArchiveOutputStream4.flush();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry5.setNumberOfLinks((long) 1);
        cpioArchiveEntry5.setDeviceMaj((long) 2048);
        cpioArchiveEntry5.setSize((long) 8);
        cpioArchiveEntry5.setRemoteDeviceMin((long) (short) 0);
        java.lang.String str14 = cpioArchiveEntry5.getName();
        cpioArchiveEntry5.setTime((long) 29127);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.putNextEntry(cpioArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "070702" + "'", str14, "070702");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int3 = tarArchiveInputStream2.getRecordSize();
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (int) (short) 100, 64);
        tarArchiveInputStream2.copyEntryContents((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        java.lang.Class<?> wildcardClass26 = zipArchiveOutputStream25.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        cpioArchiveOutputStream3.close();
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        tarArchiveInputStream7.mark(32);
        tarArchiveInputStream7.close();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream7);
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean16 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray14, 2);
        boolean boolean18 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray14, 49152);
        int int19 = arArchiveInputStream11.read(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream3.write(byteArray14, 16384, (int) (short) 12);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        cpioArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry5.setNumberOfLinks((long) 1);
        cpioArchiveEntry5.setDeviceMaj((long) 2048);
        cpioArchiveEntry5.setSize((long) 8);
        java.lang.String str12 = cpioArchiveEntry5.getName();
        cpioArchiveEntry5.setNumberOfLinks((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.putNextEntry(cpioArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "070702" + "'", str12, "070702");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        zipArchiveOutputStream5.flush();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int3 = tarArchiveInputStream2.getRecordSize();
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (int) (short) 100, 64);
        tarArchiveInputStream2.copyEntryContents((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream21);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream23 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        jarArchiveOutputStream23.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream23);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) jarArchiveInputStream20, (java.io.OutputStream) jarArchiveOutputStream23);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = jarArchiveInputStream20.getNextZipEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry29 = jarArchiveInputStream20.getNextJarEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry30 = jarArchiveInputStream20.getNextZipEntry();
        boolean boolean31 = jarArchiveInputStream20.markSupported();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(zipArchiveEntry28);
        org.junit.Assert.assertNull(jarArchiveEntry29);
        org.junit.Assert.assertNull(zipArchiveEntry30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 64, 512);
        java.lang.String str19 = tarArchiveOutputStream15.getDefaultFileExtension();
        java.lang.String str20 = tarArchiveOutputStream15.getName();
        tarArchiveOutputStream15.setLongFileMode(2048);
        java.lang.String str23 = tarArchiveOutputStream15.getName();
        tarArchiveOutputStream15.setBufferDebug(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, (int) (short) 10, (int) (short) 3);
        java.io.InputStream inputStream29 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream30 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream29);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream30);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream31);
        byte[] byteArray34 = new byte[] { (byte) 0 };
        boolean boolean36 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray34, 8);
        boolean boolean38 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray34, 32768);
        int int39 = tarArchiveInputStream32.read(byteArray34);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream15.write(byteArray34, 8, 4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "tar" + "'", str19, "tar");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "tar" + "'", str20, "tar");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "tar" + "'", str23, "tar");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, (int) (short) 12);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.write((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        java.io.OutputStream outputStream20 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream20);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream22 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream21);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23, 2048);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream25);
        tarArchiveOutputStream25.flush();
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean32 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray30, 2);
        boolean boolean34 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray30, 49152);
        boolean boolean36 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray30, 16);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream25.write(byteArray30);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        tarArchiveInputStream2.close();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean11 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray9, 2);
        boolean boolean13 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray9, 49152);
        int int14 = arArchiveInputStream6.read(byteArray9);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream16);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream18 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream18);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream19, 2048);
        tarArchiveOutputStream21.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream21);
        int int24 = tarArchiveOutputStream21.getRecordSize();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream15, (java.io.OutputStream) tarArchiveOutputStream21);
        cpioArchiveInputStream15.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry27 = cpioArchiveInputStream15.getNextCPIOEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2, 40960, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream9);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        jarArchiveOutputStream11.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream11.closeArchiveEntry();
        tarArchiveInputStream2.copyEntryContents((java.io.OutputStream) jarArchiveOutputStream11);
        tarArchiveInputStream2.reset();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 64, 512);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream18.putArchiveEntry(archiveEntry19);
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
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        arArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream6);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream2.setBufferDebug(false);
        java.lang.String str5 = tarArchiveOutputStream2.getDefaultFileExtension();
        java.lang.String str6 = tarArchiveOutputStream2.getName();
        tarArchiveOutputStream2.setBufferDebug(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "tar" + "'", str5, "tar");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "tar" + "'", str6, "tar");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        jarArchiveOutputStream2.closeArchiveEntry();
        jarArchiveOutputStream2.setEncoding("070702");
        jarArchiveOutputStream2.setEncoding("070707");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream4);
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        tarArchiveInputStream8.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream8);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 100, (byte) 0 };
        int int17 = tarArchiveInputStream10.read(byteArray14, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream4.write(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        jarArchiveOutputStream2.closeArchiveEntry();
        jarArchiveOutputStream2.setLevel((int) (short) -1);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream7);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        tarArchiveInputStream9.reset();
        boolean boolean11 = tarArchiveInputStream9.markSupported();
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream12);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream14 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream13);
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean19 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray17, 2);
        boolean boolean21 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray17, 49152);
        cpioArchiveOutputStream13.write(byteArray17, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream9, (java.io.OutputStream) cpioArchiveOutputStream13, 100);
        java.io.OutputStream outputStream27 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream28 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream27);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream29 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream28);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream29);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream30, 2048);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream9, (java.io.OutputStream) tarArchiveOutputStream32);
        byte[] byteArray38 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 10 };
        int int39 = tarArchiveInputStream9.read(byteArray38);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.write(byteArray38, 32, 8192);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[0, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int3 = tarArchiveInputStream2.getRecordSize();
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (int) (short) 100, 64);
        tarArchiveInputStream2.copyEntryContents((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean28 = cpioArchiveEntry27.isSocket();
        cpioArchiveEntry27.setTime((long) (short) 10);
        cpioArchiveEntry27.setRemoteDeviceMin(0L);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream21 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream23);
        tarArchiveInputStream24.mark(32);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean31 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray29, 2);
        boolean boolean33 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray29, (int) (byte) 10);
        boolean boolean35 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray29, 100);
        int int38 = tarArchiveInputStream24.read(byteArray29, (int) (short) 1, 4);
        int int39 = arArchiveInputStream21.read(byteArray29);
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry40 = arArchiveInputStream21.getNextArEntry();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(arArchiveEntry40);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream21);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream23 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        jarArchiveOutputStream23.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream23);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) jarArchiveInputStream20, (java.io.OutputStream) jarArchiveOutputStream23);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry28 = jarArchiveInputStream20.getNextEntry();
        byte[] byteArray30 = new byte[] { (byte) 0 };
        boolean boolean32 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray30, 8);
        boolean boolean34 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray30, 256);
        int int35 = jarArchiveInputStream20.read(byteArray30);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry36 = jarArchiveInputStream20.getNextJarEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry37 = jarArchiveInputStream20.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry38 = jarArchiveInputStream20.getNextEntry();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(archiveEntry28);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(jarArchiveEntry36);
        org.junit.Assert.assertNull(archiveEntry37);
        org.junit.Assert.assertNull(archiveEntry38);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        java.io.OutputStream outputStream20 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream20);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream22 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream21);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23, 2048);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream25);
        tarArchiveInputStream2.reset();
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean32 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray30, 2);
        boolean boolean34 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray30, (int) (byte) 10);
        boolean boolean36 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray30, 100);
        boolean boolean38 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray30, 16384);
        int int41 = tarArchiveInputStream2.read(byteArray30, 0, (int) (short) 4);
        boolean boolean42 = tarArchiveInputStream2.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream45 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2, 24576, (int) (short) 2);
        long long47 = tarArchiveInputStream2.skip(0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream3.setBufferDebug(false);
        tarArchiveOutputStream3.finish();
        tarArchiveOutputStream3.flush();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream13 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream12);
        jarArchiveOutputStream13.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream13);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy17 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        jarArchiveOutputStream13.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy17);
        jarArchiveOutputStream11.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy17);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy17);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        tarArchiveOutputStream5.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry8.setNumberOfLinks((long) 1);
        cpioArchiveEntry8.setDeviceMaj((long) 2048);
        cpioArchiveEntry8.setSize((long) 8);
        java.lang.String str15 = cpioArchiveEntry8.getName();
        cpioArchiveEntry8.setMode((long) (byte) 10);
        cpioArchiveEntry8.setMode((long) (-1));
        long long20 = cpioArchiveEntry8.getSize();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "070702" + "'", str15, "070702");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 8L + "'", long20 == 8L);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        zipArchiveOutputStream4.closeArchiveEntry();
        zipArchiveOutputStream4.closeArchiveEntry();
        zipArchiveOutputStream4.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream4.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        java.io.OutputStream outputStream20 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream20);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream22 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream21);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23, 2048);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream25);
        tarArchiveInputStream2.reset();
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean32 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray30, 2);
        boolean boolean34 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray30, (int) (byte) 10);
        boolean boolean36 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray30, 100);
        boolean boolean38 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray30, 16384);
        int int41 = tarArchiveInputStream2.read(byteArray30, 0, (int) (short) 4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry42 = tarArchiveInputStream2.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 36864, 2);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        int int15 = tarArchiveInputStream7.read(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream4.write(byteArray10, (int) (short) -1, 16);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '16' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        java.io.OutputStream outputStream20 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream20);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream22 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream21);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23, 2048);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream25);
        tarArchiveOutputStream25.flush();
        tarArchiveOutputStream25.flush();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        zipArchiveOutputStream5.setMethod(256);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        jarArchiveOutputStream4.closeArchiveEntry();
        jarArchiveOutputStream4.setLevel((int) (short) -1);
        jarArchiveOutputStream4.setFallbackToUTF8(true);
        jarArchiveOutputStream4.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream12 = archiveStreamFactory0.createArchiveOutputStream("always", (java.io.OutputStream) jarArchiveOutputStream4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: always not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 8);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream2.write(0);
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
        jarArchiveOutputStream2.setEncoding("070707");
        java.lang.String str5 = jarArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        jarArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream10);
        tarArchiveInputStream11.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream11);
        long long15 = tarArchiveInputStream11.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream11);
        byte[] byteArray18 = new byte[] { (byte) 0 };
        boolean boolean20 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray18, 8);
        boolean boolean22 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray18, 256);
        int int25 = arArchiveInputStream16.read(byteArray18, (int) (short) 8, 256);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.write(byteArray18, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "070707" + "'", str5, "070707");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        int int7 = tarArchiveInputStream2.getRecordSize();
        java.io.OutputStream outputStream8 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream8);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream9);
        jarArchiveOutputStream10.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream10);
        zipArchiveOutputStream13.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream13);
        tarArchiveInputStream2.copyEntryContents((java.io.OutputStream) cpioArchiveOutputStream15);
        byte[] byteArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream15.write(byteArray17, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 64, 512);
        java.lang.String str19 = tarArchiveOutputStream15.getName();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream21 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream23);
        tarArchiveInputStream24.mark(32);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean31 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray29, 2);
        boolean boolean33 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray29, (int) (byte) 10);
        boolean boolean35 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray29, 100);
        int int38 = tarArchiveInputStream24.read(byteArray29, (int) (short) 1, 4);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream21.write(byteArray29);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "tar" + "'", str19, "tar");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        java.io.OutputStream outputStream20 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream20);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream22 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream21);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23, 2048);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream25);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream25.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2048' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream21 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean26 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray24, 2);
        boolean boolean28 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray24, (int) (short) 1);
        int int29 = arArchiveInputStream21.read(byteArray24);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 64, 512);
        java.lang.String str19 = tarArchiveOutputStream15.getName();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = null;
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream20.putNextEntry(zipArchiveEntry21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "tar" + "'", str19, "tar");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream21);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream23 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        jarArchiveOutputStream23.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream23);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) jarArchiveInputStream20, (java.io.OutputStream) jarArchiveOutputStream23);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry28 = jarArchiveInputStream20.getNextEntry();
        byte[] byteArray30 = new byte[] { (byte) 0 };
        boolean boolean32 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray30, 8);
        boolean boolean34 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray30, 256);
        int int35 = jarArchiveInputStream20.read(byteArray30);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry36 = jarArchiveInputStream20.getNextEntry();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(archiveEntry28);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(archiveEntry36);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        zipArchiveOutputStream4.closeArchiveEntry();
        zipArchiveOutputStream4.closeArchiveEntry();
        zipArchiveOutputStream4.flush();
        zipArchiveOutputStream4.closeArchiveEntry();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        cpioArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream17.write(8);
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
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        java.lang.String str5 = jarArchiveOutputStream2.getEncoding();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        jarArchiveOutputStream2.setMethod(0);
        jarArchiveOutputStream2.setComment("UTF8");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream6.write(0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        tarArchiveOutputStream3.flush();
        tarArchiveOutputStream3.closeArchiveEntry();
        tarArchiveOutputStream3.setBufferDebug(true);
        java.lang.String str8 = tarArchiveOutputStream3.getDefaultFileExtension();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tar" + "'", str8, "tar");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, (int) (short) 12);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream4);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream7);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        tarArchiveInputStream9.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream9);
        long long13 = tarArchiveInputStream9.skip((long) (byte) -1);
        tarArchiveInputStream9.setDebug(false);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream17 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream16);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream17);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream18, (int) 'a');
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream18);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean26 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray24, 2);
        boolean boolean28 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray24, (int) (byte) 10);
        boolean boolean30 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray24, 100);
        int int33 = tarArchiveInputStream18.read(byteArray24, 0, (int) (short) -1);
        int int34 = tarArchiveInputStream9.read(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream6.write(byteArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        jarArchiveOutputStream2.closeArchiveEntry();
        jarArchiveOutputStream2.setLevel((int) (short) -1);
        jarArchiveOutputStream2.closeEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry9.setNumberOfLinks((long) 1);
        cpioArchiveEntry9.setDeviceMaj((long) 2048);
        cpioArchiveEntry9.setSize((long) 8);
        java.lang.String str16 = cpioArchiveEntry9.getName();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "070702" + "'", str16, "070702");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        tarArchiveInputStream2.close();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean11 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray9, 2);
        boolean boolean13 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray9, 49152);
        int int14 = arArchiveInputStream6.read(byteArray9);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream16);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream18 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream18);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream19, 2048);
        tarArchiveOutputStream21.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream21);
        int int24 = tarArchiveOutputStream21.getRecordSize();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream15, (java.io.OutputStream) tarArchiveOutputStream21);
        cpioArchiveInputStream15.close();
        cpioArchiveInputStream15.mark(4);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream15.closeEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int3 = tarArchiveInputStream2.getRecordSize();
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (int) (short) 100, 64);
        tarArchiveInputStream2.copyEntryContents((java.io.OutputStream) cpioArchiveOutputStream6);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.write((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        tarArchiveOutputStream3.setBufferDebug(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (short) 10, 1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream10.putNextEntry(tarArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream3 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream2);
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean8 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray6, 2);
        boolean boolean10 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray6, 49152);
        cpioArchiveOutputStream2.write(byteArray6, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream2, 0, 10);
        cpioArchiveOutputStream2.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.utils.IOUtils.copy(inputStream0, (java.io.OutputStream) cpioArchiveOutputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int3 = tarArchiveInputStream2.getRecordSize();
        tarArchiveInputStream2.reset();
        long long6 = tarArchiveInputStream2.skip((long) (byte) 1);
        tarArchiveInputStream2.mark(49152);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream10);
        int int12 = tarArchiveInputStream11.getRecordSize();
        tarArchiveInputStream11.reset();
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream14);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream16 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean21 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray19, 2);
        boolean boolean23 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray19, 49152);
        cpioArchiveOutputStream15.write(byteArray19, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15, (int) (short) 100, 64);
        tarArchiveInputStream11.copyEntryContents((java.io.OutputStream) cpioArchiveOutputStream15);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream15, 29127);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2);
        cpioArchiveOutputStream3.close();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, (int) (short) 12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream7 = archiveStreamFactory0.createArchiveOutputStream("org.apache.commons.compress.archivers.ArchiveException: ", (java.io.OutputStream) tarArchiveOutputStream6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: org.apache.commons.compress.archivers.ArchiveException:  not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        java.lang.String str10 = unicodeExtraFieldPolicy8.toString();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "always" + "'", str10, "always");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        zipArchiveOutputStream4.closeArchiveEntry();
        zipArchiveOutputStream4.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream4);
        zipArchiveOutputStream4.setComment("070701");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        jarArchiveOutputStream2.setLevel((-1));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        long long6 = tarArchiveInputStream2.skip((long) (byte) -1);
        int int7 = tarArchiveInputStream2.read();
        tarArchiveInputStream2.close();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2, (int) (byte) 1, 24576);
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream12);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream13);
        tarArchiveInputStream14.mark(32);
        tarArchiveInputStream14.close();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream18 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream14);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean23 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray21, 2);
        boolean boolean25 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray21, 49152);
        int int26 = arArchiveInputStream18.read(byteArray21);
        java.io.InputStream inputStream27 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream28 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream27);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream28);
        tarArchiveInputStream29.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream29);
        long long33 = tarArchiveInputStream29.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream34 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream29);
        byte[] byteArray36 = new byte[] { (byte) 0 };
        boolean boolean38 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray36, 8);
        boolean boolean40 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray36, 256);
        int int43 = arArchiveInputStream34.read(byteArray36, (int) (short) 8, 256);
        java.io.OutputStream outputStream44 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream45 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream44);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream46 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream45);
        byte[] byteArray49 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean51 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray49, 2);
        boolean boolean53 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray49, 49152);
        cpioArchiveOutputStream45.write(byteArray49, 0, 0);
        int int57 = arArchiveInputStream34.read(byteArray49);
        int int60 = arArchiveInputStream18.read(byteArray49, 10, 2);
        int int63 = tarArchiveInputStream2.read(byteArray49, (int) (byte) 100, (int) (short) 3);
        boolean boolean65 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray49, 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        java.io.OutputStream outputStream20 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream20);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream22 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream21);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23, 2048);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream25);
        tarArchiveInputStream2.reset();
        java.io.InputStream inputStream28 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream29 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream28);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream29);
        tarArchiveInputStream30.mark(32);
        tarArchiveInputStream30.close();
        long long35 = tarArchiveInputStream30.skip((long) (short) 2);
        java.io.InputStream inputStream36 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream37 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream36);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream37);
        tarArchiveInputStream38.reset();
        boolean boolean40 = tarArchiveInputStream38.markSupported();
        java.io.OutputStream outputStream41 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream42 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream41);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream43 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream42);
        byte[] byteArray46 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean48 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray46, 2);
        boolean boolean50 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray46, 49152);
        cpioArchiveOutputStream42.write(byteArray46, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream38, (java.io.OutputStream) cpioArchiveOutputStream42, 100);
        java.io.OutputStream outputStream56 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream57 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream56);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream58 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream57);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream59 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream58);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream61 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream59, 2048);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream38, (java.io.OutputStream) tarArchiveOutputStream61);
        tarArchiveInputStream38.reset();
        byte[] byteArray66 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean68 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray66, 2);
        boolean boolean70 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray66, (int) (byte) 10);
        boolean boolean72 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray66, 100);
        boolean boolean74 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray66, 16384);
        int int77 = tarArchiveInputStream38.read(byteArray66, 0, (int) (short) 4);
        int int80 = tarArchiveInputStream30.read(byteArray66, (int) (byte) 1, 36864);
        int int83 = tarArchiveInputStream2.read(byteArray66, 2, 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 64, 512);
        java.lang.String str19 = tarArchiveOutputStream15.getDefaultFileExtension();
        java.lang.String str20 = tarArchiveOutputStream15.getName();
        tarArchiveOutputStream15.setLongFileMode(2048);
        java.lang.String str23 = tarArchiveOutputStream15.getName();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, (short) 1);
        cpioArchiveOutputStream25.close();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "tar" + "'", str19, "tar");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "tar" + "'", str20, "tar");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "tar" + "'", str23, "tar");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        cpioArchiveOutputStream3.close();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream6);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream7);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean13 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray11, 2);
        boolean boolean15 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray11, 49152);
        cpioArchiveOutputStream7.write(byteArray11, 0, 0);
        boolean boolean20 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray11, 8);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream5.write(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 64, 512);
        int int19 = tarArchiveOutputStream18.getRecordSize();
        java.io.OutputStream outputStream20 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream20);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream22 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream21);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean27 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray25, 2);
        boolean boolean29 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray25, 49152);
        cpioArchiveOutputStream21.write(byteArray25, 0, 0);
        boolean boolean34 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray25, 8);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray25, 4);
        tarArchiveOutputStream18.write(byteArray25, (int) (short) 2, (int) (byte) 0);
        tarArchiveOutputStream18.closeArchiveEntry();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        jarArchiveOutputStream4.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        zipArchiveOutputStream7.setFallbackToUTF8(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream10 = archiveStreamFactory0.createArchiveOutputStream("org.apache.commons.compress.archivers.ArchiveException: ", (java.io.OutputStream) zipArchiveOutputStream7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: org.apache.commons.compress.archivers.ArchiveException:  not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        java.lang.String str6 = tarArchiveOutputStream5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "tar" + "'", str6, "tar");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 64, 512);
        java.lang.String str19 = tarArchiveOutputStream15.getDefaultFileExtension();
        java.lang.String str20 = tarArchiveOutputStream15.getName();
        tarArchiveOutputStream15.setLongFileMode(2048);
        java.lang.String str23 = tarArchiveOutputStream15.getName();
        tarArchiveOutputStream15.setBufferDebug(false);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream15.write(16);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "tar" + "'", str19, "tar");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "tar" + "'", str20, "tar");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "tar" + "'", str23, "tar");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeArchiveEntry();
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        tarArchiveInputStream5.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        long long9 = tarArchiveInputStream5.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        byte[] byteArray12 = new byte[] { (byte) 0 };
        boolean boolean14 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray12, 8);
        boolean boolean16 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray12, 256);
        int int19 = arArchiveInputStream10.read(byteArray12, (int) (short) 8, 256);
        java.io.OutputStream outputStream20 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream20);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream22 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream21);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean27 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray25, 2);
        boolean boolean29 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray25, 49152);
        cpioArchiveOutputStream21.write(byteArray25, 0, 0);
        int int33 = arArchiveInputStream10.read(byteArray25);
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry34 = arArchiveInputStream10.getNextArEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry35 = arArchiveInputStream10.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry36 = arArchiveInputStream10.getNextEntry();
        java.io.InputStream inputStream37 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream38 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream37);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream39 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream38);
        tarArchiveInputStream39.reset();
        boolean boolean41 = tarArchiveInputStream39.markSupported();
        java.io.OutputStream outputStream42 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream43 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream42);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream44 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream43);
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean49 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray47, 2);
        boolean boolean51 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray47, 49152);
        cpioArchiveOutputStream43.write(byteArray47, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream39, (java.io.OutputStream) cpioArchiveOutputStream43, 100);
        java.io.OutputStream outputStream57 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream58 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream57);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream59 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream58);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream60 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream59);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream62 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream60, 2048);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream39, (java.io.OutputStream) tarArchiveOutputStream62);
        tarArchiveInputStream39.reset();
        byte[] byteArray67 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean69 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray67, 2);
        boolean boolean71 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray67, (int) (byte) 10);
        boolean boolean73 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray67, 100);
        boolean boolean75 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray67, 16384);
        int int78 = tarArchiveInputStream39.read(byteArray67, 0, (int) (short) 4);
        boolean boolean80 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray67, 8192);
        int int83 = arArchiveInputStream10.read(byteArray67, (int) ' ', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream1.write(byteArray67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(arArchiveEntry34);
        org.junit.Assert.assertNull(archiveEntry35);
        org.junit.Assert.assertNull(archiveEntry36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        zipArchiveOutputStream4.closeArchiveEntry();
        zipArchiveOutputStream4.closeArchiveEntry();
        zipArchiveOutputStream4.flush();
        zipArchiveOutputStream4.setUseLanguageEncodingFlag(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream4.write((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        cpioArchiveOutputStream3.close();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream3.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream4.write((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        jarArchiveOutputStream2.closeArchiveEntry();
        jarArchiveOutputStream2.setLevel((int) (short) -1);
        jarArchiveOutputStream2.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str10 = unicodeExtraFieldPolicy9.toString();
        jarArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        jarArchiveOutputStream2.closeArchiveEntry();
        jarArchiveOutputStream2.setLevel((int) (short) -1);
        jarArchiveOutputStream2.setFallbackToUTF8(true);
        jarArchiveOutputStream2.closeArchiveEntry();
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream12 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy14);
        jarArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy14);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy14);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.write((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream21);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream23 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        jarArchiveOutputStream23.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream23);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) jarArchiveInputStream20, (java.io.OutputStream) jarArchiveOutputStream23);
        jarArchiveOutputStream23.flush();
        jarArchiveOutputStream23.setFallbackToUTF8(true);
        jarArchiveOutputStream23.setMethod(64);
        jarArchiveOutputStream23.setMethod(8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, (int) (short) 12);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        java.lang.String str5 = jarArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        jarArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.putNextEntry(zipArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "070707" + "'", str5, "070707");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        tarArchiveOutputStream15.setBufferDebug(false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        zipArchiveOutputStream4.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream4, (short) 8);
        zipArchiveOutputStream4.setMethod((int) '4');
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        java.lang.String str5 = jarArchiveOutputStream2.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.write((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "070707" + "'", str5, "070707");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        int int4 = tarArchiveOutputStream3.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.putNextEntry(tarArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 64, 512);
        java.lang.String str19 = tarArchiveOutputStream15.getName();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream21 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream21.close();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "tar" + "'", str19, "tar");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        java.lang.String str5 = jarArchiveOutputStream2.getEncoding();
        boolean boolean6 = jarArchiveOutputStream2.isSeekable();
        boolean boolean7 = jarArchiveOutputStream2.isSeekable();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "070707" + "'", str5, "070707");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        tarArchiveOutputStream5.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream7.write((int) '4');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        long long6 = tarArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        byte[] byteArray9 = new byte[] { (byte) 0 };
        boolean boolean11 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray9, 8);
        boolean boolean13 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray9, 256);
        int int16 = arArchiveInputStream7.read(byteArray9, (int) (short) 8, 256);
        java.io.OutputStream outputStream17 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream17);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream19 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean24 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray22, 2);
        boolean boolean26 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray22, 49152);
        cpioArchiveOutputStream18.write(byteArray22, 0, 0);
        int int30 = arArchiveInputStream7.read(byteArray22);
        boolean boolean32 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray22, (int) (short) 8);
        boolean boolean34 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray22, 256);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        jarArchiveOutputStream2.closeArchiveEntry();
        jarArchiveOutputStream2.setLevel((int) (short) -1);
        jarArchiveOutputStream2.closeEntry();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.write(40960);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        tarArchiveOutputStream5.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream7);
        byte[] byteArray9 = null;
        arArchiveOutputStream7.write(byteArray9, 100, 0);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        boolean boolean3 = jarArchiveOutputStream2.isSeekable();
        boolean boolean4 = jarArchiveOutputStream2.isSeekable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream21);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream23 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        jarArchiveOutputStream23.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream23);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) jarArchiveInputStream20, (java.io.OutputStream) jarArchiveOutputStream23);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream28 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream23);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        zipArchiveOutputStream4.closeArchiveEntry();
        zipArchiveOutputStream4.closeArchiveEntry();
        zipArchiveOutputStream4.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream4.setEncoding("070701");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        tarArchiveInputStream2.close();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean11 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray9, 2);
        boolean boolean13 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray9, 49152);
        int int14 = arArchiveInputStream6.read(byteArray9);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream16);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream18 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream18);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream19, 2048);
        tarArchiveOutputStream21.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream21);
        int int24 = tarArchiveOutputStream21.getRecordSize();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream15, (java.io.OutputStream) tarArchiveOutputStream21);
        int int26 = cpioArchiveInputStream15.read();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        jarArchiveOutputStream2.closeArchiveEntry();
        jarArchiveOutputStream2.setLevel((int) (short) -1);
        jarArchiveOutputStream2.setMethod((int) (byte) 0);
        java.lang.String str9 = jarArchiveOutputStream2.getEncoding();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        tarArchiveInputStream2.close();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean11 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray9, 2);
        boolean boolean13 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray9, 49152);
        int int14 = arArchiveInputStream6.read(byteArray9);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream16);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream18 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream18);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream19, 2048);
        tarArchiveOutputStream21.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream21);
        int int24 = tarArchiveOutputStream21.getRecordSize();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream15, (java.io.OutputStream) tarArchiveOutputStream21);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream15);
        java.io.InputStream inputStream27 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream28 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream27);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream28);
        tarArchiveInputStream29.reset();
        boolean boolean31 = tarArchiveInputStream29.markSupported();
        java.io.OutputStream outputStream32 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream33 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream32);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream34 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream33);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean39 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray37, 2);
        boolean boolean41 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray37, 49152);
        cpioArchiveOutputStream33.write(byteArray37, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream29, (java.io.OutputStream) cpioArchiveOutputStream33, 100);
        java.io.OutputStream outputStream47 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream48 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream47);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream49 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream48);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream50 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream49);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream50, 2048);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream29, (java.io.OutputStream) tarArchiveOutputStream52);
        byte[] byteArray58 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 10 };
        int int59 = tarArchiveInputStream29.read(byteArray58);
        // The following exception was thrown during execution in test generation
        try {
            int int62 = cpioArchiveInputStream15.read(byteArray58, 8192, 16384);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[0, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        jarArchiveOutputStream2.setMethod(40960);
        java.lang.String str8 = jarArchiveOutputStream2.getEncoding();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "070707" + "'", str8, "070707");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        long long6 = tarArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        byte[] byteArray9 = new byte[] { (byte) 0 };
        boolean boolean11 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray9, 8);
        boolean boolean13 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray9, 256);
        int int16 = arArchiveInputStream7.read(byteArray9, (int) (short) 8, 256);
        java.io.OutputStream outputStream17 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream17);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream19 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean24 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray22, 2);
        boolean boolean26 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray22, 49152);
        cpioArchiveOutputStream18.write(byteArray22, 0, 0);
        int int30 = arArchiveInputStream7.read(byteArray22);
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry31 = arArchiveInputStream7.getNextArEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry32 = arArchiveInputStream7.getNextArEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry33 = arArchiveInputStream7.getNextArEntry();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(arArchiveEntry31);
        org.junit.Assert.assertNull(arArchiveEntry32);
        org.junit.Assert.assertNull(arArchiveEntry33);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 64, 512);
        java.lang.String str19 = tarArchiveOutputStream15.getDefaultFileExtension();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream15.putNextEntry(tarArchiveEntry20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "tar" + "'", str19, "tar");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream1.close();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream21 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream23);
        tarArchiveInputStream24.mark(32);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean31 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray29, 2);
        boolean boolean33 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray29, (int) (byte) 10);
        boolean boolean35 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray29, 100);
        int int38 = tarArchiveInputStream24.read(byteArray29, (int) (short) 1, 4);
        int int39 = arArchiveInputStream21.read(byteArray29);
        long long41 = org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(byteArray29, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 2660L + "'", long41 == 2660L);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        tarArchiveOutputStream3.closeEntry();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.write((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream7);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream9, (int) 'a');
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream12);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream13);
        tarArchiveInputStream14.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream14);
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 100, (byte) 0 };
        int int23 = tarArchiveInputStream16.read(byteArray20, (int) (byte) 0, 0);
        int int26 = tarArchiveInputStream9.read(byteArray20, (int) (byte) 100, 512);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream6.write(byteArray20, (int) (short) 2, 32);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '32' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        jarArchiveOutputStream2.closeArchiveEntry();
        jarArchiveOutputStream2.setLevel((int) (short) -1);
        jarArchiveOutputStream2.setFallbackToUTF8(true);
        jarArchiveOutputStream2.closeArchiveEntry();
        jarArchiveOutputStream2.setEncoding("UTF8");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 2);
        boolean boolean9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 49152);
        cpioArchiveOutputStream1.write(byteArray5, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, (int) (short) 100, 64);
        tarArchiveOutputStream18.flush();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        cpioArchiveOutputStream1.close();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean8 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray6, 2);
        boolean boolean10 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.write(byteArray6, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        boolean boolean3 = jarArchiveOutputStream2.isSeekable();
        jarArchiveOutputStream2.setUseLanguageEncodingFlag(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.putNextEntry(zipArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2, 40960, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream10);
        tarArchiveInputStream11.reset();
        boolean boolean13 = tarArchiveInputStream11.markSupported();
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream14);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream16 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean21 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray19, 2);
        boolean boolean23 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray19, 49152);
        cpioArchiveOutputStream15.write(byteArray19, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream11, (java.io.OutputStream) cpioArchiveOutputStream15, 100);
        java.io.OutputStream outputStream29 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream30 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream29);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream31 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream30);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream31);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32, 2048);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream11, (java.io.OutputStream) tarArchiveOutputStream34);
        tarArchiveInputStream11.reset();
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean41 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray39, 2);
        boolean boolean43 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray39, (int) (byte) 10);
        boolean boolean45 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray39, 100);
        boolean boolean47 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray39, 16384);
        int int50 = tarArchiveInputStream11.read(byteArray39, 0, (int) (short) 4);
        boolean boolean52 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray39, 8192);
        int int53 = tarArchiveInputStream8.read(byteArray39);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry54 = tarArchiveInputStream8.getNextEntry();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(archiveEntry54);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream2.setBufferDebug(true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        tarArchiveInputStream7.reset();
        boolean boolean9 = tarArchiveInputStream7.markSupported();
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream12 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray15, 2);
        boolean boolean19 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray15, 49152);
        cpioArchiveOutputStream11.write(byteArray15, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream7, (java.io.OutputStream) cpioArchiveOutputStream11, 100);
        tarArchiveInputStream2.copyEntryContents((java.io.OutputStream) cpioArchiveOutputStream11);
        boolean boolean26 = tarArchiveInputStream2.markSupported();
        boolean boolean27 = tarArchiveInputStream2.markSupported();
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean32 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray30, 2);
        boolean boolean34 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray30, (int) (byte) 10);
        int int37 = tarArchiveInputStream2.read(byteArray30, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry38 = tarArchiveInputStream2.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, (int) (short) 12);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean7 = cpioArchiveEntry6.isSocket();
        long long8 = cpioArchiveEntry6.getTime();
        boolean boolean9 = cpioArchiveEntry6.isPipe();
        short short10 = cpioArchiveEntry6.getFormat();
        cpioArchiveEntry6.setSize(0L);
        cpioArchiveEntry6.setNumberOfLinks((long) 40960);
        long long15 = cpioArchiveEntry6.getSize();
        cpioArchiveEntry6.setTime((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream4.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        int int4 = tarArchiveInputStream3.available();
        tarArchiveInputStream3.reset();
        long long7 = tarArchiveInputStream3.skip((long) 8);
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream9);
        tarArchiveInputStream10.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream10);
        long long14 = tarArchiveInputStream10.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream10);
        byte[] byteArray17 = new byte[] { (byte) 0 };
        boolean boolean19 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray17, 8);
        boolean boolean21 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray17, 256);
        int int24 = arArchiveInputStream15.read(byteArray17, (int) (short) 8, 256);
        java.io.OutputStream outputStream25 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream25);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream27 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream26);
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean32 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray30, 2);
        boolean boolean34 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray30, 49152);
        cpioArchiveOutputStream26.write(byteArray30, 0, 0);
        int int38 = arArchiveInputStream15.read(byteArray30);
        int int41 = tarArchiveInputStream3.read(byteArray30, 0, 512);
        int int42 = tarArchiveInputStream3.available();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry43 = tarArchiveInputStream3.getNextTarEntry();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(tarArchiveEntry43);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2, 40960, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream9);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        jarArchiveOutputStream11.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream11.closeArchiveEntry();
        tarArchiveInputStream2.copyEntryContents((java.io.OutputStream) jarArchiveOutputStream11);
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream16);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream18 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17);
        jarArchiveOutputStream18.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream18.closeArchiveEntry();
        tarArchiveInputStream2.copyEntryContents((java.io.OutputStream) jarArchiveOutputStream18);
        jarArchiveOutputStream18.setFallbackToUTF8(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean9 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray7, 2);
        boolean boolean11 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray7, 49152);
        cpioArchiveOutputStream3.write(byteArray7, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream17, 64, 512);
        int int21 = tarArchiveOutputStream20.getRecordSize();
        tarArchiveOutputStream20.setBufferDebug(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream25 = archiveStreamFactory0.createArchiveOutputStream("070702", (java.io.OutputStream) tarArchiveOutputStream24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: 070702 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 512 + "'", int21 == 512);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int3 = tarArchiveInputStream2.getRecordSize();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        jarArchiveOutputStream6.closeArchiveEntry();
        jarArchiveOutputStream6.closeEntry();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6);
        boolean boolean11 = jarArchiveOutputStream6.isSeekable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        tarArchiveOutputStream3.setBufferDebug(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (short) 10, 1);
        java.io.OutputStream outputStream11 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream11);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream13 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean18 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray16, 2);
        boolean boolean20 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray16, 49152);
        cpioArchiveOutputStream12.write(byteArray16, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream26, 64, 512);
        int int30 = tarArchiveOutputStream29.getRecordSize();
        java.io.OutputStream outputStream31 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream32 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream31);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream33 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream32);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean38 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray36, 2);
        boolean boolean40 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray36, 49152);
        cpioArchiveOutputStream32.write(byteArray36, 0, 0);
        boolean boolean45 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray36, 8);
        boolean boolean47 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray36, 4);
        tarArchiveOutputStream29.write(byteArray36, (int) (short) 2, (int) (byte) 0);
        boolean boolean52 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray36, 40960);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream10.write(byteArray36);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 512 + "'", int30 == 512);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        java.io.OutputStream outputStream20 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream20);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream22 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream21);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23, 2048);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream25);
        java.lang.String str27 = tarArchiveOutputStream25.getDefaultFileExtension();
        int int28 = tarArchiveOutputStream25.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream25, 100);
        java.lang.String str31 = tarArchiveOutputStream30.getName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "tar" + "'", str27, "tar");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 512 + "'", int28 == 512);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "tar" + "'", str31, "tar");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        tarArchiveInputStream7.reset();
        boolean boolean9 = tarArchiveInputStream7.markSupported();
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream12 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray15, 2);
        boolean boolean19 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray15, 49152);
        cpioArchiveOutputStream11.write(byteArray15, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream7, (java.io.OutputStream) cpioArchiveOutputStream11, 100);
        tarArchiveInputStream2.copyEntryContents((java.io.OutputStream) cpioArchiveOutputStream11);
        boolean boolean26 = tarArchiveInputStream2.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry4.setTime((long) (byte) 1);
        long long7 = cpioArchiveEntry4.getMode();
        boolean boolean8 = cpioArchiveEntry4.isBlockDevice();
        long long9 = cpioArchiveEntry4.getSize();
        long long10 = cpioArchiveEntry4.getRemoteDeviceMin();
        long long11 = cpioArchiveEntry4.getNumberOfLinks();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.putNextEntry(cpioArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        zipArchiveOutputStream4.closeArchiveEntry();
        zipArchiveOutputStream4.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream4.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        boolean boolean4 = tarArchiveInputStream2.markSupported();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 2);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 49152);
        cpioArchiveOutputStream6.write(byteArray10, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) cpioArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream21);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream23 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        jarArchiveOutputStream23.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream23);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) jarArchiveInputStream20, (java.io.OutputStream) jarArchiveOutputStream23);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry28 = jarArchiveInputStream20.getNextEntry();
        byte[] byteArray30 = new byte[] { (byte) 0 };
        boolean boolean32 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray30, 8);
        boolean boolean34 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray30, 256);
        int int35 = jarArchiveInputStream20.read(byteArray30);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry36 = jarArchiveInputStream20.getNextJarEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry37 = jarArchiveInputStream20.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry38 = jarArchiveInputStream20.getNextEntry();
        int int39 = jarArchiveInputStream20.read();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(archiveEntry28);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(jarArchiveEntry36);
        org.junit.Assert.assertNull(archiveEntry37);
        org.junit.Assert.assertNull(archiveEntry38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream3.setBufferDebug(false);
        tarArchiveOutputStream3.finish();
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
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 2048);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream3.setBufferDebug(false);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream9.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.write((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream3);
        tarArchiveInputStream4.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        long long8 = tarArchiveInputStream4.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        byte[] byteArray11 = new byte[] { (byte) 0 };
        boolean boolean13 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray11, 8);
        boolean boolean15 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray11, 256);
        int int18 = arArchiveInputStream9.read(byteArray11, (int) (short) 8, 256);
        java.io.OutputStream outputStream19 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream19);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream21 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean26 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray24, 2);
        boolean boolean28 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray24, 49152);
        cpioArchiveOutputStream20.write(byteArray24, 0, 0);
        int int32 = arArchiveInputStream9.read(byteArray24);
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry33 = arArchiveInputStream9.getNextArEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry34 = arArchiveInputStream9.getNextArEntry();
        java.io.InputStream inputStream35 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream36 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream35);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream36);
        tarArchiveInputStream37.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream40 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream37);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry41 = zipArchiveInputStream40.getNextEntry();
        int int42 = zipArchiveInputStream40.read();
        java.io.InputStream inputStream43 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream44 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream43);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream45 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream44);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream47 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream45, (int) 'a');
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream48 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream45);
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean53 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray51, 2);
        boolean boolean55 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray51, (int) (byte) 10);
        boolean boolean57 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray51, 100);
        int int60 = tarArchiveInputStream45.read(byteArray51, 0, (int) (short) -1);
        int int61 = zipArchiveInputStream40.read(byteArray51);
        int int62 = arArchiveInputStream9.read(byteArray51);
        // The following exception was thrown during execution in test generation
        try {
            int int65 = arArchiveInputStream1.read(byteArray51, (int) (short) 0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(arArchiveEntry33);
        org.junit.Assert.assertNull(arArchiveEntry34);
        org.junit.Assert.assertNull(archiveEntry41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        zipArchiveOutputStream4.closeArchiveEntry();
        zipArchiveOutputStream4.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream4);
        tarArchiveOutputStream7.flush();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream7.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        jarArchiveOutputStream2.closeArchiveEntry();
        jarArchiveOutputStream2.closeArchiveEntry();
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream3);
        tarArchiveInputStream4.reset();
        boolean boolean6 = tarArchiveInputStream4.markSupported();
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream7);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream9 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream8);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean14 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray12, 2);
        boolean boolean16 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray12, 49152);
        cpioArchiveOutputStream8.write(byteArray12, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream4, (java.io.OutputStream) cpioArchiveOutputStream8, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream22 = archiveStreamFactory0.createArchiveInputStream("org.apache.commons.compress.archivers.ArchiveException: always", (java.io.InputStream) tarArchiveInputStream4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: org.apache.commons.compress.archivers.ArchiveException: always not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        jarArchiveOutputStream2.setMethod(0);
        java.lang.String str6 = jarArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        long long3 = arArchiveInputStream1.skip((long) (-1));
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        tarArchiveInputStream6.reset();
        boolean boolean8 = tarArchiveInputStream6.markSupported();
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream9);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean16 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray14, 2);
        boolean boolean18 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray14, 49152);
        cpioArchiveOutputStream10.write(byteArray14, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream6, (java.io.OutputStream) cpioArchiveOutputStream10, 100);
        java.io.OutputStream outputStream24 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream24);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream26 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream25);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream26);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream27, 2048);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream29);
        tarArchiveInputStream6.reset();
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean36 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray34, 2);
        boolean boolean38 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray34, (int) (byte) 10);
        boolean boolean40 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray34, 100);
        boolean boolean42 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray34, 16384);
        int int45 = tarArchiveInputStream6.read(byteArray34, 0, (int) (short) 4);
        java.io.InputStream inputStream46 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream47 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream46);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream48 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream47);
        tarArchiveInputStream48.reset();
        boolean boolean50 = tarArchiveInputStream48.markSupported();
        java.io.OutputStream outputStream51 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream52 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream51);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream53 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream52);
        byte[] byteArray56 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean58 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray56, 2);
        boolean boolean60 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray56, 49152);
        cpioArchiveOutputStream52.write(byteArray56, 0, 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream48, (java.io.OutputStream) cpioArchiveOutputStream52, 100);
        java.io.OutputStream outputStream66 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream67 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream66);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream68 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream67);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream69 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream68);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream71 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream69, 2048);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream48, (java.io.OutputStream) tarArchiveOutputStream71);
        byte[] byteArray77 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 10 };
        int int78 = tarArchiveInputStream48.read(byteArray77);
        boolean boolean80 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray77, 0);
        int int83 = tarArchiveInputStream6.read(byteArray77, 32768, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int86 = arArchiveInputStream1.read(byteArray77, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[0, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.setEncoding("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        arArchiveOutputStream6.closeArchiveEntry();
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream10);
        tarArchiveInputStream11.close();
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray15, 2);
        boolean boolean19 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray15, (int) (byte) 10);
        int int20 = tarArchiveInputStream11.read(byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream6.write(byteArray15, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        tarArchiveInputStream2.close();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean11 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray9, 2);
        boolean boolean13 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray9, 49152);
        int int14 = arArchiveInputStream6.read(byteArray9);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream15);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream16);
        tarArchiveInputStream17.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream17);
        long long21 = tarArchiveInputStream17.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream22 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream17);
        byte[] byteArray24 = new byte[] { (byte) 0 };
        boolean boolean26 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray24, 8);
        boolean boolean28 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray24, 256);
        int int31 = arArchiveInputStream22.read(byteArray24, (int) (short) 8, 256);
        java.io.OutputStream outputStream32 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream33 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream32);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream34 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream33);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean39 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray37, 2);
        boolean boolean41 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray37, 49152);
        cpioArchiveOutputStream33.write(byteArray37, 0, 0);
        int int45 = arArchiveInputStream22.read(byteArray37);
        int int48 = arArchiveInputStream6.read(byteArray37, 10, 2);
        java.io.OutputStream outputStream49 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream50 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream49);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream51 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream50);
        byte[] byteArray54 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean56 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray54, 2);
        boolean boolean58 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray54, 49152);
        cpioArchiveOutputStream50.write(byteArray54, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream64 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream50, 0, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream67 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream64, 64, 512);
        int int68 = tarArchiveOutputStream67.getRecordSize();
        java.io.OutputStream outputStream69 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream70 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream69);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream71 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream70);
        byte[] byteArray74 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean76 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray74, 2);
        boolean boolean78 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray74, 49152);
        cpioArchiveOutputStream70.write(byteArray74, 0, 0);
        boolean boolean83 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray74, 8);
        boolean boolean85 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray74, 4);
        tarArchiveOutputStream67.write(byteArray74, (int) (short) 2, (int) (byte) 0);
        int int89 = arArchiveInputStream6.read(byteArray74);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 512 + "'", int68 == 512);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
    }
}


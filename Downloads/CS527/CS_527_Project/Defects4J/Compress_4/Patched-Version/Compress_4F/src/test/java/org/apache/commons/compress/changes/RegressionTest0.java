package org.apache.commons.compress.changes;

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
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.flush();
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
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = tarArchiveOutputStream2.createArchiveEntry(file3, "");
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
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.write(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, 0]");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(file0);
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
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.write(byteArray5, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '97' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, 0]");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 2048, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.putArchiveEntry(archiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.setLevel(420);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 420");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField10 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray11 = asiExtraField10.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.write(byteArray11, 30062, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        java.lang.String str6 = zipArchiveOutputStream3.getEncoding();
        zipArchiveOutputStream3.setComment("not encodeable");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.write((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream3.setComment("");
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = zipArchiveOutputStream3.createArchiveEntry(file11, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        boolean boolean13 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray11, (int) (short) 1);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray11, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("hi!", byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.write(byteArray11, (int) (short) 2, 29127);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '29127' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, -1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream9.putArchiveEntry(archiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream3.setComment("");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.write((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        java.io.File file21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry23 = tarArchiveOutputStream2.createArchiveEntry(file21, "not encodeable");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        java.lang.String str6 = zipArchiveOutputStream3.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream3.setComment("");
        java.lang.String str11 = zipArchiveOutputStream3.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.putArchiveEntry(archiveEntry5);
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
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream3.setComment("");
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = zipArchiveOutputStream3.createArchiveEntry(file11, "not encodeable");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        int int5 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.putArchiveEntry(archiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        java.lang.String str4 = zipArchiveOutputStream3.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray1 = asiExtraField0.getLocalFileDataData();
        int int2 = asiExtraField0.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = asiExtraField0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField5 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj6 = asiExtraField5.clone();
        int int7 = asiExtraField5.getGroupId();
        boolean boolean8 = zipShort3.equals((java.lang.Object) asiExtraField5);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        zipArchiveOutputStream12.closeArchiveEntry();
        boolean boolean14 = zipShort3.equals((java.lang.Object) zipArchiveOutputStream12);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField15 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray16 = asiExtraField15.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort17 = asiExtraField15.getHeaderId();
        byte[] byteArray18 = asiExtraField15.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.write(byteArray18, 493, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.write(10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        int int5 = tarArchiveOutputStream2.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.putArchiveEntry(archiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream3.setEncoding("UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream12, (int) 'a');
        tarArchiveInputStream14.reset();
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (short) 10);
        int int18 = tarArchiveInputStream14.read(byteArray17);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream14);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = zipArchiveInputStream19.getNextZipEntry();
        byte[] byteArray23 = new byte[] { (byte) 100, (byte) -1 };
        int int26 = zipArchiveInputStream19.read(byteArray23, 32768, 0);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.write(byteArray23, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry20);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[100, -1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str10 = unicodeExtraFieldPolicy9.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        boolean boolean12 = zipArchiveOutputStream3.isSeekable();
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveOutputStream3.createArchiveEntry(file10, "not encodeable");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.putArchiveEntry(archiveEntry4);
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
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str10 = unicodeExtraFieldPolicy9.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 10);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream13.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.putArchiveEntry(archiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        java.lang.String str4 = zipArchiveOutputStream3.getEncoding();
        zipArchiveOutputStream3.setComment("org.apache.commons.compress.archivers.ArchiveException: not encodeable");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.putArchiveEntry(archiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream12, (int) '4');
        tarArchiveOutputStream14.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField18 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj19 = asiExtraField18.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField20 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField21 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj22 = asiExtraField21.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField23 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField24 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField25 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray26 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField18, asiExtraField20, asiExtraField21, asiExtraField23, asiExtraField24, asiExtraField25 };
        byte[] byteArray27 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray26);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField28 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray27);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField29 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray27);
        tarArchiveOutputStream14.write(byteArray27, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.write(byteArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(zipExtraFieldArray26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream3.setComment("");
        java.lang.String str11 = zipArchiveOutputStream3.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.write(32768);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        tarArchiveOutputStream2.setLongFileMode(3);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray1 = asiExtraField0.getLocalFileDataData();
        int int2 = asiExtraField0.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = asiExtraField0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField5 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj6 = asiExtraField5.clone();
        int int7 = asiExtraField5.getGroupId();
        boolean boolean8 = zipShort3.equals((java.lang.Object) asiExtraField5);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        zipArchiveOutputStream12.closeArchiveEntry();
        boolean boolean14 = zipShort3.equals((java.lang.Object) zipArchiveOutputStream12);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.setLevel(26742);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 26742");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 10);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        tarArchiveOutputStream2.setLongFileMode(3);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        java.lang.String str6 = zipArchiveOutputStream3.getEncoding();
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream7, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        zipArchiveOutputStream10.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str14 = unicodeExtraFieldPolicy13.toString();
        zipArchiveOutputStream10.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy13);
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy13);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "not encodeable" + "'", str14, "not encodeable");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.io.File file14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = arArchiveOutputStream13.createArchiveEntry(file14, "070701");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField14 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray15 = asiExtraField14.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = asiExtraField14.getHeaderId();
        byte[] byteArray17 = asiExtraField14.getCentralDirectoryData();
        byte[] byteArray18 = asiExtraField14.getLocalFileDataData();
        byte[] byteArray19 = asiExtraField14.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream13.write(byteArray19, 24576, 512);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        zipArchiveOutputStream3.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.setEncoding("not encodeable");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: not encodeable");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream13.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archives contains unclosed entries.");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (int) (short) 12, 2);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream16.putArchiveEntry(archiveEntry17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = asiExtraField6.getHeaderId();
        int int8 = zipShort7.getValue();
        int int9 = zipShort7.getValue();
        int int10 = zipShort7.getValue();
        byte[] byteArray11 = zipShort7.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.write(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30062 + "'", int8 == 30062);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 30062 + "'", int9 == 30062);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 30062 + "'", int10 == 30062);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[110, 117]");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        boolean boolean28 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray26, (int) (short) 1);
        long long29 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray26);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.write(byteArray26, (int) (byte) 100, (int) (short) 2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, -1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 130816L + "'", long29 == 130816L);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.io.File file14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = arArchiveOutputStream13.createArchiveEntry(file14, "org.apache.commons.compress.archivers.ArchiveException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str10 = unicodeExtraFieldPolicy9.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.setEncoding("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (int) (short) 12, 2);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField17 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray18 = asiExtraField17.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort19 = asiExtraField17.getHeaderId();
        byte[] byteArray20 = asiExtraField17.getCentralDirectoryData();
        byte[] byteArray21 = asiExtraField17.getLocalFileDataData();
        byte[] byteArray22 = asiExtraField17.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.write(byteArray22, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setComment("not encodeable");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 36864);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, (int) 'a');
        tarArchiveInputStream11.reset();
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (short) 10);
        int int15 = tarArchiveInputStream11.read(byteArray14);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream11);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = zipArchiveInputStream16.getNextZipEntry();
        long long19 = zipArchiveInputStream16.skip(0L);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField20 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj21 = asiExtraField20.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField22 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField23 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj24 = asiExtraField23.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField25 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField26 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField27 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray28 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField20, asiExtraField22, asiExtraField23, asiExtraField25, asiExtraField26, asiExtraField27 };
        byte[] byteArray29 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray28);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong30 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray29);
        byte[] byteArray31 = zipLong30.getBytes();
        int int34 = zipArchiveInputStream16.read(byteArray31, (int) (short) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream8.write(byteArray31, 16, 29127);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '29127' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(zipExtraFieldArray28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[110, 117, 14, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream22.write((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        tarArchiveOutputStream2.setLongFileMode(0);
        int int25 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry26 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.putArchiveEntry(archiveEntry26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 36864);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream8.putArchiveEntry(archiveEntry9);
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
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (int) (short) 12, 2);
        byte[] byteArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.write(byteArray17, 49152, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) 'a');
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        int int9 = tarArchiveInputStream2.read(byteArray8);
        int int10 = tarArchiveInputStream2.available();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream12, (int) '4');
        tarArchiveOutputStream14.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField18 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj19 = asiExtraField18.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField20 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField21 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj22 = asiExtraField21.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField23 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField24 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField25 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray26 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField18, asiExtraField20, asiExtraField21, asiExtraField23, asiExtraField24, asiExtraField25 };
        byte[] byteArray27 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray26);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField28 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray27);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField29 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray27);
        tarArchiveOutputStream14.write(byteArray27, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort33 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray27);
        int int36 = tarArchiveInputStream2.read(byteArray27, 16384, 0);
        int int38 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray27, 2);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 100, 0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(zipExtraFieldArray26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 14 + "'", int38 == 14);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream13.putArchiveEntry(archiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 36864);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream8.putArchiveEntry(archiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 10);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (int) (short) 12, 2);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream16.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("org.apache.commons.compress.archivers.ArchiveException: not encodeable");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream15.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream22.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        java.lang.String str4 = zipArchiveOutputStream3.getEncoding();
        zipArchiveOutputStream3.closeArchiveEntry();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream13);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream13.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archives contains unclosed entries.");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        tarArchiveOutputStream2.setLongFileMode(3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        java.io.File file24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry26 = tarArchiveOutputStream2.createArchiveEntry(file24, "org.apache.commons.compress.archivers.ArchiveException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        zipArchiveOutputStream3.setMethod(100);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime13 = zipArchiveEntry12.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime16 = zipArchiveEntry15.getLastAccessTime();
        long long17 = zipArchiveEntry15.getSize();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField18 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort19 = asiExtraField18.getHeaderId();
        byte[] byteArray20 = asiExtraField18.getLocalFileDataData();
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        boolean boolean29 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray27, (int) (short) 1);
        boolean boolean31 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray27, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField32 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("hi!", byteArray27);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort33 = unicodeCommentExtraField32.getHeaderId();
        byte[] byteArray34 = unicodeCommentExtraField32.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField35 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray36 = asiExtraField35.getLocalFileDataData();
        int int37 = asiExtraField35.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort38 = asiExtraField35.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField39 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort38);
        byte[] byteArray40 = zipExtraField39.getLocalFileDataData();
        byte[] byteArray41 = zipExtraField39.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray42 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField18, unicodeCommentExtraField32, zipExtraField39 };
        zipArchiveEntry15.setExtraFields(zipExtraFieldArray42);
        zipArchiveEntry12.setExtraFields(zipExtraFieldArray42);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream10.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNull(fileTime13);
        org.junit.Assert.assertNull(fileTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(zipShort19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, -1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(zipShort33);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1, 77, -85, -30, 110, 104, 105, 33]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(zipShort38);
        org.junit.Assert.assertNotNull(zipExtraField39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray42);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray1 = asiExtraField0.getLocalFileDataData();
        int int2 = asiExtraField0.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = asiExtraField0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField5 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj6 = asiExtraField5.clone();
        int int7 = asiExtraField5.getGroupId();
        boolean boolean8 = zipShort3.equals((java.lang.Object) asiExtraField5);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        zipArchiveOutputStream12.closeArchiveEntry();
        boolean boolean14 = zipShort3.equals((java.lang.Object) zipArchiveOutputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream12);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream15.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 36864);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream8.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.close();
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
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 10);
        int int14 = tarArchiveOutputStream13.getRecordSize();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream13);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime17 = zipArchiveEntry16.getLastAccessTime();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream13.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
        org.junit.Assert.assertNull(fileTime17);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry4.getLastAccessTime();
        long long6 = zipArchiveEntry4.getSize();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField7 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = asiExtraField7.getHeaderId();
        byte[] byteArray9 = asiExtraField7.getLocalFileDataData();
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        boolean boolean18 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray16, (int) (short) 1);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray16, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField21 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("hi!", byteArray16);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort22 = unicodeCommentExtraField21.getHeaderId();
        byte[] byteArray23 = unicodeCommentExtraField21.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField24 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray25 = asiExtraField24.getLocalFileDataData();
        int int26 = asiExtraField24.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort27 = asiExtraField24.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField28 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort27);
        byte[] byteArray29 = zipExtraField28.getLocalFileDataData();
        byte[] byteArray30 = zipExtraField28.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray31 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField7, unicodeCommentExtraField21, zipExtraField28 };
        zipArchiveEntry4.setExtraFields(zipExtraFieldArray31);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray31);
        java.io.OutputStream outputStream34 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream34, (int) '4');
        tarArchiveOutputStream36.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField40 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj41 = asiExtraField40.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField42 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField43 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj44 = asiExtraField43.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField45 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField46 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField47 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray48 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField40, asiExtraField42, asiExtraField43, asiExtraField45, asiExtraField46, asiExtraField47 };
        byte[] byteArray49 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray48);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField50 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray49);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField51 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray49);
        tarArchiveOutputStream36.write(byteArray49, 0, (int) (byte) 0);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray49);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.setMethod((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid compression method");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, -1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(zipShort22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 77, -85, -30, 110, 104, 105, 33]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(zipShort27);
        org.junit.Assert.assertNotNull(zipExtraField28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray31);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(zipExtraFieldArray48);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str10 = unicodeExtraFieldPolicy9.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        zipArchiveOutputStream3.setFallbackToUTF8(false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream13);
        java.io.File file15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = cpioArchiveOutputStream14.createArchiveEntry(file15, "org.apache.commons.compress.archivers.ArchiveException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream13);
        java.io.File file15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = cpioArchiveOutputStream14.createArchiveEntry(file15, "org.apache.commons.compress.archivers.ArchiveException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        int int23 = tarArchiveOutputStream22.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream13.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) 'a', (int) '#');
        tarArchiveOutputStream3.closeArchiveEntry();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime15 = zipArchiveEntry14.getLastAccessTime();
        long long16 = zipArchiveEntry14.getSize();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid compression method");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
        org.junit.Assert.assertNull(fileTime15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 36864);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.flush();
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
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime26 = zipArchiveEntry25.getLastAccessTime();
        java.io.InputStream inputStream27 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream27, (int) 'a');
        tarArchiveInputStream29.reset();
        byte[] byteArray32 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (short) 10);
        int int33 = tarArchiveInputStream29.read(byteArray32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream34 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream29);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry35 = zipArchiveInputStream34.getNextZipEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream36 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream34);
        boolean boolean37 = cpioArchiveInputStream36.markSupported();
        boolean boolean38 = zipArchiveEntry25.equals((java.lang.Object) cpioArchiveInputStream36);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream23.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNull(fileTime26);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream10.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archives contains unclosed entries.");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime16 = zipArchiveEntry15.getLastAccessTime();
        long long17 = zipArchiveEntry15.getSize();
        byte[] byteArray18 = zipArchiveEntry15.getLocalFileDataExtra();
        long long19 = zipArchiveEntry15.getSize();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream13.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
        org.junit.Assert.assertNull(fileTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream13);
        java.io.File file15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = arArchiveOutputStream13.createArchiveEntry(file15, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.setLevel(32868);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 32868");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = zipArchiveOutputStream3.createArchiveEntry(file7, "UTF8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        boolean boolean7 = zipArchiveOutputStream3.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry4.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime8 = zipArchiveEntry7.getLastAccessTime();
        long long9 = zipArchiveEntry7.getSize();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField10 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = asiExtraField10.getHeaderId();
        byte[] byteArray12 = asiExtraField10.getLocalFileDataData();
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        boolean boolean21 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray19, (int) (short) 1);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray19, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField24 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("hi!", byteArray19);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort25 = unicodeCommentExtraField24.getHeaderId();
        byte[] byteArray26 = unicodeCommentExtraField24.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField27 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray28 = asiExtraField27.getLocalFileDataData();
        int int29 = asiExtraField27.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort30 = asiExtraField27.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField31 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort30);
        byte[] byteArray32 = zipExtraField31.getLocalFileDataData();
        byte[] byteArray33 = zipExtraField31.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray34 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField10, unicodeCommentExtraField24, zipExtraField31 };
        zipArchiveEntry7.setExtraFields(zipExtraFieldArray34);
        zipArchiveEntry4.setExtraFields(zipExtraFieldArray34);
        byte[] byteArray37 = zipArchiveEntry4.getCentralDirectoryExtra();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertNull(fileTime8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, -1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zipShort25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, 77, -85, -30, 110, 104, 105, 33]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(zipShort30);
        org.junit.Assert.assertNotNull(zipExtraField31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray34);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 117, 99, 8, 0, 1, 77, -85, -30, 110, 104, 105, 33]");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) 'a', (int) '#');
        tarArchiveOutputStream3.closeArchiveEntry();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        tarArchiveOutputStream2.setLongFileMode(0);
        int int25 = tarArchiveOutputStream2.getRecordSize();
        tarArchiveOutputStream2.closeArchiveEntry();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream3.setComment("");
        java.lang.String str11 = zipArchiveOutputStream3.getEncoding();
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream12, (int) 'a');
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        int int21 = tarArchiveInputStream14.read(byteArray20);
        tarArchiveInputStream14.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream14);
        long long25 = tarArchiveInputStream14.skip((long) (short) 100);
        byte[] byteArray32 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        boolean boolean34 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray32, (int) (short) 1);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray32, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField37 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("hi!", byteArray32);
        int int40 = tarArchiveInputStream14.read(byteArray32, (int) (short) -1, 512);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.write(byteArray32, (int) '#', (int) (short) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 100, 0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0, -1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream13);
        arArchiveOutputStream13.closeArchiveEntry();
        arArchiveOutputStream13.finish();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream23.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray15, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream9.write(byteArray15, 32768, 61440);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, -1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream3.setComment("");
        zipArchiveOutputStream3.setComment("070702");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray14 = asiExtraField13.getLocalFileDataData();
        int int15 = asiExtraField13.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = asiExtraField13.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField17 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort16);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField18 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj19 = asiExtraField18.clone();
        int int20 = asiExtraField18.getGroupId();
        boolean boolean21 = zipShort16.equals((java.lang.Object) asiExtraField18);
        java.io.OutputStream outputStream22 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream22, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream24);
        zipArchiveOutputStream25.closeArchiveEntry();
        boolean boolean27 = zipShort16.equals((java.lang.Object) zipArchiveOutputStream25);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream25);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy29 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        zipArchiveOutputStream28.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy29);
        java.lang.String str31 = unicodeExtraFieldPolicy29.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy29);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(zipExtraField17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "not encodeable" + "'", str31, "not encodeable");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) 'a');
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        int int9 = tarArchiveInputStream2.read(byteArray8);
        int int10 = tarArchiveInputStream2.available();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream12, (int) '4');
        tarArchiveOutputStream14.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField18 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj19 = asiExtraField18.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField20 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField21 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj22 = asiExtraField21.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField23 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField24 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField25 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray26 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField18, asiExtraField20, asiExtraField21, asiExtraField23, asiExtraField24, asiExtraField25 };
        byte[] byteArray27 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray26);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField28 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray27);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField29 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray27);
        tarArchiveOutputStream14.write(byteArray27, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort33 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray27);
        int int36 = tarArchiveInputStream2.read(byteArray27, 16384, 0);
        tarArchiveInputStream2.close();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 100, 0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(zipExtraFieldArray26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        tarArchiveOutputStream2.setLongFileMode(51966);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        boolean boolean16 = zipArchiveOutputStream3.isSeekable();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream14.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream13);
        arArchiveOutputStream13.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream13, (int) (byte) 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream13);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime17 = zipArchiveEntry16.getLastAccessTime();
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream18, (int) 'a');
        tarArchiveInputStream20.reset();
        byte[] byteArray23 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (short) 10);
        int int24 = tarArchiveInputStream20.read(byteArray23);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream20);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = zipArchiveInputStream25.getNextZipEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream25);
        boolean boolean28 = cpioArchiveInputStream27.markSupported();
        boolean boolean29 = zipArchiveEntry16.equals((java.lang.Object) cpioArchiveInputStream27);
        long long30 = zipArchiveEntry16.getCompressedSize();
        long long31 = zipArchiveEntry16.getTime();
        int int32 = zipArchiveEntry16.getPlatform();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream14.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
        org.junit.Assert.assertNull(fileTime17);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        java.lang.String str6 = zipArchiveOutputStream3.getEncoding();
        zipArchiveOutputStream3.setComment("not encodeable");
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        zipArchiveOutputStream12.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str16 = unicodeExtraFieldPolicy15.toString();
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy18 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str19 = unicodeExtraFieldPolicy18.toString();
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime24 = zipArchiveEntry23.getLastAccessTime();
        long long25 = zipArchiveEntry23.getSize();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField26 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort27 = asiExtraField26.getHeaderId();
        byte[] byteArray28 = asiExtraField26.getLocalFileDataData();
        byte[] byteArray35 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        boolean boolean37 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray35, (int) (short) 1);
        boolean boolean39 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray35, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField40 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("hi!", byteArray35);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort41 = unicodeCommentExtraField40.getHeaderId();
        byte[] byteArray42 = unicodeCommentExtraField40.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField43 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray44 = asiExtraField43.getLocalFileDataData();
        int int45 = asiExtraField43.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort46 = asiExtraField43.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField47 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort46);
        byte[] byteArray48 = zipExtraField47.getLocalFileDataData();
        byte[] byteArray49 = zipExtraField47.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray50 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField26, unicodeCommentExtraField40, zipExtraField47 };
        zipArchiveEntry23.setExtraFields(zipExtraFieldArray50);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid compression method");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "not encodeable" + "'", str16, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "not encodeable" + "'", str19, "not encodeable");
        org.junit.Assert.assertNull(fileTime24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(zipShort27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0, -1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(zipShort41);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, 77, -85, -30, 110, 104, 105, 33]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(zipShort46);
        org.junit.Assert.assertNotNull(zipExtraField47);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray50);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        tarArchiveOutputStream22.setLongFileMode(61440);
        tarArchiveOutputStream22.closeArchiveEntry();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream13);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream14.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.closeArchiveEntry();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime12 = zipArchiveEntry11.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime15 = zipArchiveEntry14.getLastAccessTime();
        long long16 = zipArchiveEntry14.getSize();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField17 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort18 = asiExtraField17.getHeaderId();
        byte[] byteArray19 = asiExtraField17.getLocalFileDataData();
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        boolean boolean28 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray26, (int) (short) 1);
        boolean boolean30 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray26, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField31 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("hi!", byteArray26);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort32 = unicodeCommentExtraField31.getHeaderId();
        byte[] byteArray33 = unicodeCommentExtraField31.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField34 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray35 = asiExtraField34.getLocalFileDataData();
        int int36 = asiExtraField34.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort37 = asiExtraField34.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField38 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort37);
        byte[] byteArray39 = zipExtraField38.getLocalFileDataData();
        byte[] byteArray40 = zipExtraField38.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray41 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField17, unicodeCommentExtraField31, zipExtraField38 };
        zipArchiveEntry14.setExtraFields(zipExtraFieldArray41);
        zipArchiveEntry11.setExtraFields(zipExtraFieldArray41);
        java.io.OutputStream outputStream44 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream46 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream44, (int) '4');
        tarArchiveOutputStream46.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField50 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj51 = asiExtraField50.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField52 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField53 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj54 = asiExtraField53.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField55 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField56 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField57 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray58 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField50, asiExtraField52, asiExtraField53, asiExtraField55, asiExtraField56, asiExtraField57 };
        byte[] byteArray59 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray58);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField60 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray59);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField61 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray59);
        tarArchiveOutputStream46.write(byteArray59, 0, (int) (byte) 0);
        zipArchiveEntry11.setCentralDirectoryExtra(byteArray59);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream9.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNull(fileTime12);
        org.junit.Assert.assertNull(fileTime15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(zipShort18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, -1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(zipShort32);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1, 77, -85, -30, 110, 104, 105, 33]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(zipShort37);
        org.junit.Assert.assertNotNull(zipExtraField38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray41);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(zipExtraFieldArray58);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 10);
        java.lang.String str14 = zipArchiveOutputStream3.getEncoding();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF8" + "'", str14, "UTF8");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.io.File file16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = zipArchiveOutputStream15.createArchiveEntry(file16, "org.apache.commons.compress.archivers.ArchiveException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        java.lang.String str9 = unicodeExtraFieldPolicy6.toString();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "not encodeable" + "'", str9, "not encodeable");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream10.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField1 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj2 = asiExtraField1.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField3 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField4 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj5 = asiExtraField4.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField7 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField1, asiExtraField3, asiExtraField4, asiExtraField6, asiExtraField7, asiExtraField8 };
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray9);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField11 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray10);
        unicodePathExtraField11.setNameCRC32((long) (short) 2);
        byte[] byteArray14 = unicodePathExtraField11.getCentralDirectoryData();
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream15, (int) 'a');
        tarArchiveInputStream17.close();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream19 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream17);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry20 = jarArchiveInputStream19.getNextJarEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry21 = jarArchiveInputStream19.getNextJarEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry22 = jarArchiveInputStream19.getNextJarEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) jarArchiveInputStream19);
        java.io.OutputStream outputStream24 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream24, (int) '4');
        tarArchiveOutputStream26.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField30 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj31 = asiExtraField30.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField32 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField33 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj34 = asiExtraField33.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField35 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField36 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField37 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray38 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField30, asiExtraField32, asiExtraField33, asiExtraField35, asiExtraField36, asiExtraField37 };
        byte[] byteArray39 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray38);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField40 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray39);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField41 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray39);
        tarArchiveOutputStream26.write(byteArray39, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort45 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray39);
        boolean boolean47 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray39, (int) (byte) 1);
        int int50 = jarArchiveInputStream19.read(byteArray39, (int) (byte) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            unicodePathExtraField11.parseFromCentralDirectoryData(byteArray39, (int) (short) 4, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: UniCode path extra data must have at least 5 bytes.");
        } catch (java.util.zip.ZipException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 2, 0, 0, 0]");
        org.junit.Assert.assertNull(jarArchiveEntry20);
        org.junit.Assert.assertNull(jarArchiveEntry21);
        org.junit.Assert.assertNull(jarArchiveEntry22);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(zipExtraFieldArray38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        java.lang.String str13 = unicodeExtraFieldPolicy10.toString();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "not encodeable" + "'", str13, "not encodeable");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.setLongFileMode((int) (byte) 10);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray1 = asiExtraField0.getLocalFileDataData();
        int int2 = asiExtraField0.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = asiExtraField0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField5 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj6 = asiExtraField5.clone();
        int int7 = asiExtraField5.getGroupId();
        boolean boolean8 = zipShort3.equals((java.lang.Object) asiExtraField5);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        zipArchiveOutputStream12.closeArchiveEntry();
        boolean boolean14 = zipShort3.equals((java.lang.Object) zipArchiveOutputStream12);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.setEncoding("org.apache.commons.compress.archivers.ArchiveException: UTF8");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: org.apache.commons.compress.archivers.ArchiveException: UTF8");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        boolean boolean10 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray8, (int) (short) 1);
        long long11 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray8, (int) (short) 10, 24576);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, -1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 130816L + "'", long11 == 130816L);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField23 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray24 = asiExtraField23.getCentralDirectoryData();
        byte[] byteArray25 = asiExtraField23.getLocalFileDataData();
        tarArchiveOutputStream22.write(byteArray25, 0, 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        tarArchiveOutputStream2.setLongFileMode(0);
        int int25 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream26 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
    }
}


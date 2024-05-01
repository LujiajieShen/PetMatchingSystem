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
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
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
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        zipArchiveOutputStream3.closeArchiveEntry();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
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
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
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
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream3.setComment("");
        java.lang.String str11 = zipArchiveOutputStream3.getEncoding();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
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
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13, (int) '4');
        tarArchiveOutputStream15.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField19 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj20 = asiExtraField19.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField21 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField22 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj23 = asiExtraField22.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField24 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField25 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField26 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray27 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField19, asiExtraField21, asiExtraField22, asiExtraField24, asiExtraField25, asiExtraField26 };
        byte[] byteArray28 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray27);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField29 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray28);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField30 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray28);
        tarArchiveOutputStream15.write(byteArray28, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.write(byteArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(zipExtraFieldArray27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.write(1024);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
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
        org.apache.commons.compress.archivers.zip.ZipShort zipShort21 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray15);
        java.lang.Object obj22 = zipShort21.clone();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
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
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream14, (int) 'a');
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        int int23 = tarArchiveInputStream16.read(byteArray22);
        tarArchiveInputStream16.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream16);
        long long27 = tarArchiveInputStream16.skip((long) (short) 100);
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        boolean boolean36 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray34, (int) (short) 1);
        boolean boolean38 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray34, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField39 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("hi!", byteArray34);
        int int42 = tarArchiveInputStream16.read(byteArray34, (int) (short) -1, 512);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.write(byteArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 100, 0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0, -1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = arArchiveOutputStream5.createArchiveEntry(file6, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
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
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
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
        java.io.File file16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = zipArchiveOutputStream12.createArchiveEntry(file16, "not encodeable");
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
        zipArchiveOutputStream3.setComment("");
        java.lang.String str11 = zipArchiveOutputStream3.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
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
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (int) (short) 12, 2);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
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
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort3);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(zipExtraField15);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
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
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField10 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj11 = asiExtraField10.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj14 = asiExtraField13.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField15 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField16 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField17 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray18 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField10, asiExtraField12, asiExtraField13, asiExtraField15, asiExtraField16, asiExtraField17 };
        byte[] byteArray19 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray18);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong20 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray19);
        byte[] byteArray21 = zipLong20.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream9.write(byteArray21, 1, 493);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '493' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(zipExtraFieldArray18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[110, 117, 14, 0]");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setMethod((int) 'a');
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = tarArchiveOutputStream2.createArchiveEntry(file5, "org.apache.commons.compress.archivers.ArchiveException: not encodeable");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        java.lang.String str6 = zipArchiveOutputStream3.getEncoding();
        zipArchiveOutputStream3.setComment("not encodeable");
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj1 = asiExtraField0.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField2 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField3 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj4 = asiExtraField3.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField5 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField7 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField0, asiExtraField2, asiExtraField3, asiExtraField5, asiExtraField6, asiExtraField7 };
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray8);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray9);
        boolean boolean12 = zipLong10.equals((java.lang.Object) 24576);
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13, (int) '4');
        tarArchiveOutputStream15.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField19 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj20 = asiExtraField19.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField21 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField22 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj23 = asiExtraField22.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField24 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField25 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField26 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray27 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField19, asiExtraField21, asiExtraField22, asiExtraField24, asiExtraField25, asiExtraField26 };
        byte[] byteArray28 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray27);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField29 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray28);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField30 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray28);
        tarArchiveOutputStream15.write(byteArray28, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort34 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray28);
        boolean boolean36 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray28, (int) (byte) 1);
        boolean boolean37 = zipLong10.equals((java.lang.Object) boolean36);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(zipExtraFieldArray27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream5.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archives contains unclosed entries.");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("org.apache.commons.compress.archivers.ArchiveException: not encodeable");
        java.nio.file.attribute.FileTime fileTime9 = zipArchiveEntry8.getLastModifiedTime();
        byte[] byteArray10 = zipArchiveEntry8.getExtra();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime9);
        org.junit.Assert.assertNull(byteArray10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
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
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        zipArchiveOutputStream3.setMethod(32768);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker6 = new org.apache.commons.compress.archivers.zip.JarMarker();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = jarMarker6.getCentralDirectoryLength();
        byte[] byteArray8 = jarMarker6.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = asiExtraField9.getHeaderId();
        asiExtraField9.setGroupId(256);
        byte[] byteArray13 = asiExtraField9.getCentralDirectoryData();
        jarMarker6.parseFromCentralDirectoryData(byteArray13, 0, 0);
        byte[] byteArray17 = jarMarker6.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray18 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray17);
        arArchiveOutputStream5.write(byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream5.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archives contains unclosed entries.");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-32, 88, -115, -108, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray18);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("org.apache.commons.compress.archivers.ArchiveException: not encodeable");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid compression method");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
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
        zipArchiveOutputStream12.closeArchiveEntry();
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
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
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
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.write((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("org.apache.commons.compress.archivers.ArchiveException: not encodeable");
        java.nio.file.attribute.FileTime fileTime9 = zipArchiveEntry8.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField10 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj11 = asiExtraField10.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj14 = asiExtraField13.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField15 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField16 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField17 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray18 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField10, asiExtraField12, asiExtraField13, asiExtraField15, asiExtraField16, asiExtraField17 };
        byte[] byteArray19 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray18);
        byte[] byteArray20 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray18);
        byte[] byteArray21 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray18);
        zipArchiveEntry8.setCentralDirectoryExtra(byteArray21);
        zipArchiveEntry8.setTime((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid compression method");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(zipExtraFieldArray18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        java.lang.String str6 = zipArchiveOutputStream3.getEncoding();
        zipArchiveOutputStream3.setComment("not encodeable");
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
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
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("org.apache.commons.compress.archivers.ArchiveException: not encodeable");
        java.nio.file.attribute.FileTime fileTime16 = zipArchiveEntry15.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField17 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj18 = asiExtraField17.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField19 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField20 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj21 = asiExtraField20.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField22 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField23 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField24 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray25 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField17, asiExtraField19, asiExtraField20, asiExtraField22, asiExtraField23, asiExtraField24 };
        byte[] byteArray26 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray25);
        byte[] byteArray27 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray25);
        byte[] byteArray28 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray25);
        zipArchiveEntry15.setCentralDirectoryExtra(byteArray28);
        zipArchiveEntry15.setTime((long) 10);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField32 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray33 = asiExtraField32.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort34 = asiExtraField32.getLocalFileDataLength();
        zipArchiveEntry15.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) asiExtraField32);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid compression method");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNull(fileTime16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(zipExtraFieldArray25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort34);
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
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        zipArchiveOutputStream3.setComment("org.apache.commons.compress.archivers.ArchiveException: hi!");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
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
        java.io.File file23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry25 = tarArchiveOutputStream22.createArchiveEntry(file23, "not encodeable");
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
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        java.lang.String str6 = zipArchiveOutputStream3.getEncoding();
        zipArchiveOutputStream3.setComment("not encodeable");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj12 = asiExtraField11.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField14 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj15 = asiExtraField14.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField16 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField17 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField18 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray19 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField11, asiExtraField13, asiExtraField14, asiExtraField16, asiExtraField17, asiExtraField18 };
        byte[] byteArray20 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray19);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField21 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray20);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField22 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray20);
        byte[] byteArray23 = unicodePathExtraField22.getLocalFileDataData();
        byte[] byteArray24 = unicodePathExtraField22.getUnicodeName();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.write(byteArray24, (int) (short) 1, (int) (short) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(zipExtraFieldArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 69, 102, 25, 55, 104, 105, 33]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[104, 105, 33]");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = new org.apache.commons.compress.archivers.zip.JarMarker();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = jarMarker0.getCentralDirectoryLength();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream2, (int) '4');
        tarArchiveOutputStream4.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj9 = asiExtraField8.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField10 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj12 = asiExtraField11.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField14 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField15 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField8, asiExtraField10, asiExtraField11, asiExtraField13, asiExtraField14, asiExtraField15 };
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray16);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField18 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray17);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField19 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray17);
        tarArchiveOutputStream4.write(byteArray17, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort23 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray17);
        boolean boolean25 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray17, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            jarMarker0.parseFromCentralDirectoryData(byteArray17, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: JarMarker doesn't expect any data");
        } catch (java.util.zip.ZipException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
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
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry23 = tarArchiveOutputStream2.createArchiveEntry(file21, "org.apache.commons.compress.archivers.ArchiveException: not encodeable");
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
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("org.apache.commons.compress.archivers.ArchiveException: not encodeable");
        java.nio.file.attribute.FileTime fileTime4 = zipArchiveEntry3.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField5 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj6 = asiExtraField5.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField7 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj9 = asiExtraField8.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField10 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray13 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField5, asiExtraField7, asiExtraField8, asiExtraField10, asiExtraField11, asiExtraField12 };
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray13);
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray13);
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray13);
        zipArchiveEntry3.setCentralDirectoryExtra(byteArray16);
        byte[] byteArray18 = zipArchiveEntry3.getCentralDirectoryExtra();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream1.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(zipExtraFieldArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[110, 117, 14, 0, 57, 104, -33, -123, 0, -128, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
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
        int int15 = zipShort3.getValue();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30062 + "'", int15 == 30062);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("org.apache.commons.compress.archivers.ArchiveException: not encodeable");
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry6.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj9 = asiExtraField8.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField10 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj12 = asiExtraField11.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField14 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField15 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField8, asiExtraField10, asiExtraField11, asiExtraField13, asiExtraField14, asiExtraField15 };
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray16);
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray16);
        byte[] byteArray19 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray16);
        zipArchiveEntry6.setCentralDirectoryExtra(byteArray19);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField21 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj22 = asiExtraField21.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField23 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField24 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj25 = asiExtraField24.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField26 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField27 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField28 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray29 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField21, asiExtraField23, asiExtraField24, asiExtraField26, asiExtraField27, asiExtraField28 };
        byte[] byteArray30 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray29);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray31 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray30);
        zipArchiveEntry6.setExtraFields(zipExtraFieldArray31);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(zipExtraFieldArray29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray31);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = tarArchiveOutputStream6.createArchiveEntry(file7, "hi!");
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
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        tarArchiveOutputStream2.setLongFileMode(0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream3.setEncoding("UTF8");
        java.lang.String str11 = zipArchiveOutputStream3.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
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
        zipArchiveOutputStream3.setComment("");
        java.lang.String str11 = zipArchiveOutputStream3.getEncoding();
        zipArchiveOutputStream3.setComment("org.apache.commons.compress.archivers.ArchiveException: hi!");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        int int5 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("org.apache.commons.compress.archivers.ArchiveException: not encodeable");
        java.nio.file.attribute.FileTime fileTime8 = zipArchiveEntry7.getLastModifiedTime();
        byte[] byteArray9 = zipArchiveEntry7.getExtra();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray10 = zipArchiveEntry7.getExtraFields();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertNull(fileTime8);
        org.junit.Assert.assertNull(byteArray9);
        org.junit.Assert.assertNotNull(zipExtraFieldArray10);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
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
        int int23 = tarArchiveOutputStream2.getRecordSize();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = zipArchiveOutputStream3.createArchiveEntry(file6, "TRAILER!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
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
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        boolean boolean6 = zipArchiveOutputStream3.isSeekable();
        byte[] byteArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.write(byteArray7, 0, 49152);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker6 = new org.apache.commons.compress.archivers.zip.JarMarker();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = jarMarker6.getCentralDirectoryLength();
        byte[] byteArray8 = jarMarker6.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = asiExtraField9.getHeaderId();
        asiExtraField9.setGroupId(256);
        byte[] byteArray13 = asiExtraField9.getCentralDirectoryData();
        jarMarker6.parseFromCentralDirectoryData(byteArray13, 0, 0);
        byte[] byteArray17 = jarMarker6.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray18 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray17);
        arArchiveOutputStream5.write(byteArray17);
        java.io.File file20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = arArchiveOutputStream5.createArchiveEntry(file20, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-32, 88, -115, -108, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray18);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
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
        zipArchiveOutputStream3.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy16 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy16);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker6 = new org.apache.commons.compress.archivers.zip.JarMarker();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = jarMarker6.getCentralDirectoryLength();
        byte[] byteArray8 = jarMarker6.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = asiExtraField9.getHeaderId();
        asiExtraField9.setGroupId(256);
        byte[] byteArray13 = asiExtraField9.getCentralDirectoryData();
        jarMarker6.parseFromCentralDirectoryData(byteArray13, 0, 0);
        byte[] byteArray17 = jarMarker6.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray18 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray17);
        arArchiveOutputStream5.write(byteArray17);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("org.apache.commons.compress.archivers.ArchiveException: not encodeable");
        java.nio.file.attribute.FileTime fileTime22 = zipArchiveEntry21.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField23 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj24 = asiExtraField23.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField25 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField26 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj27 = asiExtraField26.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField28 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField29 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField30 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray31 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField23, asiExtraField25, asiExtraField26, asiExtraField28, asiExtraField29, asiExtraField30 };
        byte[] byteArray32 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray31);
        byte[] byteArray33 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray31);
        byte[] byteArray34 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray31);
        zipArchiveEntry21.setCentralDirectoryExtra(byteArray34);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream5.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-32, 88, -115, -108, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray18);
        org.junit.Assert.assertNull(fileTime22);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(zipExtraFieldArray31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker6 = new org.apache.commons.compress.archivers.zip.JarMarker();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = jarMarker6.getCentralDirectoryLength();
        byte[] byteArray8 = jarMarker6.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = asiExtraField9.getHeaderId();
        asiExtraField9.setGroupId(256);
        byte[] byteArray13 = asiExtraField9.getCentralDirectoryData();
        jarMarker6.parseFromCentralDirectoryData(byteArray13, 0, 0);
        byte[] byteArray17 = jarMarker6.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray18 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray17);
        arArchiveOutputStream5.write(byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream5.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-32, 88, -115, -108, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray18);
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
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
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
            tarArchiveOutputStream22.flush();
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
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        tarArchiveOutputStream9.finish();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("org.apache.commons.compress.archivers.ArchiveException: not encodeable");
        java.nio.file.attribute.FileTime fileTime12 = zipArchiveEntry11.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj14 = asiExtraField13.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField15 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField16 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj17 = asiExtraField16.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField18 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField19 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField20 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray21 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField13, asiExtraField15, asiExtraField16, asiExtraField18, asiExtraField19, asiExtraField20 };
        byte[] byteArray22 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray21);
        byte[] byteArray23 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray21);
        byte[] byteArray24 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray21);
        zipArchiveEntry11.setCentralDirectoryExtra(byteArray24);
        zipArchiveEntry11.setTime((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream9.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNull(fileTime12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(zipExtraFieldArray21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream4.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archives contains unclosed entries.");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.write((int) 'a');
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy5 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str6 = unicodeExtraFieldPolicy5.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy5);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray9 = asiExtraField8.getLocalFileDataData();
        int int10 = asiExtraField8.getMode();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray11 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField8 };
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray11);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.write(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "never" + "'", str6, "never");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.closeArchiveEntry();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
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
            zipArchiveOutputStream3.close();
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
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("org.apache.commons.compress.archivers.ArchiveException: not encodeable");
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry6.getLastModifiedTime();
        byte[] byteArray8 = zipArchiveEntry6.getExtra();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = zipArchiveEntry6.getExtraFields();
        int int10 = zipArchiveEntry6.getUnixMode();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream4.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertNull(byteArray8);
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker6 = new org.apache.commons.compress.archivers.zip.JarMarker();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = jarMarker6.getCentralDirectoryLength();
        byte[] byteArray8 = jarMarker6.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = asiExtraField9.getHeaderId();
        asiExtraField9.setGroupId(256);
        byte[] byteArray13 = asiExtraField9.getCentralDirectoryData();
        jarMarker6.parseFromCentralDirectoryData(byteArray13, 0, 0);
        byte[] byteArray17 = jarMarker6.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray18 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray17);
        arArchiveOutputStream5.write(byteArray17);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream5);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-32, 88, -115, -108, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray18);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
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
        tarArchiveOutputStream22.setLongFileMode(24576);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
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
        boolean boolean14 = zipArchiveOutputStream3.isSeekable();
        java.io.File file15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = zipArchiveOutputStream3.createArchiveEntry(file15, "070701");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
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
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (int) (short) 12, 2);
        java.io.InputStream inputStream17 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream17, (int) 'a');
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        int int26 = tarArchiveInputStream19.read(byteArray25);
        tarArchiveInputStream19.reset();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream28 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream19);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream19, (int) (byte) 0, (int) (short) 3);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream19);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream19, 10);
        java.io.InputStream inputStream35 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream35, (int) 'a');
        tarArchiveInputStream37.reset();
        byte[] byteArray40 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (short) 10);
        int int41 = tarArchiveInputStream37.read(byteArray40);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream42 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream37);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry43 = zipArchiveInputStream42.getNextZipEntry();
        byte[] byteArray46 = new byte[] { (byte) 100, (byte) -1 };
        int int49 = zipArchiveInputStream42.read(byteArray46, 32768, 0);
        int int52 = tarArchiveInputStream34.read(byteArray46, 64, (int) (short) 100);
        boolean boolean54 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray46, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.write(byteArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 100, 0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry43);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[100, -1]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        zipArchiveOutputStream3.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (short) 4);
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        boolean boolean22 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray20, (int) (short) 1);
        boolean boolean24 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray20, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField25 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("hi!", byteArray20);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong26 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray20);
        long long27 = zipLong26.getValue();
        long long28 = zipLong26.getValue();
        byte[] byteArray35 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        boolean boolean37 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray35, (int) (short) 1);
        boolean boolean39 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray35, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField40 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("hi!", byteArray35);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort41 = unicodeCommentExtraField40.getHeaderId();
        byte[] byteArray42 = unicodeCommentExtraField40.getCentralDirectoryData();
        boolean boolean43 = zipLong26.equals((java.lang.Object) byteArray42);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream13.write(byteArray42, 26742, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, -1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 130816L + "'", long27 == 130816L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 130816L + "'", long28 == 130816L);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0, -1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(zipShort41);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, 77, -85, -30, 110, 104, 105, 33]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        zipArchiveOutputStream3.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (short) 4);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("org.apache.commons.compress.archivers.ArchiveException: not encodeable");
        long long16 = zipArchiveEntry15.getSize();
        long long17 = zipArchiveEntry15.getTime();
        byte[] byteArray18 = zipArchiveEntry15.getExtra();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream13.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNull(byteArray18);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream2, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream6 = archiveStreamFactory0.createArchiveOutputStream("hi!", (java.io.OutputStream) zipArchiveOutputStream5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: hi! not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
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
        int int10 = tarArchiveOutputStream9.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("org.apache.commons.compress.archivers.ArchiveException: not encodeable");
        java.nio.file.attribute.FileTime fileTime13 = zipArchiveEntry12.getLastModifiedTime();
        java.lang.Object obj14 = zipArchiveEntry12.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField16 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj17 = asiExtraField16.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField18 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField19 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj20 = asiExtraField19.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField21 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField22 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField23 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray24 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField16, asiExtraField18, asiExtraField19, asiExtraField21, asiExtraField22, asiExtraField23 };
        byte[] byteArray25 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray24);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField26 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray25);
        unicodePathExtraField26.setNameCRC32((long) (short) 2);
        byte[] byteArray29 = unicodePathExtraField26.getCentralDirectoryData();
        zipArchiveEntry12.setCentralDirectoryExtra(byteArray29);
        boolean boolean32 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray29, 16);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream9.write(byteArray29, 16384, 61440);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '61440' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNull(fileTime13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "org.apache.commons.compress.archivers.ArchiveException: not encodeable");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "org.apache.commons.compress.archivers.ArchiveException: not encodeable");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "org.apache.commons.compress.archivers.ArchiveException: not encodeable");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(zipExtraFieldArray24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, 2, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str10 = unicodeExtraFieldPolicy9.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        boolean boolean12 = zipArchiveOutputStream3.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.setLevel((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry24 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream22.putArchiveEntry(archiveEntry24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        zipArchiveOutputStream3.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (short) 4);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream13.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        zipArchiveOutputStream3.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (short) 4);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream13.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }
}


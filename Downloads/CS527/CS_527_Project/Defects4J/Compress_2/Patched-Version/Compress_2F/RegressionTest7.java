import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream8.mark((int) (byte) 10);
        arArchiveInputStream8.mark(1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        arArchiveInputStream13.mark((int) (short) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream13);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream13.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        long long9 = arArchiveInputStream1.skip((long) (-1));
        int int10 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark((int) (short) 10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean14 = arArchiveInputStream13.markSupported();
        arArchiveInputStream13.mark((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream13.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean9 = arArchiveInputStream8.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        arArchiveInputStream10.mark((int) (short) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream14 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream13);
        java.lang.Class<?> wildcardClass15 = arArchiveInputStream14.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        arArchiveInputStream6.mark(0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        boolean boolean10 = arArchiveInputStream9.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream9);
        java.lang.Class<?> wildcardClass12 = arArchiveInputStream11.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        int int2 = arArchiveInputStream1.available();
        int int3 = arArchiveInputStream1.available();
        int int4 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean12 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) (byte) 100);
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) (short) 100);
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) (byte) -1);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) (byte) 0);
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, 10);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = arArchiveInputStream6.read(byteArray10, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        int int7 = arArchiveInputStream6.available();
        long long9 = arArchiveInputStream6.skip((long) (byte) 0);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, 0);
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (short) -1);
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, 10);
        boolean boolean23 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) 'a');
        boolean boolean25 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (byte) 100);
        boolean boolean27 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = arArchiveInputStream6.read(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        int int11 = arArchiveInputStream1.available();
        java.lang.Class<?> wildcardClass12 = arArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark((int) (short) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean7 = arArchiveInputStream6.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = arArchiveInputStream6.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        boolean boolean3 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray1, 1);
        boolean boolean5 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray1, (int) (short) 100);
        boolean boolean7 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray1, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray1, (int) '#');
        boolean boolean11 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray1, (int) (byte) 1);
        boolean boolean13 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream9);
        int int11 = arArchiveInputStream10.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream10);
        boolean boolean13 = arArchiveInputStream10.markSupported();
        long long15 = arArchiveInputStream10.skip(0L);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream10);
        arArchiveInputStream16.mark(1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry19 = arArchiveInputStream16.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) ' ');
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        long long9 = arArchiveInputStream1.skip((long) (-1));
        int int10 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark((int) (short) 10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean14 = arArchiveInputStream13.markSupported();
        arArchiveInputStream13.mark((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int17 = arArchiveInputStream13.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (short) 0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        arArchiveInputStream2.mark(0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = arArchiveInputStream9.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean9 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = arArchiveInputStream10.skip((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        int int6 = arArchiveInputStream5.available();
        arArchiveInputStream5.mark((int) (byte) 0);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (byte) 100);
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) ' ');
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (byte) 100);
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (short) -1);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (byte) 100);
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = arArchiveInputStream5.read(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean4 = arArchiveInputStream1.markSupported();
        boolean boolean5 = arArchiveInputStream1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry6 = arArchiveInputStream1.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        int int2 = arArchiveInputStream1.available();
        int int3 = arArchiveInputStream1.available();
        int int4 = arArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean9 = arArchiveInputStream8.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        boolean boolean11 = arArchiveInputStream8.markSupported();
        int int12 = arArchiveInputStream8.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        arArchiveInputStream13.mark(0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream13);
        int int17 = arArchiveInputStream13.available();
        arArchiveInputStream13.mark((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry20 = arArchiveInputStream13.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }
}


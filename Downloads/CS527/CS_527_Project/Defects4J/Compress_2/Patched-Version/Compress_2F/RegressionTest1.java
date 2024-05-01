import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        boolean boolean7 = arArchiveInputStream5.markSupported();
        boolean boolean8 = arArchiveInputStream5.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = arArchiveInputStream5.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream7.mark((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = arArchiveInputStream7.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        arArchiveInputStream1.mark((int) 'a');
        long long12 = arArchiveInputStream1.skip(0L);
        int int13 = arArchiveInputStream1.available();
        boolean boolean14 = arArchiveInputStream1.markSupported();
        java.lang.Class<?> wildcardClass15 = arArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        long long13 = arArchiveInputStream1.skip((-1L));
        arArchiveInputStream1.mark((-1));
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean8 = arArchiveInputStream7.markSupported();
        boolean boolean9 = arArchiveInputStream7.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry11 = arArchiveInputStream10.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        arArchiveInputStream6.mark(0);
        int int9 = arArchiveInputStream6.available();
        int int10 = arArchiveInputStream6.available();
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) ' ');
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 100);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = arArchiveInputStream6.read(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        arArchiveInputStream1.mark((int) ' ');
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (byte) -1);
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray22, 100);
        boolean boolean26 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray22, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int27 = arArchiveInputStream1.read(byteArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream8.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        int int5 = arArchiveInputStream1.available();
        int int6 = arArchiveInputStream1.available();
        boolean boolean7 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        arArchiveInputStream1.mark((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry10 = arArchiveInputStream1.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        arArchiveInputStream1.mark((int) ' ');
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream17 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry18 = arArchiveInputStream17.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        int int6 = arArchiveInputStream5.available();
        long long8 = arArchiveInputStream5.skip((long) (short) 0);
        boolean boolean9 = arArchiveInputStream5.markSupported();
        java.lang.Class<?> wildcardClass10 = arArchiveInputStream5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean8 = arArchiveInputStream7.markSupported();
        boolean boolean9 = arArchiveInputStream7.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = arArchiveInputStream7.read(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) (byte) 10);
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) (byte) 10);
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = arArchiveInputStream8.read(byteArray15, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        long long9 = arArchiveInputStream7.skip((long) (short) 0);
        long long11 = arArchiveInputStream7.skip((long) (-1));
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) (byte) 100);
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) ' ');
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) (byte) 100);
        boolean boolean23 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = arArchiveInputStream7.read(byteArray15, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        arArchiveInputStream2.mark((int) (short) 0);
        long long11 = arArchiveInputStream2.skip((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = arArchiveInputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = arArchiveInputStream1.skip((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        boolean boolean7 = arArchiveInputStream1.markSupported();
        long long9 = arArchiveInputStream1.skip((-1L));
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (byte) 100);
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, 1);
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = arArchiveInputStream1.read(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        int int5 = arArchiveInputStream1.available();
        int int6 = arArchiveInputStream1.available();
        boolean boolean7 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) 'a');
        java.lang.Class<?> wildcardClass10 = arArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean8 = arArchiveInputStream7.markSupported();
        boolean boolean9 = arArchiveInputStream7.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream10.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry11 = arArchiveInputStream9.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
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
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream8.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        long long6 = arArchiveInputStream1.skip((-1L));
        int int7 = arArchiveInputStream1.available();
        int int8 = arArchiveInputStream1.available();
        int int9 = arArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        byte[] byteArray11 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int14 = arArchiveInputStream9.read(byteArray11, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0]");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (short) 1);
        int int11 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean13 = arArchiveInputStream12.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry14 = arArchiveInputStream12.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream9.mark((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry12 = arArchiveInputStream9.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        long long9 = arArchiveInputStream7.skip((long) (short) 0);
        boolean boolean10 = arArchiveInputStream7.markSupported();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray17, 100);
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray17, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = arArchiveInputStream7.read(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        arArchiveInputStream5.mark((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int8 = arArchiveInputStream5.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean9 = arArchiveInputStream8.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        arArchiveInputStream8.mark((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = arArchiveInputStream8.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        int int4 = arArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = arArchiveInputStream1.skip((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        int int6 = arArchiveInputStream1.available();
        boolean boolean7 = arArchiveInputStream1.markSupported();
        java.lang.Class<?> wildcardClass8 = arArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        boolean boolean9 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream10);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = arArchiveInputStream10.skip((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        boolean boolean7 = arArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) ' ');
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (byte) 100);
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = arArchiveInputStream5.read(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = arArchiveInputStream13.skip((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream5.mark(0);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = arArchiveInputStream5.skip(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        arArchiveInputStream6.mark(0);
        int int9 = arArchiveInputStream6.available();
        int int10 = arArchiveInputStream6.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry11 = arArchiveInputStream6.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        arArchiveInputStream2.mark((int) (byte) 10);
        java.lang.Class<?> wildcardClass5 = arArchiveInputStream2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        boolean boolean7 = arArchiveInputStream6.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = arArchiveInputStream8.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean8 = arArchiveInputStream7.markSupported();
        boolean boolean9 = arArchiveInputStream7.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream7.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        boolean boolean8 = arArchiveInputStream7.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream7.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int12 = arArchiveInputStream11.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = arArchiveInputStream11.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (short) 0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = arArchiveInputStream2.skip((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean9 = arArchiveInputStream1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = arArchiveInputStream1.skip((long) 'a');
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
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        boolean boolean7 = arArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = arArchiveInputStream8.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray3, (int) (byte) 100);
        boolean boolean7 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray3, (int) ' ');
        boolean boolean9 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray3, (int) '#');
        boolean boolean11 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray3, (int) (byte) 10);
        boolean boolean13 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray3, (int) (short) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray3, 0);
        java.lang.Class<?> wildcardClass16 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (short) 0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = arArchiveInputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        arArchiveInputStream6.mark(0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, 100);
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, (int) '4');
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = arArchiveInputStream9.read(byteArray16, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        long long6 = arArchiveInputStream1.skip((-1L));
        int int7 = arArchiveInputStream1.available();
        int int8 = arArchiveInputStream1.available();
        int int9 = arArchiveInputStream1.available();
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) ' ');
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = arArchiveInputStream1.read(byteArray13, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean9 = arArchiveInputStream8.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        arArchiveInputStream8.mark((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry13 = arArchiveInputStream8.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        arArchiveInputStream1.mark((int) 'a');
        long long12 = arArchiveInputStream1.skip(0L);
        int int13 = arArchiveInputStream1.available();
        boolean boolean14 = arArchiveInputStream1.markSupported();
        boolean boolean15 = arArchiveInputStream1.markSupported();
        int int16 = arArchiveInputStream1.available();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean25 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray23, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = arArchiveInputStream1.read(byteArray23, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        long long13 = arArchiveInputStream1.skip((-1L));
        boolean boolean14 = arArchiveInputStream1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        int int4 = arArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = arArchiveInputStream1.skip(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean11 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray9, 100);
        boolean boolean13 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray9, (int) (short) 10);
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray9, (int) ' ');
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray9, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = arArchiveInputStream1.read(byteArray9, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        arArchiveInputStream1.mark((int) (byte) 10);
        int int10 = arArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = arArchiveInputStream1.skip((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = arArchiveInputStream7.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        java.lang.Class<?> wildcardClass13 = arArchiveInputStream12.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        int int2 = arArchiveInputStream1.available();
        int int3 = arArchiveInputStream1.available();
        int int4 = arArchiveInputStream1.available();
        long long6 = arArchiveInputStream1.skip((-1L));
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, 100);
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (short) 10);
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) ' ');
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (byte) 100);
        boolean boolean23 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = arArchiveInputStream1.read(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        boolean boolean7 = arArchiveInputStream6.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        arArchiveInputStream6.mark(0);
        int int9 = arArchiveInputStream6.available();
        int int10 = arArchiveInputStream6.available();
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) ' ');
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) '#');
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 10);
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = arArchiveInputStream6.read(byteArray14, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        long long9 = arArchiveInputStream1.skip((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long11 = arArchiveInputStream1.skip((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream8.mark((int) (byte) 10);
        arArchiveInputStream8.mark((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = arArchiveInputStream8.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        int int8 = arArchiveInputStream2.available();
        arArchiveInputStream2.mark((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry6 = arArchiveInputStream1.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = arArchiveInputStream1.skip((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        boolean boolean9 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean11 = arArchiveInputStream1.markSupported();
        java.lang.Class<?> wildcardClass12 = arArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        int int2 = arArchiveInputStream1.available();
        int int3 = arArchiveInputStream1.available();
        int int4 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean11 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray9, (int) (byte) 100);
        boolean boolean13 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray9, (int) ' ');
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray9, (int) '#');
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray9, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = arArchiveInputStream1.read(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        boolean boolean7 = arArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = arArchiveInputStream8.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
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
        boolean boolean14 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.close();
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
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        int int6 = arArchiveInputStream1.available();
        boolean boolean7 = arArchiveInputStream1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = arArchiveInputStream1.skip((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean8 = arArchiveInputStream7.markSupported();
        int int9 = arArchiveInputStream7.available();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, 100);
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, (int) (short) 10);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = arArchiveInputStream7.read(byteArray16, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray17, (int) (byte) 100);
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray17, (int) ' ');
        boolean boolean23 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray17, (int) (byte) 100);
        boolean boolean25 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray17, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = arArchiveInputStream13.read(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        java.lang.Class<?> wildcardClass7 = arArchiveInputStream6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        long long9 = arArchiveInputStream1.skip((long) (-1));
        int int10 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream11.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        arArchiveInputStream1.mark((int) 'a');
        boolean boolean13 = arArchiveInputStream1.markSupported();
        long long15 = arArchiveInputStream1.skip(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = arArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean9 = arArchiveInputStream1.markSupported();
        java.lang.Class<?> wildcardClass10 = arArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        int int2 = arArchiveInputStream1.available();
        int int3 = arArchiveInputStream1.available();
        int int4 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark((int) (byte) 1);
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean11 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray9, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = arArchiveInputStream1.read(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        boolean boolean7 = arArchiveInputStream6.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        long long10 = arArchiveInputStream8.skip((long) (byte) -1);
        int int11 = arArchiveInputStream8.available();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = arArchiveInputStream8.skip((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int8 = arArchiveInputStream7.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = arArchiveInputStream7.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        int int7 = arArchiveInputStream1.available();
        int int8 = arArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = arArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        arArchiveInputStream1.mark((int) ' ');
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray17, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = arArchiveInputStream13.read(byteArray17, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        long long6 = arArchiveInputStream1.skip((long) (short) -1);
        int int7 = arArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry8 = arArchiveInputStream7.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        boolean boolean7 = arArchiveInputStream6.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        long long10 = arArchiveInputStream8.skip((long) (byte) -1);
        long long12 = arArchiveInputStream8.skip((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = arArchiveInputStream8.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry12 = arArchiveInputStream11.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray6, 100);
        boolean boolean10 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray6, (int) (short) 10);
        boolean boolean12 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray6, (int) '#');
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray6, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        arArchiveInputStream1.mark((int) 'a');
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, 0);
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (short) -1);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = arArchiveInputStream1.read(byteArray14, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (short) 1);
        int int11 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean13 = arArchiveInputStream12.markSupported();
        java.lang.Class<?> wildcardClass14 = arArchiveInputStream12.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        int int9 = arArchiveInputStream8.available();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = arArchiveInputStream8.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        int int5 = arArchiveInputStream1.available();
        int int6 = arArchiveInputStream1.available();
        boolean boolean7 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) 'a');
        boolean boolean10 = arArchiveInputStream1.markSupported();
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = arArchiveInputStream1.read(byteArray14, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry9 = arArchiveInputStream2.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (short) 1);
        int int11 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry14 = arArchiveInputStream13.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        boolean boolean7 = arArchiveInputStream6.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        long long10 = arArchiveInputStream8.skip((long) (byte) -1);
        int int11 = arArchiveInputStream8.available();
        arArchiveInputStream8.mark((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry14 = arArchiveInputStream8.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean9 = arArchiveInputStream8.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream10);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = arArchiveInputStream11.skip((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream8.mark((int) (byte) 10);
        arArchiveInputStream8.mark((int) (byte) 0);
        boolean boolean13 = arArchiveInputStream8.markSupported();
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray20, 100);
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray20, (int) (short) 10);
        boolean boolean26 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray20, (int) ' ');
        boolean boolean28 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray20, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = arArchiveInputStream8.read(byteArray20, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean9 = arArchiveInputStream8.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream10);
        int int12 = arArchiveInputStream11.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry13 = arArchiveInputStream11.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        boolean boolean7 = arArchiveInputStream6.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        long long10 = arArchiveInputStream8.skip((long) (byte) -1);
        int int11 = arArchiveInputStream8.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = arArchiveInputStream8.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray7, (int) (byte) 100);
        boolean boolean11 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray7, (int) (short) 100);
        boolean boolean13 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray7, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = arArchiveInputStream2.read(byteArray7, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        int int6 = arArchiveInputStream5.available();
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean12 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) (byte) 100);
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) ' ');
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) (byte) 100);
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) (short) -1);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = arArchiveInputStream5.read(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
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
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
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
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream13.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark((int) (short) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean11 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray9, (int) (byte) 10);
        boolean boolean13 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray9, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = arArchiveInputStream1.read(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray3, (int) (byte) 100);
        boolean boolean7 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray3, (int) (short) 100);
        boolean boolean9 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray3, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark((int) (short) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        arArchiveInputStream1.mark((int) ' ');
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = arArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean9 = arArchiveInputStream8.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream8.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        long long6 = arArchiveInputStream1.skip((-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry7 = arArchiveInputStream1.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (short) 0);
        boolean boolean6 = arArchiveInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        arArchiveInputStream1.mark((int) 'a');
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) ' ');
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) '#');
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = arArchiveInputStream1.read(byteArray14, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        boolean boolean9 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        long long6 = arArchiveInputStream1.skip((-1L));
        int int7 = arArchiveInputStream1.available();
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean13 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, (int) (byte) 100);
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, (int) ' ');
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, (int) (byte) 100);
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = arArchiveInputStream1.read(byteArray11, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        boolean boolean9 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(0);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        int int8 = arArchiveInputStream2.available();
        arArchiveInputStream2.mark((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = arArchiveInputStream2.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, 100);
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) '#');
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = arArchiveInputStream1.read(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (short) 1);
        int int11 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        java.lang.Class<?> wildcardClass13 = arArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean8 = arArchiveInputStream7.markSupported();
        boolean boolean9 = arArchiveInputStream7.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        arArchiveInputStream10.mark((int) (byte) 1);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, 100);
        boolean boolean23 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, (int) (short) 10);
        boolean boolean25 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, (int) ' ');
        boolean boolean27 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, (int) (short) 10);
        boolean boolean29 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = arArchiveInputStream10.read(byteArray19, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean13 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, (int) (byte) 100);
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = arArchiveInputStream7.read(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry6 = arArchiveInputStream4.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        int int2 = arArchiveInputStream1.available();
        boolean boolean3 = arArchiveInputStream1.markSupported();
        boolean boolean4 = arArchiveInputStream1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = arArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream14 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        long long9 = arArchiveInputStream7.skip((long) (short) 0);
        boolean boolean10 = arArchiveInputStream7.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = arArchiveInputStream7.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        boolean boolean7 = arArchiveInputStream6.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        long long10 = arArchiveInputStream8.skip((long) (byte) -1);
        long long12 = arArchiveInputStream8.skip((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream8.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        arArchiveInputStream1.mark((int) 'a');
        long long12 = arArchiveInputStream1.skip(0L);
        int int13 = arArchiveInputStream1.available();
        boolean boolean14 = arArchiveInputStream1.markSupported();
        boolean boolean15 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        long long6 = arArchiveInputStream1.skip((long) (short) -1);
        java.lang.Class<?> wildcardClass7 = arArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (short) 0);
        boolean boolean6 = arArchiveInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
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
        arArchiveInputStream13.mark((int) (short) 100);
        java.lang.Class<?> wildcardClass16 = arArchiveInputStream13.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        int int9 = arArchiveInputStream8.available();
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = arArchiveInputStream8.read(byteArray13, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = arArchiveInputStream2.read(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        int int6 = arArchiveInputStream5.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = arArchiveInputStream5.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray3, (int) (byte) 100);
        boolean boolean7 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray3, (int) (short) 100);
        boolean boolean9 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray3, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray3, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray3, 10);
        java.lang.Class<?> wildcardClass14 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        arArchiveInputStream2.mark((int) (short) 0);
        long long11 = arArchiveInputStream2.skip((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        int int5 = arArchiveInputStream1.available();
        int int6 = arArchiveInputStream1.available();
        boolean boolean7 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) 'a');
        boolean boolean10 = arArchiveInputStream1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = arArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        arArchiveInputStream1.mark((int) (byte) 10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean11 = arArchiveInputStream10.markSupported();
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 10);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 10);
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = arArchiveInputStream10.read(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean10 = arArchiveInputStream1.markSupported();
        byte[] byteArray12 = new byte[] { (byte) 0 };
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = arArchiveInputStream1.read(byteArray12, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        boolean boolean9 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean11 = arArchiveInputStream10.markSupported();
        boolean boolean12 = arArchiveInputStream10.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream10.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, 100);
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) '4');
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (byte) 0);
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = arArchiveInputStream5.read(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean9 = arArchiveInputStream8.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream10);
        int int12 = arArchiveInputStream11.available();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream11.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = arArchiveInputStream1.read(byteArray5, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        long long13 = arArchiveInputStream1.skip((-1L));
        boolean boolean14 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream17 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean26 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray24, 100);
        boolean boolean28 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray24, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = arArchiveInputStream17.read(byteArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        int int2 = arArchiveInputStream1.available();
        boolean boolean3 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (short) -1);
        java.lang.Class<?> wildcardClass9 = arArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (short) 1);
        int int11 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean13 = arArchiveInputStream12.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = arArchiveInputStream12.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        boolean boolean9 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean11 = arArchiveInputStream10.markSupported();
        boolean boolean12 = arArchiveInputStream10.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = arArchiveInputStream10.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        int int5 = arArchiveInputStream1.available();
        int int6 = arArchiveInputStream1.available();
        boolean boolean7 = arArchiveInputStream1.markSupported();
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean13 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, (int) (byte) 100);
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, (int) (byte) -1);
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, (int) (byte) 0);
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = arArchiveInputStream1.read(byteArray11, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int8 = arArchiveInputStream7.available();
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, 100);
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) (short) 10);
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = arArchiveInputStream7.read(byteArray15, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        int int5 = arArchiveInputStream1.available();
        int int6 = arArchiveInputStream1.available();
        boolean boolean7 = arArchiveInputStream1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = arArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        boolean boolean7 = arArchiveInputStream5.markSupported();
        boolean boolean8 = arArchiveInputStream5.markSupported();
        int int9 = arArchiveInputStream5.available();
        int int10 = arArchiveInputStream5.available();
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) ' ');
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int23 = arArchiveInputStream5.read(byteArray14, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = arArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        arArchiveInputStream1.mark((int) 'a');
        long long12 = arArchiveInputStream1.skip(0L);
        int int13 = arArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        boolean boolean7 = arArchiveInputStream6.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = arArchiveInputStream8.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        int int2 = arArchiveInputStream1.available();
        int int3 = arArchiveInputStream1.available();
        int int4 = arArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry5 = arArchiveInputStream1.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean8 = arArchiveInputStream7.markSupported();
        boolean boolean9 = arArchiveInputStream7.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        long long9 = arArchiveInputStream1.skip((long) (-1));
        int int10 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream11.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
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
        arArchiveInputStream13.mark((int) (short) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream13);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = arArchiveInputStream16.skip(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        long long9 = arArchiveInputStream1.skip((long) (-1));
        java.lang.Class<?> wildcardClass10 = arArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        int int9 = arArchiveInputStream8.available();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = arArchiveInputStream8.skip((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        int int2 = arArchiveInputStream1.available();
        int int3 = arArchiveInputStream1.available();
        int int4 = arArchiveInputStream1.available();
        long long6 = arArchiveInputStream1.skip((-1L));
        // The following exception was thrown during execution in test generation
        try {
            int int7 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        arArchiveInputStream1.mark((int) 'a');
        long long12 = arArchiveInputStream1.skip(0L);
        int int13 = arArchiveInputStream1.available();
        boolean boolean14 = arArchiveInputStream1.markSupported();
        boolean boolean15 = arArchiveInputStream1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
        boolean boolean14 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = arArchiveInputStream15.getNextEntry();
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
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream9.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        long long9 = arArchiveInputStream1.skip((long) (-1));
        int int10 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, (int) (byte) 100);
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, (int) (byte) 100);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, 1);
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, 100);
        boolean boolean26 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = arArchiveInputStream11.read(byteArray16, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean7 = arArchiveInputStream6.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream8.mark((int) (byte) 10);
        arArchiveInputStream8.mark((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream8.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean8 = arArchiveInputStream7.markSupported();
        int int9 = arArchiveInputStream7.available();
        boolean boolean10 = arArchiveInputStream7.markSupported();
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (short) 100);
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) -1);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 0);
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, 10);
        boolean boolean26 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = arArchiveInputStream7.read(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        arArchiveInputStream1.mark((int) 'a');
        boolean boolean13 = arArchiveInputStream1.markSupported();
        long long15 = arArchiveInputStream1.skip(0L);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        boolean boolean7 = arArchiveInputStream5.markSupported();
        boolean boolean8 = arArchiveInputStream5.markSupported();
        int int9 = arArchiveInputStream5.available();
        int int10 = arArchiveInputStream5.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = arArchiveInputStream5.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (short) 0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        arArchiveInputStream6.mark((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = arArchiveInputStream6.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        long long6 = arArchiveInputStream1.skip((long) (short) -1);
        arArchiveInputStream1.mark((int) (short) -1);
        int int9 = arArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        arArchiveInputStream1.mark((int) ' ');
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray20, (int) (byte) 100);
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray20, (int) (byte) 100);
        boolean boolean26 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray20, 1);
        boolean boolean28 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray20, 100);
        boolean boolean30 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray20, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = arArchiveInputStream1.read(byteArray20, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (byte) 100);
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) ' ');
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = arArchiveInputStream8.read(byteArray12, (int) (short) 1, (int) (short) 10);
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
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        arArchiveInputStream1.mark((int) 'a');
        long long12 = arArchiveInputStream1.skip(0L);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int8 = arArchiveInputStream7.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, 0);
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (short) 1);
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = arArchiveInputStream9.read(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean3 = arArchiveInputStream1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        long long6 = arArchiveInputStream1.skip((long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = arArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        arArchiveInputStream1.mark((int) (byte) 10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean11 = arArchiveInputStream10.markSupported();
        int int12 = arArchiveInputStream10.available();
        int int13 = arArchiveInputStream10.available();
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray20, 100);
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray20, (int) (short) 10);
        boolean boolean26 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray20, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int29 = arArchiveInputStream10.read(byteArray20, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        int int2 = arArchiveInputStream1.available();
        boolean boolean3 = arArchiveInputStream1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = arArchiveInputStream1.skip((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        long long10 = arArchiveInputStream1.skip((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray3, (int) (byte) 100);
        boolean boolean7 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray3, 0);
        boolean boolean9 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray3, (int) (short) -1);
        java.lang.Class<?> wildcardClass10 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        arArchiveInputStream1.mark((int) (byte) 10);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = arArchiveInputStream1.read(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean7 = arArchiveInputStream1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = arArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        boolean boolean7 = arArchiveInputStream6.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (byte) 100);
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) ' ');
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (byte) 100);
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (byte) 100);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (short) -1);
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (byte) 10);
        boolean boolean26 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = arArchiveInputStream8.read(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        boolean boolean9 = arArchiveInputStream1.markSupported();
        int int10 = arArchiveInputStream1.available();
        long long12 = arArchiveInputStream1.skip((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = arArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        boolean boolean9 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean11 = arArchiveInputStream10.markSupported();
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray18, 100);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray18, (int) (short) 10);
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray18, (int) ' ');
        boolean boolean26 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray18, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = arArchiveInputStream10.read(byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        arArchiveInputStream1.mark((int) (short) -1);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray7, (int) (byte) 100);
        boolean boolean11 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray7, (int) (byte) 100);
        boolean boolean13 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray7, 1);
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray7, (int) '4');
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray7, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = arArchiveInputStream1.read(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        boolean boolean13 = arArchiveInputStream12.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream12.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        arArchiveInputStream1.mark((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = arArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        arArchiveInputStream5.mark((int) (short) 1);
        boolean boolean9 = arArchiveInputStream5.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry10 = arArchiveInputStream5.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry16 = arArchiveInputStream13.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean8 = arArchiveInputStream7.markSupported();
        int int9 = arArchiveInputStream7.available();
        boolean boolean10 = arArchiveInputStream7.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = arArchiveInputStream7.skip(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        long long6 = arArchiveInputStream1.skip((long) (short) -1);
        arArchiveInputStream1.mark((int) (short) -1);
        int int9 = arArchiveInputStream1.available();
        java.lang.Class<?> wildcardClass10 = arArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        arArchiveInputStream1.mark((int) 'a');
        boolean boolean13 = arArchiveInputStream1.markSupported();
        long long15 = arArchiveInputStream1.skip(0L);
        arArchiveInputStream1.mark((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        arArchiveInputStream6.mark((int) (byte) 1);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (byte) 100);
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, 0);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = arArchiveInputStream6.read(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        arArchiveInputStream6.mark(0);
        int int9 = arArchiveInputStream6.available();
        int int10 = arArchiveInputStream6.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = arArchiveInputStream6.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
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
        java.lang.Class<?> wildcardClass16 = arArchiveInputStream13.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean9 = arArchiveInputStream8.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        arArchiveInputStream8.mark((int) (short) 0);
        java.lang.Class<?> wildcardClass13 = arArchiveInputStream8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (byte) 100);
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (short) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (byte) -1);
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (byte) 0);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, 10);
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = arArchiveInputStream7.read(byteArray12, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) ' ');
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (byte) 100);
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = arArchiveInputStream1.read(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = arArchiveInputStream2.skip((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream14 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        arArchiveInputStream6.mark(0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream9);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, 0);
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (short) 1);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (short) 100);
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, 100);
        boolean boolean26 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int29 = arArchiveInputStream9.read(byteArray14, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        arArchiveInputStream11.mark((int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = arArchiveInputStream11.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry8 = arArchiveInputStream7.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream8.mark((int) (byte) 10);
        arArchiveInputStream8.mark(1);
        long long14 = arArchiveInputStream8.skip(0L);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray18, (int) (byte) 100);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray18, (int) (byte) 100);
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray18, 1);
        boolean boolean26 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray18, (int) '4');
        boolean boolean28 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray18, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int31 = arArchiveInputStream8.read(byteArray18, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        int int2 = arArchiveInputStream1.available();
        boolean boolean3 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        java.lang.Class<?> wildcardClass7 = arArchiveInputStream6.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        arArchiveInputStream11.mark((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = arArchiveInputStream11.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        arArchiveInputStream6.mark(1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = arArchiveInputStream6.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        boolean boolean9 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, 0);
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (short) 1);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (short) 100);
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, 100);
        boolean boolean26 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = arArchiveInputStream10.read(byteArray14, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        boolean boolean9 = arArchiveInputStream1.markSupported();
        int int10 = arArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry11 = arArchiveInputStream1.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean8 = arArchiveInputStream7.markSupported();
        boolean boolean9 = arArchiveInputStream7.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        arArchiveInputStream10.mark((int) (byte) 1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream10);
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray20, 100);
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray20, (int) (short) 10);
        boolean boolean26 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray20, (int) ' ');
        boolean boolean28 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray20, 0);
        boolean boolean30 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray20, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int33 = arArchiveInputStream10.read(byteArray20, (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        arArchiveInputStream5.mark((-1));
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = arArchiveInputStream8.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        arArchiveInputStream1.mark((int) 'a');
        boolean boolean13 = arArchiveInputStream1.markSupported();
        long long15 = arArchiveInputStream1.skip(0L);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = arArchiveInputStream1.skip((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        arArchiveInputStream1.mark((int) ' ');
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream17 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream16);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream16.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        int int2 = arArchiveInputStream1.available();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray6, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray6, (int) (byte) 100);
        boolean boolean12 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray6, 1);
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray6, (int) '4');
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray6, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int19 = arArchiveInputStream1.read(byteArray6, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        int int2 = arArchiveInputStream1.available();
        int int3 = arArchiveInputStream1.available();
        int int4 = arArchiveInputStream1.available();
        long long6 = arArchiveInputStream1.skip((-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry7 = arArchiveInputStream1.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = arArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean8 = arArchiveInputStream7.markSupported();
        int int9 = arArchiveInputStream7.available();
        boolean boolean10 = arArchiveInputStream7.markSupported();
        arArchiveInputStream7.mark((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry13 = arArchiveInputStream7.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        arArchiveInputStream1.mark((int) (byte) 10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean11 = arArchiveInputStream10.markSupported();
        int int12 = arArchiveInputStream10.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = arArchiveInputStream10.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (short) -1);
        java.lang.Class<?> wildcardClass10 = arArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream7.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = arArchiveInputStream11.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = arArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (short) 1);
        int int11 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream12);
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray17, (int) (byte) 100);
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray17, (int) ' ');
        boolean boolean23 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray17, (int) (byte) 100);
        boolean boolean25 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray17, (int) (byte) 100);
        boolean boolean27 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray17, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = arArchiveInputStream12.read(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean8 = arArchiveInputStream7.markSupported();
        int int9 = arArchiveInputStream7.available();
        boolean boolean10 = arArchiveInputStream7.markSupported();
        arArchiveInputStream7.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = arArchiveInputStream7.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        long long9 = arArchiveInputStream7.skip((long) (short) 0);
        boolean boolean10 = arArchiveInputStream7.markSupported();
        byte[] byteArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = arArchiveInputStream7.read(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        long long9 = arArchiveInputStream7.skip(0L);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = arArchiveInputStream7.skip(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean13 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, 100);
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, (int) (short) 10);
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, (int) ' ');
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, (int) (byte) 100);
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = arArchiveInputStream1.read(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
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
        arArchiveInputStream13.mark((int) (short) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream13);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = arArchiveInputStream16.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry6 = arArchiveInputStream1.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        int int14 = arArchiveInputStream8.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = arArchiveInputStream8.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) (byte) 10);
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) (byte) 10);
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = arArchiveInputStream1.read(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean8 = arArchiveInputStream7.markSupported();
        boolean boolean9 = arArchiveInputStream7.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        arArchiveInputStream10.mark((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = arArchiveInputStream10.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean10 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray8, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = arArchiveInputStream5.read(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        boolean boolean7 = arArchiveInputStream6.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        long long10 = arArchiveInputStream8.skip((long) (byte) -1);
        long long12 = arArchiveInputStream8.skip((long) (-1));
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, 100);
        boolean boolean23 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, (int) (short) 10);
        boolean boolean25 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int26 = arArchiveInputStream8.read(byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        arArchiveInputStream6.mark(0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        int int10 = arArchiveInputStream9.available();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = arArchiveInputStream9.skip((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry8 = arArchiveInputStream1.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean4 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        java.lang.Class<?> wildcardClass8 = arArchiveInputStream7.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark((int) (short) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream6.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean8 = arArchiveInputStream7.markSupported();
        boolean boolean9 = arArchiveInputStream7.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        arArchiveInputStream10.mark((int) (byte) 1);
        arArchiveInputStream10.mark((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = arArchiveInputStream10.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream5.mark(0);
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, 100);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) '#');
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = arArchiveInputStream5.read(byteArray14, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark((int) '4');
        arArchiveInputStream1.mark((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
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
        int int14 = arArchiveInputStream13.available();
        arArchiveInputStream13.mark((int) (short) 100);
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean25 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray23, 100);
        boolean boolean27 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray23, (int) (short) 10);
        boolean boolean29 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray23, (int) ' ');
        boolean boolean31 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray23, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = arArchiveInputStream13.read(byteArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean8 = arArchiveInputStream7.markSupported();
        int int9 = arArchiveInputStream7.available();
        boolean boolean10 = arArchiveInputStream7.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry11 = arArchiveInputStream7.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (short) 1);
        int int11 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        arArchiveInputStream6.mark(0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream9);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream9.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) (byte) 10);
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, 0);
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) '#');
        boolean boolean23 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = arArchiveInputStream12.read(byteArray15, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        long long7 = arArchiveInputStream5.skip((-1L));
        // The following exception was thrown during execution in test generation
        try {
            long long9 = arArchiveInputStream5.skip((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int8 = arArchiveInputStream7.available();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream7.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean8 = arArchiveInputStream7.markSupported();
        boolean boolean9 = arArchiveInputStream7.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        arArchiveInputStream10.mark((int) (byte) 1);
        arArchiveInputStream10.mark((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream10.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean12 = arArchiveInputStream11.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream11.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        arArchiveInputStream1.mark((int) ' ');
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = arArchiveInputStream1.skip(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = arArchiveInputStream1.skip((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        arArchiveInputStream1.mark((int) (short) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = arArchiveInputStream4.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        arArchiveInputStream1.mark((int) 'a');
        long long12 = arArchiveInputStream1.skip(0L);
        int int13 = arArchiveInputStream1.available();
        boolean boolean14 = arArchiveInputStream1.markSupported();
        int int15 = arArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream9);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream9.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        arArchiveInputStream5.mark((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream5.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean8 = arArchiveInputStream7.markSupported();
        boolean boolean9 = arArchiveInputStream7.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        arArchiveInputStream10.mark((int) (byte) 1);
        int int13 = arArchiveInputStream10.available();
        java.lang.Class<?> wildcardClass14 = arArchiveInputStream10.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        arArchiveInputStream2.mark((int) (short) 1);
        int int9 = arArchiveInputStream2.available();
        arArchiveInputStream2.mark((int) ' ');
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray18, 100);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray18, (int) (short) 10);
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray18, (int) ' ');
        boolean boolean26 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray18, (int) (byte) 100);
        boolean boolean28 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray18, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int29 = arArchiveInputStream2.read(byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray20, 100);
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray20, (int) '#');
        boolean boolean26 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray20, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = arArchiveInputStream11.read(byteArray20, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean8 = arArchiveInputStream7.markSupported();
        boolean boolean9 = arArchiveInputStream7.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        arArchiveInputStream10.mark((int) (byte) 1);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, (int) (byte) 100);
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, 0);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, (int) (short) 1);
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, (int) (short) 100);
        boolean boolean26 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, 100);
        boolean boolean28 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int29 = arArchiveInputStream10.read(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        long long9 = arArchiveInputStream1.skip((long) (-1));
        int int10 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        java.lang.Class<?> wildcardClass12 = arArchiveInputStream11.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean8 = arArchiveInputStream7.markSupported();
        int int9 = arArchiveInputStream7.available();
        boolean boolean10 = arArchiveInputStream7.markSupported();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray17, 100);
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray17, (int) (short) 10);
        boolean boolean23 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray17, 0);
        boolean boolean25 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray17, (int) '#');
        boolean boolean27 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray17, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = arArchiveInputStream7.read(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean9 = arArchiveInputStream8.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream10);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = arArchiveInputStream11.skip((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        int int4 = arArchiveInputStream1.available();
        java.lang.Class<?> wildcardClass5 = arArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark((int) (short) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean9 = arArchiveInputStream8.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry10 = arArchiveInputStream8.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        int int7 = arArchiveInputStream5.available();
        long long9 = arArchiveInputStream5.skip(0L);
        boolean boolean10 = arArchiveInputStream5.markSupported();
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = arArchiveInputStream5.read(byteArray14, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        long long12 = arArchiveInputStream1.skip(0L);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int6 = arArchiveInputStream1.available();
        boolean boolean7 = arArchiveInputStream1.markSupported();
        int int8 = arArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        int int5 = arArchiveInputStream1.available();
        int int6 = arArchiveInputStream1.available();
        boolean boolean7 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) 'a');
        boolean boolean10 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(1);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, 100);
        boolean boolean23 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, (int) (short) 10);
        boolean boolean25 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, (int) ' ');
        boolean boolean27 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = arArchiveInputStream1.read(byteArray19, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        arArchiveInputStream6.mark(1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry9 = arArchiveInputStream6.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        long long9 = arArchiveInputStream1.skip((long) (-1));
        int int10 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) (byte) 100);
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) (short) -1);
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = arArchiveInputStream11.read(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
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
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream13.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        arArchiveInputStream2.mark((int) (short) 0);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = arArchiveInputStream2.read(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean9 = arArchiveInputStream8.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream10);
        int int12 = arArchiveInputStream11.available();
        long long14 = arArchiveInputStream11.skip((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream11.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        boolean boolean7 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry10 = arArchiveInputStream1.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
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
        arArchiveInputStream13.mark((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream13.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        int int2 = arArchiveInputStream1.available();
        boolean boolean3 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(0);
        java.lang.Class<?> wildcardClass6 = arArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        long long13 = arArchiveInputStream1.skip((-1L));
        boolean boolean14 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream17 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry18 = arArchiveInputStream1.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean9 = arArchiveInputStream8.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = arArchiveInputStream11.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        int int2 = arArchiveInputStream1.available();
        boolean boolean3 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = arArchiveInputStream6.skip(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean9 = arArchiveInputStream8.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        int int11 = arArchiveInputStream8.available();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = arArchiveInputStream8.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean12 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, 100);
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) '#');
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = arArchiveInputStream3.read(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean12 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, 100);
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = arArchiveInputStream2.read(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        arArchiveInputStream2.mark((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry9 = arArchiveInputStream2.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        arArchiveInputStream1.mark((int) (byte) 10);
        int int10 = arArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark((int) '4');
        arArchiveInputStream1.mark((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 10 };
        boolean boolean4 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray2, (int) (byte) 1);
        boolean boolean6 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass7 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        boolean boolean7 = arArchiveInputStream6.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        long long10 = arArchiveInputStream8.skip((long) (byte) -1);
        int int11 = arArchiveInputStream8.available();
        arArchiveInputStream8.mark((int) (byte) 10);
        arArchiveInputStream8.mark(0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = arArchiveInputStream8.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray17, (int) (byte) 100);
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray17, 0);
        boolean boolean23 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray17, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = arArchiveInputStream13.read(byteArray17, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
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
        arArchiveInputStream13.mark((int) (short) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream13);
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean25 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray23, 100);
        boolean boolean27 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray23, (int) '#');
        boolean boolean29 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray23, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = arArchiveInputStream16.read(byteArray23, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream5.mark(0);
        long long9 = arArchiveInputStream5.skip((-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = arArchiveInputStream5.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int8 = arArchiveInputStream7.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        arArchiveInputStream6.mark(1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        arArchiveInputStream9.mark(100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = arArchiveInputStream9.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean9 = arArchiveInputStream8.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray18, 100);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray18, (int) '#');
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray18, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = arArchiveInputStream8.read(byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
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
            long long12 = arArchiveInputStream10.skip(100L);
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
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean12 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) (byte) 100);
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) (byte) 100);
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, 1);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) '4');
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int23 = arArchiveInputStream6.read(byteArray10, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        arArchiveInputStream1.mark((int) ' ');
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry17 = arArchiveInputStream16.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        int int2 = arArchiveInputStream1.available();
        boolean boolean3 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(0);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = arArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        arArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry12 = arArchiveInputStream11.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        arArchiveInputStream2.mark((-1));
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, 100);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) '4');
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = arArchiveInputStream2.read(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        int int8 = arArchiveInputStream2.available();
        arArchiveInputStream2.mark((int) (byte) -1);
        boolean boolean11 = arArchiveInputStream2.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        boolean boolean13 = arArchiveInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        arArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        int int5 = arArchiveInputStream1.available();
        int int6 = arArchiveInputStream1.available();
        java.lang.Class<?> wildcardClass7 = arArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        boolean boolean9 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean11 = arArchiveInputStream1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        arArchiveInputStream1.mark((int) 'a');
        long long12 = arArchiveInputStream1.skip(0L);
        int int13 = arArchiveInputStream1.available();
        boolean boolean14 = arArchiveInputStream1.markSupported();
        boolean boolean15 = arArchiveInputStream1.markSupported();
        int int16 = arArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
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
        boolean boolean14 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray22, 100);
        boolean boolean26 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray22, (int) (short) 10);
        boolean boolean28 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray22, 0);
        boolean boolean30 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray22, (int) '#');
        boolean boolean32 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray22, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = arArchiveInputStream15.read(byteArray22);
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
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        arArchiveInputStream2.mark((-1));
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean13 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, (int) (byte) 100);
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, 0);
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = arArchiveInputStream2.read(byteArray11, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        int int2 = arArchiveInputStream1.available();
        int int3 = arArchiveInputStream1.available();
        int int4 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        java.lang.Class<?> wildcardClass6 = arArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream7.mark((int) (byte) -1);
        long long11 = arArchiveInputStream7.skip((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        long long13 = arArchiveInputStream1.skip((-1L));
        boolean boolean14 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream17 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean26 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray24, 100);
        boolean boolean28 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray24, (int) (short) 10);
        boolean boolean30 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray24, 0);
        boolean boolean32 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray24, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int35 = arArchiveInputStream1.read(byteArray24, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
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
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream13.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = arArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        long long6 = arArchiveInputStream1.skip((long) (short) -1);
        arArchiveInputStream1.mark((int) (short) -1);
        arArchiveInputStream1.mark((int) '4');
        int int11 = arArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        arArchiveInputStream1.mark((int) (byte) 10);
        int int10 = arArchiveInputStream1.available();
        long long12 = arArchiveInputStream1.skip((long) 0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int14 = arArchiveInputStream13.available();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = arArchiveInputStream13.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = arArchiveInputStream13.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        arArchiveInputStream5.mark((-1));
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean13 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, (int) (byte) 100);
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, (int) ' ');
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = arArchiveInputStream5.read(byteArray11, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = arArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean8 = arArchiveInputStream7.markSupported();
        int int9 = arArchiveInputStream7.available();
        boolean boolean10 = arArchiveInputStream7.markSupported();
        arArchiveInputStream7.mark((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = arArchiveInputStream7.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream7.mark((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = arArchiveInputStream7.skip(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        long long13 = arArchiveInputStream1.skip((-1L));
        boolean boolean14 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream17 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream17.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        int int5 = arArchiveInputStream1.available();
        int int6 = arArchiveInputStream1.available();
        boolean boolean7 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        int int2 = arArchiveInputStream1.available();
        int int3 = arArchiveInputStream1.available();
        int int4 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int6 = arArchiveInputStream5.available();
        java.lang.Class<?> wildcardClass7 = arArchiveInputStream5.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        arArchiveInputStream2.mark((int) (short) 1);
        int int9 = arArchiveInputStream2.available();
        arArchiveInputStream2.mark((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        int int7 = arArchiveInputStream5.available();
        int int8 = arArchiveInputStream5.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) ' ');
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (byte) 100);
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (byte) 100);
        boolean boolean23 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = arArchiveInputStream9.read(byteArray13, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark(100);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) ' ');
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 100);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = arArchiveInputStream1.read(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        long long13 = arArchiveInputStream1.skip((-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry14 = arArchiveInputStream1.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        int int5 = arArchiveInputStream1.available();
        int int6 = arArchiveInputStream1.available();
        boolean boolean7 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) 'a');
        boolean boolean10 = arArchiveInputStream1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) -1);
        boolean boolean11 = arArchiveInputStream1.markSupported();
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 10 };
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = arArchiveInputStream1.read(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean4 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream7.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        long long9 = arArchiveInputStream7.skip((long) (short) 0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry11 = arArchiveInputStream10.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        arArchiveInputStream1.mark((int) (byte) 10);
        int int10 = arArchiveInputStream1.available();
        long long12 = arArchiveInputStream1.skip((long) 0);
        arArchiveInputStream1.mark((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean9 = arArchiveInputStream8.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        int int11 = arArchiveInputStream8.available();
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) (byte) 100);
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) ' ');
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = arArchiveInputStream8.read(byteArray15, 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
        arArchiveInputStream13.mark((int) (short) -1);
        byte[] byteArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = arArchiveInputStream13.read(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark(100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry11 = arArchiveInputStream1.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean9 = arArchiveInputStream8.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream12.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        int int7 = arArchiveInputStream5.available();
        int int8 = arArchiveInputStream5.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = arArchiveInputStream9.skip((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        int int6 = arArchiveInputStream5.available();
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean12 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) (byte) 100);
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) ' ');
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) (byte) 100);
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) (short) -1);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) (byte) 10);
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = arArchiveInputStream5.read(byteArray10, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        arArchiveInputStream2.mark((int) (short) 1);
        int int9 = arArchiveInputStream2.available();
        arArchiveInputStream2.mark((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry12 = arArchiveInputStream2.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        int int2 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        java.lang.Class<?> wildcardClass9 = arArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (short) 0);
        boolean boolean6 = arArchiveInputStream2.markSupported();
        boolean boolean7 = arArchiveInputStream2.markSupported();
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean13 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, (int) (byte) 100);
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, (int) ' ');
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, (int) (byte) 100);
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = arArchiveInputStream2.read(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = arArchiveInputStream6.skip((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean3 = arArchiveInputStream1.markSupported();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean12 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, 100);
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) (short) 10);
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) ' ');
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = arArchiveInputStream1.read(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        int int7 = arArchiveInputStream5.available();
        long long9 = arArchiveInputStream5.skip(0L);
        boolean boolean10 = arArchiveInputStream5.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = arArchiveInputStream5.skip((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        arArchiveInputStream1.mark((int) (short) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream4.mark(0);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, 100);
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (short) 10);
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) ' ');
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = arArchiveInputStream4.read(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (short) 1);
        int int11 = arArchiveInputStream1.available();
        int int12 = arArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry13 = arArchiveInputStream1.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        arArchiveInputStream3.mark((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = arArchiveInputStream3.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        long long9 = arArchiveInputStream7.skip((long) (short) 0);
        long long11 = arArchiveInputStream7.skip((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry12 = arArchiveInputStream7.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        arArchiveInputStream1.mark((int) ' ');
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream17 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream16);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = arArchiveInputStream16.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        arArchiveInputStream2.mark((int) (byte) 0);
        boolean boolean9 = arArchiveInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = arArchiveInputStream2.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = arArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        arArchiveInputStream1.mark((int) (short) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = arArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        arArchiveInputStream2.mark((int) (byte) 0);
        boolean boolean9 = arArchiveInputStream2.markSupported();
        int int10 = arArchiveInputStream2.available();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        int int7 = arArchiveInputStream5.available();
        arArchiveInputStream5.mark((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = arArchiveInputStream5.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int8 = arArchiveInputStream7.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = arArchiveInputStream9.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (short) 1);
        int int11 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        java.lang.Class<?> wildcardClass13 = arArchiveInputStream12.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        int int8 = arArchiveInputStream2.available();
        arArchiveInputStream2.mark((int) (byte) -1);
        boolean boolean11 = arArchiveInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = arArchiveInputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean8 = arArchiveInputStream7.markSupported();
        boolean boolean9 = arArchiveInputStream7.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        arArchiveInputStream10.mark((int) (byte) 1);
        arArchiveInputStream10.mark((int) (short) 100);
        boolean boolean15 = arArchiveInputStream10.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = arArchiveInputStream10.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean8 = arArchiveInputStream7.markSupported();
        boolean boolean9 = arArchiveInputStream7.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        boolean boolean11 = arArchiveInputStream7.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = arArchiveInputStream7.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        long long6 = arArchiveInputStream1.skip((long) (short) -1);
        int int7 = arArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry8 = arArchiveInputStream1.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (short) 1);
        int int11 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean13 = arArchiveInputStream12.markSupported();
        int int14 = arArchiveInputStream12.available();
        int int15 = arArchiveInputStream12.available();
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray22, 100);
        boolean boolean26 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray22, (int) '4');
        boolean boolean28 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray22, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = arArchiveInputStream12.read(byteArray22, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream8.mark((int) (byte) 10);
        arArchiveInputStream8.mark(1);
        long long14 = arArchiveInputStream8.skip(0L);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray18, (int) (byte) 100);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray18, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = arArchiveInputStream8.read(byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        long long9 = arArchiveInputStream7.skip((long) (short) 0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, 0);
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (short) 1);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (short) 100);
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, 100);
        boolean boolean26 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int27 = arArchiveInputStream7.read(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        boolean boolean9 = arArchiveInputStream1.markSupported();
        int int10 = arArchiveInputStream1.available();
        long long12 = arArchiveInputStream1.skip((long) (short) 0);
        arArchiveInputStream1.mark(10);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) (byte) 100);
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) (byte) 100);
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, 1);
        boolean boolean23 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, 100);
        boolean boolean25 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) 'a');
        boolean boolean27 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = arArchiveInputStream11.read(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        // The following exception was thrown during execution in test generation
        try {
            int int14 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark((int) (short) 100);
        byte[] byteArray7 = new byte[] { (byte) 1 };
        boolean boolean9 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray7, 1);
        boolean boolean11 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray7, (int) (short) 100);
        boolean boolean13 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray7, (-1));
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray7, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = arArchiveInputStream1.read(byteArray7, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (short) 0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        long long8 = arArchiveInputStream2.skip((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = arArchiveInputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = arArchiveInputStream1.skip((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        long long9 = arArchiveInputStream1.skip((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int10 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        boolean boolean7 = arArchiveInputStream6.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        long long10 = arArchiveInputStream8.skip((long) (byte) -1);
        int int11 = arArchiveInputStream8.available();
        arArchiveInputStream8.mark((int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = arArchiveInputStream8.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean9 = arArchiveInputStream8.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream10);
        int int12 = arArchiveInputStream11.available();
        long long14 = arArchiveInputStream11.skip((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream11.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream7.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        arArchiveInputStream5.mark((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream5.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
        boolean boolean11 = arArchiveInputStream1.markSupported();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int20 = arArchiveInputStream1.read(byteArray17, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 1, 1, -1, 0]");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        arArchiveInputStream6.mark(0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        int int10 = arArchiveInputStream9.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = arArchiveInputStream9.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream7.mark((int) (byte) -1);
        long long11 = arArchiveInputStream7.skip((long) 0);
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int18 = arArchiveInputStream7.read(byteArray15, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 1, 10]");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        long long6 = arArchiveInputStream1.skip((-1L));
        int int7 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark((int) (byte) 100);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, 100);
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, (int) (short) 10);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, (int) ' ');
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = arArchiveInputStream1.read(byteArray16, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        long long9 = arArchiveInputStream7.skip(0L);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = arArchiveInputStream7.skip((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        arArchiveInputStream1.mark((int) (byte) 10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = arArchiveInputStream10.skip((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        arArchiveInputStream6.mark(1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream9.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        int int7 = arArchiveInputStream1.available();
        int int8 = arArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry9 = arArchiveInputStream1.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream8.mark((int) (byte) 10);
        arArchiveInputStream8.mark((int) (byte) 0);
        boolean boolean13 = arArchiveInputStream8.markSupported();
        arArchiveInputStream8.mark((int) (short) -1);
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, (int) (byte) 100);
        boolean boolean23 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, 0);
        boolean boolean25 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = arArchiveInputStream8.read(byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        arArchiveInputStream1.mark((int) 'a');
        long long12 = arArchiveInputStream1.skip(0L);
        int int13 = arArchiveInputStream1.available();
        boolean boolean14 = arArchiveInputStream1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = arArchiveInputStream1.skip(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (byte) 100);
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) ' ');
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (byte) 100);
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) ' ');
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = arArchiveInputStream8.read(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean8 = arArchiveInputStream7.markSupported();
        boolean boolean9 = arArchiveInputStream7.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        arArchiveInputStream10.mark((int) (byte) 1);
        arArchiveInputStream10.mark((int) (short) 100);
        boolean boolean15 = arArchiveInputStream10.markSupported();
        java.lang.Class<?> wildcardClass16 = arArchiveInputStream10.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        arArchiveInputStream1.mark((int) 'a');
        long long12 = arArchiveInputStream1.skip(0L);
        int int13 = arArchiveInputStream1.available();
        boolean boolean14 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry16 = arArchiveInputStream1.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean9 = arArchiveInputStream8.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream10);
        int int12 = arArchiveInputStream11.available();
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) (byte) 10);
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, 0);
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) '#');
        boolean boolean23 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = arArchiveInputStream11.read(byteArray15, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        int int8 = arArchiveInputStream2.available();
        arArchiveInputStream2.mark((int) (byte) -1);
        boolean boolean11 = arArchiveInputStream2.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        long long14 = arArchiveInputStream12.skip(0L);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = arArchiveInputStream12.skip((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        int int8 = arArchiveInputStream2.available();
        arArchiveInputStream2.mark((int) (byte) -1);
        boolean boolean11 = arArchiveInputStream2.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, (int) (byte) 100);
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, (int) (short) 100);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, (int) (byte) -1);
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, (int) (byte) 0);
        boolean boolean26 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = arArchiveInputStream2.read(byteArray16, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        arArchiveInputStream1.mark((int) 'a');
        boolean boolean13 = arArchiveInputStream1.markSupported();
        long long15 = arArchiveInputStream1.skip(0L);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        long long7 = arArchiveInputStream5.skip((-1L));
        int int8 = arArchiveInputStream5.available();
        boolean boolean9 = arArchiveInputStream5.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = arArchiveInputStream5.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        arArchiveInputStream5.mark((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = arArchiveInputStream5.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (short) 1);
        int int11 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean13 = arArchiveInputStream12.markSupported();
        int int14 = arArchiveInputStream12.available();
        int int15 = arArchiveInputStream12.available();
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, (int) (byte) 100);
        boolean boolean23 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, (int) (short) 100);
        boolean boolean25 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, (int) (byte) -1);
        boolean boolean27 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, (int) (byte) 0);
        boolean boolean29 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, 10);
        boolean boolean31 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = arArchiveInputStream12.read(byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
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
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream12.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream8.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        int int7 = arArchiveInputStream5.available();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream5.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean4 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int8 = arArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
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
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = arArchiveInputStream10.read(byteArray15, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, (int) (byte) 100);
        boolean boolean23 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, 0);
        boolean boolean25 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, (int) (short) 1);
        boolean boolean27 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, (int) (short) 100);
        boolean boolean29 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = arArchiveInputStream13.read(byteArray19, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream14 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray18, (int) (byte) 100);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray18, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = arArchiveInputStream1.read(byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean9 = arArchiveInputStream8.markSupported();
        int int10 = arArchiveInputStream8.available();
        boolean boolean11 = arArchiveInputStream8.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = arArchiveInputStream8.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        arArchiveInputStream1.mark((int) 'a');
        long long12 = arArchiveInputStream1.skip(0L);
        int int13 = arArchiveInputStream1.available();
        boolean boolean14 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = arArchiveInputStream15.skip(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        long long6 = arArchiveInputStream1.skip((-1L));
        int int7 = arArchiveInputStream1.available();
        int int8 = arArchiveInputStream1.available();
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (byte) 100);
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (short) -1);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, 10);
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = arArchiveInputStream1.read(byteArray12, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        int int2 = arArchiveInputStream1.available();
        int int3 = arArchiveInputStream1.available();
        int int4 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry7 = arArchiveInputStream5.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        arArchiveInputStream5.mark((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry8 = arArchiveInputStream5.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        boolean boolean7 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((-1));
        int int10 = arArchiveInputStream1.available();
        java.lang.Class<?> wildcardClass11 = arArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (short) 0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        long long8 = arArchiveInputStream2.skip((long) (short) 0);
        long long10 = arArchiveInputStream2.skip((long) (-1));
        long long12 = arArchiveInputStream2.skip((long) (byte) -1);
        arArchiveInputStream2.mark((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry15 = arArchiveInputStream2.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, (int) (byte) 100);
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, (int) ' ');
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int25 = arArchiveInputStream10.read(byteArray16, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        java.lang.Class<?> wildcardClass13 = arArchiveInputStream11.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        boolean boolean9 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean11 = arArchiveInputStream1.markSupported();
        boolean boolean12 = arArchiveInputStream1.markSupported();
        java.lang.Class<?> wildcardClass13 = arArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        boolean boolean7 = arArchiveInputStream6.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        long long10 = arArchiveInputStream8.skip((long) (byte) -1);
        arArchiveInputStream8.mark(100);
        byte[] byteArray14 = new byte[] { (byte) 1 };
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, 1);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (short) 100);
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int23 = arArchiveInputStream8.read(byteArray14, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry3 = arArchiveInputStream2.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        int int6 = arArchiveInputStream1.available();
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean12 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) (byte) 100);
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) (byte) 100);
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, 1);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, 100);
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int23 = arArchiveInputStream1.read(byteArray10, (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray3, (int) (byte) 100);
        boolean boolean7 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray3, (int) (byte) 100);
        boolean boolean9 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray3, 1);
        boolean boolean11 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray3, 100);
        boolean boolean13 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray3, 0);
        java.lang.Class<?> wildcardClass14 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        arArchiveInputStream1.mark((int) 'a');
        long long12 = arArchiveInputStream1.skip(0L);
        int int13 = arArchiveInputStream1.available();
        boolean boolean14 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = arArchiveInputStream5.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray20, 100);
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray20, (int) (short) 10);
        boolean boolean26 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray20, (int) ' ');
        boolean boolean28 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray20, 0);
        boolean boolean30 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray20, (int) ' ');
        boolean boolean32 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray20, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = arArchiveInputStream8.read(byteArray20, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int10 = arArchiveInputStream9.available();
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (short) 100);
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) -1);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = arArchiveInputStream9.read(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (short) -1);
        int int11 = arArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        boolean boolean7 = arArchiveInputStream6.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        long long10 = arArchiveInputStream8.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = arArchiveInputStream8.skip((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        arArchiveInputStream1.mark((int) (byte) 10);
        int int10 = arArchiveInputStream1.available();
        long long12 = arArchiveInputStream1.skip((long) 0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int14 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry17 = arArchiveInputStream1.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean9 = arArchiveInputStream8.markSupported();
        int int10 = arArchiveInputStream8.available();
        boolean boolean11 = arArchiveInputStream8.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream8.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean3 = arArchiveInputStream1.markSupported();
        java.lang.Class<?> wildcardClass4 = arArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream7.mark((int) (byte) -1);
        arArchiveInputStream7.mark((int) (short) -1);
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) (byte) 100);
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) (short) 100);
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) (byte) -1);
        boolean boolean23 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) (byte) 0);
        boolean boolean25 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, 10);
        boolean boolean27 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = arArchiveInputStream7.read(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int10 = arArchiveInputStream1.available();
        int int11 = arArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = arArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        arArchiveInputStream1.mark((int) (byte) 10);
        int int10 = arArchiveInputStream1.available();
        long long12 = arArchiveInputStream1.skip((long) 0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int14 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark((int) (short) 0);
        arArchiveInputStream1.mark((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        int int8 = arArchiveInputStream2.available();
        arArchiveInputStream2.mark((int) (byte) -1);
        boolean boolean11 = arArchiveInputStream2.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        boolean boolean7 = arArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        long long10 = arArchiveInputStream5.skip((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = arArchiveInputStream5.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean7 = arArchiveInputStream6.markSupported();
        arArchiveInputStream6.mark(100);
        boolean boolean10 = arArchiveInputStream6.markSupported();
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = arArchiveInputStream6.read(byteArray14, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int6 = arArchiveInputStream1.available();
        int int7 = arArchiveInputStream1.available();
        boolean boolean8 = arArchiveInputStream1.markSupported();
        java.lang.Class<?> wildcardClass9 = arArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        boolean boolean7 = arArchiveInputStream6.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        long long10 = arArchiveInputStream8.skip((long) (byte) -1);
        java.lang.Class<?> wildcardClass11 = arArchiveInputStream8.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (short) 1);
        int int11 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = arArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        int int7 = arArchiveInputStream5.available();
        int int8 = arArchiveInputStream5.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry10 = arArchiveInputStream5.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        long long9 = arArchiveInputStream7.skip(0L);
        byte[] byteArray11 = new byte[] { (byte) 1 };
        boolean boolean13 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, 1);
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, (-1));
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = arArchiveInputStream7.read(byteArray11, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) 'a');
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, 100);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) '4');
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 0);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (short) 0);
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = arArchiveInputStream1.read(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        arArchiveInputStream1.mark((int) 'a');
        long long12 = arArchiveInputStream1.skip(0L);
        int int13 = arArchiveInputStream1.available();
        boolean boolean14 = arArchiveInputStream1.markSupported();
        int int15 = arArchiveInputStream1.available();
        int int16 = arArchiveInputStream1.available();
        int int17 = arArchiveInputStream1.available();
        byte[] byteArray19 = new byte[] { (byte) 1 };
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, 1);
        boolean boolean23 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, (int) (short) 100);
        boolean boolean25 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, (-1));
        boolean boolean27 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int28 = arArchiveInputStream1.read(byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        boolean boolean9 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = arArchiveInputStream11.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        int int4 = arArchiveInputStream1.available();
        boolean boolean5 = arArchiveInputStream1.markSupported();
        java.lang.Class<?> wildcardClass6 = arArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        arArchiveInputStream6.mark(0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, 100);
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, (int) (short) 10);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, 0);
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = arArchiveInputStream6.read(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        boolean boolean9 = arArchiveInputStream1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        arArchiveInputStream1.mark((int) 'a');
        long long12 = arArchiveInputStream1.skip(0L);
        int int13 = arArchiveInputStream1.available();
        boolean boolean14 = arArchiveInputStream1.markSupported();
        boolean boolean15 = arArchiveInputStream1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        arArchiveInputStream5.mark((-1));
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (byte) 100);
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (short) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (byte) -1);
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (byte) 0);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, 10);
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = arArchiveInputStream5.read(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
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
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        arArchiveInputStream6.mark(0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        int int10 = arArchiveInputStream9.available();
        java.lang.Class<?> wildcardClass11 = arArchiveInputStream9.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        arArchiveInputStream6.mark((int) (byte) 1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        arArchiveInputStream6.mark((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry12 = arArchiveInputStream6.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean8 = arArchiveInputStream7.markSupported();
        boolean boolean9 = arArchiveInputStream7.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        byte[] byteArray12 = new byte[] { (byte) 0 };
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = arArchiveInputStream10.read(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        arArchiveInputStream6.mark(1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        arArchiveInputStream9.mark(100);
        arArchiveInputStream9.mark((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream9.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
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
        arArchiveInputStream13.mark((int) (short) 100);
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, (int) (byte) 100);
        boolean boolean23 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, (int) ' ');
        boolean boolean25 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, (int) (byte) 100);
        boolean boolean27 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int30 = arArchiveInputStream13.read(byteArray19, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        arArchiveInputStream2.mark((int) (byte) 10);
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean10 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray8, (int) (byte) 100);
        boolean boolean12 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray8, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int13 = arArchiveInputStream2.read(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) ' ');
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int21 = arArchiveInputStream1.read(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
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
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = arArchiveInputStream11.skip(1L);
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
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        arArchiveInputStream6.mark(1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        boolean boolean10 = arArchiveInputStream6.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry11 = arArchiveInputStream6.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        long long9 = arArchiveInputStream1.skip((long) (-1));
        int int10 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = arArchiveInputStream11.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        arArchiveInputStream2.mark((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = arArchiveInputStream2.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int8 = arArchiveInputStream7.available();
        long long10 = arArchiveInputStream7.skip((long) (byte) 0);
        long long12 = arArchiveInputStream7.skip((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        arArchiveInputStream6.mark((int) (byte) 1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (byte) 100);
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, 1);
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, 100);
        boolean boolean23 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, 0);
        boolean boolean25 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = arArchiveInputStream6.read(byteArray13, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        arArchiveInputStream1.mark((int) ' ');
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        arArchiveInputStream1.mark((int) (byte) 10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean11 = arArchiveInputStream10.markSupported();
        boolean boolean12 = arArchiveInputStream10.markSupported();
        java.lang.Class<?> wildcardClass13 = arArchiveInputStream10.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int8 = arArchiveInputStream7.available();
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, 100);
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) (short) 10);
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) ' ');
        boolean boolean23 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = arArchiveInputStream7.read(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean5 = arArchiveInputStream1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        long long13 = arArchiveInputStream1.skip((-1L));
        arArchiveInputStream1.mark((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int16 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        arArchiveInputStream2.mark((int) (byte) 0);
        boolean boolean9 = arArchiveInputStream2.markSupported();
        boolean boolean10 = arArchiveInputStream2.markSupported();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray17, 100);
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray17, (int) (short) 10);
        boolean boolean23 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray17, (int) ' ');
        boolean boolean25 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray17, (int) (byte) 100);
        boolean boolean27 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray17, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int30 = arArchiveInputStream2.read(byteArray17, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        arArchiveInputStream2.mark((int) (short) 0);
        long long11 = arArchiveInputStream2.skip((long) (byte) 0);
        java.lang.Class<?> wildcardClass12 = arArchiveInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        arArchiveInputStream6.mark((int) (byte) 1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean3 = arArchiveInputStream2.markSupported();
        long long5 = arArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        long long9 = arArchiveInputStream7.skip((long) (short) 0);
        arArchiveInputStream7.mark(0);
        int int12 = arArchiveInputStream7.available();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = arArchiveInputStream7.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        long long13 = arArchiveInputStream1.skip((-1L));
        arArchiveInputStream1.mark((-1));
        arArchiveInputStream1.mark((int) (byte) 0);
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean26 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray24, 100);
        boolean boolean28 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray24, (int) '#');
        boolean boolean30 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray24, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = arArchiveInputStream1.read(byteArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
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
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = arArchiveInputStream11.getNextEntry();
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
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        boolean boolean8 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        long long13 = arArchiveInputStream1.skip((-1L));
        arArchiveInputStream1.mark((-1));
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray18, (int) (byte) 10);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray18, (int) (byte) 10);
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray18, (int) (byte) -1);
        boolean boolean26 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray18, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = arArchiveInputStream1.read(byteArray18, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        boolean boolean9 = arArchiveInputStream8.markSupported();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        java.lang.Class<?> wildcardClass11 = arArchiveInputStream10.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = arArchiveInputStream2.skip((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (short) -1);
        int int11 = arArchiveInputStream1.available();
        byte[] byteArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = arArchiveInputStream1.read(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        boolean boolean9 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark(0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (byte) 100);
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, 1);
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, 100);
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, 0);
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, (int) (byte) 0);
        boolean boolean26 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = arArchiveInputStream1.read(byteArray12, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        arArchiveInputStream1.mark((int) (short) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = arArchiveInputStream9.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        arArchiveInputStream1.mark((int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = arArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        long long6 = arArchiveInputStream1.skip((long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = arArchiveInputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        arArchiveInputStream1.mark(100);
        boolean boolean6 = arArchiveInputStream1.markSupported();
        long long8 = arArchiveInputStream1.skip((long) (short) 0);
        arArchiveInputStream1.mark((int) 'a');
        long long12 = arArchiveInputStream1.skip(0L);
        int int13 = arArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = arArchiveInputStream1.skip((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        int int6 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = arArchiveInputStream7.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        boolean boolean5 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        arArchiveInputStream1.mark((int) (short) 1);
        boolean boolean11 = arArchiveInputStream1.markSupported();
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) (byte) 100);
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, 0);
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) (short) 1);
        boolean boolean23 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) (short) 100);
        boolean boolean25 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = arArchiveInputStream1.read(byteArray15, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        arArchiveInputStream6.mark(0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = arArchiveInputStream6.read(byteArray13, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray6, 100);
        boolean boolean10 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray6, (int) (short) 10);
        boolean boolean12 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray6, (int) '#');
        java.lang.Class<?> wildcardClass15 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        int int6 = arArchiveInputStream4.available();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream4.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        int int3 = arArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream4);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        arArchiveInputStream5.mark((int) (short) 1);
        boolean boolean9 = arArchiveInputStream5.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream5.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        boolean boolean2 = arArchiveInputStream1.markSupported();
        arArchiveInputStream1.mark((int) ' ');
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int6 = arArchiveInputStream1.available();
        boolean boolean7 = arArchiveInputStream1.markSupported();
        int int8 = arArchiveInputStream1.available();
        long long10 = arArchiveInputStream1.skip((long) (short) -1);
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean19 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray17, 100);
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray17, (int) (short) 10);
        boolean boolean23 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray17, 0);
        boolean boolean25 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray17, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = arArchiveInputStream1.read(byteArray17, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }
}

